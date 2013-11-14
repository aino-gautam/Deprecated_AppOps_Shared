package in.appops.platform.client.config.client_type;

import in.appops.platform.client.config.entityconfiguration_type.basic.LabelFieldConfigType;
import in.appops.platform.core.entity.type.MetaType;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */

@SuppressWarnings("serial")
public class LabelFieldConfig extends BaseFieldConfig {
	
	public LabelFieldConfig() {
		super.setType(new MetaType(LabelFieldConfig.class));
	}
	
	public String getDisplayTitle(){
		return getPropertyByName(LabelFieldConfigType.LBLFD_TITLE);
	}
	
	public String getDisplayText(){
		return getPropertyByName(LabelFieldConfigType.LBLFD_DISPLAYTXT);
	}
	
	public String isWordWrap(){
		return getPropertyByName(LabelFieldConfigType.LBLFD_ISWORDWRAP);
	}
}
