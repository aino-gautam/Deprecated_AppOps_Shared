/**
 * 
 */
package in.appops.platform.core.entity;

import java.util.logging.Level;
import java.util.logging.Logger;

import in.appops.platform.core.entity.Property;

import com.google.common.annotations.GwtCompatible;


/**
 * @author mahesh@ensarm.com
 *
 */
@SuppressWarnings("serial")
@GwtCompatible
public class AppopsJson extends Property{
	
	private Logger logger = Logger.getLogger(AppopsJson.class.getSimpleName());
	private String jsonString;
	private org.json.JSONObject serverJson;
	private com.google.gwt.json.client.JSONObject clientJson;
	
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

	/**
	 * @return the serverJson
	 */
	public org.json.JSONObject getServerJson() {
		try {
			if(serverJson==null){
				if(jsonString!=null)
					serverJson = new org.json.JSONObject(jsonString);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "[AppopsJson]::[getServerJson]::Exception", e);
		}
		return serverJson;
	}

	/**
	 * @param serverJson the serverJson to set
	 */
	public void setServerJson(org.json.JSONObject serverJson) {
		this.serverJson = serverJson;
	}

	/**
	 * @return the clientJson
	 */
	public com.google.gwt.json.client.JSONObject getClientJson() {
		try{
			if (clientJson == null) {
				if(jsonString!=null){
					com.google.gwt.json.client.JSONValue jsonVal = com.google.gwt.json.client.JSONParser.parseLenient(jsonString);
					clientJson = jsonVal.isObject();
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return clientJson;
	}

	/**
	 * @param clientJson the clientJson to set
	 */
	public void setClientJson(com.google.gwt.json.client.JSONObject clientJson) {
		this.clientJson = clientJson;
	}
}
