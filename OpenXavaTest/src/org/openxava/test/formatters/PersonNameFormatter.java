package org.openxava.test.formatters;

import java.util.*;

import javax.servlet.http.*;

import org.openxava.formatters.*;
import org.openxava.util.*;

/**
 * @author Javier Paniza
 */
public class PersonNameFormatter implements IFormatter {
	
	private boolean firstLetterInUpperCase = false;

	public String format(HttpServletRequest request, Object object)	throws Exception {
		if (!(object instanceof String)) return "";
		if (!isFirstLetterInUpperCase()) return (String) object; 		
		StringTokenizer st = new StringTokenizer((String) object);
		StringBuffer result = new StringBuffer();
		while (st.hasMoreTokens()) {
			result.append(Strings.firstUpper(st.nextToken().toLowerCase()));
			if (st.hasMoreTokens()) result.append(' ');			
		}
		return result.toString();
	}

	public Object parse(HttpServletRequest request, String string) throws Exception {
		return string;
	}

	public boolean isFirstLetterInUpperCase() {
		return firstLetterInUpperCase;
	}
	public void setFirstLetterInUpperCase(boolean firstLetterInUpperCase) {
		this.firstLetterInUpperCase = firstLetterInUpperCase;
	}
}
