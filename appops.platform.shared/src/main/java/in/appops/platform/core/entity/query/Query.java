/**
 * 
 */
package in.appops.platform.core.entity.query;

import in.appops.platform.core.entity.Entity;

import java.util.HashMap;

/**
 * @author Debasish Padhy Created it on 24-Aug-2012
 *
 */
public class Query extends Entity {
	
	private final String	QUERYNAME			= "name";
	private final String	QUERYSTRING			= "queryString";
	private final String	QUERYID				= "id";
	private final String	SERVICEID			= "serviceId";
	private final String	QUERYPARAMETERS		= "queryParameters";
	private final String	LISTSIZE			= "listSize";
	private final Integer		DEFAULT_LISTSIZE	= 25;
	private final String	STARTINDEX			= "startIndex";
	private final Integer		DEFAULT_STARTINDEX	= 0;
	
	public Query() {
		setListSize(DEFAULT_LISTSIZE);
		setStartIndex(DEFAULT_STARTINDEX);
	}
	
	public void setQueryString(String queryStr) {
		setPropertyByName(QUERYSTRING, queryStr);
	}
	
	public String getQueryString() {
		return getPropertyByName(QUERYSTRING);
	}
	
	public void setQueryName(String queryNm) {
		setPropertyByName(QUERYNAME, queryNm);
	}
	
	public String getQueryName() {
		return getPropertyByName(QUERYNAME);
	}
	
	public void setQueryId(Long queryId) {
		setPropertyByName(QUERYID, queryId);
	}
	
	public String getQueryId() {
		return getPropertyByName(QUERYID);
	}
	
	public void setServicId(Long serviceId) {
		setPropertyByName(SERVICEID, serviceId);
	}
	
	public String getServiceId() {
		return getPropertyByName(SERVICEID);
	}
	
	public void setListSize(Integer no) {
		setPropertyByName(LISTSIZE, no);
	}
	
	public Integer getListSize() {
		return getPropertyByName(LISTSIZE);
	}
	
	public void setStartIndex(Integer no) {
		setPropertyByName(STARTINDEX, no);
	}
	
	public Integer getStartIndex() {
		return getPropertyByName(STARTINDEX);
	}
	
	public void setQueryParameterMap(HashMap<String, Object> map) {
		setPropertyByName(QUERYPARAMETERS, map);
	}
	
	public HashMap<String, Object> getQueryParameters() {
		return getPropertyByName(QUERYPARAMETERS);
	}
}
