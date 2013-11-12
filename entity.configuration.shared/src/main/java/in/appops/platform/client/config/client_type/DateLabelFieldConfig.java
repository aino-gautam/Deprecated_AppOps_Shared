package in.appops.platform.client.config.client_type;

import in.appops.platform.client.config.entityconfiguration_type.basic.DateLabelFieldConfigType;
import in.appops.platform.core.entity.type.MetaType;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */
@SuppressWarnings("serial")
public class DateLabelFieldConfig extends BaseFieldConfig {
	
	public DateLabelFieldConfig() {
		super.setType(new MetaType(DateLabelFieldConfig.class));
	}
	
	public String getDisplayFormat(){
		return getPropertyByName(DateLabelFieldConfigType.DTLBL_DSPLY_FORM);
	}
	
	public String getDateTimeFormat(){
		return getPropertyByName(DateLabelFieldConfigType.DATETIME_FORMAT);
	}
	
	public String getDateTimeToDisplay(){
		return getPropertyByName(DateLabelFieldConfigType.DATETIME_TO_DISPLAY);
	}
	
	public Boolean isTitleVisible(){
		return getPropertyByName(DateLabelFieldConfigType.IS_TITLE_VISIBLE);
	}
}
