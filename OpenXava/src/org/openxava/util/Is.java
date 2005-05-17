package org.openxava.util;

/**
 * Utility class to reduce the ifs size. <p>
 * 
 * Util to implements asserts (invaritant, preconditions, postcondition).<br>
 * 
 * For example:
 * <pre>
 * if (name != null || name.trim().equals("") ||
 *   surname1 != null || surname1.trim().equals("")) ||
 *   surname2 != null || surname2.trim().equals(""))
 * {
 *   doSomething();
 * }
 * </pre>
 * can be write:
 * <pre>
 * if (Is.emptyString(name, surname1, surname2)) {
 *   doSomethis();
 * }
 * </pre>  
 *  
 * @author  Javier Paniza
 */

public class Is {

  /**
   * Verifies is the sent string is <code>null</code> or emptry string. <p>
   */
  public final static boolean emptyString(String string) {
  	return string == null || string.trim().equals("");
  }
  
  /**
   * Verifies if some of the sent strings are <code>null</code> or empty string. <p>
   */
  public final static boolean emptyString(String string1, String string2) {
		if (string1 == null || string1.trim().equals(""))
		  return true;
		if (string2 == null || string2.trim().equals(""))
		  return true;
		return false;
  }
  
  /**
   * Verifies if some of the sent strings are <code>null</code> or empty string. <p>
   */
  public final static boolean emptyString(String string1, String string2, String string3) {
		if (string1 == null || string1.trim().equals(""))
		  return true;
		if (string2 == null || string2.trim().equals(""))
		  return true;
		if (string3 == null || string3.trim().equals(""))
		  return true;
		return false;
  }
  
  /**
   * Verifies if some of the sent strings are <code>null</code> or empty string. <p>
   */
  public final static boolean emptyString(String string1, String string2, String string3, String string4) {
		if (string1 == null || string1.trim().equals(""))
		  return true;
		if (string2 == null || string2.trim().equals(""))
		  return true;
		if (string3 == null || string3.trim().equals(""))
		  return true;
		if (string4 == null || string4.trim().equals(""))
		  return true;
		return false;
  }
  
  /**
   * Verifies if some of the sent strings are <code>null</code> or empty string. <p>
   */
  public final static boolean emptyString(String string1, String string2, String string3, String string4, String string5) {
		if (string1 == null || string1.trim().equals(""))
		  return true;
		if (string2 == null || string2.trim().equals(""))
		  return true;
		if (string3 == null || string3.trim().equals(""))
		  return true;
		if (string4 == null || string4.trim().equals(""))
		  return true;
		if (string5 == null || string5.trim().equals(""))
		  return true;
		return false;
  }
  
  /**
   * Verifies if some of the sent strings are <code>null</code> or empty string. <p>
   */
  public final static boolean emptyString(String string1, String string2, String string3, String string4, String string5, String string6) {
		if (string1 == null || string1.trim().equals(""))
		  return true;
		if (string2 == null || string2.trim().equals(""))
		  return true;
		if (string3 == null || string3.trim().equals(""))
		  return true;
		if (string4 == null || string4.trim().equals(""))
		  return true;
		if (string5 == null || string5.trim().equals(""))
		  return true;
		if (string6 == null || string6.trim().equals(""))
		  return true;
		return false;
  }
  
	/**
	 * If <code>a</code> is equals to <code>b</code>. <p>
	 *
	 * Takes in account the nulls.<br>
	 * 
	 * @param a Can be null.
	 * @param b Can be null.
	 */
	public final static boolean equal(Object a, Object b) {
		if (a == null) return b == null;
		if (b == null) return false;
		if (a instanceof Comparable) {
			return ((Comparable) a).compareTo(b) == 0;
		}
		return a.equals(b);
	}

	/**
	 * If <code>a.toString().trim()</code> is equals to <code>b.toString().trim()</code>. <p>
	 *
	 * Takes in account the nulls.<br>
	 * 
	 * @param a Can be null.
	 * @param b Can be null.
	 */
	public final static boolean equalAsString(Object a, Object b) {
		a = a==null?"":a.toString().trim();
		b = b==null?"":b.toString().trim();
		return a.equals(b);
	}

	/**
	 * If <code>a.toString().trim()</code> is equalst to <tt>b.toString().trim()</tt> ignoring case. <p>
	 *
	 * Takes in account the nulls.<br> 
	 * 
	 * @param a Can be null.
	 * @param b Can be null.
	 */
	public final static boolean equalAsStringIgnoreCase(Object a, Object b) {
		String sa = a == null?"":a.toString().trim();
		String sb = b == null?"":b.toString().trim();
		return sa.equalsIgnoreCase(sb);
	}

  /**
   * Verifies if all sent strings are <code>null</code> or empty string. <p>
   */
  public final static boolean emptyStringAll(String string1, String string2) {
		return (string1 == null || string1.trim().equals(""))
		    && (string2 == null || string2.trim().equals(""));
  }
  
  /**
   * Verifies if all sent strings are <code>null</code> or empty string. <p>
   */
  public final static boolean emptyStringAll(String string1, String string2, String string3) {
		return (string1 == null || string1.trim().equals(""))
		    && (string2 == null || string2.trim().equals(""))
   	    && (string3 == null || string3.trim().equals(""));
  }
  
  /**
   * Verifies if all sent strings are <code>null</code> or empty string. <p>
   */
  public final static boolean emptyStringAll(String string1, String string2, String string3, String string4) {
		return (string1 == null || string1.trim().equals(""))
		    && (string2 == null || string2.trim().equals(""))
   	    && (string3 == null || string3.trim().equals(""))
   	    && (string4 == null || string4.trim().equals(""));   	    
  }
  
  /**
   * Verifies if all sent strings are <code>null</code> or empty string. <p>
   */
  public final static boolean emptyStringAll(String string1, String string2, String string3, String string4, String string5) {
		return (string1 == null || string1.trim().equals(""))
		    && (string2 == null || string2.trim().equals(""))
	      && (string3 == null || string3.trim().equals(""))
   	    && (string4 == null || string4.trim().equals(""))
   	    && (string5 == null || string5.trim().equals(""));   	       	    
  }
  
  /**
   * Verifies if all sent strings are <code>null</code> or empty string. <p>
   */
  public final static boolean emptyStringAll(String string1, String string2, String string3, String string4, String string5, String string6) {
		return (string1 == null || string1.trim().equals(""))
		    && (string2 == null || string2.trim().equals(""))
   	    && (string3 == null || string3.trim().equals(""))
   	    && (string4 == null || string4.trim().equals(""))
   	    && (string5 == null || string5.trim().equals(""))
   	    && (string6 == null || string6.trim().equals(""));   	       	       	    
  }
  
}
