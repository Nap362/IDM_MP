/**
 */
package simplepdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.AllocationRessource#getQuantiteRequise <em>Quantite Requise</em>}</li>
 *   <li>{@link simplepdl.AllocationRessource#getWorkdefinition <em>Workdefinition</em>}</li>
 *   <li>{@link simplepdl.AllocationRessource#getRessource <em>Ressource</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getAllocationRessource()
 * @model
 * @generated
 */
public interface AllocationRessource extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantite Requise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Requise</em>' attribute.
	 * @see #setQuantiteRequise(int)
	 * @see simplepdl.SimplepdlPackage#getAllocationRessource_QuantiteRequise()
	 * @model required="true"
	 * @generated
	 */
	int getQuantiteRequise();

	/**
	 * Sets the value of the '{@link simplepdl.AllocationRessource#getQuantiteRequise <em>Quantite Requise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Requise</em>' attribute.
	 * @see #getQuantiteRequise()
	 * @generated
	 */
	void setQuantiteRequise(int value);

	/**
	 * Returns the value of the '<em><b>Workdefinition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkDefinition#getAllocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workdefinition</em>' container reference.
	 * @see #setWorkdefinition(WorkDefinition)
	 * @see simplepdl.SimplepdlPackage#getAllocationRessource_Workdefinition()
	 * @see simplepdl.WorkDefinition#getAllocations
	 * @model opposite="allocations" required="true" transient="false"
	 * @generated
	 */
	WorkDefinition getWorkdefinition();

	/**
	 * Sets the value of the '{@link simplepdl.AllocationRessource#getWorkdefinition <em>Workdefinition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workdefinition</em>' container reference.
	 * @see #getWorkdefinition()
	 * @generated
	 */
	void setWorkdefinition(WorkDefinition value);

	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.Ressource#getAllocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' reference.
	 * @see #setRessource(Ressource)
	 * @see simplepdl.SimplepdlPackage#getAllocationRessource_Ressource()
	 * @see simplepdl.Ressource#getAllocations
	 * @model opposite="allocations" required="true"
	 * @generated
	 */
	Ressource getRessource();

	/**
	 * Sets the value of the '{@link simplepdl.AllocationRessource#getRessource <em>Ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressource</em>' reference.
	 * @see #getRessource()
	 * @generated
	 */
	void setRessource(Ressource value);

} // AllocationRessource
