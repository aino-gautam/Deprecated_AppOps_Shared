package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.BooleanConfig;
import in.appops.platform.client.config.entityconfiguration_type.ConfigType;

public class BooleanConfigType extends ConfigType {
	
	private static final long serialVersionUID = 1L;
	public static final String	BOOLEAN		= "BooleanConfig";
	
	public BooleanConfigType() {
		setParentConfigtype(BOOLEAN, false, this.getClass(), null, BooleanConfig.class);
		addProperty(DEFAULT_VALUE, false, false, null, null, null);
	}
	
	@Override
	public Boolean getDefaultValue() {
		return (Boolean) super.getDefaultValue();
	}

}
