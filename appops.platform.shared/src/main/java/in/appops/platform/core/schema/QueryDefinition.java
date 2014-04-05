package in.appops.platform.core.schema;

import java.io.Serializable;

/**
 * @author milind@ensarm.com
 *This class is used for Query definition, contains all the information regarding query.
 */
public class QueryDefinition implements Serializable{

	private String name = null;
	private String queryString = null;
	private Long schemaId = null;
	private Long serviceId = null;
	private Long id = null;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQueryString() {
		return queryString;
	}
	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}
	public Long getSchemaId() {
		return schemaId;
	}
	public void setSchemaId(Long schemaId) {
		this.schemaId = schemaId;
	}
	public Long getServiceId() {
		return serviceId;
	}
	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}
}
