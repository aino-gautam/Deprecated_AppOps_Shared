package in.appops.platform.client.config.client_type;

import in.appops.platform.core.entity.type.MetaType;

public class TextFieldConfig extends BaseFieldConfig {
	
	private static final long serialVersionUID = 1L;

	public TextFieldConfig() {
		super.setType(new MetaType(TextFieldConfig.class));
	}
	
}
