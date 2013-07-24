/**
 */
package com.github.evra.jcr.cnd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Opv</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.github.evra.jcr.cnd.CndPackage#getOpv()
 * @model
 * @generated
 */
public enum Opv implements Enumerator
{
  /**
   * The '<em><b>COPY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COPY_VALUE
   * @generated
   * @ordered
   */
  COPY(0, "COPY", "COPY"),

  /**
   * The '<em><b>VERSION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VERSION_VALUE
   * @generated
   * @ordered
   */
  VERSION(1, "VERSION", "VERSION"),

  /**
   * The '<em><b>INITIALIZE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INITIALIZE_VALUE
   * @generated
   * @ordered
   */
  INITIALIZE(2, "INITIALIZE", "INITIALIZE"),

  /**
   * The '<em><b>COMPUTE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPUTE_VALUE
   * @generated
   * @ordered
   */
  COMPUTE(3, "COMPUTE", "COMPUTE"),

  /**
   * The '<em><b>IGNORE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IGNORE_VALUE
   * @generated
   * @ordered
   */
  IGNORE(4, "IGNORE", "IGNORE"),

  /**
   * The '<em><b>ABORT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ABORT_VALUE
   * @generated
   * @ordered
   */
  ABORT(5, "ABORT", "ABORT");

  /**
   * The '<em><b>COPY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>COPY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COPY
   * @model
   * @generated
   * @ordered
   */
  public static final int COPY_VALUE = 0;

  /**
   * The '<em><b>VERSION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VERSION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VERSION
   * @model
   * @generated
   * @ordered
   */
  public static final int VERSION_VALUE = 1;

  /**
   * The '<em><b>INITIALIZE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INITIALIZE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INITIALIZE
   * @model
   * @generated
   * @ordered
   */
  public static final int INITIALIZE_VALUE = 2;

  /**
   * The '<em><b>COMPUTE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>COMPUTE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMPUTE
   * @model
   * @generated
   * @ordered
   */
  public static final int COMPUTE_VALUE = 3;

  /**
   * The '<em><b>IGNORE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>IGNORE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IGNORE
   * @model
   * @generated
   * @ordered
   */
  public static final int IGNORE_VALUE = 4;

  /**
   * The '<em><b>ABORT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ABORT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ABORT
   * @model
   * @generated
   * @ordered
   */
  public static final int ABORT_VALUE = 5;

  /**
   * An array of all the '<em><b>Opv</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Opv[] VALUES_ARRAY =
    new Opv[]
    {
      COPY,
      VERSION,
      INITIALIZE,
      COMPUTE,
      IGNORE,
      ABORT,
    };

  /**
   * A public read-only list of all the '<em><b>Opv</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Opv> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Opv</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Opv get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Opv result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Opv</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Opv getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Opv result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Opv</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Opv get(int value)
  {
    switch (value)
    {
      case COPY_VALUE: return COPY;
      case VERSION_VALUE: return VERSION;
      case INITIALIZE_VALUE: return INITIALIZE;
      case COMPUTE_VALUE: return COMPUTE;
      case IGNORE_VALUE: return IGNORE;
      case ABORT_VALUE: return ABORT;
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
  private Opv(int value, String name, String literal)
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
  
} //Opv
