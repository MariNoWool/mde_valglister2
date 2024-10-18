/**
 */
package ntnu.mde.as2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ntnu.mde.as2.Student#isCurrentlyEnrolled <em>Currently Enrolled</em>}</li>
 *   <li>{@link ntnu.mde.as2.Student#getEnrolledIn <em>Enrolled In</em>}</li>
 * </ul>
 *
 * @see ntnu.mde.as2.As2Package#getStudent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='canExistOnlyOnceOnARoll canOnlyRunForAssociatedBoards'"
 * @generated
 */
public interface Student extends User {
	/**
	 * Returns the value of the '<em><b>Currently Enrolled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currently Enrolled</em>' attribute.
	 * @see #setCurrentlyEnrolled(boolean)
	 * @see ntnu.mde.as2.As2Package#getStudent_CurrentlyEnrolled()
	 * @model
	 * @generated
	 */
	boolean isCurrentlyEnrolled();

	/**
	 * Sets the value of the '{@link ntnu.mde.as2.Student#isCurrentlyEnrolled <em>Currently Enrolled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currently Enrolled</em>' attribute.
	 * @see #isCurrentlyEnrolled()
	 * @generated
	 */
	void setCurrentlyEnrolled(boolean value);

	/**
	 * Returns the value of the '<em><b>Enrolled In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ntnu.mde.as2.StudyProgramme#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrolled In</em>' reference.
	 * @see #setEnrolledIn(StudyProgramme)
	 * @see ntnu.mde.as2.As2Package#getStudent_EnrolledIn()
	 * @see ntnu.mde.as2.StudyProgramme#getStudents
	 * @model opposite="students" required="true"
	 * @generated
	 */
	StudyProgramme getEnrolledIn();

	/**
	 * Sets the value of the '{@link ntnu.mde.as2.Student#getEnrolledIn <em>Enrolled In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enrolled In</em>' reference.
	 * @see #getEnrolledIn()
	 * @generated
	 */
	void setEnrolledIn(StudyProgramme value);

} // Student
