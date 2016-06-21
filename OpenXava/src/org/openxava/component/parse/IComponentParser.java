package org.openxava.component.parse;

import org.openxava.component.*;

/**
 * @since 5.6 
 * @author Javier Paniza
 */
public interface IComponentParser {
	
	MetaComponent parse(String name) throws Exception;

}
