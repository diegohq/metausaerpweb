/**
 */
package metaerp.impl;

import metaerp.DataType;
import metaerp.MetaerpPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metaerp.impl.DataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link metaerp.impl.DataTypeImpl#getRegex <em>Regex</em>}</li>
 *   <li>{@link metaerp.impl.DataTypeImpl#getHelperText <em>Helper Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeImpl extends EObjectImpl implements DataType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegex() <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegex()
	 * @generated
	 * @ordered
	 */
	protected static final String REGEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegex() <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegex()
	 * @generated
	 * @ordered
	 */
	protected String regex = REGEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getHelperText() <em>Helper Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelperText()
	 * @generated
	 * @ordered
	 */
	protected static final String HELPER_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHelperText() <em>Helper Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelperText()
	 * @generated
	 * @ordered
	 */
	protected String helperText = HELPER_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaerpPackage.Literals.DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaerpPackage.DATA_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegex() {
		return regex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegex(String newRegex) {
		String oldRegex = regex;
		regex = newRegex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaerpPackage.DATA_TYPE__REGEX, oldRegex, regex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHelperText() {
		return helperText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHelperText(String newHelperText) {
		String oldHelperText = helperText;
		helperText = newHelperText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaerpPackage.DATA_TYPE__HELPER_TEXT, oldHelperText, helperText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaerpPackage.DATA_TYPE__NAME:
				return getName();
			case MetaerpPackage.DATA_TYPE__REGEX:
				return getRegex();
			case MetaerpPackage.DATA_TYPE__HELPER_TEXT:
				return getHelperText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetaerpPackage.DATA_TYPE__NAME:
				setName((String)newValue);
				return;
			case MetaerpPackage.DATA_TYPE__REGEX:
				setRegex((String)newValue);
				return;
			case MetaerpPackage.DATA_TYPE__HELPER_TEXT:
				setHelperText((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetaerpPackage.DATA_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetaerpPackage.DATA_TYPE__REGEX:
				setRegex(REGEX_EDEFAULT);
				return;
			case MetaerpPackage.DATA_TYPE__HELPER_TEXT:
				setHelperText(HELPER_TEXT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetaerpPackage.DATA_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetaerpPackage.DATA_TYPE__REGEX:
				return REGEX_EDEFAULT == null ? regex != null : !REGEX_EDEFAULT.equals(regex);
			case MetaerpPackage.DATA_TYPE__HELPER_TEXT:
				return HELPER_TEXT_EDEFAULT == null ? helperText != null : !HELPER_TEXT_EDEFAULT.equals(helperText);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", regex: ");
		result.append(regex);
		result.append(", helperText: ");
		result.append(helperText);
		result.append(')');
		return result.toString();
	}

} //DataTypeImpl
