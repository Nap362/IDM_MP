package simplepdl.manip;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import petrinet.Arc;
import petrinet.PetriNet;
import petrinet.PetrinetFactory;
import petrinet.Place;
import petrinet.Transition;
import simplepdl.Process;
import simplepdl.SimplepdlFactory;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;

public class SimplePDL2PetriNet {
	public static void main(String[] args) {
		
		// Chargement du package SimplePDL afin de l'enregistrer dans le registre d'Eclipse.
		SimplepdlPackage packageInstance = SimplepdlPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant Ãªtre ouverte Ã 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (notre modÃ¨le)
		ResourceSet resSet = new ResourceSetImpl();
		ResourceSet resSetP = new ResourceSetImpl();

		// Charger la ressource (notre modÃ¨le)
		URI modelURI = URI.createURI("models/SimplePDLCreator_Created_Process.xmi");
		Resource resource = resSet.getResource(modelURI, true);
		
		// RÃ©cupÃ©rer le premier Ã©lÃ©ment du modÃ¨le (Ã©lÃ©ment racine)
		Process process = (Process) resource.getContents().get(0);
		
		// Définir les ressources pour la création du reseau de petri
		URI modelURIP = URI.createURI("models/SimplePDL2PetriNet.xmi");
		Resource resourceP = resSetP.createResource(modelURIP);
		
		// La fabrique pour fabriquer les Ã©lÃ©ments de SimplePDL
	    PetrinetFactory petriFactory = PetrinetFactory.eINSTANCE;
		
		/**
		 * Manipulation de notre instance
		 */
	    
	    // Creer le reseau
 	 	PetriNet petrinetI = petriFactory.createPetriNet();
 	 	petrinetI.setName(process.getName());
 	 	
	    // Naviguer dans les rÃ©fÃ©rences
	    Integer nbPE = process.getProcessElements().size();

		// Afficher les sous-activitÃ©s
		for (Object o : process.getProcessElements()) {
			if (o instanceof WorkDefinition) {
				WorkDefinition wd = (WorkDefinition) o;
				//Creation du réseau de petri correspondant à une wd
				activitePetri(wd.getName(), petriFactory, petrinetI);
			}else if (o instanceof WorkSequence) {
				WorkSequence ws = (WorkSequence) o;
				sequencePetri(ws, petriFactory, petrinetI);
			}
		}
		
		// Ajouter le Process dans le modÃ¨le
		resourceP.getContents().add(petrinetI);
	    
		
		// Sauver la ressource
	    try {
	    	resourceP.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void activitePetri(String name, PetrinetFactory factory, PetriNet petrinetI) {
		//Creation des places pour une wd
		Place p_notStarted = factory.createPlace();
		p_notStarted.setName(name + "_NotStarted");
		petrinetI.getNodes().add(p_notStarted);
		
		Transition t_started = factory.createTransition();
		t_started.setName(name + "_Starts");
		petrinetI.getNodes().add(t_started);
		
		Place p_running = factory.createPlace();
		p_running.setName(name + "_Running");
		petrinetI.getNodes().add(p_running);
		
		Place p_started = factory.createPlace();
		p_started.setName(name + "_Started");
		petrinetI.getNodes().add(p_started);
		
		Transition t_finished = factory.createTransition();
		t_finished.setName(name + "_Finishes");
		petrinetI.getNodes().add(t_finished);
		
		Place p_finished = factory.createPlace();
		p_finished.setName(name + "_Finished");
		petrinetI.getNodes().add(p_finished);
		
		//Creation des arcs pour une wd
		Arc a1 = factory.createArc();
		p_notStarted.getOutgoing().add(a1);
		t_started.setIngoing(a1);
		a1.setSource(p_notStarted);
		a1.setTarget(t_started);
		petrinetI.getArcs().add(a1);
		
		Arc a2 = factory.createArc();
		p_started.setIngoing(a2);
		t_started.getOutgoing().add(a2);
		a2.setSource(t_started);
		a2.setTarget(p_started);
		petrinetI.getArcs().add(a2);
		
		Arc a3 = factory.createArc();
		p_running.setIngoing(a3);
		t_started.getOutgoing().add(a3);
		a3.setSource(t_started);
		a3.setTarget(p_running);
		petrinetI.getArcs().add(a3);
		
		Arc a4 = factory.createArc();
		t_finished.setIngoing(a4);
		p_running.getOutgoing().add(a4);
		a4.setSource(p_running);
		a4.setTarget(t_finished);
		petrinetI.getArcs().add(a4);
		
		Arc a5 = factory.createArc();
		p_finished.setIngoing(a5);
		t_finished.getOutgoing().add(a5);
		a5.setSource(t_finished);
		a5.setTarget(p_finished);
		petrinetI.getArcs().add(a5);
	}
	
	public static void sequencePetri(WorkSequence ws, PetrinetFactory factory, PetriNet petrinetI) {
		WorkDefinition wdPred = ws.getPredecessor();
		WorkDefinition wdSucc = ws.getSuccessor();
		
		switch (ws.getLinkType()) {
		case FINISH_TO_FINISH: {
			Transition t_finishes = (Transition) petrinetI.getNodes().stream().filter(x -> x.getName().equals(wdPred.getName() + "_Finishes")).findFirst().get();
			Place p_finished = (Place) petrinetI.getNodes().stream().filter(x -> x.getName().equals(wdSucc.getName() + "_Finished")).findFirst().get();
			Arc a = factory.createArc();
			p_finished.setIngoing(a);
			t_finishes.getOutgoing().add(a);
			a.setSource(t_finishes);
			a.setTarget(p_finished);
			petrinetI.getArcs().add(a);
			return;
		}
		case START_TO_FINISH: {
			Transition t_finishes = (Transition) petrinetI.getNodes().stream().filter(x -> x.getName().equals(wdPred.getName() + "_Finishes")).findFirst().get();
			Place p_finished = (Place) petrinetI.getNodes().stream().filter(x -> x.getName().equals(wdSucc.getName() + "_Started")).findFirst().get();
			Arc a = factory.createArc();
			p_finished.getOutgoing().add(a);
			t_finishes.setIngoing(a);
			a.setSource(p_finished);
			a.setTarget(t_finishes);
			petrinetI.getArcs().add(a);	
			return;
		}
		case START_TO_START: {
			Transition t_finishes = (Transition) petrinetI.getNodes().stream().filter(x -> x.getName().equals(wdPred.getName() + "_Starts")).findFirst().get();
			Place p_finished = (Place) petrinetI.getNodes().stream().filter(x -> x.getName().equals(wdSucc.getName() + "_Started")).findFirst().get();
			Arc a = factory.createArc();
			p_finished.getOutgoing().add(a);
			t_finishes.setIngoing(a);
			a.setSource(p_finished);
			a.setTarget(t_finishes);
			petrinetI.getArcs().add(a);
			return;
		}
		case FINISH_TO_START: {
			Transition t_finishes = (Transition) petrinetI.getNodes().stream().filter(x -> x.getName().equals(wdPred.getName() + "_Starts")).findFirst().get();
			Place p_finished = (Place) petrinetI.getNodes().stream().filter(x -> x.getName().equals(wdSucc.getName() + "_Finished")).findFirst().get();
			Arc a = factory.createArc();
			p_finished.getOutgoing().add(a);
			t_finishes.setIngoing(a);
			a.setSource(p_finished);
			a.setTarget(t_finishes);
			petrinetI.getArcs().add(a);	
			return;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + ws.getLinkType());
		}
	}

}
