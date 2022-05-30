/**
 */
package metaerp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rule Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see metaerp.MetaerpPackage#getRuleTypes()
 * @model
 * @generated
 */
public enum RuleTypes implements Enumerator {
	/**
	 * The '<em><b>Bigger</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIGGER_VALUE
	 * @generated
	 * @ordered
	 */
	BIGGER(0, "bigger", "bigger"),

	/**
	 * The '<em><b>Smaller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALLER_VALUE
	 * @generated
	 * @ordered
	 */
	SMALLER(1, "smaller", "smaller"),

	/**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(2, "equal", "equal"),

	/**
	 * The '<em><b>Bigger Or Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIGGER_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	BIGGER_OR_EQUAL(3, "biggerOrEqual", "biggerOrEqual"),

	/**
	 * The '<em><b>Smaller Or Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALLER_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	SMALLER_OR_EQUAL(4, "smallerOrEqual", "smallerOrEqual"), /**
	 * The '<em><b>No Rule</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_RULE_VALUE
	 * @generated
	 * @ordered
	 */
	NO_RULE(5, "noRule", "noRule");

	/**
	 * The '<em><b>Bigger</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bigger</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIGGER
	 * @model name="bigger"
	 * @generated
	 * @ordered
	 */
	public static final int BIGGER_VALUE = 0;

	/**
	 * The '<em><b>Smaller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Smaller</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMALLER
	 * @model name="smaller"
	 * @generated
	 * @ordered
	 */
	public static final int SMALLER_VALUE = 1;

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model name="equal"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 2;

	/**
	 * The '<em><b>Bigger Or Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bigger Or Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIGGER_OR_EQUAL
	 * @model name="biggerOrEqual"
	 * @generated
	 * @ordered
	 */
	public static final int BIGGER_OR_EQUAL_VALUE = 3;

	/**
	 * The '<em><b>Smaller Or Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Smaller Or Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMALLER_OR_EQUAL
	 * @model name="smallerOrEqual"
	 * @generated
	 * @ordered
	 */
	public static final int SMALLER_OR_EQUAL_VALUE = 4;

	/**
	 * The '<em><b>No Rule</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Rule</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_RULE
	 * @model name="noRule"
	 * @generated
	 * @ordered
	 */
	public static final int NO_RULE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Rule Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RuleTypes[] VALUES_ARRAY =
		new RuleTypes[] {
			BIGGER,
			SMALLER,
			EQUAL,
			BIGGER_OR_EQUAL,
			SMALLER_OR_EQUAL,
			NO_RULE,
		};

	/**
	 * A public read-only list of all the '<em><b>Rule Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RuleTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rule Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RuleTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RuleTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rule Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RuleTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RuleTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rule Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RuleTypes get(int value) {
		switch (value) {
			case BIGGER_VALUE: return BIGGER;
			case SMALLER_VALUE: return SMALLER;
			case EQUAL_VALUE: return EQUAL;
			case BIGGER_OR_EQUAL_VALUE: return BIGGER_OR_EQUAL;
			case SMALLER_OR_EQUAL_VALUE: return SMALLER_OR_EQUAL;
			case NO_RULE_VALUE: return NO_RULE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RuleTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RuleTypes
