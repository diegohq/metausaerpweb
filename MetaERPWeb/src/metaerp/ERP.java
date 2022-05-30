/**
 */
package metaerp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metaerp.ERP#getEntities <em>Entities</em>}</li>
 *   <li>{@link metaerp.ERP#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see metaerp.MetaerpPackage#getERP()
 * @model
 * @generated
 */
public interface ERP extends EObject {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link metaerp.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see metaerp.MetaerpPackage#getERP_Entities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link metaerp.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see metaerp.MetaerpPackage#getERP_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getTypes();

} // ERP
