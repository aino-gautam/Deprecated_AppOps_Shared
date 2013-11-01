package in.appops.platform.client.config.client_type;

import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.core.shared.Configuration;

@SuppressWarnings("serial")
public class BaseFieldConfig extends Configuration{
	
	public BaseFieldConfig() {
		setType(new MetaType(BaseFieldConfig.class));
	}
	
}
