package in.appops.platform.client.config.client_type;

import in.appops.platform.client.config.entityconfiguration_type.basic.BaseFieldConfigType;
import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.core.shared.Configuration;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */
@SuppressWarnings("serial")
public class BaseFieldConfig extends Configuration{
	
	public BaseFieldConfig() {
		setType(new MetaType(BaseFieldConfig.class));
	}
	
	public Integer getId(){
		return getPropertyByName(BaseFieldConfigType.BF_ID);
	}
	
	public String getPrimaryCss(){
		return getPropertyByName(BaseFieldConfigType.BF_PCLS);
	}
	
	public String getDependentCss(){
		return getPropertyByName(BaseFieldConfigType.BF_DCLS);
	}
	
	public String getDefaultValue(){
		return getPropertyByName(BaseFieldConfigType.BF_DEFVAL);
	}
	
	public String getErrorPosition(){
		return getPropertyByName(BaseFieldConfigType.BF_ERRPOS);
	}
	
	public String getSuggestionPosition(){
		return getPropertyByName(BaseFieldConfigType.BF_SUGGESTION_POS);
	}
	
	public String getSuggestionText(){
		return getPropertyByName(BaseFieldConfigType.BF_SUGGESTION_TEXT);
	}
	
	public String getBlankFieldErrorText(){
		return getPropertyByName(BaseFieldConfigType.BF_BLANK_TEXT);
	}
	
	public Boolean isEnabled(){
		return getPropertyByName(BaseFieldConfigType.BF_ENABLED);
	}
	
	public Boolean isValidateOnChange(){
		return getPropertyByName(BaseFieldConfigType.BF_VALIDATEONCHANGE);
	}
	
	public Boolean isValidateOnBlur(){
		return getPropertyByName(BaseFieldConfigType.BF_VALIDATEONBLUR);
	}
	
	public Boolean getInvalidFieldMsg(){
		return getPropertyByName(BaseFieldConfigType.BF_INVLDMSG);
	}
	
	public Boolean isReadOnly(){
		return getPropertyByName(BaseFieldConfigType.BF_READONLY);
	}
	
	public String getErrorMsgTextCss(){
		return getPropertyByName(BaseFieldConfigType.BF_ERRMSGCLS);
	}
	
	public String getErrorMsgIconCss(){
		return getPropertyByName(BaseFieldConfigType.BF_ERRMSGICONCLS);
	}
	
	public String getSuggestionMsgTextCss(){
		return getPropertyByName(BaseFieldConfigType.BF_SUGGESTION_MSG_CLS);
	}
	
	public Integer getTabIndex(){
		return getPropertyByName(BaseFieldConfigType.BF_TABINDEX);
	}
	
	public Boolean isAllowBlank(){
		return getPropertyByName(BaseFieldConfigType.BF_ALLOWBLNK);
	}
	
	public String getErrorIconBlobId(){
		return getPropertyByName(BaseFieldConfigType.BF_ERRICON_BLOB);
	}
	
	public String getValidFieldTextMsgCss(){
		return getPropertyByName(BaseFieldConfigType.BF_VALID_FIELD_MSGICONCLS);
	}
	
	public String getValidFieldIconBlobId(){
		return getPropertyByName(BaseFieldConfigType.BF_VALIDATION_ICON_BLOBID);
	}
	
	public Boolean isShowValidFieldMsg(){
		return getPropertyByName(BaseFieldConfigType.BF_SHOW_VALID_FIELD);
	}
	
	public String getTextMessageForValidField(){
		return getPropertyByName(BaseFieldConfigType.BF_VALIDVALUE_TEXT);
	}
	
	public String getCssForValidFieldTextMessage(){
		return getPropertyByName(BaseFieldConfigType.BF_VALID_FIELD_MSGCLS);
	}
	
	public String getBindProperty(){
		return getPropertyByName(BaseFieldConfigType.BF_BINDPROP);
	}
	
	public String getValueType(){
		return getPropertyByName(BaseFieldConfigType.BF_VALUETYPE);
	}
}
