package in.appops.platform.core.shared;

import in.appops.platform.core.entity.Entity;

public class PropertyDescriptor extends Entity {

	public static final String PARENTYPEDESC = "typeByParentType";
	public static final String TYPEID = "typeByTypeId";
	public static final String NAME = "name";
	public static final String ORDER = "order";
	public static final String OPTIONAL = "optional";
	public static final String CORE = "core";
	
	public Entity getParentType() {
		return getPropertyByName(PARENTYPEDESC);
	}

	public void setParentType(Entity val) {
		setPropertyByName(PARENTYPEDESC, val);
	}
	
	public Entity getActualType() {
		return getPropertyByName(TYPEID);
	}

	public void setActualType(Entity val) {
		setPropertyByName(TYPEID, val);
	}
	
	public String getPropName() {
		return getPropertyByName(NAME);
	}

	public void setPropName(String val) {
		setPropertyByName(NAME, val);
	}
	
	public Integer getOrder() {
		return getPropertyByName(ORDER);
	}

	public void setOrder(Integer val) {
		setPropertyByName(ORDER, val);
	}
	
	public Boolean getIsOptional() {
		return getPropertyByName(OPTIONAL);
	}

	public void setIsOptional(Boolean val) {
		setPropertyByName(OPTIONAL, val);
	}
	
	public Boolean getIsCore() {
		return getPropertyByName(CORE);
	}

	public void setIsCore(Boolean val) {
		setPropertyByName(CORE, val);
	}
}
