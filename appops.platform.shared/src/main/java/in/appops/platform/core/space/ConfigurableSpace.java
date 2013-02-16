/**
 * 
 */
package in.appops.platform.core.space;

import in.appops.platform.core.util.Size;

/**
 * @author Debasish Padhy Created it on 15-Aug-2012
 *
 * A standard concrete implementation of Space interface. Used for creating a space through configuration
 * 
 * More precisely represents almost all kinds of spaces. 
 *
 */
public class ConfigurableSpace implements Space {

	public String getSpaceName() {
		return name;
	}
	
	public void setSpaceName(String name) {
		this.name = name;
	}
	
	public Long getDiameter() {
		return diameter;
	}
	
	public void setDiameter(long diameter) {
		this.diameter = diameter;
	}
	
	private String name = null ;
	private long diameter = 1000 ; // size of a space in centimeters
	
	
	public Size getSize() {
		return null;
	}
}
