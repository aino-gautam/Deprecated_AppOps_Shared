package in.appops.platform.client.config.entityconfiguration_type.basic;

import java.util.logging.Level;
import java.util.logging.Logger;

import in.appops.platform.client.config.client_type.BaseFieldConfig;
import in.appops.platform.client.config.entityconfiguration_type.ConfigType;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */

@SuppressWarnings("serial")
public class BaseFieldConfigType extends ConfigType{
	
	/*** Configurations for the base field **/
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
	public static final String BF_BASEPANEL_PCLS = "basePanelPrimaryCss";
	public static final String BF_BASEPANEL_DCLS = "basePanelDependentCss";
	public static final String BF_VISIBLE = "visible";
	
	/** MVP constants **/
	public static final String	BASEFIELDCONFIG		= "BaseFieldConfig";
	public static final String	MODEL		= "model";
	public static final String	VIEW		= "view";
	public static final String	PRESENTER		= "presenter";
	
	/** MVP configType variables declaration **/
	protected ModelConfigType modelConfigType = null;
	protected ViewConfigType viewConfigType = null;
	protected PresenterConfigType presenterConfigType = null;
	
	/** Local variables**/
	private Boolean isReadOnlyField = false;
	private Logger logger = Logger.getLogger("BaseFieldConfigType");
	
	public BaseFieldConfigType() {
	}
	
	public BaseFieldConfigType(Boolean isReadOnlyField) {
		this.isReadOnlyField = isReadOnlyField;
		setParentConfigtype(BASEFIELDCONFIG, false, this.getClass(), null, BaseFieldConfig.class);
		populateProperties();
	}
	
	protected void populateProperties() {
		try {
			populateDefaultProperties();
		} catch (Exception e) {
			logger.log(Level.SEVERE,"[BaseFieldConfigType]::Exception In populateProperties  method :"+e);
		}
	}

	private void populateDefaultProperties() {
		try {
			modelConfigType = new ModelConfigType();
			viewConfigType = new ViewConfigType();
			presenterConfigType = new PresenterConfigType();
			
			if (isReadOnlyField) {
				populateReadOnlyFieldProperties();
			} else {
				populateInputFieldProperties();
			}
			
			addProperty(MODEL, modelConfigType);
			addProperty(VIEW, viewConfigType);
			addProperty(PRESENTER, presenterConfigType);
			
		} catch (Exception e) {
			logger.log(Level.SEVERE,"[BaseFieldConfigType]::Exception In populateDefaultProperties  method :"+e);
		}
	}
	
	@SuppressWarnings("unused")
	private void populateInputFieldProperties(){
		try {
			viewConfigType.addProperty(BF_PCLS, null, false, null, null, null);
			viewConfigType.addProperty(BF_DCLS, null, false, null, null, null);
			viewConfigType.addProperty(BF_BASEPANEL_PCLS, null, false, null, null, null);
			viewConfigType.addProperty(BF_BASEPANEL_DCLS, null, false, null, null, null);
			viewConfigType.addProperty(BF_SHOW_VALID_FIELD, false, false, null, null, null);
			viewConfigType.addProperty(BF_ERRPOS, BF_SIDE, false, null, null, null);
			viewConfigType.addProperty(BF_SUGGESTION_POS, BF_SUGGESTION_INLINE, false, null, null, null);
			viewConfigType.addProperty(BF_SUGGESTION_TEXT, "", false, null, null, null);
			viewConfigType.addProperty(BF_BLANK_TEXT, "Field value cannot be blank", false, null, null, null);
			viewConfigType.addProperty(BF_ENABLED, true , false, null, null, null);
			viewConfigType.addProperty(BF_INVLDMSG, "Invalid field" , false, null, null, null);
			viewConfigType.addProperty(BF_READONLY, false , false, null, null, null);
			viewConfigType.addProperty(BF_ERRMSGCLS, "errorMsgCss" , false, null, null, null);
			viewConfigType.addProperty(BF_ERRICON_BLOB, "images/invalid_line.gif" , false, null, null, null);
			viewConfigType.addProperty(BF_SUGGESTION_MSG_CLS, "suggestionMsgCss" , false, null, null, null);
			viewConfigType.addProperty(BF_ALLOWBLNK, true , false, null, null, null);
			viewConfigType.addProperty(BF_BINDPROP, "name" , false, null, null, null);
			viewConfigType.addProperty(BF_ERRMSGICONCLS, "errorIconCss" , false, null, null, null);
			viewConfigType.addProperty(BF_VALIDATEONCHANGE, true , false, null, null, null);
			viewConfigType.addProperty(BF_VALIDATEONBLUR, true , false, null, null, null);
			viewConfigType.addProperty(BF_ERRMSGICONCLS, "errorIconCss" , false, null, null, null);
			viewConfigType.addProperty(BF_DEFVAL, null, false, null, null, null);
			
		} catch (Exception e) {
			logger.log(Level.SEVERE,"[BaseFieldConfigType]::Exception In populateInputFieldProperties method :"+e);
		}
	}
	
	private void populateReadOnlyFieldProperties(){
		try {
			viewConfigType.addProperty(BF_PCLS, null, false, null, null, null);
			viewConfigType.addProperty(BF_DCLS, null, false, null, null, null);
			viewConfigType.addProperty(BF_BASEPANEL_PCLS, null, false, null, null, null);
			viewConfigType.addProperty(BF_BASEPANEL_DCLS, null, false, null, null, null);
			viewConfigType.addProperty(BF_VISIBLE, true, false, null, null, null);
			viewConfigType.addProperty(BF_ENABLED, true, false, null, null, null);
			viewConfigType.addProperty(BF_DEFVAL, null, false, null, null, null);
		} catch (Exception e) {
			logger.log(Level.SEVERE,"[BaseFieldConfigType]::Exception In populateReadOnlyFieldProperties method :"+e);
		}
	}
	
	protected void populateAlternateProperties(){
		try {
			viewConfigType.addAlternateProperty(BF_ERRPOS, BF_BOTTOM, false, null, null, null);
			viewConfigType.addAlternateProperty(BF_ERRPOS, BF_TOP, false, null, null, null);
			viewConfigType.addAlternateProperty(BF_ERRPOS, BF_ERRINLINE, false, null, null, null);
			
			viewConfigType.addAlternateProperty(BF_SUGGESTION_POS, BF_BOTTOM, false, null, null, null);
			viewConfigType.addAlternateProperty(BF_SUGGESTION_POS, BF_SIDE, false, null, null, null);
			viewConfigType.addAlternateProperty(BF_SUGGESTION_POS, BF_TOP, false, null, null, null);
		} catch (Exception e) {
			logger.log(Level.SEVERE,"[BaseFieldConfigType]::Exception In populateAlternateProperties  method :"+e);
		}
	}
	
}
