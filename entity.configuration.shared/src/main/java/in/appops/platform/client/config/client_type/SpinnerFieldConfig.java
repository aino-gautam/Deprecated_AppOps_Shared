package in.appops.platform.client.config.client_type;

import java.util.ArrayList;

import in.appops.platform.client.config.entityconfiguration_type.basic.SpinnerFieldConfigType;
import in.appops.platform.core.entity.type.MetaType;

/**
 * @author pallavi@ensarm.com
 * @createdOn 12-Nov-2013
 */

@SuppressWarnings("serial")
public class SpinnerFieldConfig extends BaseFieldConfig{

	public SpinnerFieldConfig() {
		setType(new MetaType(SpinnerFieldConfig.class));
	}
	
	public String getGroupFieldType(){
		return getPropertyByName(SpinnerFieldConfigType.SP_TYPE);
	}
	
	public Integer getStep(){
		return getPropertyByName(SpinnerFieldConfigType.SP_STEP);
	}
	
	public Integer getUnit(){
		return getPropertyByName(SpinnerFieldConfigType.SP_UNIT);
	}
	
	public String isCircular(){
		return getPropertyByName(SpinnerFieldConfigType.SP_CIRCULAR);
	}
	
	public String isAllowDecimal(){
		return getPropertyByName(SpinnerFieldConfigType.SP_ALLOWDEC);
	}
	
	public String maxValueErrorMsg(){
		return getPropertyByName(SpinnerFieldConfigType.SP_ERRMSGMAX);
	}
	
	public String minValueErrorMsg(){
		return getPropertyByName(SpinnerFieldConfigType.SP_ERRMSGMIN);
	}
	
	public String negativeValErrorMsg(){
		return getPropertyByName(SpinnerFieldConfigType.SP_ERRMSGNEG);
	}
	
	public ArrayList<String> getValueList(){
		return getPropertyByName(SpinnerFieldConfigType.SP_VALUELIST);
	}
	
	public Integer getValueIndex(){
		return getPropertyByName(SpinnerFieldConfigType.SP_VALUEIDX);
	}
}
