package in.appops.platform.core.schema;

import java.io.Serializable;

import com.google.common.annotations.GwtCompatible;

/**
 * @author Debasish Padhy Created it on 13-Jun-2013
 * 
 * We will use derived types of property definition objects to contain details of property specifics 
 * such as size , constraints and subtypes (such as email , password , creditcard , richtext etc. )
 */
@GwtCompatible
public class PropertyDefinition implements Serializable{

	private String name = null ;
	
	private int datasize = 0;
	
	private Long referencetypeId;
	private Long typeId;
	
	private String referenceTypeName = null;
	private String typeName = null;
	
	private Long id = null;
	private Boolean isUpdated = false; 
	
	public PropertyDefinition() {
	}
	
	public PropertyDefinition(String name, String typeName, int size){
		this.name = name;
		this.typeName = typeName;
		this.datasize = size;
	}
	
	/**
	 * @return
	 */
	public String getName() {
		
		return name;
	}
	
	public void setName(String nme){
		name = nme ;
	}
	
	public int getDatasize() {
		return datasize;
	}

	public void setDatasize(int dataSize) {
		this.datasize = dataSize;
	}

	public Long getReferencetypeId() {
		return referencetypeId;
	}

	public void setReferencetypeId(Long referencetypeId) {
		this.referencetypeId = referencetypeId;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public String getReferenceTypeName() {
		return referenceTypeName;
	}

	public void setReferenceTypeName(String referenceTypeName) {
		this.referenceTypeName = referenceTypeName;
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

	public Boolean getIsUpdated() {
		return isUpdated;
	}

	public void setIsUpdated(Boolean isUpdated) {
		this.isUpdated = isUpdated;
	}

}
