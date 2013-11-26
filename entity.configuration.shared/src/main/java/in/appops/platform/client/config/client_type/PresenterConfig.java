package in.appops.platform.client.config.client_type;

import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.core.shared.Configuration;

public class PresenterConfig extends Configuration{
	
	public PresenterConfig() {
		setType(new MetaType("config"));
	}

}
