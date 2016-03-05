/**
 */
package metaerp.tests;

import junit.textui.TestRunner;

import metaerp.EntityRelated;
import metaerp.MetaerpFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entity Related</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityRelatedTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntityRelatedTest.class);
	}

	/**
	 * Constructs a new Entity Related test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityRelatedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Entity Related test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EntityRelated getFixture() {
		return (EntityRelated)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetaerpFactory.eINSTANCE.createEntityRelated());
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

} //EntityRelatedTest
