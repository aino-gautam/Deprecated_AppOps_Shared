package in.appops.platform.client.config.client_type;

import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.core.shared.Configuration;

public class TextFieldConfig extends Configuration {
	
	private static final long serialVersionUID = 1L;

	public TextFieldConfig() {
		super.setType(new MetaType(TextFieldConfig.class));
	}
	
}
