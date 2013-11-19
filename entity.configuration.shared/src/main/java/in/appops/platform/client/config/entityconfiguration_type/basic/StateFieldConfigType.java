package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.StateFieldConfig;

/**
 * @author pallavi@ensarm.com
 * @createdOn 11-Nov-2013
 */
@SuppressWarnings("serial")
public class StateFieldConfigType extends BaseFieldConfigType{

	public static final String IS_STATIC_BOX = "isStaticBox";
	public static final String ITEMS_LIST = "itemsList";
	public static final String STFD_QUERYNAME = "queryName";
	public static final String STFD_OPRTION = "operation";
	public static final String STFD_QUERY_MAXRESULT = "queryMaxresult";
	public static final String STFD_ENTPROP = "propertyToDisplay";
	public static final String STFD_QUERY_RESTRICTION = "queryRestriction";
	public static final String IS_SEARCH_QUERY = "isSearchQuery";
	public static final String IS_AUTOSUGGESTION = "isAutoSuggestion";
	public static final String	STATEFIELD		= "StateFieldConfig";
	
	public StateFieldConfigType() {
		setParentConfigtype(STATEFIELD, false, this.getClass(), BaseFieldConfigType.class, StateFieldConfig.class);
		
		ModelConfigType modelConfigType = new ModelConfigType();
		modelConfigType.addProperty(ModelConfigType.OPERATIONNAME, "appdefinition.AppDefinitionService.getAllServiceList", false, null, null, null);
		//modelConfigType.addProperty(ModelConfigType.OPERATIONPARAM, "param", false, null, null, null);
		modelConfigType.addProperty(ModelConfigType.QUERYNAME, "getServiceSuggestionsForAugs", false, null, null, null);
		//modelConfigType.addProperty(ModelConfigType.QUERYPARAM, "queryParam", false, null, null, null);
		
		ViewConfigType viewConfigType = new ViewConfigType();
		viewConfigType.addProperty(IS_STATIC_BOX, false, false, null, null, null);
		viewConfigType.addProperty(IS_SEARCH_QUERY, false, false, null, null, null);
		viewConfigType.addProperty(IS_AUTOSUGGESTION, false, false, null, null, null);
		viewConfigType.addProperty(STFD_ENTPROP, "name", false, null, null, null);
		viewConfigType.addProperty(BF_SUGGESTION_TEXT, "Enter a service name", false, null, null, null);
		
		addProperty(MODEL, modelConfigType);
		addProperty(VIEW, viewConfigType);
		addProperty(PRESENTER, new PresenterConfigType());
	}
}
