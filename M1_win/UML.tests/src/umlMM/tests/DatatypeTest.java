/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package umlMM.tests;

import junit.textui.TestRunner;

import umlMM.Datatype;
import umlMM.UmlMMFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Datatype</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypeTest extends ClassifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatatypeTest.class);
	}

	/**
	 * Constructs a new Datatype test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Datatype test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Datatype getFixture() {
		return (Datatype)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UmlMMFactory.eINSTANCE.createDatatype());
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

} //DatatypeTest
