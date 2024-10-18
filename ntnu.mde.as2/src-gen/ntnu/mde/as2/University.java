/**
 */
package ntnu.mde.as2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ntnu.mde.as2.University#getUser <em>User</em>}</li>
 *   <li>{@link ntnu.mde.as2.University#getFaculties <em>Faculties</em>}</li>
 * </ul>
 *
 * @see ntnu.mde.as2.As2Package#getUniversity()
 * @model
 * @generated
 */
public interface University extends Entity {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference list.
	 * The list contents are of type {@link ntnu.mde.as2.User}.
	 * It is bidirectional and its opposite is '{@link ntnu.mde.as2.User#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference list.
	 * @see ntnu.mde.as2.As2Package#getUniversity_User()
	 * @see ntnu.mde.as2.User#getUniversity
	 * @model opposite="university"
	 * @generated
	 */
	EList<User> getUser();

	/**
	 * Returns the value of the '<em><b>Faculties</b></em>' reference list.
	 * The list contents are of type {@link ntnu.mde.as2.Faculty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faculties</em>' reference list.
	 * @see ntnu.mde.as2.As2Package#getUniversity_Faculties()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Faculty> getFaculties();

} // University
