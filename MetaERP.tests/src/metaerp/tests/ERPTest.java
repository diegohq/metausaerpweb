/**
 */
package metaerp.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import metaerp.ERP;
import metaerp.MetaerpFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ERP</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ERPTest extends TestCase {

	/**
	 * The fixture for this ERP test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERP fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ERPTest.class);
	}

	/**
	 * Constructs a new ERP test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERPTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this ERP test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ERP fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this ERP test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERP getFixture() {
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
		setFixture(MetaerpFactory.eINSTANCE.createERP());
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

} //ERPTest
