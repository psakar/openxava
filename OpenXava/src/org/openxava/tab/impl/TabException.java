package org.openxava.tab.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Exception throwed by some classes of this package. <p>
 *
 * It will throw to indicate the imposibility of complete
 * an operation and there are no more specific exception. <br>
 * 
 * Also it can be used to indicate a system error in a
 * no remote interface (for compatibility with CORBA).
 *
 * @author  Javier Paniza
 */

public class TabException extends Exception {

  private Log log = LogFactory.getLog(TabException.class);	
	
  public TabException(String message) {
  	super(message);
  }
  
  /**
   * From another exception. <br>
   * No nested it, only use its message.<br>
   */
  public TabException(Throwable ex) {
  	super(ex.getLocalizedMessage());
  }
  
}
