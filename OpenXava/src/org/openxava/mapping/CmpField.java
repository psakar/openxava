package org.openxava.mapping;

import java.io.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Javier Paniza
 */
public class CmpField implements Serializable {
	
	private String converterPropertyName;
	private String column;
	private String cmpPropertyName; 
	private String cmpTypeName;
	private Log log = LogFactory.getLog(CmpField.class);

	public String getColumn() {
		return column;
	}

	public String getConverterPropertyName() {
		return converterPropertyName;
	}

	public String getCmpTypeName() {
		return cmpTypeName;
	}

	public void setColumn(String string) {		
		column = string;
	}

	public void setConverterPropertyName(String string) {
		converterPropertyName = string;
	}

	public void setCmpTypeName(String string) {		
		cmpTypeName = string;
	}

	public String getCmpPropertyName() {
		return cmpPropertyName;
	}
	public void setCmpPropertyName(String cmpPropertyName) {
		this.cmpPropertyName = cmpPropertyName;
	}
}
