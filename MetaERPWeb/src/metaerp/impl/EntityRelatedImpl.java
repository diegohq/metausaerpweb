/**
 */
package metaerp.impl;

import java.util.Collection;

import metaerp.AttributeRelated;
import metaerp.Entity;
import metaerp.EntityRelated;
import metaerp.MetaerpPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Related</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metaerp.impl.EntityRelatedImpl#getRelated <em>Related</em>}</li>
 *   <li>{@link metaerp.impl.EntityRelatedImpl#getAttributesRelated <em>Attributes Related</em>}</li>
 *   <li>{@link metaerp.impl.EntityRelatedImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityRelatedImpl extends EntityImpl implements EntityRelated {
	/**
	 * The cached value of the '{@link #getRelated() <em>Related</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelated()
	 * @generated
	 * @ordered
	 */
	protected Entity related;

	/**
	 * The cached value of the '{@link #getAttributesRelated() <em>Attributes Related</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributesRelated()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeRelated> attributesRelated;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityRelatedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaerpPackage.Literals.ENTITY_RELATED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getRelated() {
		if (related != null && related.eIsProxy()) {
			InternalEObject oldRelated = (InternalEObject)related;
			related = (Entity)eResolveProxy(oldRelated);
			if (related != oldRelated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaerpPackage.ENTITY_RELATED__RELATED, oldRelated, related));
			}
		}
		return related;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetRelated() {
		return related;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelated(Entity newRelated) {
		Entity oldRelated = related;
		related = newRelated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaerpPackage.ENTITY_RELATED__RELATED, oldRelated, related));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeRelated> getAttributesRelated() {
		if (attributesRelated == null) {
			attributesRelated = new EObjectContainmentEList<AttributeRelated>(AttributeRelated.class, this, MetaerpPackage.ENTITY_RELATED__ATTRIBUTES_RELATED);
		}
		return attributesRelated;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaerpPackage.ENTITY_RELATED__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaerpPackage.ENTITY_RELATED__ATTRIBUTES_RELATED:
				return ((InternalEList<?>)getAttributesRelated()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaerpPackage.ENTITY_RELATED__RELATED:
				if (resolve) return getRelated();
				return basicGetRelated();
			case MetaerpPackage.ENTITY_RELATED__ATTRIBUTES_RELATED:
				return getAttributesRelated();
			case MetaerpPackage.ENTITY_RELATED__LABEL:
				return getLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetaerpPackage.ENTITY_RELATED__RELATED:
				setRelated((Entity)newValue);
				return;
			case MetaerpPackage.ENTITY_RELATED__ATTRIBUTES_RELATED:
				getAttributesRelated().clear();
				getAttributesRelated().addAll((Collection<? extends AttributeRelated>)newValue);
				return;
			case MetaerpPackage.ENTITY_RELATED__LABEL:
				setLabel((String)newValue);
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
			case MetaerpPackage.ENTITY_RELATED__RELATED:
				setRelated((Entity)null);
				return;
			case MetaerpPackage.ENTITY_RELATED__ATTRIBUTES_RELATED:
				getAttributesRelated().clear();
				return;
			case MetaerpPackage.ENTITY_RELATED__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case MetaerpPackage.ENTITY_RELATED__RELATED:
				return related != null;
			case MetaerpPackage.ENTITY_RELATED__ATTRIBUTES_RELATED:
				return attributesRelated != null && !attributesRelated.isEmpty();
			case MetaerpPackage.ENTITY_RELATED__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //EntityRelatedImpl
