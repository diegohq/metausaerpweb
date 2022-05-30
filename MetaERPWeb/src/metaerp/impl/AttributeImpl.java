/**
 */
package metaerp.impl;

import metaerp.Attribute;
import metaerp.DataType;
import metaerp.DataTypes;
import metaerp.InputDefaultTypes;
import metaerp.MetaerpPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metaerp.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link metaerp.impl.AttributeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link metaerp.impl.AttributeImpl#isCreateble <em>Createble</em>}</li>
 *   <li>{@link metaerp.impl.AttributeImpl#isEditable <em>Editable</em>}</li>
 *   <li>{@link metaerp.impl.AttributeImpl#getCustomType <em>Custom Type</em>}</li>
 *   <li>{@link metaerp.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link metaerp.impl.AttributeImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link metaerp.impl.AttributeImpl#isListable <em>Listable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends EObjectImpl implements Attribute {
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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isCreateble() <em>Createble</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateble()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATEBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCreateble() <em>Createble</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateble()
	 * @generated
	 * @ordered
	 */
	protected boolean createble = CREATEBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EDITABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean editable = EDITABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomType() <em>Custom Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomType()
	 * @generated
	 * @ordered
	 */
	protected DataType customType;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final InputDefaultTypes TYPE_EDEFAULT = InputDefaultTypes.VARCHAR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected InputDefaultTypes type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #isListable() <em>Listable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isListable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LISTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isListable() <em>Listable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isListable()
	 * @generated
	 * @ordered
	 */
	protected boolean listable = LISTABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaerpPackage.Literals.ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaerpPackage.ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaerpPackage.ATTRIBUTE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCreateble() {
		return createble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateble(boolean newCreateble) {
		boolean oldCreateble = createble;
		createble = newCreateble;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaerpPackage.ATTRIBUTE__CREATEBLE, oldCreateble, createble));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEditable() {
		return editable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditable(boolean newEditable) {
		boolean oldEditable = editable;
		editable = newEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaerpPackage.ATTRIBUTE__EDITABLE, oldEditable, editable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getCustomType() {
		if (customType != null && customType.eIsProxy()) {
			InternalEObject oldCustomType = (InternalEObject)customType;
			customType = (DataType)eResolveProxy(oldCustomType);
			if (customType != oldCustomType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaerpPackage.ATTRIBUTE__CUSTOM_TYPE, oldCustomType, customType));
			}
		}
		return customType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetCustomType() {
		return customType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomType(DataType newCustomType) {
		DataType oldCustomType = customType;
		customType = newCustomType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaerpPackage.ATTRIBUTE__CUSTOM_TYPE, oldCustomType, customType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDefaultTypes getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(InputDefaultTypes newType) {
		InputDefaultTypes oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaerpPackage.ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaerpPackage.ATTRIBUTE__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isListable() {
		return listable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListable(boolean newListable) {
		boolean oldListable = listable;
		listable = newListable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaerpPackage.ATTRIBUTE__LISTABLE, oldListable, listable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaerpPackage.ATTRIBUTE__NAME:
				return getName();
			case MetaerpPackage.ATTRIBUTE__LABEL:
				return getLabel();
			case MetaerpPackage.ATTRIBUTE__CREATEBLE:
				return isCreateble();
			case MetaerpPackage.ATTRIBUTE__EDITABLE:
				return isEditable();
			case MetaerpPackage.ATTRIBUTE__CUSTOM_TYPE:
				if (resolve) return getCustomType();
				return basicGetCustomType();
			case MetaerpPackage.ATTRIBUTE__TYPE:
				return getType();
			case MetaerpPackage.ATTRIBUTE__REQUIRED:
				return isRequired();
			case MetaerpPackage.ATTRIBUTE__LISTABLE:
				return isListable();
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
			case MetaerpPackage.ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case MetaerpPackage.ATTRIBUTE__LABEL:
				setLabel((String)newValue);
				return;
			case MetaerpPackage.ATTRIBUTE__CREATEBLE:
				setCreateble((Boolean)newValue);
				return;
			case MetaerpPackage.ATTRIBUTE__EDITABLE:
				setEditable((Boolean)newValue);
				return;
			case MetaerpPackage.ATTRIBUTE__CUSTOM_TYPE:
				setCustomType((DataType)newValue);
				return;
			case MetaerpPackage.ATTRIBUTE__TYPE:
				setType((InputDefaultTypes)newValue);
				return;
			case MetaerpPackage.ATTRIBUTE__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case MetaerpPackage.ATTRIBUTE__LISTABLE:
				setListable((Boolean)newValue);
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
			case MetaerpPackage.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetaerpPackage.ATTRIBUTE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case MetaerpPackage.ATTRIBUTE__CREATEBLE:
				setCreateble(CREATEBLE_EDEFAULT);
				return;
			case MetaerpPackage.ATTRIBUTE__EDITABLE:
				setEditable(EDITABLE_EDEFAULT);
				return;
			case MetaerpPackage.ATTRIBUTE__CUSTOM_TYPE:
				setCustomType((DataType)null);
				return;
			case MetaerpPackage.ATTRIBUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MetaerpPackage.ATTRIBUTE__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case MetaerpPackage.ATTRIBUTE__LISTABLE:
				setListable(LISTABLE_EDEFAULT);
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
			case MetaerpPackage.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetaerpPackage.ATTRIBUTE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case MetaerpPackage.ATTRIBUTE__CREATEBLE:
				return createble != CREATEBLE_EDEFAULT;
			case MetaerpPackage.ATTRIBUTE__EDITABLE:
				return editable != EDITABLE_EDEFAULT;
			case MetaerpPackage.ATTRIBUTE__CUSTOM_TYPE:
				return customType != null;
			case MetaerpPackage.ATTRIBUTE__TYPE:
				return type != TYPE_EDEFAULT;
			case MetaerpPackage.ATTRIBUTE__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case MetaerpPackage.ATTRIBUTE__LISTABLE:
				return listable != LISTABLE_EDEFAULT;
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
		result.append(", label: ");
		result.append(label);
		result.append(", createble: ");
		result.append(createble);
		result.append(", editable: ");
		result.append(editable);
		result.append(", type: ");
		result.append(type);
		result.append(", required: ");
		result.append(required);
		result.append(", listable: ");
		result.append(listable);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
