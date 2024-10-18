/**
 */
package ntnu.mde.as2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ntnu.mde.as2.Department#getStudyprogrammes <em>Studyprogrammes</em>}</li>
 * </ul>
 *
 * @see ntnu.mde.as2.As2Package#getDepartment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='departmentMustBeInFaculty'"
 * @generated
 */
public interface Department extends Entity {
	/**
	 * Returns the value of the '<em><b>Studyprogrammes</b></em>' reference list.
	 * The list contents are of type {@link ntnu.mde.as2.StudyProgramme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studyprogrammes</em>' reference list.
	 * @see ntnu.mde.as2.As2Package#getDepartment_Studyprogrammes()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<StudyProgramme> getStudyprogrammes();

} // Department
