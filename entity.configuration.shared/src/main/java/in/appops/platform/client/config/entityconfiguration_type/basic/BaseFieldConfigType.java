package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.BaseFieldConfig;
import in.appops.platform.client.config.entityconfiguration_type.ConfigType;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */

public class BaseFieldConfigType extends ConfigType{
	
	private static final long serialVersionUID = 1L;
	public static final String BF_ID = "baseFieldId";
	public static final String BF_PCLS = "baseFieldPrimaryCss";
	public static final String BF_DCLS = "baseFieldDependentCss";
	public static final String BF_DEFVAL = "defaultValue";
	public static final String BF_SHOW_VALID_FIELD = "showValidField";
	public static final String BF_ERRPOS = "errorPosition";
	public static final String BF_SUGGESTION_POS = "suggestionPosition";
	public static final String BF_TOP = "top";
	public static final String BF_SIDE = "side";
	public static final String BF_BOTTOM = "bottom";
	public static final String BF_ERRINLINE = "errorInline";
	public static final String BF_SUGGESTION_INLINE = "suggestionInline";
	public static final String BF_SUGGESTION_TEXT = "suggestionText";
	public static final String BF_BLANK_TEXT = "blankFieldErrTxt";
	public static final String BF_ENABLED = "enabled";
	public static final String BF_VALIDATEONCHANGE = "validateOnChange";
	public static final String BF_VALIDATEONBLUR = "validateOnBlur";
	public static final String BF_INVLDMSG = "invalidMsg";
	public static final String BF_READONLY = "readOnly";
	public static final String BF_ERRMSGCLS = "errorMsgCls";
	public static final String BF_ERRMSGICONCLS = "errorMsgIconCls";
	public static final String BF_SUGGESTION_MSG_CLS = "suggestionMsgCls";
	public static final String BF_TABINDEX = "tabIndex";
	public static final String BF_ALLOWBLNK = "allowBlank";
	public static final String BF_ERRICON_BLOB = "errorIcon";
	public static final String BF_VALID_FIELD_MSGICONCLS = "validFieldMsgIconCss";
	public static final String BF_VALIDATION_ICON_BLOBID = "validIconBlobId";
	public static final String BF_VALIDVALUE_TEXT = "validValueTxt";
	public static final String BF_VALID_FIELD_MSGCLS = "validFieldMsgCls";
	public static final String BF_BINDPROP = "bindProperty";
	public static final String BF_VALUETYPE = "valueType";
	
	public static final String	BASEFIELDCONFIG		= "BaseFieldConfig";
	public static final String	MODEL		= "model";
	public static final String	VIEW		= "view";
	public static final String	PRESENTER		= "presenter";
	
	public BaseFieldConfigType() {
		setParentConfigtype(BASEFIELDCONFIG, false, this.getClass(), null, BaseFieldConfig.class);
		addProperty(BF_PCLS, "baseFieldCss", false, null, null, null);
		addProperty(BF_DCLS, "baseFieldDepenentCss", false, null, null, null);
		addProperty(BF_SHOW_VALID_FIELD, false, false, null, null, null);
		addProperty(BF_ERRPOS, BF_TOP, false, null, null, null);
		addProperty(BF_SUGGESTION_POS, BF_TOP, false, null, null, null);
		addProperty(BF_SUGGESTION_TEXT, "Enter field value text", false, null, null, null);
		addProperty(BF_BLANK_TEXT, "Field value cannot be blank", false, null, null, null);
		addProperty(BF_ENABLED, true , false, null, null, null);
		addProperty(BF_INVLDMSG, "Invalid field" , false, null, null, null);
		addProperty(BF_READONLY, false , false, null, null, null);
		addProperty(BF_ERRMSGCLS, "errorMsgCss" , false, null, null, null);
		addProperty(BF_ERRICON_BLOB, "images/invalid_line.gif" , false, null, null, null);
		addProperty(BF_SUGGESTION_MSG_CLS, "suggestionMsgCss" , false, null, null, null);
		addProperty(BF_ALLOWBLNK, false , false, null, null, null);
		addProperty(BF_BINDPROP, "name" , false, null, null, null);
		addProperty(BF_ERRMSGICONCLS, "errorIconCss" , false, null, null, null);
		
		//addAlternateProperties();
	}
	
	private void addAlternateProperties(){
		
		addAlternateProperty(BF_ERRPOS, BF_BOTTOM, false, null, null, null);
		addAlternateProperty(BF_ERRPOS, BF_SIDE, false, null, null, null);
		addAlternateProperty(BF_ERRPOS, BF_ERRINLINE, false, null, null, null);
		
		addAlternateProperty(BF_SUGGESTION_POS, BF_BOTTOM, false, null, null, null);
		addAlternateProperty(BF_SUGGESTION_POS, BF_SIDE, false, null, null, null);
		addAlternateProperty(BF_SUGGESTION_POS, BF_SUGGESTION_INLINE, false, null, null, null);
	}
	
}
