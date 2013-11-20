package in.appops.platform.client.config.entityconfiguration_type.basic;

import java.util.logging.Level;
import java.util.logging.Logger;

import in.appops.platform.client.config.client_type.QueryThoughtFieldConfig;
import in.appops.platform.core.entity.Entity;
import in.appops.platform.core.entity.Key;
import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.core.schema.SchemaDefinition;
import in.appops.platform.core.shared.Service;

/**
 * @author pallavi@ensarm.com
 * @createdOn 12-Nov-2013
 */

@SuppressWarnings("serial")
public class QueryThoughtFieldConfigType extends IntellithoughtFieldConfigType{
	
	/** Configurations available **/
	public static final String QRYTHOUGHT_SERVICE = "service";
	public static final String QRYTHOUGHT_SCHEMA = "schema";
	
	public static final String	QUERYTHOUGHTCONFIG		= "QueryThoughtFieldConfig";
	private Logger logger = Logger.getLogger("QueryThoughtFieldConfigType");
	
	
	public QueryThoughtFieldConfigType() {
		super(false);
		setParentConfigtype(QUERYTHOUGHTCONFIG, false, this.getClass(), IntellithoughtFieldConfigType.class, QueryThoughtFieldConfig.class);
		populateProperties();
	}
	
	@Override
	public void populateProperties() {
		try {
			viewConfigType.addProperty(QRYTHOUGHT_SERVICE, null, false, null, null, null);
			viewConfigType.addProperty(QRYTHOUGHT_SERVICE, null, false, null, null, null);
			viewConfigType.addProperty(BF_SUGGESTION_TEXT, "Enter Query string", false, null, null, null);
			viewConfigType.addProperty(BF_INVLDMSG, "Query is not valid", false, null, null, null);
			viewConfigType.addProperty(BF_PCLS, "intelliThoughtField", false, null, null, null);
			viewConfigType.addProperty(FIRE_EDITINITIATED_EVENT, true, false, null, null, null);
			viewConfigType.addProperty(FIRE_THREECHARENTERED_EVENT, true, false, null, null, null);
			viewConfigType.addProperty(FIRE_WORDENTERED_EVENT, true, false, null, null, null);
			viewConfigType.addProperty(INTLTHT_MAXCHARLEN, 3, false, null, null, null);
			viewConfigType.addProperty(BF_ID, "queryThoughtFieldId", false, null, null, null);
			viewConfigType.addProperty(INTLTHT_SUGGESTIONLBL_PCLS, "appops-intelliThoughtSuggestionLabel", false, null, null, null);
			viewConfigType.addProperty(INTLTHT_SUGGESTIONPOPUP_PCLS, "appops-intelliThoughtLinkedSuggestionPopup", false, null, null, null);
			//populateAlternateProperties();
		} catch (Exception e) {
			logger.log(Level.SEVERE,"[QueryThoughtFieldConfigType]::Exception In populateProperties  method :"+e);
		}
	}
	
	@Override
	protected void populateAlternateProperties() {
		try {
			super.populateAlternateProperties();
		} catch (Exception e) {
			logger.log(Level.SEVERE,"[QueryThoughtFieldConfigType]::Exception In populateAlternateProperties  method :"+e);
		}
	}

}
