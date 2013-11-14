package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.StringConfig;
import in.appops.platform.client.config.entityconfiguration_type.ConfigType;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */
@SuppressWarnings("serial")
public class StringConfigType extends ConfigType {
	
	public static final String	MAX_LENGTH	= "maxlength";
	public static final String	MIN_LENGTH	= "minlength";
	public static final String CHARSET = "Charset";
	public static final String	STRING		= "StringConfig";
	
	public StringConfigType() {
		setParentConfigtype(STRING, false, this.getClass(), null, StringConfig.class);
		addProperty(REGEX_VALIDATOR, "[A-Z][a-z]", false, null, null, null);
		addProperty(MAX_LENGTH, 500, false, null, null, null);
		addProperty(MIN_LENGTH, 0, false, null, null, null);
	}
	
}
