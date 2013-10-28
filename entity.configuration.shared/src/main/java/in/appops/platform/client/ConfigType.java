package in.appops.platform.client;

import in.appops.platform.core.entity.Entity;
import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.core.util.EntityList;

public class ConfigType extends Entity {
	public static final String	ID					= "id";
	public static final String	PARENTCONFIGTYPE	= "configtype";
	public static final String	KEYNAME				= "keyname";
	public static final String	KEYVALUE			= "keyvalue";
	public static final String	ISDEFAULT			= "isdefault";
	public static final String	EMSTYPEID			= "emstypeId";
	public static final String	SERVICEID			= "serviceId";
	public static final String	SPACEID				= "spaceId";
	public static final String	LOOKUPID			= "lookupId";
	//public static final String	ALTERNATE_CONFIG_PROPERTIES	= "alternate_config_properties";
	public static final String	CONGFIG				= "in.appops.platform.server.core.services.configuration.domain.Configtype";
	public static final String	CONGFIGTYPE			= "configtype";
	private Entity				parentConfigtype;
	private EntityList			alternateProperties;
	
	public ConfigType(String name, Long emsTypeId) {
		Entity configTypeEnt = createConfigType(name, null, true, emsTypeId, null, null, null);
		parentConfigtype = configTypeEnt;
	}
	
	public ConfigType() {
	}
	
	public void addProperty(String keyname, String keyvalue, Long emstypeId, Long serviceId, Long spaceId, String lookupId) {
		Entity configTypeEnt = createConfigType(keyname, keyvalue, true, emstypeId, serviceId, spaceId, lookupId);
		setProperty(keyname, configTypeEnt);
	}
	
	public void addProperty(String name, ConfigType configTypeEnt) {
		setProperty(name, configTypeEnt);
	}
	
	public void addAlternateProperty(String keyname, String keyvalue, Long emstypeId, Long serviceId, Long spaceId, String lookupId) {
		Entity configTypeEnt = createConfigType(keyname, keyvalue, false, emstypeId, serviceId, spaceId, lookupId);
		if (alternateProperties == null)
			alternateProperties = new EntityList();
		alternateProperties.add(configTypeEnt);
	}
	
	public Entity createConfigType(String keyname, String keyvalue, Boolean isdefault, Long emstypeId, Long serviceId, Long spaceId, String lookupId) {
		Entity configTypeEnt = new Entity();
		configTypeEnt.setType(new MetaType(CONGFIG));
		if (keyname != null)
			configTypeEnt.setPropertyByName(KEYNAME, keyname);
		/*if (parentConfigtype != null)
			configTypeEnt.setPropertyByName(PARENTCONFIGTYPE, parentConfigtype);*/
		configTypeEnt.setProperty(PARENTCONFIGTYPE, parentConfigtype);
		if (keyvalue != null)
			configTypeEnt.setPropertyByName(KEYVALUE, keyvalue);
		if (isdefault != null)
			configTypeEnt.setPropertyByName(ISDEFAULT, isdefault);
		if (emstypeId != null)
			configTypeEnt.setPropertyByName(EMSTYPEID, emstypeId);
		if (serviceId != null)
			configTypeEnt.setPropertyByName(SERVICEID, serviceId);
		if (spaceId != null)
			configTypeEnt.setPropertyByName(SPACEID, spaceId);
		if (lookupId != null)
			configTypeEnt.setPropertyByName(LOOKUPID, lookupId);
		return configTypeEnt;
	}
	
	public Entity getParentConfigtype() {
		return parentConfigtype;
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
	
}
