/**
 */
package petrinet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinet.Arc;
import petrinet.Node;
import petrinet.PetriNet;
import petrinet.PetrinetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.NodeImpl#getReseau <em>Reseau</em>}</li>
 *   <li>{@link petrinet.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.impl.NodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link petrinet.impl.NodeImpl#getIngoing <em>Ingoing</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> outgoing;

	/**
	 * The cached value of the '{@link #getIngoing() <em>Ingoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngoing()
	 * @generated
	 * @ordered
	 */
	protected Arc ingoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PetriNet getReseau() {
		if (eContainerFeatureID() != PetrinetPackage.NODE__RESEAU) return null;
		return (PetriNet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReseau(PetriNet newReseau, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReseau, PetrinetPackage.NODE__RESEAU, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReseau(PetriNet newReseau) {
		if (newReseau != eInternalContainer() || (eContainerFeatureID() != PetrinetPackage.NODE__RESEAU && newReseau != null)) {
			if (EcoreUtil.isAncestor(this, newReseau))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReseau != null)
				msgs = ((InternalEObject)newReseau).eInverseAdd(this, PetrinetPackage.PETRI_NET__NODES, PetriNet.class, msgs);
			msgs = basicSetReseau(newReseau, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.NODE__RESEAU, newReseau, newReseau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Arc> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PetrinetPackage.NODE__OUTGOING, PetrinetPackage.ARC__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Arc getIngoing() {
		if (ingoing != null && ingoing.eIsProxy()) {
			InternalEObject oldIngoing = (InternalEObject)ingoing;
			ingoing = (Arc)eResolveProxy(oldIngoing);
			if (ingoing != oldIngoing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.NODE__INGOING, oldIngoing, ingoing));
			}
		}
		return ingoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc basicGetIngoing() {
		return ingoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIngoing(Arc newIngoing, NotificationChain msgs) {
		Arc oldIngoing = ingoing;
		ingoing = newIngoing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetPackage.NODE__INGOING, oldIngoing, newIngoing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIngoing(Arc newIngoing) {
		if (newIngoing != ingoing) {
			NotificationChain msgs = null;
			if (ingoing != null)
				msgs = ((InternalEObject)ingoing).eInverseRemove(this, PetrinetPackage.ARC__TARGET, Arc.class, msgs);
			if (newIngoing != null)
				msgs = ((InternalEObject)newIngoing).eInverseAdd(this, PetrinetPackage.ARC__TARGET, Arc.class, msgs);
			msgs = basicSetIngoing(newIngoing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.NODE__INGOING, newIngoing, newIngoing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetPackage.NODE__RESEAU:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReseau((PetriNet)otherEnd, msgs);
			case PetrinetPackage.NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
			case PetrinetPackage.NODE__INGOING:
				if (ingoing != null)
					msgs = ((InternalEObject)ingoing).eInverseRemove(this, PetrinetPackage.ARC__TARGET, Arc.class, msgs);
				return basicSetIngoing((Arc)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetPackage.NODE__RESEAU:
				return basicSetReseau(null, msgs);
			case PetrinetPackage.NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case PetrinetPackage.NODE__INGOING:
				return basicSetIngoing(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PetrinetPackage.NODE__RESEAU:
				return eInternalContainer().eInverseRemove(this, PetrinetPackage.PETRI_NET__NODES, PetriNet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetPackage.NODE__RESEAU:
				return getReseau();
			case PetrinetPackage.NODE__NAME:
				return getName();
			case PetrinetPackage.NODE__OUTGOING:
				return getOutgoing();
			case PetrinetPackage.NODE__INGOING:
				if (resolve) return getIngoing();
				return basicGetIngoing();
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
			case PetrinetPackage.NODE__RESEAU:
				setReseau((PetriNet)newValue);
				return;
			case PetrinetPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case PetrinetPackage.NODE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Arc>)newValue);
				return;
			case PetrinetPackage.NODE__INGOING:
				setIngoing((Arc)newValue);
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
			case PetrinetPackage.NODE__RESEAU:
				setReseau((PetriNet)null);
				return;
			case PetrinetPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PetrinetPackage.NODE__OUTGOING:
				getOutgoing().clear();
				return;
			case PetrinetPackage.NODE__INGOING:
				setIngoing((Arc)null);
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
			case PetrinetPackage.NODE__RESEAU:
				return getReseau() != null;
			case PetrinetPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PetrinetPackage.NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case PetrinetPackage.NODE__INGOING:
				return ingoing != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
