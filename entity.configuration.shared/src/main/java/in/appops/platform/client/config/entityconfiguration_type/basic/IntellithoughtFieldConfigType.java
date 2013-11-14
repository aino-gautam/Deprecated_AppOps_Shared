package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.IntellithoughtFieldConfig;

/**
 * @author pallavi@ensarm.com
 * @createdOn 12-Nov-2013
 */
@SuppressWarnings("serial")
public class IntellithoughtFieldConfigType extends BaseFieldConfigType{
	
	public static final String INTLTHT_MAXCHARLEN = "maxLength";
	public static final String INTLTHT_CONTENTEDITABLE = "contenteditable";
	public static final String INTLTHT_QUERYNAME = "queryName";
	public static final String INTLTHT_OPRTION = "operation";
	public static final String INTLTHT_QUERY_MAXRESULT = "queryMaxresult";
	public static final String INTLTHT_ENTPROP = "propertyToDisplay";	
	public static final String FIRE_THREECHARENTERED_EVENT = "fireThreeCharEnteredEvent";
	public static final String FIRE_WORDENTERED_EVENT = "fireWordEnteredEvent";
	public static final String FIRE_EDITINITIATED_EVENT = "fireEditInitatedEvent";		
	public static final String INTLTHT_LNKSUGGESTION_PCLS = "linkFieldCss";
	public static final String INTLTHT_SUGGESTIONLBL_PCLS = "suggestionLblCss";
	public static final String INTLTHT_SUGGESTIONPOPUP_PCLS = "suggestionPopupCss";
	public static final String INTLTHT_SUGGESTION_HOVER_PCLS = "suggestionHoverCss";
	public static final String INTLTHT_LOADERIMG_BLOBID = "loaderImgBlobId";
	public static final String INTLTHT_LOADERIMG_PCLS = "loaderImgPrimaryCss";
	
	public static final String	INTELLITHOUGHTCONFIG		= "IntellithoughtFieldConfig";
	
	public IntellithoughtFieldConfigType() {
		setParentConfigtype(INTELLITHOUGHTCONFIG, false, this.getClass(), BaseFieldConfigType.class, IntellithoughtFieldConfig.class);
		addProperty(BF_PCLS, "intelliThoughtField", false, null, null, null);
		addProperty(BF_SUGGESTION_TEXT, "Any thoughts", false, null, null, null);
		addProperty(FIRE_EDITINITIATED_EVENT, true, false, null, null, null);
		addProperty(FIRE_THREECHARENTERED_EVENT, true, false, null, null, null);
		addProperty(FIRE_WORDENTERED_EVENT, true, false, null, null, null);
		addProperty(INTLTHT_ENTPROP, "name", false, null, null, null);
		addProperty(INTLTHT_OPRTION, "spacemanagement.SpaceManagementService.getLinkSuggestions", false, null, null, null);
		addProperty(INTLTHT_MAXCHARLEN, 3, false, null, null, null);
		addProperty(INTLTHT_QUERY_MAXRESULT, 10, false, null, null, null);
		addProperty(BF_ID, "intelliTextField", false, null, null, null);
		addProperty(INTLTHT_SUGGESTIONLBL_PCLS, "appops-intelliThoughtSuggestionLabel", false, null, null, null);
		addProperty(INTLTHT_SUGGESTIONPOPUP_PCLS, "appops-intelliThoughtLinkedSuggestionPopup", false, null, null, null);
	}
}
