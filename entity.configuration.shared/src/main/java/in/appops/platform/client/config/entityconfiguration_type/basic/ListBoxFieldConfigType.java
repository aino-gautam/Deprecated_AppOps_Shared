package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.ListBoxFieldConfig;
import in.appops.platform.client.config.entityconfiguration_type.ConfigType;

@SuppressWarnings("serial")
public class ListBoxFieldConfigType extends ConfigType {
	
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
		
	}
	
}
