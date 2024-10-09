/**
 */
package petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Place#getNbTokens <em>Nb Tokens</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends Node {
	/**
	 * Returns the value of the '<em><b>Nb Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Tokens</em>' attribute.
	 * @see #setNbTokens(int)
	 * @see petrinet.PetrinetPackage#getPlace_NbTokens()
	 * @model required="true"
	 * @generated
	 */
	int getNbTokens();

	/**
	 * Sets the value of the '{@link petrinet.Place#getNbTokens <em>Nb Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Tokens</em>' attribute.
	 * @see #getNbTokens()
	 * @generated
	 */
	void setNbTokens(int value);

} // Place
