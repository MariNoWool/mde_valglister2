/**
 */
package ntnu.mde.as2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ntnu.mde.as2.As2Factory
 * @model kind="package"
 * @generated
 */
public interface As2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "as2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ntnu.no/mde/as2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "as2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	As2Package eINSTANCE = ntnu.mde.as2.impl.As2PackageImpl.init();

	/**
	 * The meta object id for the '{@link ntnu.mde.as2.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ntnu.mde.as2.impl.EntityImpl
	 * @see ntnu.mde.as2.impl.As2PackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = 1;

	/**
	 * The feature id for the '<em><b>Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__BOARD = 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ntnu.mde.as2.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ntnu.mde.as2.impl.UniversityImpl
	 * @see ntnu.mde.as2.impl.As2PackageImpl#getUniversity()
	 * @generated
	 */
	int UNIVERSITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__BOARD = ENTITY__BOARD;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__USER = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Faculties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__FACULTIES = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ntnu.mde.as2.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ntnu.mde.as2.impl.UserImpl
	 * @see ntnu.mde.as2.impl.As2PackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 1;

	/**
	 * The feature id for the '<em><b>University</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__UNIVERSITY = 2;

	/**
	 * The feature id for the '<em><b>Lists Owned</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LISTS_OWNED = 3;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ntnu.mde.as2.impl.ElectionStaffImpl <em>Election Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ntnu.mde.as2.impl.ElectionStaffImpl
	 * @see ntnu.mde.as2.impl.As2PackageImpl#getElectionStaff()
	 * @generated
	 */
	int ELECTION_STAFF = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTION_STAFF__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTION_STAFF__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>University</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTION_STAFF__UNIVERSITY = USER__UNIVERSITY;

	/**
	 * The feature id for the '<em><b>Lists Owned</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTION_STAFF__LISTS_OWNED = USER__LISTS_OWNED;

	/**
	 * The number of structural features of the '<em>Election Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTION_STAFF_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Election Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTION_STAFF_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ntnu.mde.as2.impl.StudentAssociationImpl <em>Student Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ntnu.mde.as2.impl.StudentAssociationImpl
	 * @see ntnu.mde.as2.impl.As2PackageImpl#getStudentAssociation()
	 * @generated
	 */
	int STUDENT_ASSOCIATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_ASSOCIATION__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_ASSOCIATION__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>University</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_ASSOCIATION__UNIVERSITY = USER__UNIVERSITY;

	/**
	 * The feature id for the '<em><b>Lists Owned</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_ASSOCIATION__LISTS_OWNED = USER__LISTS_OWNED;

	/**
	 * The number of structural features of the '<em>Student Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_ASSOCIATION_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Student Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_ASSOCIATION_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ntnu.mde.as2.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ntnu.mde.as2.impl.StudentImpl
	 * @see ntnu.mde.as2.impl.As2PackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>University</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__UNIVERSITY = USER__UNIVERSITY;

	/**
	 * The feature id for the '<em><b>Lists Owned</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__LISTS_OWNED = USER__LISTS_OWNED;

	/**
	 * The feature id for the '<em><b>Currently Enrolled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__CURRENTLY_ENROLLED = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enrolled In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__ENROLLED_IN = USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = USER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ntnu.mde.as2.impl.FacultyImpl <em>Faculty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ntnu.mde.as2.impl.FacultyImpl
	 * @see ntnu.mde.as2.impl.As2PackageImpl#getFaculty()
	 * @generated
	 */
	int FACULTY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY__BOARD = ENTITY__BOARD;

	/**
	 * The feature id for the '<em><b>Departments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY__DEPARTMENTS = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Faculty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Faculty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ntnu.mde.as2.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ntnu.mde.as2.impl.DepartmentImpl
	 * @see ntnu.mde.as2.impl.As2PackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__BOARD = ENTITY__BOARD;

	/**
	 * The feature id for the '<em><b>Studyprogrammes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__STUDYPROGRAMMES = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ntnu.mde.as2.impl.StudyProgrammeImpl <em>Study Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ntnu.mde.as2.impl.StudyProgrammeImpl
	 * @see ntnu.mde.as2.impl.As2PackageImpl#getStudyProgramme()
	 * @generated
	 */
	int STUDY_PROGRAMME = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAMME__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAMME__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAMME__BOARD = ENTITY__BOARD;

	/**
	 * The feature id for the '<em><b>Students</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAMME__STUDENTS = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Study Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAMME_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Study Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAMME_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ntnu.mde.as2.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ntnu.mde.as2.impl.BoardImpl
	 * @see ntnu.mde.as2.impl.As2PackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__ID = 1;

	/**
	 * The feature id for the '<em><b>Electoralroll</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__ELECTORALROLL = 2;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ntnu.mde.as2.impl.ElectoralRollImpl <em>Electoral Roll</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ntnu.mde.as2.impl.ElectoralRollImpl
	 * @see ntnu.mde.as2.impl.As2PackageImpl#getElectoralRoll()
	 * @generated
	 */
	int ELECTORAL_ROLL = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTORAL_ROLL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTORAL_ROLL__ID = 1;

	/**
	 * The feature id for the '<em><b>Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTORAL_ROLL__BOARD = 2;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTORAL_ROLL__MEMBERS = 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTORAL_ROLL__OWNER = 4;

	/**
	 * The number of structural features of the '<em>Electoral Roll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTORAL_ROLL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Electoral Roll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTORAL_ROLL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link ntnu.mde.as2.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University</em>'.
	 * @see ntnu.mde.as2.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the reference list '{@link ntnu.mde.as2.University#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User</em>'.
	 * @see ntnu.mde.as2.University#getUser()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_User();

	/**
	 * Returns the meta object for the reference list '{@link ntnu.mde.as2.University#getFaculties <em>Faculties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Faculties</em>'.
	 * @see ntnu.mde.as2.University#getFaculties()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Faculties();

	/**
	 * Returns the meta object for class '{@link ntnu.mde.as2.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see ntnu.mde.as2.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link ntnu.mde.as2.User#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ntnu.mde.as2.User#getId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Id();

	/**
	 * Returns the meta object for the attribute '{@link ntnu.mde.as2.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ntnu.mde.as2.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the reference '{@link ntnu.mde.as2.User#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>University</em>'.
	 * @see ntnu.mde.as2.User#getUniversity()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_University();

	/**
	 * Returns the meta object for the reference list '{@link ntnu.mde.as2.User#getListsOwned <em>Lists Owned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lists Owned</em>'.
	 * @see ntnu.mde.as2.User#getListsOwned()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_ListsOwned();

	/**
	 * Returns the meta object for class '{@link ntnu.mde.as2.ElectionStaff <em>Election Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Election Staff</em>'.
	 * @see ntnu.mde.as2.ElectionStaff
	 * @generated
	 */
	EClass getElectionStaff();

	/**
	 * Returns the meta object for class '{@link ntnu.mde.as2.StudentAssociation <em>Student Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student Association</em>'.
	 * @see ntnu.mde.as2.StudentAssociation
	 * @generated
	 */
	EClass getStudentAssociation();

	/**
	 * Returns the meta object for class '{@link ntnu.mde.as2.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see ntnu.mde.as2.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link ntnu.mde.as2.Student#isCurrentlyEnrolled <em>Currently Enrolled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currently Enrolled</em>'.
	 * @see ntnu.mde.as2.Student#isCurrentlyEnrolled()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_CurrentlyEnrolled();

	/**
	 * Returns the meta object for the reference '{@link ntnu.mde.as2.Student#getEnrolledIn <em>Enrolled In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enrolled In</em>'.
	 * @see ntnu.mde.as2.Student#getEnrolledIn()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_EnrolledIn();

	/**
	 * Returns the meta object for class '{@link ntnu.mde.as2.Faculty <em>Faculty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Faculty</em>'.
	 * @see ntnu.mde.as2.Faculty
	 * @generated
	 */
	EClass getFaculty();

	/**
	 * Returns the meta object for the reference list '{@link ntnu.mde.as2.Faculty#getDepartments <em>Departments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Departments</em>'.
	 * @see ntnu.mde.as2.Faculty#getDepartments()
	 * @see #getFaculty()
	 * @generated
	 */
	EReference getFaculty_Departments();

	/**
	 * Returns the meta object for class '{@link ntnu.mde.as2.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see ntnu.mde.as2.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the reference list '{@link ntnu.mde.as2.Department#getStudyprogrammes <em>Studyprogrammes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Studyprogrammes</em>'.
	 * @see ntnu.mde.as2.Department#getStudyprogrammes()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Studyprogrammes();

	/**
	 * Returns the meta object for class '{@link ntnu.mde.as2.StudyProgramme <em>Study Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Programme</em>'.
	 * @see ntnu.mde.as2.StudyProgramme
	 * @generated
	 */
	EClass getStudyProgramme();

	/**
	 * Returns the meta object for the reference list '{@link ntnu.mde.as2.StudyProgramme#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Students</em>'.
	 * @see ntnu.mde.as2.StudyProgramme#getStudents()
	 * @see #getStudyProgramme()
	 * @generated
	 */
	EReference getStudyProgramme_Students();

	/**
	 * Returns the meta object for class '{@link ntnu.mde.as2.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see ntnu.mde.as2.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the attribute '{@link ntnu.mde.as2.Board#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ntnu.mde.as2.Board#getName()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Name();

	/**
	 * Returns the meta object for the attribute '{@link ntnu.mde.as2.Board#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ntnu.mde.as2.Board#getId()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Id();

	/**
	 * Returns the meta object for the reference '{@link ntnu.mde.as2.Board#getElectoralroll <em>Electoralroll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Electoralroll</em>'.
	 * @see ntnu.mde.as2.Board#getElectoralroll()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Electoralroll();

	/**
	 * Returns the meta object for class '{@link ntnu.mde.as2.ElectoralRoll <em>Electoral Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electoral Roll</em>'.
	 * @see ntnu.mde.as2.ElectoralRoll
	 * @generated
	 */
	EClass getElectoralRoll();

	/**
	 * Returns the meta object for the attribute '{@link ntnu.mde.as2.ElectoralRoll#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ntnu.mde.as2.ElectoralRoll#getName()
	 * @see #getElectoralRoll()
	 * @generated
	 */
	EAttribute getElectoralRoll_Name();

	/**
	 * Returns the meta object for the attribute '{@link ntnu.mde.as2.ElectoralRoll#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ntnu.mde.as2.ElectoralRoll#getId()
	 * @see #getElectoralRoll()
	 * @generated
	 */
	EAttribute getElectoralRoll_Id();

	/**
	 * Returns the meta object for the reference '{@link ntnu.mde.as2.ElectoralRoll#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Board</em>'.
	 * @see ntnu.mde.as2.ElectoralRoll#getBoard()
	 * @see #getElectoralRoll()
	 * @generated
	 */
	EReference getElectoralRoll_Board();

	/**
	 * Returns the meta object for the reference '{@link ntnu.mde.as2.ElectoralRoll#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see ntnu.mde.as2.ElectoralRoll#getOwner()
	 * @see #getElectoralRoll()
	 * @generated
	 */
	EReference getElectoralRoll_Owner();

	/**
	 * Returns the meta object for the reference list '{@link ntnu.mde.as2.ElectoralRoll#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Members</em>'.
	 * @see ntnu.mde.as2.ElectoralRoll#getMembers()
	 * @see #getElectoralRoll()
	 * @generated
	 */
	EReference getElectoralRoll_Members();

	/**
	 * Returns the meta object for class '{@link ntnu.mde.as2.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see ntnu.mde.as2.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link ntnu.mde.as2.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ntnu.mde.as2.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link ntnu.mde.as2.Entity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ntnu.mde.as2.Entity#getId()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Id();

	/**
	 * Returns the meta object for the reference '{@link ntnu.mde.as2.Entity#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Board</em>'.
	 * @see ntnu.mde.as2.Entity#getBoard()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Board();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	As2Factory getAs2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ntnu.mde.as2.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ntnu.mde.as2.impl.UniversityImpl
		 * @see ntnu.mde.as2.impl.As2PackageImpl#getUniversity()
		 * @generated
		 */
		EClass UNIVERSITY = eINSTANCE.getUniversity();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__USER = eINSTANCE.getUniversity_User();

		/**
		 * The meta object literal for the '<em><b>Faculties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__FACULTIES = eINSTANCE.getUniversity_Faculties();

		/**
		 * The meta object literal for the '{@link ntnu.mde.as2.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ntnu.mde.as2.impl.UserImpl
		 * @see ntnu.mde.as2.impl.As2PackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID = eINSTANCE.getUser_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>University</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__UNIVERSITY = eINSTANCE.getUser_University();

		/**
		 * The meta object literal for the '<em><b>Lists Owned</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__LISTS_OWNED = eINSTANCE.getUser_ListsOwned();

		/**
		 * The meta object literal for the '{@link ntnu.mde.as2.impl.ElectionStaffImpl <em>Election Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ntnu.mde.as2.impl.ElectionStaffImpl
		 * @see ntnu.mde.as2.impl.As2PackageImpl#getElectionStaff()
		 * @generated
		 */
		EClass ELECTION_STAFF = eINSTANCE.getElectionStaff();

		/**
		 * The meta object literal for the '{@link ntnu.mde.as2.impl.StudentAssociationImpl <em>Student Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ntnu.mde.as2.impl.StudentAssociationImpl
		 * @see ntnu.mde.as2.impl.As2PackageImpl#getStudentAssociation()
		 * @generated
		 */
		EClass STUDENT_ASSOCIATION = eINSTANCE.getStudentAssociation();

		/**
		 * The meta object literal for the '{@link ntnu.mde.as2.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ntnu.mde.as2.impl.StudentImpl
		 * @see ntnu.mde.as2.impl.As2PackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Currently Enrolled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__CURRENTLY_ENROLLED = eINSTANCE.getStudent_CurrentlyEnrolled();

		/**
		 * The meta object literal for the '<em><b>Enrolled In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__ENROLLED_IN = eINSTANCE.getStudent_EnrolledIn();

		/**
		 * The meta object literal for the '{@link ntnu.mde.as2.impl.FacultyImpl <em>Faculty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ntnu.mde.as2.impl.FacultyImpl
		 * @see ntnu.mde.as2.impl.As2PackageImpl#getFaculty()
		 * @generated
		 */
		EClass FACULTY = eINSTANCE.getFaculty();

		/**
		 * The meta object literal for the '<em><b>Departments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACULTY__DEPARTMENTS = eINSTANCE.getFaculty_Departments();

		/**
		 * The meta object literal for the '{@link ntnu.mde.as2.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ntnu.mde.as2.impl.DepartmentImpl
		 * @see ntnu.mde.as2.impl.As2PackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Studyprogrammes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__STUDYPROGRAMMES = eINSTANCE.getDepartment_Studyprogrammes();

		/**
		 * The meta object literal for the '{@link ntnu.mde.as2.impl.StudyProgrammeImpl <em>Study Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ntnu.mde.as2.impl.StudyProgrammeImpl
		 * @see ntnu.mde.as2.impl.As2PackageImpl#getStudyProgramme()
		 * @generated
		 */
		EClass STUDY_PROGRAMME = eINSTANCE.getStudyProgramme();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PROGRAMME__STUDENTS = eINSTANCE.getStudyProgramme_Students();

		/**
		 * The meta object literal for the '{@link ntnu.mde.as2.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ntnu.mde.as2.impl.BoardImpl
		 * @see ntnu.mde.as2.impl.As2PackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__NAME = eINSTANCE.getBoard_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__ID = eINSTANCE.getBoard_Id();

		/**
		 * The meta object literal for the '<em><b>Electoralroll</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__ELECTORALROLL = eINSTANCE.getBoard_Electoralroll();

		/**
		 * The meta object literal for the '{@link ntnu.mde.as2.impl.ElectoralRollImpl <em>Electoral Roll</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ntnu.mde.as2.impl.ElectoralRollImpl
		 * @see ntnu.mde.as2.impl.As2PackageImpl#getElectoralRoll()
		 * @generated
		 */
		EClass ELECTORAL_ROLL = eINSTANCE.getElectoralRoll();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTORAL_ROLL__NAME = eINSTANCE.getElectoralRoll_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTORAL_ROLL__ID = eINSTANCE.getElectoralRoll_Id();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTORAL_ROLL__BOARD = eINSTANCE.getElectoralRoll_Board();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTORAL_ROLL__OWNER = eINSTANCE.getElectoralRoll_Owner();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTORAL_ROLL__MEMBERS = eINSTANCE.getElectoralRoll_Members();

		/**
		 * The meta object literal for the '{@link ntnu.mde.as2.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ntnu.mde.as2.impl.EntityImpl
		 * @see ntnu.mde.as2.impl.As2PackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ID = eINSTANCE.getEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__BOARD = eINSTANCE.getEntity_Board();

	}

} //As2Package
