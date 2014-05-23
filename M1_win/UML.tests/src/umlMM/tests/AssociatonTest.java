/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package umlMM.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import umlMM.Associaton;
import umlMM.UmlMMFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Associaton</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssociatonTest extends TestCase {

	/**
	 * The fixture for this Associaton test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Associaton fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssociatonTest.class);
	}

	/**
	 * Constructs a new Associaton test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociatonTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Associaton test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Associaton fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Associaton test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Associaton getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UmlMMFactory.eINSTANCE.createAssociaton());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AssociatonTest
