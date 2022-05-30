/**
 */
package metaerp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see metaerp.MetaerpFactory
 * @model kind="package"
 * @generated
 */
public interface MetaerpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metaerp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://metaerp/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metaerp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaerpPackage eINSTANCE = metaerp.impl.MetaerpPackageImpl.init();

	/**
	 * The meta object id for the '{@link metaerp.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaerp.impl.EntityImpl
	 * @see metaerp.impl.MetaerpPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Sub Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SUB_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CARDINALITY = 3;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link metaerp.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaerp.impl.AttributeImpl
	 * @see metaerp.impl.MetaerpPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Createble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CREATEBLE = 2;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__EDITABLE = 3;

	/**
	 * The feature id for the '<em><b>Custom Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CUSTOM_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REQUIRED = 6;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LISTABLE = 7;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link metaerp.impl.ERPImpl <em>ERP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaerp.impl.ERPImpl
	 * @see metaerp.impl.MetaerpPackageImpl#getERP()
	 * @generated
	 */
	int ERP = 2;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP__ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP__TYPES = 1;

	/**
	 * The number of structural features of the '<em>ERP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link metaerp.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaerp.impl.DataTypeImpl
	 * @see metaerp.impl.MetaerpPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__REGEX = 1;

	/**
	 * The feature id for the '<em><b>Helper Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__HELPER_TEXT = 2;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link metaerp.impl.EntityRelatedImpl <em>Entity Related</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaerp.impl.EntityRelatedImpl
	 * @see metaerp.impl.MetaerpPackageImpl#getEntityRelated()
	 * @generated
	 */
	int ENTITY_RELATED = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATED__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATED__ATTRIBUTES = ENTITY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Sub Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATED__SUB_ENTITY = ENTITY__SUB_ENTITY;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATED__CARDINALITY = ENTITY__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATED__RELATED = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes Related</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATED__ATTRIBUTES_RELATED = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATED__LABEL = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity Related</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATED_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link metaerp.impl.AttributeRelatedImpl <em>Attribute Related</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaerp.impl.AttributeRelatedImpl
	 * @see metaerp.impl.MetaerpPackageImpl#getAttributeRelated()
	 * @generated
	 */
	int ATTRIBUTE_RELATED = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATED__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATED__LABEL = ATTRIBUTE__LABEL;

	/**
	 * The feature id for the '<em><b>Createble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATED__CREATEBLE = ATTRIBUTE__CREATEBLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATED__EDITABLE = ATTRIBUTE__EDITABLE;

	/**
	 * The feature id for the '<em><b>Custom Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATED__CUSTOM_TYPE = ATTRIBUTE__CUSTOM_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATED__TYPE = ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATED__REQUIRED = ATTRIBUTE__REQUIRED;

	/**
	 * The feature id for the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATED__LISTABLE = ATTRIBUTE__LISTABLE;

	/**
	 * The feature id for the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATED__MAIN = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATED__ON_CREATE = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATED__ON_DELETE = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATED__RULE = ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATED__RELATED = ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Autocomplete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATED__AUTOCOMPLETE = ATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Attribute Related</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATED_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link metaerp.BehaviorTypes <em>Behavior Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaerp.BehaviorTypes
	 * @see metaerp.impl.MetaerpPackageImpl#getBehaviorTypes()
	 * @generated
	 */
	int BEHAVIOR_TYPES = 6;

	/**
	 * The meta object id for the '{@link metaerp.RuleTypes <em>Rule Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaerp.RuleTypes
	 * @see metaerp.impl.MetaerpPackageImpl#getRuleTypes()
	 * @generated
	 */
	int RULE_TYPES = 7;

	/**
	 * The meta object id for the '{@link metaerp.InputDefaultTypes <em>Input Default Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaerp.InputDefaultTypes
	 * @see metaerp.impl.MetaerpPackageImpl#getInputDefaultTypes()
	 * @generated
	 */
	int INPUT_DEFAULT_TYPES = 8;


	/**
	 * Returns the meta object for class '{@link metaerp.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see metaerp.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link metaerp.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metaerp.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link metaerp.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see metaerp.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link metaerp.Entity#getSubEntity <em>Sub Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Entity</em>'.
	 * @see metaerp.Entity#getSubEntity()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_SubEntity();

	/**
	 * Returns the meta object for the attribute '{@link metaerp.Entity#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see metaerp.Entity#getCardinality()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Cardinality();

	/**
	 * Returns the meta object for class '{@link metaerp.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see metaerp.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link metaerp.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metaerp.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link metaerp.Attribute#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see metaerp.Attribute#getLabel()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Label();

	/**
	 * Returns the meta object for the attribute '{@link metaerp.Attribute#isCreateble <em>Createble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Createble</em>'.
	 * @see metaerp.Attribute#isCreateble()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Createble();

	/**
	 * Returns the meta object for the attribute '{@link metaerp.Attribute#isEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see metaerp.Attribute#isEditable()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Editable();

	/**
	 * Returns the meta object for the reference '{@link metaerp.Attribute#getCustomType <em>Custom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Type</em>'.
	 * @see metaerp.Attribute#getCustomType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_CustomType();

	/**
	 * Returns the meta object for the attribute '{@link metaerp.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see metaerp.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link metaerp.Attribute#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see metaerp.Attribute#isRequired()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Required();

	/**
	 * Returns the meta object for the attribute '{@link metaerp.Attribute#isListable <em>Listable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listable</em>'.
	 * @see metaerp.Attribute#isListable()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Listable();

	/**
	 * Returns the meta object for class '{@link metaerp.ERP <em>ERP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERP</em>'.
	 * @see metaerp.ERP
	 * @generated
	 */
	EClass getERP();

	/**
	 * Returns the meta object for the containment reference list '{@link metaerp.ERP#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see metaerp.ERP#getEntities()
	 * @see #getERP()
	 * @generated
	 */
	EReference getERP_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link metaerp.ERP#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see metaerp.ERP#getTypes()
	 * @see #getERP()
	 * @generated
	 */
	EReference getERP_Types();

	/**
	 * Returns the meta object for class '{@link metaerp.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see metaerp.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link metaerp.DataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metaerp.DataType#getName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Name();

	/**
	 * Returns the meta object for the attribute '{@link metaerp.DataType#getRegex <em>Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex</em>'.
	 * @see metaerp.DataType#getRegex()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Regex();

	/**
	 * Returns the meta object for the attribute '{@link metaerp.DataType#getHelperText <em>Helper Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Helper Text</em>'.
	 * @see metaerp.DataType#getHelperText()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_HelperText();

	/**
	 * Returns the meta object for class '{@link metaerp.EntityRelated <em>Entity Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Related</em>'.
	 * @see metaerp.EntityRelated
	 * @generated
	 */
	EClass getEntityRelated();

	/**
	 * Returns the meta object for the reference '{@link metaerp.EntityRelated#getRelated <em>Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related</em>'.
	 * @see metaerp.EntityRelated#getRelated()
	 * @see #getEntityRelated()
	 * @generated
	 */
	EReference getEntityRelated_Related();

	/**
	 * Returns the meta object for the containment reference list '{@link metaerp.EntityRelated#getAttributesRelated <em>Attributes Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes Related</em>'.
	 * @see metaerp.EntityRelated#getAttributesRelated()
	 * @see #getEntityRelated()
	 * @generated
	 */
	EReference getEntityRelated_AttributesRelated();

	/**
	 * Returns the meta object for the attribute '{@link metaerp.EntityRelated#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see metaerp.EntityRelated#getLabel()
	 * @see #getEntityRelated()
	 * @generated
	 */
	EAttribute getEntityRelated_Label();

	/**
	 * Returns the meta object for class '{@link metaerp.AttributeRelated <em>Attribute Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Related</em>'.
	 * @see metaerp.AttributeRelated
	 * @generated
	 */
	EClass getAttributeRelated();

	/**
	 * Returns the meta object for the attribute '{@link metaerp.AttributeRelated#isMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main</em>'.
	 * @see metaerp.AttributeRelated#isMain()
	 * @see #getAttributeRelated()
	 * @generated
	 */
	EAttribute getAttributeRelated_Main();

	/**
	 * Returns the meta object for the attribute '{@link metaerp.AttributeRelated#getOnCreate <em>On Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Create</em>'.
	 * @see metaerp.AttributeRelated#getOnCreate()
	 * @see #getAttributeRelated()
	 * @generated
	 */
	EAttribute getAttributeRelated_OnCreate();

	/**
	 * Returns the meta object for the attribute '{@link metaerp.AttributeRelated#getOnDelete <em>On Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Delete</em>'.
	 * @see metaerp.AttributeRelated#getOnDelete()
	 * @see #getAttributeRelated()
	 * @generated
	 */
	EAttribute getAttributeRelated_OnDelete();

	/**
	 * Returns the meta object for the attribute '{@link metaerp.AttributeRelated#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule</em>'.
	 * @see metaerp.AttributeRelated#getRule()
	 * @see #getAttributeRelated()
	 * @generated
	 */
	EAttribute getAttributeRelated_Rule();

	/**
	 * Returns the meta object for the reference '{@link metaerp.AttributeRelated#getRelated <em>Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related</em>'.
	 * @see metaerp.AttributeRelated#getRelated()
	 * @see #getAttributeRelated()
	 * @generated
	 */
	EReference getAttributeRelated_Related();

	/**
	 * Returns the meta object for the attribute '{@link metaerp.AttributeRelated#isAutocomplete <em>Autocomplete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autocomplete</em>'.
	 * @see metaerp.AttributeRelated#isAutocomplete()
	 * @see #getAttributeRelated()
	 * @generated
	 */
	EAttribute getAttributeRelated_Autocomplete();

	/**
	 * Returns the meta object for enum '{@link metaerp.BehaviorTypes <em>Behavior Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Behavior Types</em>'.
	 * @see metaerp.BehaviorTypes
	 * @generated
	 */
	EEnum getBehaviorTypes();

	/**
	 * Returns the meta object for enum '{@link metaerp.RuleTypes <em>Rule Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Types</em>'.
	 * @see metaerp.RuleTypes
	 * @generated
	 */
	EEnum getRuleTypes();

	/**
	 * Returns the meta object for enum '{@link metaerp.InputDefaultTypes <em>Input Default Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Input Default Types</em>'.
	 * @see metaerp.InputDefaultTypes
	 * @generated
	 */
	EEnum getInputDefaultTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetaerpFactory getMetaerpFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link metaerp.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaerp.impl.EntityImpl
		 * @see metaerp.impl.MetaerpPackageImpl#getEntity()
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
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Sub Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__SUB_ENTITY = eINSTANCE.getEntity_SubEntity();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__CARDINALITY = eINSTANCE.getEntity_Cardinality();

		/**
		 * The meta object literal for the '{@link metaerp.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaerp.impl.AttributeImpl
		 * @see metaerp.impl.MetaerpPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__LABEL = eINSTANCE.getAttribute_Label();

		/**
		 * The meta object literal for the '<em><b>Createble</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__CREATEBLE = eINSTANCE.getAttribute_Createble();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__EDITABLE = eINSTANCE.getAttribute_Editable();

		/**
		 * The meta object literal for the '<em><b>Custom Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CUSTOM_TYPE = eINSTANCE.getAttribute_CustomType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__REQUIRED = eINSTANCE.getAttribute_Required();

		/**
		 * The meta object literal for the '<em><b>Listable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__LISTABLE = eINSTANCE.getAttribute_Listable();

		/**
		 * The meta object literal for the '{@link metaerp.impl.ERPImpl <em>ERP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaerp.impl.ERPImpl
		 * @see metaerp.impl.MetaerpPackageImpl#getERP()
		 * @generated
		 */
		EClass ERP = eINSTANCE.getERP();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP__ENTITIES = eINSTANCE.getERP_Entities();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERP__TYPES = eINSTANCE.getERP_Types();

		/**
		 * The meta object literal for the '{@link metaerp.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaerp.impl.DataTypeImpl
		 * @see metaerp.impl.MetaerpPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

		/**
		 * The meta object literal for the '<em><b>Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__REGEX = eINSTANCE.getDataType_Regex();

		/**
		 * The meta object literal for the '<em><b>Helper Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__HELPER_TEXT = eINSTANCE.getDataType_HelperText();

		/**
		 * The meta object literal for the '{@link metaerp.impl.EntityRelatedImpl <em>Entity Related</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaerp.impl.EntityRelatedImpl
		 * @see metaerp.impl.MetaerpPackageImpl#getEntityRelated()
		 * @generated
		 */
		EClass ENTITY_RELATED = eINSTANCE.getEntityRelated();

		/**
		 * The meta object literal for the '<em><b>Related</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATED__RELATED = eINSTANCE.getEntityRelated_Related();

		/**
		 * The meta object literal for the '<em><b>Attributes Related</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_RELATED__ATTRIBUTES_RELATED = eINSTANCE.getEntityRelated_AttributesRelated();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_RELATED__LABEL = eINSTANCE.getEntityRelated_Label();

		/**
		 * The meta object literal for the '{@link metaerp.impl.AttributeRelatedImpl <em>Attribute Related</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaerp.impl.AttributeRelatedImpl
		 * @see metaerp.impl.MetaerpPackageImpl#getAttributeRelated()
		 * @generated
		 */
		EClass ATTRIBUTE_RELATED = eINSTANCE.getAttributeRelated();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_RELATED__MAIN = eINSTANCE.getAttributeRelated_Main();

		/**
		 * The meta object literal for the '<em><b>On Create</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_RELATED__ON_CREATE = eINSTANCE.getAttributeRelated_OnCreate();

		/**
		 * The meta object literal for the '<em><b>On Delete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_RELATED__ON_DELETE = eINSTANCE.getAttributeRelated_OnDelete();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_RELATED__RULE = eINSTANCE.getAttributeRelated_Rule();

		/**
		 * The meta object literal for the '<em><b>Related</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_RELATED__RELATED = eINSTANCE.getAttributeRelated_Related();

		/**
		 * The meta object literal for the '<em><b>Autocomplete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_RELATED__AUTOCOMPLETE = eINSTANCE.getAttributeRelated_Autocomplete();

		/**
		 * The meta object literal for the '{@link metaerp.BehaviorTypes <em>Behavior Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaerp.BehaviorTypes
		 * @see metaerp.impl.MetaerpPackageImpl#getBehaviorTypes()
		 * @generated
		 */
		EEnum BEHAVIOR_TYPES = eINSTANCE.getBehaviorTypes();

		/**
		 * The meta object literal for the '{@link metaerp.RuleTypes <em>Rule Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaerp.RuleTypes
		 * @see metaerp.impl.MetaerpPackageImpl#getRuleTypes()
		 * @generated
		 */
		EEnum RULE_TYPES = eINSTANCE.getRuleTypes();

		/**
		 * The meta object literal for the '{@link metaerp.InputDefaultTypes <em>Input Default Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaerp.InputDefaultTypes
		 * @see metaerp.impl.MetaerpPackageImpl#getInputDefaultTypes()
		 * @generated
		 */
		EEnum INPUT_DEFAULT_TYPES = eINSTANCE.getInputDefaultTypes();

	}

} //MetaerpPackage
