package in.appops.platform.client.config.entityconfiguration_type;

import java.io.Serializable;

import in.appops.platform.core.entity.Entity;
import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.core.util.EntityList;

public class ConfigType extends Entity {
	
	private static final long serialVersionUID = 1L;
	
	public static final String DEFAULT_VALUE = "defaultValue";
	public static final String REGEX_VALIDATOR = "regexValidator";
	
	private Entity		parentConfigtype;
	private EntityList	alternateProperties;
	
	public ConfigType(String name, ConfigType configType, ConfigType superType, Boolean isImmutable, Class clientConfigurationType) {
		this();
		if (clientConfigurationType != null)
			parentConfigtype = createConfigType(name, null, true, null, null, null, null, configType, isImmutable, superType, clientConfigurationType.getName());
		else
			parentConfigtype = createConfigType(name, null, true, null, null, null, null, configType, isImmutable, superType, null);
	}
	
	public ConfigType() {
	}
	
	public void addProperty(String name, ConfigType configTypeEnt) {
		setProperty(name, configTypeEnt);
	}
	
	public void addProperty(String keyname, Object keyvalue, Boolean isImmutable, Object configtype, Object superType, Class clientConfigurationType) {
		Entity configTypeEnt = null;
		if (clientConfigurationType != null)
			configTypeEnt = createConfigType(keyname, keyvalue, true, null, null, null, null, configtype, isImmutable, superType, clientConfigurationType.getName());
		else
			configTypeEnt = createConfigType(keyname, keyvalue, true, null, null, null, null, configtype, isImmutable, superType, null);
		setProperty(keyname, configTypeEnt);
	}
	
	public void addAlternateProperty(String keyname, Object keyvalue, Boolean isImmutable, Object configtype, Object superType, Class clientConfigurationType) {
		Entity configTypeEnt = null;
		if (clientConfigurationType != null)
			configTypeEnt = createConfigType(keyname, keyvalue, true, null, null, null, null, configtype, isImmutable, superType, clientConfigurationType.getName());
		else
			configTypeEnt = createConfigType(keyname, keyvalue, true, null, null, null, null, configtype, isImmutable, superType, null);
		if (alternateProperties == null)
			alternateProperties = new EntityList();
		alternateProperties.add(configTypeEnt);
	}
	
