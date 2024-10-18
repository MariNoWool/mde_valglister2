/**
 */
package ntnu.mde.as2.impl;

import ntnu.mde.as2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class As2FactoryImpl extends EFactoryImpl implements As2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static As2Factory init() {
		try {
			As2Factory theAs2Factory = (As2Factory) EPackage.Registry.INSTANCE.getEFactory(As2Package.eNS_URI);
			if (theAs2Factory != null) {
				return theAs2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new As2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case As2Package.UNIVERSITY:
			return createUniversity();
		case As2Package.ELECTION_STAFF:
			return createElectionStaff();
		case As2Package.STUDENT_ASSOCIATION:
			return createStudentAssociation();
		case As2Package.STUDENT:
			return createStudent();
		case As2Package.FACULTY:
			return createFaculty();
		case As2Package.DEPARTMENT:
			return createDepartment();
		case As2Package.STUDY_PROGRAMME:
			return createStudyProgramme();
		case As2Package.BOARD:
			return createBoard();
		case As2Package.ELECTORAL_ROLL:
			return createElectoralRoll();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public University createUniversity() {
		UniversityImpl university = new UniversityImpl();
		return university;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElectionStaff createElectionStaff() {
		ElectionStaffImpl electionStaff = new ElectionStaffImpl();
		return electionStaff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudentAssociation createStudentAssociation() {
		StudentAssociationImpl studentAssociation = new StudentAssociationImpl();
		return studentAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Student createStudent() {
		StudentImpl student = new StudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Faculty createFaculty() {
		FacultyImpl faculty = new FacultyImpl();
		return faculty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Department createDepartment() {
		DepartmentImpl department = new DepartmentImpl();
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyProgramme createStudyProgramme() {
		StudyProgrammeImpl studyProgramme = new StudyProgrammeImpl();
		return studyProgramme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Board createBoard() {
		BoardImpl board = new BoardImpl();
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElectoralRoll createElectoralRoll() {
		ElectoralRollImpl electoralRoll = new ElectoralRollImpl();
		return electoralRoll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public As2Package getAs2Package() {
		return (As2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static As2Package getPackage() {
		return As2Package.eINSTANCE;
	}

} //As2FactoryImpl
