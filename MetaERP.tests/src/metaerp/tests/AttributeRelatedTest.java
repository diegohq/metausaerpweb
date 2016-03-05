/**
 */
package metaerp.tests;

import junit.textui.TestRunner;

import metaerp.AttributeRelated;
import metaerp.MetaerpFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Related</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeRelatedTest extends AttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttributeRelatedTest.class);
	}

	/**
	 * Constructs a new Attribute Related test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeRelatedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Attribute Related test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AttributeRelated getFixture() {
		return (AttributeRelated)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetaerpFactory.eINSTANCE.createAttributeRelated());
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

} //AttributeRelatedTest
