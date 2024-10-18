/**
 */
package ntnu.mde.as2.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreEList;

import ntnu.mde.as2.As2Package;
import ntnu.mde.as2.Department;
import ntnu.mde.as2.StudyProgramme;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ntnu.mde.as2.impl.DepartmentImpl#getStudyprogrammes <em>Studyprogrammes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartmentImpl extends EntityImpl implements Department {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentImpl() {
		super();
	}

	protected EList<StudyProgramme> programmes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As2Package.Literals.DEPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<StudyProgramme> getStudyprogrammes() {
		// TODO: implement this method to return the 'StudyProgrammes' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		if (programmes == null) {
			programmes = new EcoreEList.UnmodifiableEList<StudyProgramme>(this,
					As2Package.Literals.DEPARTMENT__STUDYPROGRAMMES, new StudyProgramme[0]);
		}
		return programmes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case As2Package.DEPARTMENT__STUDYPROGRAMMES:
			return getStudyprogrammes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case As2Package.DEPARTMENT__STUDYPROGRAMMES:
			return !getStudyprogrammes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DepartmentImpl
