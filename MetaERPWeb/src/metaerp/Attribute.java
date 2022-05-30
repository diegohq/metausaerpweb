/**
 */
package metaerp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metaerp.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link metaerp.Attribute#getLabel <em>Label</em>}</li>
 *   <li>{@link metaerp.Attribute#isCreateble <em>Createble</em>}</li>
 *   <li>{@link metaerp.Attribute#isEditable <em>Editable</em>}</li>
 *   <li>{@link metaerp.Attribute#getCustomType <em>Custom Type</em>}</li>
 *   <li>{@link metaerp.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link metaerp.Attribute#isRequired <em>Required</em>}</li>
 *   <li>{@link metaerp.Attribute#isListable <em>Listable</em>}</li>
 * </ul>
 * </p>
 *
 * @see metaerp.MetaerpPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metaerp.MetaerpPackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metaerp.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see metaerp.MetaerpPackage#getAttribute_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link metaerp.Attribute#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Createble</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Createble</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Createble</em>' attribute.
	 * @see #setCreateble(boolean)
	 * @see metaerp.MetaerpPackage#getAttribute_Createble()
	 * @model default="true"
	 * @generated
	 */
	boolean isCreateble();

	/**
	 * Sets the value of the '{@link metaerp.Attribute#isCreateble <em>Createble</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Createble</em>' attribute.
	 * @see #isCreateble()
	 * @generated
	 */
	void setCreateble(boolean value);

	/**
	 * Returns the value of the '<em><b>Editable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editable</em>' attribute.
	 * @see #setEditable(boolean)
	 * @see metaerp.MetaerpPackage#getAttribute_Editable()
	 * @model default="true"
	 * @generated
	 */
	boolean isEditable();

	/**
	 * Sets the value of the '{@link metaerp.Attribute#isEditable <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editable</em>' attribute.
	 * @see #isEditable()
	 * @generated
	 */
	void setEditable(boolean value);

	/**
	 * Returns the value of the '<em><b>Custom Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Type</em>' reference.
	 * @see #setCustomType(DataType)
	 * @see metaerp.MetaerpPackage#getAttribute_CustomType()
	 * @model required="true"
	 * @generated
	 */
	DataType getCustomType();

	/**
	 * Sets the value of the '{@link metaerp.Attribute#getCustomType <em>Custom Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Type</em>' reference.
	 * @see #getCustomType()
	 * @generated
	 */
	void setCustomType(DataType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link metaerp.InputDefaultTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see metaerp.InputDefaultTypes
	 * @see #setType(InputDefaultTypes)
	 * @see metaerp.MetaerpPackage#getAttribute_Type()
	 * @model
	 * @generated
	 */
	InputDefaultTypes getType();

	/**
	 * Sets the value of the '{@link metaerp.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see metaerp.InputDefaultTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(InputDefaultTypes value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see metaerp.MetaerpPackage#getAttribute_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link metaerp.Attribute#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Listable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listable</em>' attribute.
	 * @see #setListable(boolean)
	 * @see metaerp.MetaerpPackage#getAttribute_Listable()
	 * @model
	 * @generated
	 */
	boolean isListable();

	/**
	 * Sets the value of the '{@link metaerp.Attribute#isListable <em>Listable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listable</em>' attribute.
	 * @see #isListable()
	 * @generated
	 */
	void setListable(boolean value);

} // Attribute
