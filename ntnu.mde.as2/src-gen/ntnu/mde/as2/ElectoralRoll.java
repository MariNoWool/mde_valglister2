/**
 */
package ntnu.mde.as2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electoral Roll</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ntnu.mde.as2.ElectoralRoll#getName <em>Name</em>}</li>
 *   <li>{@link ntnu.mde.as2.ElectoralRoll#getId <em>Id</em>}</li>
 *   <li>{@link ntnu.mde.as2.ElectoralRoll#getBoard <em>Board</em>}</li>
 *   <li>{@link ntnu.mde.as2.ElectoralRoll#getMembers <em>Members</em>}</li>
 *   <li>{@link ntnu.mde.as2.ElectoralRoll#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see ntnu.mde.as2.As2Package#getElectoralRoll()
 * @model
 * @generated
 */
public interface ElectoralRoll extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ntnu.mde.as2.As2Package#getElectoralRoll_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ntnu.mde.as2.ElectoralRoll#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see ntnu.mde.as2.As2Package#getElectoralRoll_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link ntnu.mde.as2.ElectoralRoll#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Board</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ntnu.mde.as2.Board#getElectoralroll <em>Electoralroll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' reference.
	 * @see #setBoard(Board)
	 * @see ntnu.mde.as2.As2Package#getElectoralRoll_Board()
	 * @see ntnu.mde.as2.Board#getElectoralroll
	 * @model opposite="electoralroll" required="true"
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link ntnu.mde.as2.ElectoralRoll#getBoard <em>Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ntnu.mde.as2.User#getListsOwned <em>Lists Owned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(User)
	 * @see ntnu.mde.as2.As2Package#getElectoralRoll_Owner()
	 * @see ntnu.mde.as2.User#getListsOwned
	 * @model opposite="listsOwned" required="true"
	 * @generated
	 */
	User getOwner();

	/**
	 * Sets the value of the '{@link ntnu.mde.as2.ElectoralRoll#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(User value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' reference list.
	 * The list contents are of type {@link ntnu.mde.as2.Student}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' reference list.
	 * @see ntnu.mde.as2.As2Package#getElectoralRoll_Members()
	 * @model
	 * @generated
	 */
	EList<Student> getMembers();

} // ElectoralRoll
