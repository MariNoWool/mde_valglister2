/**
 */
package ntnu.mde.as2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ntnu.mde.as2.Board#getName <em>Name</em>}</li>
 *   <li>{@link ntnu.mde.as2.Board#getId <em>Id</em>}</li>
 *   <li>{@link ntnu.mde.as2.Board#getElectoralroll <em>Electoralroll</em>}</li>
 * </ul>
 *
 * @see ntnu.mde.as2.As2Package#getBoard()
 * @model
 * @generated
 */
public interface Board extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ntnu.mde.as2.As2Package#getBoard_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ntnu.mde.as2.Board#getName <em>Name</em>}' attribute.
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
	 * @see ntnu.mde.as2.As2Package#getBoard_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link ntnu.mde.as2.Board#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Electoralroll</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ntnu.mde.as2.ElectoralRoll#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electoralroll</em>' reference.
	 * @see #setElectoralroll(ElectoralRoll)
	 * @see ntnu.mde.as2.As2Package#getBoard_Electoralroll()
	 * @see ntnu.mde.as2.ElectoralRoll#getBoard
	 * @model opposite="board"
	 * @generated
	 */
	ElectoralRoll getElectoralroll();

	/**
	 * Sets the value of the '{@link ntnu.mde.as2.Board#getElectoralroll <em>Electoralroll</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electoralroll</em>' reference.
	 * @see #getElectoralroll()
	 * @generated
	 */
	void setElectoralroll(ElectoralRoll value);

} // Board
