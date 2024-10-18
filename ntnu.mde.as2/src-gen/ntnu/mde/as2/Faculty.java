/**
 */
package ntnu.mde.as2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Faculty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ntnu.mde.as2.Faculty#getDepartments <em>Departments</em>}</li>
 * </ul>
 *
 * @see ntnu.mde.as2.As2Package#getFaculty()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='facultyMustBeInUniversity'"
 * @generated
 */
public interface Faculty extends Entity {
	/**
	 * Returns the value of the '<em><b>Departments</b></em>' reference list.
	 * The list contents are of type {@link ntnu.mde.as2.Department}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departments</em>' reference list.
	 * @see ntnu.mde.as2.As2Package#getFaculty_Departments()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Department> getDepartments();

} // Faculty
