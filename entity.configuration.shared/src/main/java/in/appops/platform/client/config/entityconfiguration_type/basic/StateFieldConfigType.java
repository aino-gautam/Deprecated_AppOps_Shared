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
		setParentConfigtype(STATEFIELD, false, this.getClass(), null, StateFieldConfig.class);
		addProperty(IS_STATIC_BOX, false, false, null, null, null);
		addProperty(IS_SEARCH_QUERY, false, false, null, null, null);
		addProperty(IS_AUTOSUGGESTION, false, false, null, null, null);
		addProperty(STFD_QUERYNAME, "getAllSpaces", false, null, null, null);
		addProperty(STFD_OPRTION, "spacemanagement.SpaceManagementService.getEntityList", false, null, null, null);
		addProperty(STFD_QUERY_MAXRESULT, 10, false, null, null, null);
		addProperty(STFD_ENTPROP, "name", false, null, null, null);
	}
}
