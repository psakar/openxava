package org.openxava.model.meta;

import java.io.*;

import org.openxava.calculators.*;
import org.openxava.util.*;
import org.openxava.util.meta.*;


/**
 * @author Javier Paniza
 */
public class MetaCalculator extends MetaSetsContainer implements Serializable {
	
	private String className;	
	private boolean onCreate;
		
	/**
	 * Create a calculator whenever this method is called,
	 * congured with values assigned in xml. <p> 
	 */
	public ICalculator createCalculator() throws XavaException {		
		try {
			Object o = Class.forName(getClassName()).newInstance();
			if (!(o instanceof ICalculator)) {
				throw new XavaException("calculator_implements_icalculator", getClassName());
			}
			ICalculator calculator = (ICalculator) o;
			if (containsMetaSets()) {
				assignPropertiesValues(calculator);
			}									
			return calculator;
		}
		catch (XavaException ex) {
			throw ex;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new XavaException("create_calculator_error", getClassName(), ex.getLocalizedMessage());
		}
	}
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

	public boolean isOnCreate() {
		return onCreate;
	}
	public void setOnCreate(boolean onCreate) {
		this.onCreate = onCreate;
	}

}
