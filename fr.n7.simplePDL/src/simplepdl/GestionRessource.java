/**
 */
package simplepdl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gestion Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.GestionRessource#getQuantiteRequise <em>Quantite Requise</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getGestionRessource()
 * @model
 * @generated
 */
public interface GestionRessource extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Quantite Requise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Requise</em>' attribute.
	 * @see #setQuantiteRequise(int)
	 * @see simplepdl.SimplepdlPackage#getGestionRessource_QuantiteRequise()
	 * @model required="true"
	 * @generated
	 */
	int getQuantiteRequise();

	/**
	 * Sets the value of the '{@link simplepdl.GestionRessource#getQuantiteRequise <em>Quantite Requise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Requise</em>' attribute.
	 * @see #getQuantiteRequise()
	 * @generated
	 */
	void setQuantiteRequise(int value);

} // GestionRessource
