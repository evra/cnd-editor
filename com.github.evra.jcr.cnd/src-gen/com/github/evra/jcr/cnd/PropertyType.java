/**
 */
package com.github.evra.jcr.cnd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Property Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.github.evra.jcr.cnd.CndPackage#getPropertyType()
 * @model
 * @generated
 */
public enum PropertyType implements Enumerator
{
  /**
   * The '<em><b>UNDEFINED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNDEFINED_VALUE
   * @generated
   * @ordered
   */
  UNDEFINED(0, "UNDEFINED", "UNDEFINED"),

  /**
   * The '<em><b>TSTRING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TSTRING_VALUE
   * @generated
   * @ordered
   */
  TSTRING(1, "TSTRING", "STRING"),

  /**
   * The '<em><b>TBINARY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TBINARY_VALUE
   * @generated
   * @ordered
   */
  TBINARY(2, "TBINARY", "BINARY"),

  /**
   * The '<em><b>TLONG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TLONG_VALUE
   * @generated
   * @ordered
   */
  TLONG(3, "TLONG", "LONG"),

  /**
   * The '<em><b>TDOUBLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TDOUBLE_VALUE
   * @generated
   * @ordered
   */
  TDOUBLE(4, "TDOUBLE", "DOUBLE"),

  /**
   * The '<em><b>DDATE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DDATE_VALUE
   * @generated
   * @ordered
   */
  DDATE(5, "DDATE", "DATE"),

  /**
   * The '<em><b>TBOOLEAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TBOOLEAN_VALUE
   * @generated
   * @ordered
   */
  TBOOLEAN(6, "TBOOLEAN", "BOOLEAN"),

  /**
   * The '<em><b>TNAME</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TNAME_VALUE
   * @generated
   * @ordered
   */
  TNAME(7, "TNAME", "NAME"),

  /**
   * The '<em><b>TPATH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TPATH_VALUE
   * @generated
   * @ordered
   */
  TPATH(8, "TPATH", "PATH"),

  /**
   * The '<em><b>TREFERENCE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TREFERENCE_VALUE
   * @generated
   * @ordered
   */
  TREFERENCE(9, "TREFERENCE", "REFERENCE"),

  /**
   * The '<em><b>TWEAKREFERENCE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TWEAKREFERENCE_VALUE
   * @generated
   * @ordered
   */
  TWEAKREFERENCE(10, "TWEAKREFERENCE", "WEAKREFERENCE"),

  /**
   * The '<em><b>TURI</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TURI_VALUE
   * @generated
   * @ordered
   */
  TURI(11, "TURI", "URI"),

  /**
   * The '<em><b>TDECIMAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TDECIMAL_VALUE
   * @generated
   * @ordered
   */
  TDECIMAL(12, "TDECIMAL", "DECIMAL");

  /**
   * The '<em><b>UNDEFINED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UNDEFINED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNDEFINED
   * @model
   * @generated
   * @ordered
   */
  public static final int UNDEFINED_VALUE = 0;

  /**
   * The '<em><b>TSTRING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TSTRING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TSTRING
   * @model literal="STRING"
   * @generated
   * @ordered
   */
  public static final int TSTRING_VALUE = 1;

  /**
   * The '<em><b>TBINARY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TBINARY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TBINARY
   * @model literal="BINARY"
   * @generated
   * @ordered
   */
  public static final int TBINARY_VALUE = 2;

  /**
   * The '<em><b>TLONG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TLONG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TLONG
   * @model literal="LONG"
   * @generated
   * @ordered
   */
  public static final int TLONG_VALUE = 3;

  /**
   * The '<em><b>TDOUBLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TDOUBLE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TDOUBLE
   * @model literal="DOUBLE"
   * @generated
   * @ordered
   */
  public static final int TDOUBLE_VALUE = 4;

  /**
   * The '<em><b>DDATE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DDATE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DDATE
   * @model literal="DATE"
   * @generated
   * @ordered
   */
  public static final int DDATE_VALUE = 5;

  /**
   * The '<em><b>TBOOLEAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TBOOLEAN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TBOOLEAN
   * @model literal="BOOLEAN"
   * @generated
   * @ordered
   */
  public static final int TBOOLEAN_VALUE = 6;

  /**
   * The '<em><b>TNAME</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TNAME</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TNAME
   * @model literal="NAME"
   * @generated
   * @ordered
   */
  public static final int TNAME_VALUE = 7;

  /**
   * The '<em><b>TPATH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TPATH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TPATH
   * @model literal="PATH"
   * @generated
   * @ordered
   */
  public static final int TPATH_VALUE = 8;

  /**
   * The '<em><b>TREFERENCE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TREFERENCE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TREFERENCE
   * @model literal="REFERENCE"
   * @generated
   * @ordered
   */
  public static final int TREFERENCE_VALUE = 9;

  /**
   * The '<em><b>TWEAKREFERENCE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TWEAKREFERENCE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TWEAKREFERENCE
   * @model literal="WEAKREFERENCE"
   * @generated
   * @ordered
   */
  public static final int TWEAKREFERENCE_VALUE = 10;

  /**
   * The '<em><b>TURI</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TURI</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TURI
   * @model literal="URI"
   * @generated
   * @ordered
   */
  public static final int TURI_VALUE = 11;

  /**
   * The '<em><b>TDECIMAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TDECIMAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TDECIMAL
   * @model literal="DECIMAL"
   * @generated
   * @ordered
   */
  public static final int TDECIMAL_VALUE = 12;

  /**
   * An array of all the '<em><b>Property Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PropertyType[] VALUES_ARRAY =
    new PropertyType[]
    {
      UNDEFINED,
      TSTRING,
      TBINARY,
      TLONG,
      TDOUBLE,
      DDATE,
      TBOOLEAN,
      TNAME,
      TPATH,
      TREFERENCE,
      TWEAKREFERENCE,
      TURI,
      TDECIMAL,
    };

  /**
   * A public read-only list of all the '<em><b>Property Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PropertyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Property Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PropertyType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PropertyType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Property Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PropertyType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PropertyType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Property Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PropertyType get(int value)
  {
    switch (value)
    {
      case UNDEFINED_VALUE: return UNDEFINED;
      case TSTRING_VALUE: return TSTRING;
      case TBINARY_VALUE: return TBINARY;
      case TLONG_VALUE: return TLONG;
      case TDOUBLE_VALUE: return TDOUBLE;
      case DDATE_VALUE: return DDATE;
      case TBOOLEAN_VALUE: return TBOOLEAN;
      case TNAME_VALUE: return TNAME;
      case TPATH_VALUE: return TPATH;
      case TREFERENCE_VALUE: return TREFERENCE;
      case TWEAKREFERENCE_VALUE: return TWEAKREFERENCE;
      case TURI_VALUE: return TURI;
      case TDECIMAL_VALUE: return TDECIMAL;
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
  private PropertyType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //PropertyType
