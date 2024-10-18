/**
 */
package ntnu.mde.as2.util;

import java.util.Map;

import ntnu.mde.as2.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ntnu.mde.as2.As2Package
 * @generated
 */
public class As2Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final As2Validator INSTANCE = new As2Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ntnu.mde.as2";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As2Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return As2Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case As2Package.UNIVERSITY:
			return validateUniversity((University) value, diagnostics, context);
		case As2Package.USER:
			return validateUser((User) value, diagnostics, context);
		case As2Package.ELECTION_STAFF:
			return validateElectionStaff((ElectionStaff) value, diagnostics, context);
		case As2Package.STUDENT_ASSOCIATION:
			return validateStudentAssociation((StudentAssociation) value, diagnostics, context);
		case As2Package.STUDENT:
			return validateStudent((Student) value, diagnostics, context);
		case As2Package.FACULTY:
			return validateFaculty((Faculty) value, diagnostics, context);
		case As2Package.DEPARTMENT:
			return validateDepartment((Department) value, diagnostics, context);
		case As2Package.STUDY_PROGRAMME:
			return validateStudyProgramme((StudyProgramme) value, diagnostics, context);
		case As2Package.BOARD:
			return validateBoard((Board) value, diagnostics, context);
		case As2Package.ELECTORAL_ROLL:
			return validateElectoralRoll((ElectoralRoll) value, diagnostics, context);
		case As2Package.ENTITY:
			return validateEntity((Entity) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversity(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(university, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(user, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElectionStaff(ElectionStaff electionStaff, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(electionStaff, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudentAssociation(StudentAssociation studentAssociation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studentAssociation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent(Student student, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(student, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(student, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(student, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(student, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(student, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(student, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(student, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(student, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(student, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateStudent_canExistOnlyOnceOnARoll(student, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateStudent_canOnlyRunForAssociatedBoards(student, diagnostics, context);
		return result;
	}

	/**
	 * Validates the canExistOnlyOnceOnARoll constraint of '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent_canExistOnlyOnceOnARoll(Student student, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "canExistOnlyOnceOnARoll", getObjectLabel(student, context) },
								new Object[] { student }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the canOnlyRunForAssociatedBoards constraint of '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent_canOnlyRunForAssociatedBoards(Student student, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "canOnlyRunForAssociatedBoards", getObjectLabel(student, context) },
								new Object[] { student }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaculty(Faculty faculty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(faculty, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(faculty, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(faculty, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(faculty, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(faculty, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(faculty, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(faculty, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(faculty, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(faculty, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFaculty_facultyMustBeInUniversity(faculty, diagnostics, context);
		return result;
	}

	/**
	 * Validates the facultyMustBeInUniversity constraint of '<em>Faculty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaculty_facultyMustBeInUniversity(Faculty faculty, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "facultyMustBeInUniversity", getObjectLabel(faculty, context) },
								new Object[] { faculty }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(department, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(department, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(department, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(department, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(department, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(department, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(department, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(department, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(department, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDepartment_departmentMustBeInFaculty(department, diagnostics, context);
		return result;
	}

	/**
	 * Validates the departmentMustBeInFaculty constraint of '<em>Department</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment_departmentMustBeInFaculty(Department department, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "departmentMustBeInFaculty", getObjectLabel(department, context) },
								new Object[] { department }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyProgramme(StudyProgramme studyProgramme, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(studyProgramme, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(studyProgramme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(studyProgramme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(studyProgramme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(studyProgramme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(studyProgramme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(studyProgramme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(studyProgramme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(studyProgramme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateStudyProgramme_studyProgrammeMustBeInDepartment(studyProgramme, diagnostics, context);
		return result;
	}

	/**
	 * Validates the studyProgrammeMustBeInDepartment constraint of '<em>Study Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyProgramme_studyProgrammeMustBeInDepartment(StudyProgramme studyProgramme,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "studyProgrammeMustBeInDepartment", getObjectLabel(studyProgramme, context) },
						new Object[] { studyProgramme }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoard(Board board, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(board, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElectoralRoll(ElectoralRoll electoralRoll, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(electoralRoll, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entity, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //As2Validator
