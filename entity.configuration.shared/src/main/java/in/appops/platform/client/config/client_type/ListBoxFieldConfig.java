package in.appops.platform.client.config.client_type;

import in.appops.platform.core.entity.type.MetaType;

@SuppressWarnings("serial")
public class ListBoxFieldConfig extends BaseFieldConfig {
	
	public ListBoxFieldConfig() {
		super.setType(new MetaType(ListBoxFieldConfig.class));
	}
		
}
