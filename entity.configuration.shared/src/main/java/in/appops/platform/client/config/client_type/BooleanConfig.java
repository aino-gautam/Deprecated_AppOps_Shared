package in.appops.platform.client.config.client_type;

import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.core.shared.Configuration;

@SuppressWarnings("serial")
public class BooleanConfig extends Configuration {
	
	public BooleanConfig() {
		super.setType(new MetaType(BooleanConfig.class));
	}
	
}