	public Entity createConfigType(String keyname, Object keyvalue, Boolean isdefault, Long emstypeId, Long serviceId, Long spaceId, String lookupId, Object configtypeId, Boolean isImmutable,
			Object sypertypeId, String clientConfigurationType) {
		Entity configTypeEnt = new Entity();
		configTypeEnt.setType(new MetaType(ConfigTypeConstant.CONGFIG));
		if (keyname != null)
			configTypeEnt.setPropertyByName(ConfigTypeConstant.KEYNAME, keyname);
		configTypeEnt.setProperty(ConfigTypeConstant.PARENTCONFIGTYPE, parentConfigtype);
		if (keyvalue != null) {
			if (keyvalue instanceof String) {
				configTypeEnt.setPropertyByName(ConfigTypeConstant.KEYVALUE, (String) keyvalue);
				if (emstypeId == null)
					configTypeEnt.setPropertyByName(ConfigTypeConstant.EMSTYPEID, 3L);
			}
			if (keyvalue instanceof Integer) {
				configTypeEnt.setPropertyByName(ConfigTypeConstant.KEYVALUE, ((Integer) keyvalue).toString());
				if (emstypeId == null)
					configTypeEnt.setPropertyByName(ConfigTypeConstant.EMSTYPEID, 2L);
			}
			if (keyvalue instanceof Boolean) {
				configTypeEnt.setPropertyByName(ConfigTypeConstant.KEYVALUE, ((Boolean) keyvalue).toString());
				if (emstypeId == null)
					configTypeEnt.setPropertyByName(ConfigTypeConstant.EMSTYPEID, 22L);
			}
		}
		if (isdefault != null)
			configTypeEnt.setPropertyByName(ConfigTypeConstant.ISDEFAULT, isdefault);
		if (emstypeId != null)
			configTypeEnt.setPropertyByName(ConfigTypeConstant.EMSTYPEID, emstypeId);
		if (serviceId != null)
			configTypeEnt.setPropertyByName(ConfigTypeConstant.SERVICEID, serviceId);
		if (spaceId != null)
			configTypeEnt.setPropertyByName(ConfigTypeConstant.SPACEID, spaceId);
		if (lookupId != null)
			configTypeEnt.setPropertyByName(ConfigTypeConstant.LOOKUPID, lookupId);
		if (configtypeId != null) {
			if (configtypeId instanceof Class)
				configTypeEnt.setPropertyByName(ConfigTypeConstant.CONFIGTYPEID, ((Class) configtypeId).getName());
			else
				configTypeEnt.setProperty(ConfigTypeConstant.CONFIGTYPEID, (ConfigType) configtypeId);
		}
		if (isImmutable != null)
			configTypeEnt.setPropertyByName(ConfigTypeConstant.ISIMMUTABLE, isImmutable);
		else
			configTypeEnt.setPropertyByName(ConfigTypeConstant.ISIMMUTABLE, false);
		if (sypertypeId != null) {
			if (sypertypeId instanceof Class)
				configTypeEnt.setPropertyByName(ConfigTypeConstant.SUPERTYPEID, ((Class) sypertypeId).getName());
			else
				configTypeEnt.setProperty(ConfigTypeConstant.SUPERTYPEID, (ConfigType) sypertypeId);
		}
		if (clientConfigurationType != null)
			configTypeEnt.setPropertyByName(ConfigTypeConstant.CLIENTQNAME, clientConfigurationType);
		
		return configTypeEnt;
	}
	
	public Entity getParentConfigtype() {
		return parentConfigtype;
	}
	
	public void setParentConfigtype(String keyname, Boolean isImmutable, Object configtype, Object superType, Class clientConfigurationType) {
		this.parentConfigtype = createConfigType(keyname, null, true, null, null, null, null, configtype, isImmutable, superType, clientConfigurationType.getSimpleName());
	}
	
	public void setParentConfigtype(Entity parentConfigtype) {
		this.parentConfigtype = parentConfigtype;
	}
	
	public EntityList getAlternateProperties() {
		return alternateProperties;
	}
	
	public void setAlternateProperties(EntityList alternateProperties) {
		this.alternateProperties = alternateProperties;
	}
	
	public boolean isSuperTypeClass() {
		Object object = parentConfigtype.getPropertyByName(ConfigTypeConstant.SUPERTYPEID);
		if (object != null) {
			if (object instanceof ConfigType)
				return false;
			else
				return true;
		}
		return false;
	}
	
	public ConfigType getSuperType() {
		return parentConfigtype.getPropertyByName(ConfigTypeConstant.SUPERTYPEID);
	}
	
	public Boolean isConfigTypeClass() {
		Object object = this.getPropertyByName(ConfigTypeConstant.CONFIGTYPEID);
		if (object != null) {
			if (object instanceof ConfigType)
				return false;
			else
				return true;
		}
		return false;
	}
	
	public Object getConfigType() {
		return this.getPropertyByName(ConfigTypeConstant.CONFIGTYPEID);
		
	}
	
	/**
	 * gets the default value
	 * @return
	 */
	public Object getDefaultValue(){
		return getPropertyByName(DEFAULT_VALUE);
	}
	
	/**
	 * gets the regex validator to be used for validations in a field
	 * @return
	 */
	public String getRegexValidator(){
		return getPropertyByName(REGEX_VALIDATOR);
	}
	
	/**
	 * 
	 * @param propName
	 * @param value
	 */
	public void addValueTypeProp(String propName, Object value){
		this.setPropertyByName(propName, (Serializable)value);
	}
}
