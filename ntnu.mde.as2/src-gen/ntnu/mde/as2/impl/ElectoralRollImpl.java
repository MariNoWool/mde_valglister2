/**
 */
package ntnu.mde.as2.impl;

import java.util.Collection;
import ntnu.mde.as2.As2Package;
import ntnu.mde.as2.Board;
import ntnu.mde.as2.ElectoralRoll;
import ntnu.mde.as2.Student;
import ntnu.mde.as2.User;

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
 * An implementation of the model object '<em><b>Electoral Roll</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ntnu.mde.as2.impl.ElectoralRollImpl#getName <em>Name</em>}</li>
 *   <li>{@link ntnu.mde.as2.impl.ElectoralRollImpl#getId <em>Id</em>}</li>
 *   <li>{@link ntnu.mde.as2.impl.ElectoralRollImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link ntnu.mde.as2.impl.ElectoralRollImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link ntnu.mde.as2.impl.ElectoralRollImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectoralRollImpl extends MinimalEObjectImpl.Container implements ElectoralRoll {
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
	 * The cached value of the '{@link #getBoard() <em>Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoard()
	 * @generated
	 * @ordered
	 */
	protected Board board;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> members;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected User owner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectoralRollImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As2Package.Literals.ELECTORAL_ROLL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, As2Package.ELECTORAL_ROLL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, As2Package.ELECTORAL_ROLL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Board getBoard() {
		if (board != null && board.eIsProxy()) {
			InternalEObject oldBoard = (InternalEObject) board;
			board = (Board) eResolveProxy(oldBoard);
			if (board != oldBoard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, As2Package.ELECTORAL_ROLL__BOARD,
							oldBoard, board));
			}
		}
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board basicGetBoard() {
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoard(Board newBoard, NotificationChain msgs) {
		Board oldBoard = board;
		board = newBoard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					As2Package.ELECTORAL_ROLL__BOARD, oldBoard, newBoard);
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
	public void setBoard(Board newBoard) {
		if (newBoard != board) {
			NotificationChain msgs = null;
			if (board != null)
				msgs = ((InternalEObject) board).eInverseRemove(this, As2Package.BOARD__ELECTORALROLL, Board.class,
						msgs);
			if (newBoard != null)
				msgs = ((InternalEObject) newBoard).eInverseAdd(this, As2Package.BOARD__ELECTORALROLL, Board.class,
						msgs);
			msgs = basicSetBoard(newBoard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As2Package.ELECTORAL_ROLL__BOARD, newBoard,
					newBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject) owner;
			owner = (User) eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, As2Package.ELECTORAL_ROLL__OWNER,
							oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(User newOwner, NotificationChain msgs) {
		User oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					As2Package.ELECTORAL_ROLL__OWNER, oldOwner, newOwner);
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
	public void setOwner(User newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject) owner).eInverseRemove(this, As2Package.USER__LISTS_OWNED, User.class, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject) newOwner).eInverseAdd(this, As2Package.USER__LISTS_OWNED, User.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As2Package.ELECTORAL_ROLL__OWNER, newOwner,
					newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Student> getMembers() {
		if (members == null) {
			members = new EObjectResolvingEList<Student>(Student.class, this, As2Package.ELECTORAL_ROLL__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case As2Package.ELECTORAL_ROLL__BOARD:
			if (board != null)
				msgs = ((InternalEObject) board).eInverseRemove(this, As2Package.BOARD__ELECTORALROLL, Board.class,
						msgs);
			return basicSetBoard((Board) otherEnd, msgs);
		case As2Package.ELECTORAL_ROLL__OWNER:
			if (owner != null)
				msgs = ((InternalEObject) owner).eInverseRemove(this, As2Package.USER__LISTS_OWNED, User.class, msgs);
			return basicSetOwner((User) otherEnd, msgs);
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
		case As2Package.ELECTORAL_ROLL__BOARD:
			return basicSetBoard(null, msgs);
		case As2Package.ELECTORAL_ROLL__OWNER:
			return basicSetOwner(null, msgs);
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
		case As2Package.ELECTORAL_ROLL__NAME:
			return getName();
		case As2Package.ELECTORAL_ROLL__ID:
			return getId();
		case As2Package.ELECTORAL_ROLL__BOARD:
			if (resolve)
				return getBoard();
			return basicGetBoard();
		case As2Package.ELECTORAL_ROLL__MEMBERS:
			return getMembers();
		case As2Package.ELECTORAL_ROLL__OWNER:
			if (resolve)
				return getOwner();
			return basicGetOwner();
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
		case As2Package.ELECTORAL_ROLL__NAME:
			setName((String) newValue);
			return;
		case As2Package.ELECTORAL_ROLL__ID:
			setId((Long) newValue);
			return;
		case As2Package.ELECTORAL_ROLL__BOARD:
			setBoard((Board) newValue);
			return;
		case As2Package.ELECTORAL_ROLL__MEMBERS:
			getMembers().clear();
			getMembers().addAll((Collection<? extends Student>) newValue);
			return;
		case As2Package.ELECTORAL_ROLL__OWNER:
			setOwner((User) newValue);
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
		case As2Package.ELECTORAL_ROLL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case As2Package.ELECTORAL_ROLL__ID:
			setId(ID_EDEFAULT);
			return;
		case As2Package.ELECTORAL_ROLL__BOARD:
			setBoard((Board) null);
			return;
		case As2Package.ELECTORAL_ROLL__MEMBERS:
			getMembers().clear();
			return;
		case As2Package.ELECTORAL_ROLL__OWNER:
			setOwner((User) null);
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
		case As2Package.ELECTORAL_ROLL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case As2Package.ELECTORAL_ROLL__ID:
			return id != ID_EDEFAULT;
		case As2Package.ELECTORAL_ROLL__BOARD:
			return board != null;
		case As2Package.ELECTORAL_ROLL__MEMBERS:
			return members != null && !members.isEmpty();
		case As2Package.ELECTORAL_ROLL__OWNER:
			return owner != null;
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

} //ElectoralRollImpl
