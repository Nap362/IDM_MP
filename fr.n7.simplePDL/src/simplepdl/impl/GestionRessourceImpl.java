/**
 */
package simplepdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import simplepdl.GestionRessource;
import simplepdl.Ressource;
import simplepdl.SimplepdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gestion Ressource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.GestionRessourceImpl#getQuantiteMax <em>Quantite Max</em>}</li>
 *   <li>{@link simplepdl.impl.GestionRessourceImpl#getRessources <em>Ressources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GestionRessourceImpl extends ProcessElementImpl implements GestionRessource {
	/**
	 * The default value of the '{@link #getQuantiteMax() <em>Quantite Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMax()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITE_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantiteMax() <em>Quantite Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMax()
	 * @generated
	 * @ordered
	 */
	protected int quantiteMax = QUANTITE_MAX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRessources() <em>Ressources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessources()
	 * @generated
	 * @ordered
	 */
	protected EList<Ressource> ressources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GestionRessourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.GESTION_RESSOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getQuantiteMax() {
		return quantiteMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantiteMax(int newQuantiteMax) {
		int oldQuantiteMax = quantiteMax;
		quantiteMax = newQuantiteMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.GESTION_RESSOURCE__QUANTITE_MAX, oldQuantiteMax, quantiteMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Ressource> getRessources() {
		if (ressources == null) {
			ressources = new EObjectResolvingEList<Ressource>(Ressource.class, this, SimplepdlPackage.GESTION_RESSOURCE__RESSOURCES);
		}
		return ressources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplepdlPackage.GESTION_RESSOURCE__QUANTITE_MAX:
				return getQuantiteMax();
			case SimplepdlPackage.GESTION_RESSOURCE__RESSOURCES:
				return getRessources();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplepdlPackage.GESTION_RESSOURCE__QUANTITE_MAX:
				setQuantiteMax((Integer)newValue);
				return;
			case SimplepdlPackage.GESTION_RESSOURCE__RESSOURCES:
				getRessources().clear();
				getRessources().addAll((Collection<? extends Ressource>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimplepdlPackage.GESTION_RESSOURCE__QUANTITE_MAX:
				setQuantiteMax(QUANTITE_MAX_EDEFAULT);
				return;
			case SimplepdlPackage.GESTION_RESSOURCE__RESSOURCES:
				getRessources().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimplepdlPackage.GESTION_RESSOURCE__QUANTITE_MAX:
				return quantiteMax != QUANTITE_MAX_EDEFAULT;
			case SimplepdlPackage.GESTION_RESSOURCE__RESSOURCES:
				return ressources != null && !ressources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (quantiteMax: ");
		result.append(quantiteMax);
		result.append(')');
		return result.toString();
	}

} //GestionRessourceImpl
