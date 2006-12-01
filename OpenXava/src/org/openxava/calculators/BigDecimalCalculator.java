package org.openxava.calculators;

import java.math.BigDecimal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openxava.application.meta.xmlparse.ApplicationParser;


/**
 * @author Luis Miguel Hernández
 */
public class BigDecimalCalculator implements ICalculator {

	private Object value;
	private Log log = LogFactory.getLog(BigDecimalCalculator.class);

	public Object calculate() throws Exception {		
	    if (getValue()==null) return new BigDecimal(0);
		return new BigDecimal(getValue().toString());
	}

	public Object getValue() {
	  if (value==null) return new BigDecimal(0);
		return value.toString();
	}

	public void setValue(Object i){
		value = i;
	}

}
