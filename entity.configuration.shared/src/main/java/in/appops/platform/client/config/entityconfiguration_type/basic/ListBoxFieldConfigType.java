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
	}
	
	@Override
	public void populateProperties() {

		ModelConfigType modelConfigType = new ModelConfigType();
		modelConfigType.addProperty(ModelConfigType.OPERATIONNAME, "appdefinition.AppDefinitionService.getAllServiceList", false, null, null, null);
		//modelConfigType.addProperty(ModelConfigType.OPERATIONPARAM, "param", false, null, null, null);
		modelConfigType.addProperty(ModelConfigType.QUERYNAME, "getServicesForAugs", false, null, null, null);
		//modelConfigType.addProperty(ModelConfigType.QUERYPARAM, "queryParam", false, null, null, null);
		
		ViewConfigType viewConfigType = new ViewConfigType();
		viewConfigType.addProperty(LSTFD_VISIBLE_ITEM_CNT, 10, false, null, null, null);
		viewConfigType.addProperty(LSTFD_LOADERIMG_BLOBID, "images/loader.jpg", false, null, null, null);
		viewConfigType.addProperty(LSTFD_ENTPROP, "name", false, null, null, null);
		viewConfigType.addProperty(BF_PCLS, "dynamicUIListBox", false, null, null, null);
		viewConfigType.addProperty(LSTFD_LOADERIMG_PCLS, "dynamicUIListBoxLoader", false, null, null, null);
		viewConfigType.addProperty(BF_DEFVAL, "--Select service--", false, null, null, null);
		
		addProperty(MODEL, modelConfigType);
		addProperty(VIEW, viewConfigType);
		addProperty(PRESENTER, new PresenterConfigType());
	}
	
}
