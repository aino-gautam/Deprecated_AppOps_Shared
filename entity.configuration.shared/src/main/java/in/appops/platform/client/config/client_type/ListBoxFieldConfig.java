package in.appops.platform.client.config.client_type;

import in.appops.platform.client.config.entityconfiguration_type.basic.StringConfigType;
import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.core.shared.Configuration;

@SuppressWarnings("serial")
public class ListBoxFieldConfig extends Configuration {
	public ListBoxFieldConfig() {
		super.setType(new MetaType(ListBoxFieldConfig.class));
	}
	
	public String getCharset(){
		return getPropertyByName(StringConfigType.CHARSET);
	}
}
