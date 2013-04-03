/**
 * 
 */
package in.appops.platform.core.entity;

import in.appops.platform.core.entity.Property;
import com.google.common.annotations.GwtCompatible;


/**
 * @author mahesh@ensarm.com
 *
 */
@SuppressWarnings("serial")
@GwtCompatible
public class JsonProperty extends Property{
	
	private String jsonString;

	/**
	 * @return the jsonString
	 */
	public String getJsonString() {
		return jsonString;
	}

	/**
	 * @param jsonString the jsonString to set
	 */
	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}
	
}
