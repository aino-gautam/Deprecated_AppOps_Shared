/**
 * 
 */
package in.appops.platform.core.schema;

import java.io.Serializable;
import java.util.HashMap;

import com.google.common.annotations.GwtCompatible;

/**
 * @author Debasish Padhy Created it on 13-Jun-2013
 *
 * Each instance contains a specific schema definition
 *
 */

@GwtCompatible
public class SchemaDefinition implements Serializable{
	
	public enum Type {

		hibernate , hbase , cassandra , jdbc
	}
	
	/**
	 * schemaPerSpace = for each service a copy of schema created per space the service is applied to
	 * 					Services available in the UserHub space are not applicable and user cannot control the services
	 * 					available within his space 
	 * 
	 * 					User partition is provided automatically
	 * 
	 * schemaPerService = Single schema for service. Space / user separation is done automatically within this schema
	 * 
	 * schemaPerSpaceHierarchy = very interesting one ... can be used by space that needs to manage a hierarchy of spaces 
	 * 
	 * all data relevant to the top level and child spaces are kept in a single schema per service. 
	 */
	public enum Strategy {
		
		schemaPerSpace , schemaPerService , schemaPerSpaceHierarchy
	}

	private String name;
	private Type schematype;
	private Strategy strategy;
	private Boolean isPojoRequired;
	private String packageinfo;
	private Long serviceId;
	private Long spaceId;
	private Long id = null;
	private HashMap<String  , EntityDefinition > entityDefMap  = new HashMap<String , EntityDefinition>() ;

	public SchemaDefinition() {
	}
	
	public SchemaDefinition(String name , Strategy str, Type type){
		this.name = name;
		this.schematype = type;
		this.strategy = str;
	}
	
	/**
	 * SchemaDefinition name is system created and cannot be changed by developer so no corresponding get
	 * @return
	 */
	public String getName(){
		return name ;
	}
	
	public void setName(String schemaName) {
		this.name = schemaName;
	}
	
	/**
	 * SchemaDefinition type once selected remains fixed and cannot be changed. To change shcema type developer / user will
	 * be needed to execute a schema migration job through a migrator job
	 * @return
	 */
	
	public Type getSchematype(){
		return schematype ; 
	}
	
	public void setSchematype(Type schemaType) {
		this.schematype = schemaType;
	}
	
	public void addEntityDefinition(EntityDefinition edef){
		entityDefMap.put(edef.getName(), edef);
	}
	
	public void removeEntityDefinition(EntityDefinition edef){
		entityDefMap.remove(edef.getName());
	}
	
	public HashMap getEntityDefMap() {
		return entityDefMap;
	}

	public void setEntityDefMap(HashMap entityDefMap) {
		this.entityDefMap = entityDefMap;
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy schemaStrategy) {
		this.strategy = schemaStrategy;
	}
	
	public Boolean getIsPojoRequired() {
		return isPojoRequired;
	}

	public void setIsPojoRequired(Boolean isPojoRequired) {
		this.isPojoRequired = isPojoRequired;
	}

	public String getPackageinfo() {
		return packageinfo;
	}

	public void setPackageinfo(String packageinfo) {
		this.packageinfo = packageinfo;
	}

	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public Long getSpaceId() {
		return spaceId;
	}

	public void setSpaceId(Long spaceId) {
		this.spaceId = spaceId;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
