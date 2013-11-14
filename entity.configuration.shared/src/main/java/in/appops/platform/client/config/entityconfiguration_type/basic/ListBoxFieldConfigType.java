package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.ListBoxFieldConfig;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */

@SuppressWarnings("serial")
public class ListBoxFieldConfigType extends BaseFieldConfigType {
	
	public static final String LSTFD_VISIBLE_ITEM_CNT = "visibleItems";
	public static final String LSTFD_ITEMS = "listOfItems";
	public static final String LSTFD_QUERYNAME = "queryName";
	public static final String LSTFD_OPRTION = "operation";
	public static final String LSTFD_QUERY_MAXRESULT = "queryMaxresult";
	public static final String LSTFD_ENTPROP = "propertyToDisplay";
	public static final String LSTFD_QUERY_RESTRICTION = "queryRestriction";
	public static final String LSTFD_SELECTED_TXT = "defaultSelectedText";
	public static final String LSTFD_LOADERIMG_BLOBID="loaderImgBlobId";
	public static final String LSTFD_LOADERIMG_PCLS ="loaderImgPrimarycss";
	public static final String LSTFD_LOADERIMG_DCLS="loaderImgSecondarycss";
	public static final String	LISTBOX		= "ListBoxFieldConfig";
	
	public ListBoxFieldConfigType() {
		setParentConfigtype(LISTBOX, false, this.getClass(), BaseFieldConfigType.class, ListBoxFieldConfig.class);
		addProperty(LSTFD_VISIBLE_ITEM_CNT, 10, false, null, null, null);
		addProperty(LSTFD_LOADERIMG_BLOBID, "images/loader.jpg", false, null, null, null);
		addProperty(LSTFD_QUERYNAME, "getAllSpaces", false, null, null, null);
		addProperty(LSTFD_OPRTION, "spacemanagement.SpaceManagementService.getEntityList", false, null, null, null);
		addProperty(LSTFD_QUERY_MAXRESULT, 10, false, null, null, null);
		addProperty(LSTFD_ENTPROP, "name", false, null, null, null);
		addProperty(LSTFD_LOADERIMG_PCLS, "", false, null, null, null);
		addProperty(LSTFD_LOADERIMG_DCLS, "", false, null, null, null);
	}
	
}
