package in.appops.platform.client.config.entityconfiguration_type;

import in.appops.client.common.util.EntityToJsonClientConvertor;
import in.appops.platform.core.entity.Entity;
import in.appops.platform.core.entity.Property;
import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.core.shared.Configuration;
import in.appops.platform.core.util.EntityList;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map.Entry;

import com.google.gwt.json.client.JSONObject;

public class ConfigType extends Entity {

	public static final String DEFAULT_VALUE = "defaultValue";
	public static final String REGEX_VALIDATOR = "regexValidator";
	
	private Entity		parentConfigtype;
	private EntityList	alternateProperties;
	
	//private Serializable	keyvalue;
	
	public ConfigType(String name, Object configType, Object superType, Boolean isImmutable, Class clientConfigurationType) {
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
	
	public void addProperty(String keyname, Serializable keyvalue, Boolean isImmutable, Object configtype, Object superType, Class clientConfigurationType) {
		Entity configTypeEnt = null;
		if (clientConfigurationType != null)
			configTypeEnt = createConfigType(keyname, keyvalue, true, null, null, null, null, configtype, isImmutable, superType, clientConfigurationType.getName());
		else
			configTypeEnt = createConfigType(keyname, keyvalue, true, null, null, null, null, configtype, isImmutable, superType, null);
		setProperty(keyname, configTypeEnt);
	}
	
	public void addAlternateProperty(String keyname, Serializable keyvalue, Boolean isImmutable, Object configtype, Object superType, Class clientConfigurationType) {
		Entity configTypeEnt = null;
		if (clientConfigurationType != null)
			configTypeEnt = createConfigType(keyname, keyvalue, true, null, null, null, null, configtype, isImmutable, superType, clientConfigurationType.getName());
		else
			configTypeEnt = createConfigType(keyname, keyvalue, true, null, null, null, null, configtype, isImmutable, superType, null);
		if (alternateProperties == null)
			alternateProperties = new EntityList();
		alternateProperties.add(configTypeEnt);
	}
	
	public Entity createConfigType(String keyname, Serializable keyvalue, Boolean isdefault, Long emstypeId, Long serviceId, Long spaceId, String lookupId, Object configtypeId, Boolean isImmutable,
			Object sypertypeId, String clientConfigurationType) {
		Entity configTypeEnt = new Entity();
		configTypeEnt.setType(new MetaType(ConfigTypeConstant.CONGFIG));
		if (keyname != null)
			configTypeEnt.setPropertyByName(ConfigTypeConstant.KEYNAME, keyname);
		configTypeEnt.setProperty(ConfigTypeConstant.PARENTCONFIGTYPE, parentConfigtype);
		if (keyvalue != null) {
			//this.keyvalue = keyvalue;
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
	
	public void setParentConfigtype(String keyname, Boolean isImmutable, Serializable configtype, Serializable superType, Class clientConfigurationType) {
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
		Serializable object = parentConfigtype.getPropertyByName(ConfigTypeConstant.SUPERTYPEID);
		if (object != null) {
			if (object instanceof ConfigType)
				return false;
			else
				return true;
		}
		return false;
	}
	
	public Serializable getSuperType() {
		return parentConfigtype.getPropertyByName(ConfigTypeConstant.SUPERTYPEID);
	}
	
	public Boolean isConfigTypeClass() {
		Serializable object = this.getPropertyByName(ConfigTypeConstant.CONFIGTYPEID);
		if (object != null) {
			if (object instanceof ConfigType)
				return false;
			else
				return true;
		}
		return false;
	}
	
	public Serializable getConfigType() {
		return parentConfigtype.getPropertyByName(ConfigTypeConstant.CONFIGTYPEID);
	}
	
	public String getDefaultConfigInstanceJsonString(String configId) {
		Entity convertToInstance = this.getParentConfigtype();
		if (configId == null)
			configId = convertToInstance.getPropertyByName(ConfigTypeConstant.KEYNAME);
		Configuration configuration = getDefaultConfigInstance(this);
		
		JSONObject jsonObject = EntityToJsonClientConvertor.createJsonFromEntity(configuration);
		String json = jsonObject.toString();
		json = json.replace("\"", "\\\"");
		String configurationStr = configId + ":\"" + json + "\",";
		return configurationStr;
	}
	
	public Configuration getDefaultConfigInstance(ConfigType configType) {
		Entity convertToInstance = configType.getParentConfigtype();
		
		Configuration config = createConfigurationEntity(convertToInstance);
		//process supertype
		processConfigType(config, configType.getSuperType());
		
		//process configtype
		processConfigType(config, configType.getConfigType());
		
		//process default properties
		HashMap<String, Property<? extends Serializable>> properties = configType.getValue();
		processProperties(config, properties);
		
		return config;
	}
	
	private void processProperties(Configuration config, HashMap<String, Property<? extends Serializable>> properties) {
		for (Entry<String, Property<? extends Serializable>> entry : properties.entrySet()) {
			Property prop =entry.getValue();
			Serializable keyvalue = prop.getValue();
			
			
			if (prop instanceof ConfigType) {
				ConfigType propConfigtype = (ConfigType) prop;
				Entity convertToInstance = propConfigtype.getParentConfigtype();
				String keyname = entry.getKey();
				Property newprop = getDefaultConfigInstance(propConfigtype);
				config.setProperty(keyname, newprop);
			}
			else if (prop instanceof Entity) {
				Entity propConfigtype = (Entity) prop;
				Property newprop = null;
				String keyname = propConfigtype.getPropertyByName(ConfigTypeConstant.KEYNAME);
				if (isProperty(propConfigtype)) {
					newprop = constructProperty(propConfigtype);
				}
				else if (keyvalue instanceof Class) {
					processConfigType(config, keyvalue);
				}
				else if (keyvalue instanceof ConfigType) {
					newprop = getDefaultConfigInstance((ConfigType) keyvalue);
				}
				else {
					newprop = new Property(keyname, keyvalue);
				}
				config.setProperty(keyname, newprop);
			}
			
		}
	}
	
	private void processConfigType(Configuration config, Serializable type) {
		try {
			if (type != null) {
				ConfigType configType = null;
				if (type instanceof String) {
					configType = (ConfigType) Class.forName((String) type).getConstructor().newInstance();
				}
				else
					configType = (ConfigType) type;
				HashMap<String, Property<? extends Serializable>> superTypeProperties = configType.getValue();
				processProperties(config, superTypeProperties);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Configuration createConfigurationEntity(Entity configInstance) {
		String clientConfigType = configInstance.getPropertyByName(ConfigTypeConstant.CLIENTQNAME);
		Configuration confEntity = null;
		if (clientConfigType != null) {
			try {
				Class configClass = Class.forName(clientConfigType);
				confEntity = (Configuration) configClass.getConstructor().newInstance();
				MetaType type = new MetaType(configClass.getSimpleName());
				confEntity.setType(type);
			}
			catch (Exception e) {
				confEntity = new Configuration();
				MetaType type = new MetaType("config");
				confEntity.setType(type);
			}
		}
		else {
			confEntity = new Configuration();
			MetaType type = new MetaType("config");
			confEntity.setType(type);
		}
		return confEntity;
	}
	
	public Property constructProperty(Entity configTypeEnt) {
		Property prop = null;
		Long empTypeId = configTypeEnt.getPropertyByName(ConfigTypeConstant.EMSTYPEID);
		if (empTypeId == 3) {
			prop = new Property<String>();
			String val = configTypeEnt.getPropertyByName(ConfigTypeConstant.KEYVALUE);
			if (val != null) {
				prop.setValue(val.toString());
			}
		}
		else if (empTypeId == 22) {
			prop = new Property<Boolean>();
			prop.setValue(convertTOBoolean(configTypeEnt.getPropertyByName(ConfigTypeConstant.KEYVALUE).toString()));
		}
		else if (empTypeId == 2) {
			prop = new Property<Integer>();
			prop.setValue(Integer.parseInt(configTypeEnt.getPropertyByName(ConfigTypeConstant.KEYVALUE).toString()));
		}
		else if (empTypeId == 77) {
			prop = new Property<Long>();
			prop.setValue(convertTOLong(configTypeEnt.getPropertyByName(ConfigTypeConstant.KEYVALUE).toString()));
			
		}
		if (prop == null)
			prop = new Property<String>();
		prop.setName(configTypeEnt.getPropertyByName(ConfigTypeConstant.KEYVALUE).toString());
		
		return prop;
	}
	
	public Long convertTOLong(String val) {
		return Long.valueOf(val);
	}
	
	public Boolean convertTOBoolean(String val) {
		return Boolean.valueOf(val);
	}
	
	public boolean isProperty(Entity configTypeEnt) {
		try {
			Long empTypeId = configTypeEnt.getPropertyByName(ConfigTypeConstant.EMSTYPEID);
			if (empTypeId == 3 || empTypeId == 22 || empTypeId == 2 || empTypeId == 77)
				return true;
			return false;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/*public Serializable getKeyvalue() {
		return keyvalue;
	}
	
	public void setKeyvalue(Serializable keyvalue) {
		this.keyvalue = keyvalue;
	}*/
	
}
