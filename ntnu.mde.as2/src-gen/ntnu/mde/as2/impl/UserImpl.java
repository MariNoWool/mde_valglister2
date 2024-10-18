/**
 */
package ntnu.mde.as2.impl;

import java.util.Collection;
import ntnu.mde.as2.As2Package;
import ntnu.mde.as2.ElectoralRoll;
import ntnu.mde.as2.University;
import ntnu.mde.as2.User;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ntnu.mde.as2.impl.UserImpl#getId <em>Id</em>}</li>
 *   <li>{@link ntnu.mde.as2.impl.UserImpl#getName <em>Name</em>}</li>
 *   <li>{@link ntnu.mde.as2.impl.UserImpl#getUniversity <em>University</em>}</li>
 *   <li>{@link ntnu.mde.as2.impl.UserImpl#getListsOwned <em>Lists Owned</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UserImpl extends MinimalEObjectImpl.Container implements User {
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
	 * The cached value of the '{@link #getUniversity() <em>University</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniversity()
	 * @generated
	 * @ordered
	 */
	protected University university;

	/**
	 * The cached value of the '{@link #getListsOwned() <em>Lists Owned</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListsOwned()
	 * @generated
	 * @ordered
	 */
	protected EList<ElectoralRoll> listsOwned;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As2Package.Literals.USER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, As2Package.USER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, As2Package.USER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public University getUniversity() {
		if (university != null && university.eIsProxy()) {
			InternalEObject oldUniversity = (InternalEObject) university;
			university = (University) eResolveProxy(oldUniversity);
			if (university != oldUniversity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, As2Package.USER__UNIVERSITY,
							oldUniversity, university));
			}
		}
		return university;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public University basicGetUniversity() {
		return university;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUniversity(University newUniversity, NotificationChain msgs) {
		University oldUniversity = university;
		university = newUniversity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As2Package.USER__UNIVERSITY,
					oldUniversity, newUniversity);
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
	public void setUniversity(University newUniversity) {
		if (newUniversity != university) {
			NotificationChain msgs = null;
			if (university != null)
				msgs = ((InternalEObject) university).eInverseRemove(this, As2Package.UNIVERSITY__USER,
						University.class, msgs);
			if (newUniversity != null)
				msgs = ((InternalEObject) newUniversity).eInverseAdd(this, As2Package.UNIVERSITY__USER,
						University.class, msgs);
			msgs = basicSetUniversity(newUniversity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As2Package.USER__UNIVERSITY, newUniversity,
					newUniversity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElectoralRoll> getListsOwned() {
		if (listsOwned == null) {
			listsOwned = new EObjectWithInverseResolvingEList<ElectoralRoll>(ElectoralRoll.class, this,
					As2Package.USER__LISTS_OWNED, As2Package.ELECTORAL_ROLL__OWNER);
		}
		return listsOwned;
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
		case As2Package.USER__UNIVERSITY:
			if (university != null)
				msgs = ((InternalEObject) university).eInverseRemove(this, As2Package.UNIVERSITY__USER,
						University.class, msgs);
			return basicSetUniversity((University) otherEnd, msgs);
		case As2Package.USER__LISTS_OWNED:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getListsOwned()).basicAdd(otherEnd, msgs);
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
		case As2Package.USER__UNIVERSITY:
			return basicSetUniversity(null, msgs);
		case As2Package.USER__LISTS_OWNED:
			return ((InternalEList<?>) getListsOwned()).basicRemove(otherEnd, msgs);
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
		case As2Package.USER__ID:
			return getId();
		case As2Package.USER__NAME:
			return getName();
		case As2Package.USER__UNIVERSITY:
			if (resolve)
				return getUniversity();
			return basicGetUniversity();
		case As2Package.USER__LISTS_OWNED:
			return getListsOwned();
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
		case As2Package.USER__ID:
			setId((Long) newValue);
			return;
		case As2Package.USER__NAME:
			setName((String) newValue);
			return;
		case As2Package.USER__UNIVERSITY:
			setUniversity((University) newValue);
			return;
		case As2Package.USER__LISTS_OWNED:
			getListsOwned().clear();
			getListsOwned().addAll((Collection<? extends ElectoralRoll>) newValue);
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
		case As2Package.USER__ID:
			setId(ID_EDEFAULT);
			return;
		case As2Package.USER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case As2Package.USER__UNIVERSITY:
			setUniversity((University) null);
			return;
		case As2Package.USER__LISTS_OWNED:
			getListsOwned().clear();
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
		case As2Package.USER__ID:
			return id != ID_EDEFAULT;
		case As2Package.USER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case As2Package.USER__UNIVERSITY:
			return university != null;
		case As2Package.USER__LISTS_OWNED:
			return listsOwned != null && !listsOwned.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //UserImpl
