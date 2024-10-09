/**
 */
package simplepdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import simplepdl.Ressource;
import simplepdl.SimplepdlPackage;
import simplepdl.UtilisationRessource;
import simplepdl.WorkDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Utilisation Ressource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.UtilisationRessourceImpl#getQuantiteMax <em>Quantite Max</em>}</li>
 *   <li>{@link simplepdl.impl.UtilisationRessourceImpl#getRessource <em>Ressource</em>}</li>
 *   <li>{@link simplepdl.impl.UtilisationRessourceImpl#getWorkDefinition <em>Work Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UtilisationRessourceImpl extends MinimalEObjectImpl.Container implements UtilisationRessource {
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
	 * The cached value of the '{@link #getRessource() <em>Ressource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessource()
	 * @generated
	 * @ordered
	 */
	protected EList<Ressource> ressource;

	/**
	 * The cached value of the '{@link #getWorkDefinition() <em>Work Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkDefinition()
	 * @generated
	 * @ordered
	 */
	protected WorkDefinition workDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtilisationRessourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.UTILISATION_RESSOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.UTILISATION_RESSOURCE__QUANTITE_MAX, oldQuantiteMax, quantiteMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Ressource> getRessource() {
		if (ressource == null) {
			ressource = new EObjectResolvingEList<Ressource>(Ressource.class, this, SimplepdlPackage.UTILISATION_RESSOURCE__RESSOURCE);
		}
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkDefinition getWorkDefinition() {
		if (workDefinition != null && workDefinition.eIsProxy()) {
			InternalEObject oldWorkDefinition = (InternalEObject)workDefinition;
			workDefinition = (WorkDefinition)eResolveProxy(oldWorkDefinition);
			if (workDefinition != oldWorkDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.UTILISATION_RESSOURCE__WORK_DEFINITION, oldWorkDefinition, workDefinition));
			}
		}
		return workDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition basicGetWorkDefinition() {
		return workDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplepdlPackage.UTILISATION_RESSOURCE__QUANTITE_MAX:
				return getQuantiteMax();
			case SimplepdlPackage.UTILISATION_RESSOURCE__RESSOURCE:
				return getRessource();
			case SimplepdlPackage.UTILISATION_RESSOURCE__WORK_DEFINITION:
				if (resolve) return getWorkDefinition();
				return basicGetWorkDefinition();
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
			case SimplepdlPackage.UTILISATION_RESSOURCE__QUANTITE_MAX:
				setQuantiteMax((Integer)newValue);
				return;
			case SimplepdlPackage.UTILISATION_RESSOURCE__RESSOURCE:
				getRessource().clear();
				getRessource().addAll((Collection<? extends Ressource>)newValue);
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
			case SimplepdlPackage.UTILISATION_RESSOURCE__QUANTITE_MAX:
				setQuantiteMax(QUANTITE_MAX_EDEFAULT);
				return;
			case SimplepdlPackage.UTILISATION_RESSOURCE__RESSOURCE:
				getRessource().clear();
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
			case SimplepdlPackage.UTILISATION_RESSOURCE__QUANTITE_MAX:
				return quantiteMax != QUANTITE_MAX_EDEFAULT;
			case SimplepdlPackage.UTILISATION_RESSOURCE__RESSOURCE:
				return ressource != null && !ressource.isEmpty();
			case SimplepdlPackage.UTILISATION_RESSOURCE__WORK_DEFINITION:
				return workDefinition != null;
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

} //UtilisationRessourceImpl
