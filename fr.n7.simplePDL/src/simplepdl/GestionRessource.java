/**
 */
package simplepdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gestion Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.GestionRessource#getQuantiteMax <em>Quantite Max</em>}</li>
 *   <li>{@link simplepdl.GestionRessource#getRessources <em>Ressources</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getGestionRessource()
 * @model
 * @generated
 */
public interface GestionRessource extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Quantite Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Max</em>' attribute.
	 * @see #setQuantiteMax(int)
	 * @see simplepdl.SimplepdlPackage#getGestionRessource_QuantiteMax()
	 * @model required="true"
	 * @generated
	 */
	int getQuantiteMax();

	/**
	 * Sets the value of the '{@link simplepdl.GestionRessource#getQuantiteMax <em>Quantite Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Max</em>' attribute.
	 * @see #getQuantiteMax()
	 * @generated
	 */
	void setQuantiteMax(int value);

	/**
	 * Returns the value of the '<em><b>Ressources</b></em>' reference list.
	 * The list contents are of type {@link simplepdl.Ressource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressources</em>' reference list.
	 * @see simplepdl.SimplepdlPackage#getGestionRessource_Ressources()
	 * @model
	 * @generated
	 */
	EList<Ressource> getRessources();

} // GestionRessource
