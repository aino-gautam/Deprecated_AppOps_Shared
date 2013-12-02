package in.appops.platform.client.config.client_type;

import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.core.shared.Configuration;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */

public class DecimalConfig extends Configuration {
	
	public DecimalConfig() {
		super.setType(new MetaType(DecimalConfig.class));
	}
	
	
}
