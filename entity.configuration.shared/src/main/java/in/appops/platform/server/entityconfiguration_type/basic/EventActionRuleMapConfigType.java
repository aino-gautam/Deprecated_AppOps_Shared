package in.appops.platform.server.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.EventActionRuleMapConfig;
import in.appops.platform.server.entityconfiguration_type.ConfigType;

@SuppressWarnings("serial")
public class EventActionRuleMapConfigType extends ConfigType {
	
	public static final String	EVENTACTIONRULEMAP		= "EventActionRuleMapConfig";
	
	public EventActionRuleMapConfigType() {
		setParentConfigtype(EVENTACTIONRULEMAP, false, this.getClass(), null, EventActionRuleMapConfig.class);
	}

}
