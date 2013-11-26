package in.appops.platform.client.config.client_type;

import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.core.shared.Configuration;
import in.appops.platform.server.entityconfiguration_type.basic.BooleanConfigType;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */
@SuppressWarnings("serial")
public class BooleanConfig extends Configuration {
	
	public BooleanConfig() {
		super.setType(new MetaType(BooleanConfig.class));
	}
	
	public Boolean getDefaultValue() {
		return getPropertyByName(BooleanConfigType.DEFAULT_VALUE);
	}

}
