package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.IntegerConfig;
import in.appops.platform.client.config.entityconfiguration_type.ConfigType;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */

public class IntegerConfigType extends ConfigType {
	
	public static final String MAX_VALUE = "maxValue";
	public static final String MIN_VALUE = "minValue";
	public static final String IS_SIGNED = "isSigned";
	public static final String	INTEGER		= "IntegerConfig";
		
	private static final long serialVersionUID = 1L;
	
	
	public IntegerConfigType() {
		setParentConfigtype(INTEGER, false, this.getClass(), null, IntegerConfig.class);
		addProperty(MAX_VALUE, 1000, false, null, null, null);
		addProperty(MIN_VALUE, 0, false, null, null, null);
		addProperty(IS_SIGNED, false, false, null, null, null);
		
	}
}
