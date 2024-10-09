/**
 */
package simplepdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utilisation Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.UtilisationRessource#getQuantiteMax <em>Quantite Max</em>}</li>
 *   <li>{@link simplepdl.UtilisationRessource#getRessource <em>Ressource</em>}</li>
 *   <li>{@link simplepdl.UtilisationRessource#getWorkDefinition <em>Work Definition</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getUtilisationRessource()
 * @model
 * @generated
 */
public interface UtilisationRessource extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantite Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Max</em>' attribute.
	 * @see #setQuantiteMax(int)
	 * @see simplepdl.SimplepdlPackage#getUtilisationRessource_QuantiteMax()
	 * @model
	 * @generated
	 */
	int getQuantiteMax();

	/**
	 * Sets the value of the '{@link simplepdl.UtilisationRessource#getQuantiteMax <em>Quantite Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Max</em>' attribute.
	 * @see #getQuantiteMax()
	 * @generated
	 */
	void setQuantiteMax(int value);

	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' reference list.
	 * The list contents are of type {@link simplepdl.Ressource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' reference list.
	 * @see simplepdl.SimplepdlPackage#getUtilisationRessource_Ressource()
	 * @model required="true"
	 * @generated
	 */
	EList<Ressource> getRessource();

	/**
	 * Returns the value of the '<em><b>Work Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Definition</em>' reference.
	 * @see simplepdl.SimplepdlPackage#getUtilisationRessource_WorkDefinition()
	 * @model required="true" changeable="false" ordered="false"
	 * @generated
	 */
	WorkDefinition getWorkDefinition();

} // UtilisationRessource
