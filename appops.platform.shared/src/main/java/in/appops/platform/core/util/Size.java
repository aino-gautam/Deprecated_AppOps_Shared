/**
 * 
 */
package in.appops.platform.core.util;

import java.io.Serializable;

/**
 * @author Debasish Padhy Created it on 16-Aug-2012
 *
 */
@SuppressWarnings("serial")
public class Size implements Serializable {

	long height ;
	/**
	 * @return the height
	 */
	public long getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(long height) {
		this.height = height;
	}
	/**
	 * @return the width
	 */
	public long getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(long width) {
		this.width = width;
	}
	long width ;
	
}
