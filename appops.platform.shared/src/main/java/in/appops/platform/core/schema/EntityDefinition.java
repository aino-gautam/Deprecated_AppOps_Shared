/**
 * 
 */
package in.appops.platform.core.schema;

import java.io.Serializable;
import java.util.HashMap;

import com.google.common.annotations.GwtCompatible;

/**
 * @author Debasish Padhy Created it on 13-Jun-2013
 * Derived types will be used to specify predefined entity structures such as enumerations etc. 
 */
@GwtCompatible
public class EntityDefinition implements Serializable{

	private String name = null ;
	private String typeQualifier = null;
	private String typeName = null;
	private Long typeId = null;
	private Long schemaId = null;
	private Long id = null;
	private HashMap<String , PropertyDefinition> propertyDefMap = new HashMap<String, PropertyDefinition>();

	public void addPropertyDefinition(PropertyDefinition pdef) {
		propertyDefMap.put(pdef.getName(), pdef);
	}
	
	public void removePropertyDefinition(String pname){
		propertyDefMap.remove(pname);
	}
	
	public void updatePropertyDefinition ( PropertyDefinition pdef) {
		propertyDefMap.put(pdef.getName(), pdef);
	}
	
	/**
	 * Its the pojo type name without fully qualified package name e.g. User
	 * @param name
	 */
	public void setName(String nme){
		name = nme ;
	}
	
	public String getName(){
		return name ; 
	}
	
	/**
	 * This is a combination of schema specific qualifier and the shortTypeName e.g. com.ensarm.somthing.User
	 * The package part is provided by containing SchemaDefinition and cannot be changed per entity
	 * @return
	 */
	public String getFullyQualifiedTypeName(){
		return typeQualifier + name  ; 
	}
	
	/**
	 * This method should be called by ems alone to update the type's fully qualified name
	 */
	public void setTypeQualifier(String tpq) {
		typeQualifier = tpq ; 
	}
	
	public String getEntityDefinitionAsJson(){
		return null ;
	}

	public HashMap getPropertyDefMap() {
		return propertyDefMap;
	}

	public void setPropertyDefMap(HashMap propertyDefMap) {
		this.propertyDefMap = propertyDefMap;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public Long getSchemaId() {
		return schemaId;
	}

	public void setSchemaId(Long schemaId) {
		this.schemaId = schemaId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypeQualifier() {
		return typeQualifier;
	}
}
