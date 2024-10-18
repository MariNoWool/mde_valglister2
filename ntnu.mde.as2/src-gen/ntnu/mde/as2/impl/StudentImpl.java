/**
 */
package ntnu.mde.as2.impl;

import ntnu.mde.as2.As2Package;
import ntnu.mde.as2.Student;

import ntnu.mde.as2.StudyProgramme;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ntnu.mde.as2.impl.StudentImpl#isCurrentlyEnrolled <em>Currently Enrolled</em>}</li>
 *   <li>{@link ntnu.mde.as2.impl.StudentImpl#getEnrolledIn <em>Enrolled In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends UserImpl implements Student {
	/**
	 * The default value of the '{@link #isCurrentlyEnrolled() <em>Currently Enrolled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurrentlyEnrolled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CURRENTLY_ENROLLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCurrentlyEnrolled() <em>Currently Enrolled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurrentlyEnrolled()
	 * @generated
	 * @ordered
	 */
	protected boolean currentlyEnrolled = CURRENTLY_ENROLLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnrolledIn() <em>Enrolled In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrolledIn()
	 * @generated
	 * @ordered
	 */
	protected StudyProgramme enrolledIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As2Package.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCurrentlyEnrolled() {
		return currentlyEnrolled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentlyEnrolled(boolean newCurrentlyEnrolled) {
		boolean oldCurrentlyEnrolled = currentlyEnrolled;
		currentlyEnrolled = newCurrentlyEnrolled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As2Package.STUDENT__CURRENTLY_ENROLLED,
					oldCurrentlyEnrolled, currentlyEnrolled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyProgramme getEnrolledIn() {
		if (enrolledIn != null && enrolledIn.eIsProxy()) {
			InternalEObject oldEnrolledIn = (InternalEObject) enrolledIn;
			enrolledIn = (StudyProgramme) eResolveProxy(oldEnrolledIn);
			if (enrolledIn != oldEnrolledIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, As2Package.STUDENT__ENROLLED_IN,
							oldEnrolledIn, enrolledIn));
			}
		}
		return enrolledIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyProgramme basicGetEnrolledIn() {
		return enrolledIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnrolledIn(StudyProgramme newEnrolledIn, NotificationChain msgs) {
		StudyProgramme oldEnrolledIn = enrolledIn;
		enrolledIn = newEnrolledIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					As2Package.STUDENT__ENROLLED_IN, oldEnrolledIn, newEnrolledIn);
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
	public void setEnrolledIn(StudyProgramme newEnrolledIn) {
		if (newEnrolledIn != enrolledIn) {
			NotificationChain msgs = null;
			if (enrolledIn != null)
				msgs = ((InternalEObject) enrolledIn).eInverseRemove(this, As2Package.STUDY_PROGRAMME__STUDENTS,
						StudyProgramme.class, msgs);
			if (newEnrolledIn != null)
				msgs = ((InternalEObject) newEnrolledIn).eInverseAdd(this, As2Package.STUDY_PROGRAMME__STUDENTS,
						StudyProgramme.class, msgs);
			msgs = basicSetEnrolledIn(newEnrolledIn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As2Package.STUDENT__ENROLLED_IN, newEnrolledIn,
					newEnrolledIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case As2Package.STUDENT__ENROLLED_IN:
			if (enrolledIn != null)
				msgs = ((InternalEObject) enrolledIn).eInverseRemove(this, As2Package.STUDY_PROGRAMME__STUDENTS,
						StudyProgramme.class, msgs);
			return basicSetEnrolledIn((StudyProgramme) otherEnd, msgs);
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
		case As2Package.STUDENT__ENROLLED_IN:
			return basicSetEnrolledIn(null, msgs);
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
		case As2Package.STUDENT__CURRENTLY_ENROLLED:
			return isCurrentlyEnrolled();
		case As2Package.STUDENT__ENROLLED_IN:
			if (resolve)
				return getEnrolledIn();
			return basicGetEnrolledIn();
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
		case As2Package.STUDENT__CURRENTLY_ENROLLED:
			setCurrentlyEnrolled((Boolean) newValue);
			return;
		case As2Package.STUDENT__ENROLLED_IN:
			setEnrolledIn((StudyProgramme) newValue);
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
		case As2Package.STUDENT__CURRENTLY_ENROLLED:
			setCurrentlyEnrolled(CURRENTLY_ENROLLED_EDEFAULT);
			return;
		case As2Package.STUDENT__ENROLLED_IN:
			setEnrolledIn((StudyProgramme) null);
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
		case As2Package.STUDENT__CURRENTLY_ENROLLED:
			return currentlyEnrolled != CURRENTLY_ENROLLED_EDEFAULT;
		case As2Package.STUDENT__ENROLLED_IN:
			return enrolledIn != null;
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
		result.append(" (currentlyEnrolled: ");
		result.append(currentlyEnrolled);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
