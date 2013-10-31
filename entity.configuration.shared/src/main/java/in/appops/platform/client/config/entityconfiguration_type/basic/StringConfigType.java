package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.StringConfig;
import in.appops.platform.client.config.entityconfiguration_type.ConfigType;

public class StringConfigType extends ConfigType {
	public static final String	MAXLENGTH	= "maxlength";
	public static final String	MINLENGTH	= "minlength";
	public static final String	VALIDATOR	= "validator";
	public static final String	STRING		= "StringConfig";
	
	public StringConfigType() {
		setParentConfigtype(STRING, false, this.getClass(), null, StringConfig.class);
		addProperty(VALIDATOR, "[A-Z][a-z]", false, null, null, null);
		addProperty(MAXLENGTH, 500, false, null, null, null);
		addProperty(MINLENGTH, 0, false, null, null, null);
	}
	
}
