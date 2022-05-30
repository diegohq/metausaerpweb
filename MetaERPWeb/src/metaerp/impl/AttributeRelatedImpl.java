/**
 */
package metaerp.impl;

import metaerp.Attribute;
import metaerp.AttributeRelated;
import metaerp.BehaviorTypes;
import metaerp.MetaerpPackage;

import metaerp.RuleTypes;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Related</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metaerp.impl.AttributeRelatedImpl#isMain <em>Main</em>}</li>
 *   <li>{@link metaerp.impl.AttributeRelatedImpl#getOnCreate <em>On Create</em>}</li>
 *   <li>{@link metaerp.impl.AttributeRelatedImpl#getOnDelete <em>On Delete</em>}</li>
 *   <li>{@link metaerp.impl.AttributeRelatedImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link metaerp.impl.AttributeRelatedImpl#getRelated <em>Related</em>}</li>
 *   <li>{@link metaerp.impl.AttributeRelatedImpl#isAutocomplete <em>Autocomplete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeRelatedImpl extends AttributeImpl implements AttributeRelated {
	/**
	 * The default value of the '{@link #isMain() <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMain() <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMain()
	 * @generated
	 * @ordered
	 */
	protected boolean main = MAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnCreate() <em>On Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnCreate()
	 * @generated
	 * @ordered
	 */
	protected static final BehaviorTypes ON_CREATE_EDEFAULT = BehaviorTypes.SUBTRACT;

	/**
	 * The cached value of the '{@link #getOnCreate() <em>On Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnCreate()
	 * @generated
	 * @ordered
	 */
	protected BehaviorTypes onCreate = ON_CREATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnDelete() <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDelete()
	 * @generated
	 * @ordered
	 */
	protected static final BehaviorTypes ON_DELETE_EDEFAULT = BehaviorTypes.SUBTRACT;

	/**
	 * The cached value of the '{@link #getOnDelete() <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDelete()
	 * @generated
	 * @ordered
	 */
	protected BehaviorTypes onDelete = ON_DELETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRule() <em>Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected static final RuleTypes RULE_EDEFAULT = RuleTypes.BIGGER;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected RuleTypes rule = RULE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelated() <em>Related</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelated()
	 * @generated
	 * @ordered
	 */
	protected Attribute related;

	/**
	 * The default value of the '{@link #isAutocomplete() <em>Autocomplete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutocomplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOCOMPLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutocomplete() <em>Autocomplete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutocomplete()
	 * @generated
	 * @ordered
	 */
	protected boolean autocomplete = AUTOCOMPLETE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeRelatedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaerpPackage.Literals.ATTRIBUTE_RELATED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMain() {
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMain(boolean newMain) {
		boolean oldMain = main;
		main = newMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaerpPackage.ATTRIBUTE_RELATED__MAIN, oldMain, main));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorTypes getOnCreate() {
		return onCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnCreate(BehaviorTypes newOnCreate) {
		BehaviorTypes oldOnCreate = onCreate;
		onCreate = newOnCreate == null ? ON_CREATE_EDEFAULT : newOnCreate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaerpPackage.ATTRIBUTE_RELATED__ON_CREATE, oldOnCreate, onCreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorTypes getOnDelete() {
		return onDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDelete(BehaviorTypes newOnDelete) {
		BehaviorTypes oldOnDelete = onDelete;
		onDelete = newOnDelete == null ? ON_DELETE_EDEFAULT : newOnDelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaerpPackage.ATTRIBUTE_RELATED__ON_DELETE, oldOnDelete, onDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleTypes getRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(RuleTypes newRule) {
		RuleTypes oldRule = rule;
		rule = newRule == null ? RULE_EDEFAULT : newRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaerpPackage.ATTRIBUTE_RELATED__RULE, oldRule, rule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getRelated() {
		if (related != null && related.eIsProxy()) {
			InternalEObject oldRelated = (InternalEObject)related;
			related = (Attribute)eResolveProxy(oldRelated);
			if (related != oldRelated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaerpPackage.ATTRIBUTE_RELATED__RELATED, oldRelated, related));
			}
		}
		return related;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetRelated() {
		return related;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelated(Attribute newRelated) {
		Attribute oldRelated = related;
		related = newRelated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaerpPackage.ATTRIBUTE_RELATED__RELATED, oldRelated, related));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutocomplete() {
		return autocomplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutocomplete(boolean newAutocomplete) {
		boolean oldAutocomplete = autocomplete;
		autocomplete = newAutocomplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaerpPackage.ATTRIBUTE_RELATED__AUTOCOMPLETE, oldAutocomplete, autocomplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaerpPackage.ATTRIBUTE_RELATED__MAIN:
				return isMain();
			case MetaerpPackage.ATTRIBUTE_RELATED__ON_CREATE:
				return getOnCreate();
			case MetaerpPackage.ATTRIBUTE_RELATED__ON_DELETE:
				return getOnDelete();
			case MetaerpPackage.ATTRIBUTE_RELATED__RULE:
				return getRule();
			case MetaerpPackage.ATTRIBUTE_RELATED__RELATED:
				if (resolve) return getRelated();
				return basicGetRelated();
			case MetaerpPackage.ATTRIBUTE_RELATED__AUTOCOMPLETE:
				return isAutocomplete();
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
			case MetaerpPackage.ATTRIBUTE_RELATED__MAIN:
				setMain((Boolean)newValue);
				return;
			case MetaerpPackage.ATTRIBUTE_RELATED__ON_CREATE:
				setOnCreate((BehaviorTypes)newValue);
				return;
			case MetaerpPackage.ATTRIBUTE_RELATED__ON_DELETE:
				setOnDelete((BehaviorTypes)newValue);
				return;
			case MetaerpPackage.ATTRIBUTE_RELATED__RULE:
				setRule((RuleTypes)newValue);
				return;
			case MetaerpPackage.ATTRIBUTE_RELATED__RELATED:
				setRelated((Attribute)newValue);
				return;
			case MetaerpPackage.ATTRIBUTE_RELATED__AUTOCOMPLETE:
				setAutocomplete((Boolean)newValue);
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
			case MetaerpPackage.ATTRIBUTE_RELATED__MAIN:
				setMain(MAIN_EDEFAULT);
				return;
			case MetaerpPackage.ATTRIBUTE_RELATED__ON_CREATE:
				setOnCreate(ON_CREATE_EDEFAULT);
				return;
			case MetaerpPackage.ATTRIBUTE_RELATED__ON_DELETE:
				setOnDelete(ON_DELETE_EDEFAULT);
				return;
			case MetaerpPackage.ATTRIBUTE_RELATED__RULE:
				setRule(RULE_EDEFAULT);
				return;
			case MetaerpPackage.ATTRIBUTE_RELATED__RELATED:
				setRelated((Attribute)null);
				return;
			case MetaerpPackage.ATTRIBUTE_RELATED__AUTOCOMPLETE:
				setAutocomplete(AUTOCOMPLETE_EDEFAULT);
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
			case MetaerpPackage.ATTRIBUTE_RELATED__MAIN:
				return main != MAIN_EDEFAULT;
			case MetaerpPackage.ATTRIBUTE_RELATED__ON_CREATE:
				return onCreate != ON_CREATE_EDEFAULT;
			case MetaerpPackage.ATTRIBUTE_RELATED__ON_DELETE:
				return onDelete != ON_DELETE_EDEFAULT;
			case MetaerpPackage.ATTRIBUTE_RELATED__RULE:
				return rule != RULE_EDEFAULT;
			case MetaerpPackage.ATTRIBUTE_RELATED__RELATED:
				return related != null;
			case MetaerpPackage.ATTRIBUTE_RELATED__AUTOCOMPLETE:
				return autocomplete != AUTOCOMPLETE_EDEFAULT;
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
		result.append(" (main: ");
		result.append(main);
		result.append(", onCreate: ");
		result.append(onCreate);
		result.append(", onDelete: ");
		result.append(onDelete);
		result.append(", rule: ");
		result.append(rule);
		result.append(", autocomplete: ");
		result.append(autocomplete);
		result.append(')');
		return result.toString();
	}

} //AttributeRelatedImpl
