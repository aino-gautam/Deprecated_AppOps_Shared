package in.appops.platform.client.config.client_type;

import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.core.shared.Configuration;

public class DecimalConfig extends Configuration {
	
	public DecimalConfig() {
		super.setType(new MetaType(DecimalConfig.class));
	}
	
	
}
