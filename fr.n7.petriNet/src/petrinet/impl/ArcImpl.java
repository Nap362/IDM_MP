/**
 */
package petrinet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import petrinet.Arc;
import petrinet.Node;
import petrinet.PetriNet;
import petrinet.PetrinetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.ArcImpl#getPetrinet <em>Petrinet</em>}</li>
 *   <li>{@link petrinet.impl.ArcImpl#getSource <em>Source</em>}</li>
 *   <li>{@link petrinet.impl.ArcImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link petrinet.impl.ArcImpl#getPoids <em>Poids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArcImpl extends MinimalEObjectImpl.Container implements Arc {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Node source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Node target;

	/**
	 * The default value of the '{@link #getPoids() <em>Poids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoids()
	 * @generated
	 * @ordered
	 */
	protected static final int POIDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoids() <em>Poids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoids()
	 * @generated
	 * @ordered
	 */
	protected int poids = POIDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PetriNet getPetrinet() {
		if (eContainerFeatureID() != PetrinetPackage.ARC__PETRINET) return null;
		return (PetriNet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPetrinet(PetriNet newPetrinet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPetrinet, PetrinetPackage.ARC__PETRINET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPetrinet(PetriNet newPetrinet) {
		if (newPetrinet != eInternalContainer() || (eContainerFeatureID() != PetrinetPackage.ARC__PETRINET && newPetrinet != null)) {
			if (EcoreUtil.isAncestor(this, newPetrinet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPetrinet != null)
				msgs = ((InternalEObject)newPetrinet).eInverseAdd(this, PetrinetPackage.PETRI_NET__ARCS, PetriNet.class, msgs);
			msgs = basicSetPetrinet(newPetrinet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__PETRINET, newPetrinet, newPetrinet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Node)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.ARC__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Node newSource, NotificationChain msgs) {
		Node oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__SOURCE, oldSource, newSource);
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
	public void setSource(Node newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, PetrinetPackage.NODE__OUTGOING, Node.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, PetrinetPackage.NODE__OUTGOING, Node.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Node)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.ARC__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Node newTarget, NotificationChain msgs) {
		Node oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__TARGET, oldTarget, newTarget);
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
	public void setTarget(Node newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, PetrinetPackage.NODE__INGOING, Node.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, PetrinetPackage.NODE__INGOING, Node.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPoids() {
		return poids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoids(int newPoids) {
		int oldPoids = poids;
		poids = newPoids;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__POIDS, oldPoids, poids));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetPackage.ARC__PETRINET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPetrinet((PetriNet)otherEnd, msgs);
			case PetrinetPackage.ARC__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, PetrinetPackage.NODE__OUTGOING, Node.class, msgs);
				return basicSetSource((Node)otherEnd, msgs);
			case PetrinetPackage.ARC__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, PetrinetPackage.NODE__INGOING, Node.class, msgs);
				return basicSetTarget((Node)otherEnd, msgs);
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
			case PetrinetPackage.ARC__PETRINET:
				return basicSetPetrinet(null, msgs);
			case PetrinetPackage.ARC__SOURCE:
				return basicSetSource(null, msgs);
			case PetrinetPackage.ARC__TARGET:
				return basicSetTarget(null, msgs);
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
			case PetrinetPackage.ARC__PETRINET:
				return eInternalContainer().eInverseRemove(this, PetrinetPackage.PETRI_NET__ARCS, PetriNet.class, msgs);
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
			case PetrinetPackage.ARC__PETRINET:
				return getPetrinet();
			case PetrinetPackage.ARC__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case PetrinetPackage.ARC__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case PetrinetPackage.ARC__POIDS:
				return getPoids();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetrinetPackage.ARC__PETRINET:
				setPetrinet((PetriNet)newValue);
				return;
			case PetrinetPackage.ARC__SOURCE:
				setSource((Node)newValue);
				return;
			case PetrinetPackage.ARC__TARGET:
				setTarget((Node)newValue);
				return;
			case PetrinetPackage.ARC__POIDS:
				setPoids((Integer)newValue);
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
			case PetrinetPackage.ARC__PETRINET:
				setPetrinet((PetriNet)null);
				return;
			case PetrinetPackage.ARC__SOURCE:
				setSource((Node)null);
				return;
			case PetrinetPackage.ARC__TARGET:
				setTarget((Node)null);
				return;
			case PetrinetPackage.ARC__POIDS:
				setPoids(POIDS_EDEFAULT);
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
			case PetrinetPackage.ARC__PETRINET:
				return getPetrinet() != null;
			case PetrinetPackage.ARC__SOURCE:
				return source != null;
			case PetrinetPackage.ARC__TARGET:
				return target != null;
			case PetrinetPackage.ARC__POIDS:
				return poids != POIDS_EDEFAULT;
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
		result.append(" (poids: ");
		result.append(poids);
		result.append(')');
		return result.toString();
	}

} //ArcImpl
