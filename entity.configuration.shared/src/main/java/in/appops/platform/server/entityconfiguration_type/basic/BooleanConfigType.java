package in.appops.platform.server.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.BooleanConfig;
import in.appops.platform.server.entityconfiguration_type.ConfigType;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */

public class BooleanConfigType extends ConfigType {
	
	private static final long serialVersionUID = 1L;
	public static final String	BOOLEAN		= "BooleanConfig";
	
	public BooleanConfigType() {
		setParentConfigtype(BOOLEAN, false, this.getClass(), null, BooleanConfig.class);
		addProperty(DEFAULT_VALUE, false, false, null, null, null);
	}

}
