package in.appops.platform.client.config.client_type;

import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.server.entityconfiguration_type.basic.TextFieldConfigType;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */

public class TextFieldConfig extends BaseFieldConfig {
	
	private static final long serialVersionUID = 1L;

	public TextFieldConfig() {
		super.setType(new MetaType(TextFieldConfig.class));
	}
	
	public Integer getNoOfVisibleLines(){
		return getPropertyByName(TextFieldConfigType.TF_VISLINES);
	}
	
	public String getTextFieldType(){
		return getPropertyByName(TextFieldConfigType.TF_TYPE);
	}
	
	public String getEmailRegex(){
		return getPropertyByName(TextFieldConfigType.EMAIL_REGEX);
	}
	
	public Boolean isAllowDecimal(){
		return getPropertyByName(TextFieldConfigType.ALLOWDEC);
	}
	
	public Integer getDecimalPrecision(){
		return getPropertyByName(TextFieldConfigType.DEC_PRECISION);
	}
	
	public Boolean isValidateField(){
		return getPropertyByName(TextFieldConfigType.VALIDATEFIELD);
	}
	
	public String getMinimumLengthErrorText(){
		return getPropertyByName(TextFieldConfigType.MIN_LEGTH_ERRTXT);
	}
	
	public String getMaxValueErrorText(){
		return getPropertyByName(TextFieldConfigType.MAX_VALUE_TEXT);
	}
	
	public String getMinValueErrorText(){
		return getPropertyByName(TextFieldConfigType.MIN_VALUE_TEXT);
	}
	
	public String getNegativeValueErrorText(){
		return getPropertyByName(TextFieldConfigType.NEGATIVE_VALUE_TEXT);
	}
	
	public String getInvalidEmailText(){
		return getPropertyByName(TextFieldConfigType.INVALID_EMAIL_TEXT);
	}
	
}
