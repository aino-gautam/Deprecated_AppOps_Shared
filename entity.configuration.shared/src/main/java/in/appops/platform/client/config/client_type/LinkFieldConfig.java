package in.appops.platform.client.config.client_type;

import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.server.entityconfiguration_type.basic.LinkFieldConfigType;

@SuppressWarnings("serial")
public class LinkFieldConfig extends BaseFieldConfig {
	
	public LinkFieldConfig() {
		super.setType(new MetaType(LinkFieldConfigType.class));
	}
	
	public String getLinkFieldType(){
		return getPropertyByName(LinkFieldConfigType.LNK_TYPE);
	}
	
	public String getDisplayText(){
		return getPropertyByName(LinkFieldConfigType.LNK_DISPLAYTEXT);
	}
	
	public String getLinkTitle(){
		return getPropertyByName(LinkFieldConfigType.LNK_TITLE);
	}
	
	public String getHostoryToken(){
		return getPropertyByName(LinkFieldConfigType.LNK_HISTORYTOKEN);
	}

}
