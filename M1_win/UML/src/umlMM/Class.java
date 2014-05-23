/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package umlMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link umlMM.Class#getDestinationOf <em>Destination Of</em>}</li>
 *   <li>{@link umlMM.Class#getSourceOf <em>Source Of</em>}</li>
 *   <li>{@link umlMM.Class#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see umlMM.UmlMMPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Classifier {
	/**
	 * Returns the value of the '<em><b>Destination Of</b></em>' reference list.
	 * The list contents are of type {@link umlMM.Associaton}.
	 * It is bidirectional and its opposite is '{@link umlMM.Associaton#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Of</em>' reference list.
	 * @see umlMM.UmlMMPackage#getClass_DestinationOf()
	 * @see umlMM.Associaton#getDestination
	 * @model opposite="destination"
	 * @generated
	 */
	EList<Associaton> getDestinationOf();

	/**
	 * Returns the value of the '<em><b>Source Of</b></em>' reference list.
	 * The list contents are of type {@link umlMM.Associaton}.
	 * It is bidirectional and its opposite is '{@link umlMM.Associaton#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Of</em>' reference list.
	 * @see umlMM.UmlMMPackage#getClass_SourceOf()
	 * @see umlMM.Associaton#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Associaton> getSourceOf();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link umlMM.Attribute}.
	 * It is bidirectional and its opposite is '{@link umlMM.Attribute#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see umlMM.UmlMMPackage#getClass_Attribute()
	 * @see umlMM.Attribute#getOwner
	 * @model opposite="Owner" containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

} // Class
