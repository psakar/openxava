package org.openxava.annotations;

import java.lang.annotation.*;

/**
 * A group of @CollectionView associated to the same collection. <p>
 * 
 * Applies to collections.<p>
 * 
 * It allows to define a value different for @CollectionView in each view.<br>
 * Example:
 * <pre>
 * @CollectionViews({
 *   @CollectionView(forViews="DEFAULT", value= ... ),
 *   @CollectionView(forViews="Simple, VerySimple", value= ... ),
 *   @CollectionView(forViews="Complete", value= ... )
 * })
 * </pre>

 * 
 * @author Javier Paniza
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface CollectionViews {
	
	CollectionView [] value();
	
}
