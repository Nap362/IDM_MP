/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Node#getReseau <em>Reseau</em>}</li>
 *   <li>{@link petrinet.Node#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link petrinet.Node#getIngoing <em>Ingoing</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Reseau</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link petrinet.PetriNet#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reseau</em>' container reference.
	 * @see #setReseau(PetriNet)
	 * @see petrinet.PetrinetPackage#getNode_Reseau()
	 * @see petrinet.PetriNet#getNodes
	 * @model opposite="nodes" transient="false"
	 * @generated
	 */
	PetriNet getReseau();

	/**
	 * Sets the value of the '{@link petrinet.Node#getReseau <em>Reseau</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reseau</em>' container reference.
	 * @see #getReseau()
	 * @generated
	 */
	void setReseau(PetriNet value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinet.PetrinetPackage#getNode_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Arc}.
	 * It is bidirectional and its opposite is '{@link petrinet.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see petrinet.PetrinetPackage#getNode_Outgoing()
	 * @see petrinet.Arc#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Arc> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Ingoing</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinet.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingoing</em>' reference.
	 * @see #setIngoing(Arc)
	 * @see petrinet.PetrinetPackage#getNode_Ingoing()
	 * @see petrinet.Arc#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	Arc getIngoing();

	/**
	 * Sets the value of the '{@link petrinet.Node#getIngoing <em>Ingoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ingoing</em>' reference.
	 * @see #getIngoing()
	 * @generated
	 */
	void setIngoing(Arc value);

} // Node
