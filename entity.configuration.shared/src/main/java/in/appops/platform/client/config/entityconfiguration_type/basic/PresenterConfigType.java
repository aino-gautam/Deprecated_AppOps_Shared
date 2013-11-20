package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.entityconfiguration_type.ConfigType;

/**
 * @author pallavi@ensarm.com
 */
@SuppressWarnings("serial")
public class PresenterConfigType extends ConfigType{
	
	public static final String	EVENTACTIONRULRMAP		= "eventActionRuleMap";
	
	public PresenterConfigType() {
		addProperty(EVENTACTIONRULRMAP, new EventActionRuleMapConfigType());
	}

}
