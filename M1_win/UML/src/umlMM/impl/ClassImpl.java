/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package umlMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import umlMM.Associaton;
import umlMM.Attribute;
import umlMM.UmlMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link umlMM.impl.ClassImpl#getDestinationOf <em>Destination Of</em>}</li>
 *   <li>{@link umlMM.impl.ClassImpl#getSourceOf <em>Source Of</em>}</li>
 *   <li>{@link umlMM.impl.ClassImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends ClassifierImpl implements umlMM.Class {
	/**
	 * The cached value of the '{@link #getDestinationOf() <em>Destination Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Associaton> destinationOf;

	/**
	 * The cached value of the '{@link #getSourceOf() <em>Source Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Associaton> sourceOf;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlMMPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Associaton> getDestinationOf() {
		if (destinationOf == null) {
			destinationOf = new EObjectWithInverseResolvingEList<Associaton>(Associaton.class, this, UmlMMPackage.CLASS__DESTINATION_OF, UmlMMPackage.ASSOCIATON__DESTINATION);
		}
		return destinationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Associaton> getSourceOf() {
		if (sourceOf == null) {
			sourceOf = new EObjectWithInverseResolvingEList<Associaton>(Associaton.class, this, UmlMMPackage.CLASS__SOURCE_OF, UmlMMPackage.ASSOCIATON__SOURCE);
		}
		return sourceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentWithInverseEList<Attribute>(Attribute.class, this, UmlMMPackage.CLASS__ATTRIBUTE, UmlMMPackage.ATTRIBUTE__OWNER);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlMMPackage.CLASS__DESTINATION_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDestinationOf()).basicAdd(otherEnd, msgs);
			case UmlMMPackage.CLASS__SOURCE_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceOf()).basicAdd(otherEnd, msgs);
			case UmlMMPackage.CLASS__ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttribute()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlMMPackage.CLASS__DESTINATION_OF:
				return ((InternalEList<?>)getDestinationOf()).basicRemove(otherEnd, msgs);
			case UmlMMPackage.CLASS__SOURCE_OF:
				return ((InternalEList<?>)getSourceOf()).basicRemove(otherEnd, msgs);
			case UmlMMPackage.CLASS__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
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
			case UmlMMPackage.CLASS__DESTINATION_OF:
				return getDestinationOf();
			case UmlMMPackage.CLASS__SOURCE_OF:
				return getSourceOf();
			case UmlMMPackage.CLASS__ATTRIBUTE:
				return getAttribute();
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
			case UmlMMPackage.CLASS__DESTINATION_OF:
				getDestinationOf().clear();
				getDestinationOf().addAll((Collection<? extends Associaton>)newValue);
				return;
			case UmlMMPackage.CLASS__SOURCE_OF:
				getSourceOf().clear();
				getSourceOf().addAll((Collection<? extends Associaton>)newValue);
				return;
			case UmlMMPackage.CLASS__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
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
			case UmlMMPackage.CLASS__DESTINATION_OF:
				getDestinationOf().clear();
				return;
			case UmlMMPackage.CLASS__SOURCE_OF:
				getSourceOf().clear();
				return;
			case UmlMMPackage.CLASS__ATTRIBUTE:
				getAttribute().clear();
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
			case UmlMMPackage.CLASS__DESTINATION_OF:
				return destinationOf != null && !destinationOf.isEmpty();
			case UmlMMPackage.CLASS__SOURCE_OF:
				return sourceOf != null && !sourceOf.isEmpty();
			case UmlMMPackage.CLASS__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassImpl
