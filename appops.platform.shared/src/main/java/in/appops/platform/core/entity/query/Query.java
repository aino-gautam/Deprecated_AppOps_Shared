/**
 * 
 */
package in.appops.platform.core.entity.query;

import java.util.HashMap;

import in.appops.platform.core.entity.Entity;

/**
 * @author Debasish Padhy Created it on 24-Aug-2012
 *
 */
public class Query extends Entity {
	
	private final String QUERYNAME = "name";
	private final String QUERYSTRING = "queryString";
	private final String QUERYID =  "id";
	private String SERVICEID =  "serviceId";
	private final String QUERYPARAMETERS = "queryParameters";
	private HashMap<String, Object> parameterMap = null;
	
	
	public void setQueryString(String queryStr){
		setPropertyByName(QUERYSTRING, queryStr);
	}
	
	public String getQueryString(){
		return getPropertyByName(QUERYSTRING);
	}
	
	public void setQueryName(String queryNm){
		setPropertyByName(QUERYNAME, queryNm);
	}
	
	public String getQueryName(){
		return getPropertyByName(QUERYNAME);
	}
	
	public void setQueryId(Long queryId){
		setPropertyByName(QUERYID, queryId);
	}
	
	public String getQueryId(){
		return getPropertyByName(QUERYID);
	}
	
	public void setServicId(Long serviceId){
		setPropertyByName(SERVICEID, serviceId);
	}
	
	public String getServiceId(){
		return getPropertyByName(SERVICEID);
	}
	
	public void setQueryParameterMap(HashMap<String, Object> map) {
		this.parameterMap = map;
		setPropertyByName(QUERYPARAMETERS, parameterMap);
	}
	
	public HashMap<String, Object> getQueryParameters() {
		return getPropertyByName(QUERYPARAMETERS);
	}
}
