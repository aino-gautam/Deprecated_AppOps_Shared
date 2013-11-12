package in.appops.platform.client.config.client_type;

import in.appops.platform.client.config.entityconfiguration_type.basic.IntellithoughtFieldConfigType;
import in.appops.platform.core.entity.type.MetaType;


/**
 * @author pallavi@ensarm.com
 * @createdOn 12-Nov-2013
 */

@SuppressWarnings("serial")
public class IntellithoughtFieldConfig extends BaseFieldConfig{
	
	public IntellithoughtFieldConfig() {
		setType(new MetaType(IntellithoughtFieldConfig.class));
	}
	
	public String getMaxCharLength(){
		return getPropertyByName(IntellithoughtFieldConfigType.INTLTHT_MAXCHARLEN);
	}
	
	public Boolean isContentEditable(){
		return getPropertyByName(IntellithoughtFieldConfigType.INTLTHT_CONTENTEDITABLE);
	}
	
	public String getQueryName(){
		return getPropertyByName(IntellithoughtFieldConfigType.INTLTHT_QUERYNAME);
	}
	
	public String getOperationName(){
		return getPropertyByName(IntellithoughtFieldConfigType.INTLTHT_OPRTION);
	}
	
	public Integer getQueryMaxResult(){
		return getPropertyByName(IntellithoughtFieldConfigType.INTLTHT_QUERY_MAXRESULT);
	}
	
	public String getEntityPropertyToDisplay(){
		return getPropertyByName(IntellithoughtFieldConfigType.INTLTHT_ENTPROP);
	}
	
	public String getLinkedSugestionPrimaryCss(){
		return getPropertyByName(IntellithoughtFieldConfigType.INTLTHT_ENTPROP);
	}
	
	public String getSuggestionLabelPrimaryCss(){
		return getPropertyByName(IntellithoughtFieldConfigType.INTLTHT_SUGGESTIONLBL_PCLS);
	}
	public String getSuggestionHoverPrimarycss(){
		return getPropertyByName(IntellithoughtFieldConfigType.INTLTHT_SUGGESTION_HOVER_PCLS);
	}
	
	public String getSuggestionPopup(){
		return getPropertyByName(IntellithoughtFieldConfigType.INTLTHT_SUGGESTIONPOPUP_PCLS);
	}
	
	public String getLoaderImageBlobId(){
		return getPropertyByName(IntellithoughtFieldConfigType.INTLTHT_LOADERIMG_BLOBID);
	}
	
	public String getLoaderImagePrimaryCss(){
		return getPropertyByName(IntellithoughtFieldConfigType.INTLTHT_LOADERIMG_PCLS);
	}
	
	public Boolean isFireThreeCharEvent(){
		return getPropertyByName(IntellithoughtFieldConfigType.FIRE_THREECHARENTERED_EVENT);
	}
	
	public Boolean isFireWordEnteredEvent(){
		return getPropertyByName(IntellithoughtFieldConfigType.FIRE_WORDENTERED_EVENT);
	}
	
	public Boolean isFireEditInitiatedEvent(){
		return getPropertyByName(IntellithoughtFieldConfigType.FIRE_EDITINITIATED_EVENT);
	}
	
}
