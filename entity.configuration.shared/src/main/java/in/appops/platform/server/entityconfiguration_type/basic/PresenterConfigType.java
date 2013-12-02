package in.appops.platform.server.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.PresenterConfig;
import in.appops.platform.server.entityconfiguration_type.ConfigType;

/**
 * @author pallavi@ensarm.com
 */
@SuppressWarnings("serial")
public class PresenterConfigType extends ConfigType{
	
	public static final String	EVENTACTIONRULRMAP		= "eventActionRuleMap";
	public static final String	PRESENTER		= "presenterConfig";
	
	public PresenterConfigType() {
		setParentConfigtype(PRESENTER, false, this.getClass(), null, PresenterConfig.class);
		addProperty(EVENTACTIONRULRMAP, new EventActionRuleMapConfigType());
	}

}
