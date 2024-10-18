/**
 */
package ntnu.mde.as2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ntnu.mde.as2.User#getId <em>Id</em>}</li>
 *   <li>{@link ntnu.mde.as2.User#getName <em>Name</em>}</li>
 *   <li>{@link ntnu.mde.as2.User#getUniversity <em>University</em>}</li>
 *   <li>{@link ntnu.mde.as2.User#getListsOwned <em>Lists Owned</em>}</li>
 * </ul>
 *
 * @see ntnu.mde.as2.As2Package#getUser()
 * @model abstract="true"
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see ntnu.mde.as2.As2Package#getUser_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link ntnu.mde.as2.User#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ntnu.mde.as2.As2Package#getUser_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ntnu.mde.as2.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>University</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ntnu.mde.as2.University#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>University</em>' reference.
	 * @see #setUniversity(University)
	 * @see ntnu.mde.as2.As2Package#getUser_University()
	 * @see ntnu.mde.as2.University#getUser
	 * @model opposite="user" required="true"
	 * @generated
	 */
	University getUniversity();

	/**
	 * Sets the value of the '{@link ntnu.mde.as2.User#getUniversity <em>University</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>University</em>' reference.
	 * @see #getUniversity()
	 * @generated
	 */
	void setUniversity(University value);

	/**
	 * Returns the value of the '<em><b>Lists Owned</b></em>' reference list.
	 * The list contents are of type {@link ntnu.mde.as2.ElectoralRoll}.
	 * It is bidirectional and its opposite is '{@link ntnu.mde.as2.ElectoralRoll#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lists Owned</em>' reference list.
	 * @see ntnu.mde.as2.As2Package#getUser_ListsOwned()
	 * @see ntnu.mde.as2.ElectoralRoll#getOwner
	 * @model opposite="owner"
	 * @generated
	 */
	EList<ElectoralRoll> getListsOwned();

} // User
