/**
 */
package metaerp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Related</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metaerp.EntityRelated#getRelated <em>Related</em>}</li>
 *   <li>{@link metaerp.EntityRelated#getAttributesRelated <em>Attributes Related</em>}</li>
 *   <li>{@link metaerp.EntityRelated#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see metaerp.MetaerpPackage#getEntityRelated()
 * @model
 * @generated
 */
public interface EntityRelated extends Entity {
	/**
	 * Returns the value of the '<em><b>Related</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related</em>' reference.
	 * @see #setRelated(Entity)
	 * @see metaerp.MetaerpPackage#getEntityRelated_Related()
	 * @model required="true"
	 * @generated
	 */
	Entity getRelated();

	/**
	 * Sets the value of the '{@link metaerp.EntityRelated#getRelated <em>Related</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related</em>' reference.
	 * @see #getRelated()
	 * @generated
	 */
	void setRelated(Entity value);

	/**
	 * Returns the value of the '<em><b>Attributes Related</b></em>' containment reference list.
	 * The list contents are of type {@link metaerp.AttributeRelated}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes Related</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes Related</em>' containment reference list.
	 * @see metaerp.MetaerpPackage#getEntityRelated_AttributesRelated()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AttributeRelated> getAttributesRelated();

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
	 * @see metaerp.MetaerpPackage#getEntityRelated_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link metaerp.EntityRelated#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // EntityRelated
