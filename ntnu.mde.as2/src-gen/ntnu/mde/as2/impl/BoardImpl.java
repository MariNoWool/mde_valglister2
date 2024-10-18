/**
 */
package ntnu.mde.as2.impl;

import java.util.Collection;

import ntnu.mde.as2.As2Package;
import ntnu.mde.as2.Board;
import ntnu.mde.as2.ElectoralRoll;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ntnu.mde.as2.impl.BoardImpl#getName <em>Name</em>}</li>
 *   <li>{@link ntnu.mde.as2.impl.BoardImpl#getId <em>Id</em>}</li>
 *   <li>{@link ntnu.mde.as2.impl.BoardImpl#getElectoralroll <em>Electoralroll</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoardImpl extends MinimalEObjectImpl.Container implements Board {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElectoralroll() <em>Electoralroll</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectoralroll()
	 * @generated
	 * @ordered
	 */
	protected ElectoralRoll electoralroll;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As2Package.Literals.BOARD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, As2Package.BOARD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As2Package.BOARD__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElectoralRoll getElectoralroll() {
		if (electoralroll != null && electoralroll.eIsProxy()) {
			InternalEObject oldElectoralroll = (InternalEObject) electoralroll;
			electoralroll = (ElectoralRoll) eResolveProxy(oldElectoralroll);
			if (electoralroll != oldElectoralroll) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, As2Package.BOARD__ELECTORALROLL,
							oldElectoralroll, electoralroll));
			}
		}
		return electoralroll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectoralRoll basicGetElectoralroll() {
		return electoralroll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectoralroll(ElectoralRoll newElectoralroll, NotificationChain msgs) {
		ElectoralRoll oldElectoralroll = electoralroll;
		electoralroll = newElectoralroll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					As2Package.BOARD__ELECTORALROLL, oldElectoralroll, newElectoralroll);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElectoralroll(ElectoralRoll newElectoralroll) {
		if (newElectoralroll != electoralroll) {
			NotificationChain msgs = null;
			if (electoralroll != null)
				msgs = ((InternalEObject) electoralroll).eInverseRemove(this, As2Package.ELECTORAL_ROLL__BOARD,
						ElectoralRoll.class, msgs);
			if (newElectoralroll != null)
				msgs = ((InternalEObject) newElectoralroll).eInverseAdd(this, As2Package.ELECTORAL_ROLL__BOARD,
						ElectoralRoll.class, msgs);
			msgs = basicSetElectoralroll(newElectoralroll, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As2Package.BOARD__ELECTORALROLL, newElectoralroll,
					newElectoralroll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case As2Package.BOARD__ELECTORALROLL:
			if (electoralroll != null)
				msgs = ((InternalEObject) electoralroll).eInverseRemove(this, As2Package.ELECTORAL_ROLL__BOARD,
						ElectoralRoll.class, msgs);
			return basicSetElectoralroll((ElectoralRoll) otherEnd, msgs);
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
		case As2Package.BOARD__ELECTORALROLL:
			return basicSetElectoralroll(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case As2Package.BOARD__NAME:
			return getName();
		case As2Package.BOARD__ID:
			return getId();
		case As2Package.BOARD__ELECTORALROLL:
			if (resolve)
				return getElectoralroll();
			return basicGetElectoralroll();
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
		case As2Package.BOARD__NAME:
			setName((String) newValue);
			return;
		case As2Package.BOARD__ID:
			setId((Long) newValue);
			return;
		case As2Package.BOARD__ELECTORALROLL:
			setElectoralroll((ElectoralRoll) newValue);
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
		case As2Package.BOARD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case As2Package.BOARD__ID:
			setId(ID_EDEFAULT);
			return;
		case As2Package.BOARD__ELECTORALROLL:
			setElectoralroll((ElectoralRoll) null);
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
		case As2Package.BOARD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case As2Package.BOARD__ID:
			return id != ID_EDEFAULT;
		case As2Package.BOARD__ELECTORALROLL:
			return electoralroll != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //BoardImpl
