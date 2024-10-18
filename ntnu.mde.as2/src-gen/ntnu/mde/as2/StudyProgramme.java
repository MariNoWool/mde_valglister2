/**
 */
package ntnu.mde.as2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ntnu.mde.as2.StudyProgramme#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @see ntnu.mde.as2.As2Package#getStudyProgramme()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='studyProgrammeMustBeInDepartment'"
 * @generated
 */
public interface StudyProgramme extends Entity {
	/**
	 * Returns the value of the '<em><b>Students</b></em>' reference list.
	 * The list contents are of type {@link ntnu.mde.as2.Student}.
	 * It is bidirectional and its opposite is '{@link ntnu.mde.as2.Student#getEnrolledIn <em>Enrolled In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' reference list.
	 * @see ntnu.mde.as2.As2Package#getStudyProgramme_Students()
	 * @see ntnu.mde.as2.Student#getEnrolledIn
	 * @model opposite="enrolledIn"
	 * @generated
	 */
	EList<Student> getStudents();

} // StudyProgramme
