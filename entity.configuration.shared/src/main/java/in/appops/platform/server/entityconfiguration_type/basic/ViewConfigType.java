package in.appops.platform.server.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.ViewConfig;
import in.appops.platform.server.entityconfiguration_type.ConfigType;

/**
 * @author pallavi@ensarm.com
 */
@SuppressWarnings("serial")
public class ViewConfigType extends ConfigType{
	
	public static final String	VIEW		= "ViewConfig";
	
	public ViewConfigType() {
		setParentConfigtype(VIEW, false, this.getClass(), null, ViewConfig.class);
	}
		
}
