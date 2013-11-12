package in.appops.platform.client.config.client_type;

import in.appops.platform.client.config.entityconfiguration_type.basic.DatePickerFieldConfigType;
import in.appops.platform.core.entity.type.MetaType;
import java.util.Date;

/**
 * @author pallavi@ensarm.com
 * @createdOn 12-Nov-2013
 */

@SuppressWarnings("serial")
public class DatePickerFieldConfig extends BaseFieldConfig{
	
	public DatePickerFieldConfig() {
		setType(new MetaType(QueryThoughtFieldConfig.class));
	}
	
	public String getDateBoxPrimaryCss(){
		return getPropertyByName(DatePickerFieldConfigType.DP_BXPCLS);
	}
	
	public String getDateBoxDependentCss(){
		return getPropertyByName(DatePickerFieldConfigType.DP_BXDCLS);
	}
	
	public Date getMaxDate(){
		return getPropertyByName(DatePickerFieldConfigType.DP_MAXDATE);
	}
	
	public Date getMinDate(){
		return getPropertyByName(DatePickerFieldConfigType.DP_MINDATE);
	}
	
	public String getDateFormat(){
		return getPropertyByName(DatePickerFieldConfigType.DP_FORMAT);
	}
	
	public String getMinErrorMsg(){
		return getPropertyByName(DatePickerFieldConfigType.DP_ERRMSGMIN);
	}
	
	public String getMaxErrorMsg(){
		return getPropertyByName(DatePickerFieldConfigType.DP_ERRMSGMAX);
	}
	

}
