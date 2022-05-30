/**
 */
package metaerp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Related</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metaerp.AttributeRelated#isMain <em>Main</em>}</li>
 *   <li>{@link metaerp.AttributeRelated#getOnCreate <em>On Create</em>}</li>
 *   <li>{@link metaerp.AttributeRelated#getOnDelete <em>On Delete</em>}</li>
 *   <li>{@link metaerp.AttributeRelated#getRule <em>Rule</em>}</li>
 *   <li>{@link metaerp.AttributeRelated#getRelated <em>Related</em>}</li>
 *   <li>{@link metaerp.AttributeRelated#isAutocomplete <em>Autocomplete</em>}</li>
 * </ul>
 * </p>
 *
 * @see metaerp.MetaerpPackage#getAttributeRelated()
 * @model
 * @generated
 */
public interface AttributeRelated extends Attribute {
	/**
	 * Returns the value of the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' attribute.
	 * @see #setMain(boolean)
	 * @see metaerp.MetaerpPackage#getAttributeRelated_Main()
	 * @model
	 * @generated
	 */
	boolean isMain();

	/**
	 * Sets the value of the '{@link metaerp.AttributeRelated#isMain <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' attribute.
	 * @see #isMain()
	 * @generated
	 */
	void setMain(boolean value);

	/**
	 * Returns the value of the '<em><b>On Create</b></em>' attribute.
	 * The literals are from the enumeration {@link metaerp.BehaviorTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Create</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Create</em>' attribute.
	 * @see metaerp.BehaviorTypes
	 * @see #setOnCreate(BehaviorTypes)
	 * @see metaerp.MetaerpPackage#getAttributeRelated_OnCreate()
	 * @model
	 * @generated
	 */
	BehaviorTypes getOnCreate();

	/**
	 * Sets the value of the '{@link metaerp.AttributeRelated#getOnCreate <em>On Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Create</em>' attribute.
	 * @see metaerp.BehaviorTypes
	 * @see #getOnCreate()
	 * @generated
	 */
	void setOnCreate(BehaviorTypes value);

	/**
	 * Returns the value of the '<em><b>On Delete</b></em>' attribute.
	 * The literals are from the enumeration {@link metaerp.BehaviorTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Delete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Delete</em>' attribute.
	 * @see metaerp.BehaviorTypes
	 * @see #setOnDelete(BehaviorTypes)
	 * @see metaerp.MetaerpPackage#getAttributeRelated_OnDelete()
	 * @model
	 * @generated
	 */
	BehaviorTypes getOnDelete();

	/**
	 * Sets the value of the '{@link metaerp.AttributeRelated#getOnDelete <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Delete</em>' attribute.
	 * @see metaerp.BehaviorTypes
	 * @see #getOnDelete()
	 * @generated
	 */
	void setOnDelete(BehaviorTypes value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' attribute.
	 * The literals are from the enumeration {@link metaerp.RuleTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' attribute.
	 * @see metaerp.RuleTypes
	 * @see #setRule(RuleTypes)
	 * @see metaerp.MetaerpPackage#getAttributeRelated_Rule()
	 * @model
	 * @generated
	 */
	RuleTypes getRule();

	/**
	 * Sets the value of the '{@link metaerp.AttributeRelated#getRule <em>Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' attribute.
	 * @see metaerp.RuleTypes
	 * @see #getRule()
	 * @generated
	 */
	void setRule(RuleTypes value);

	/**
	 * Returns the value of the '<em><b>Related</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related</em>' reference.
	 * @see #setRelated(Attribute)
	 * @see metaerp.MetaerpPackage#getAttributeRelated_Related()
	 * @model required="true"
	 * @generated
	 */
	Attribute getRelated();

	/**
	 * Sets the value of the '{@link metaerp.AttributeRelated#getRelated <em>Related</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related</em>' reference.
	 * @see #getRelated()
	 * @generated
	 */
	void setRelated(Attribute value);

	/**
	 * Returns the value of the '<em><b>Autocomplete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autocomplete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autocomplete</em>' attribute.
	 * @see #setAutocomplete(boolean)
	 * @see metaerp.MetaerpPackage#getAttributeRelated_Autocomplete()
	 * @model
	 * @generated
	 */
	boolean isAutocomplete();

	/**
	 * Sets the value of the '{@link metaerp.AttributeRelated#isAutocomplete <em>Autocomplete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autocomplete</em>' attribute.
	 * @see #isAutocomplete()
	 * @generated
	 */
	void setAutocomplete(boolean value);

} // AttributeRelated
