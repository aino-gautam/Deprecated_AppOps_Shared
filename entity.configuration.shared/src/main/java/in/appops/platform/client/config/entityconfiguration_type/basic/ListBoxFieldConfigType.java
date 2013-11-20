package in.appops.platform.client.config.entityconfiguration_type.basic;

import java.util.logging.Level;
import java.util.logging.Logger;

import in.appops.platform.client.config.client_type.ListBoxFieldConfig;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */

@SuppressWarnings("serial")
public class ListBoxFieldConfigType extends BaseFieldConfigType {
	
	/** Configurations available **/
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
	
	private Logger logger = Logger.getLogger("ListBoxFieldConfigType");
	
	public ListBoxFieldConfigType() {
		super(true);
		setParentConfigtype(LISTBOX, false, this.getClass(), BaseFieldConfigType.class, ListBoxFieldConfig.class);
		populateProperties();
	}
	
	@Override
	public void populateProperties() {
		try {
			modelConfigType.addProperty(ModelConfigType.OPERATIONNAME, null, false, null, null, null);
			modelConfigType.addProperty(ModelConfigType.OPERATIONPARAM, null, false, null, null, null);
			modelConfigType.addProperty(ModelConfigType.QUERYNAME, null, false, null, null, null);
			modelConfigType.addProperty(ModelConfigType.QUERYPARAM, null, false, null, null, null);
			
			viewConfigType.addProperty(LSTFD_VISIBLE_ITEM_CNT, 10, false, null, null, null);
			viewConfigType.addProperty(LSTFD_QUERY_RESTRICTION, null, false, null, null, null);
			
			viewConfigType.addProperty(LSTFD_LOADERIMG_BLOBID, "images/loader.jpg", false, null, null, null);
			viewConfigType.addProperty(LSTFD_LOADERIMG_DCLS, null, false, null, null, null);
			viewConfigType.addProperty(LSTFD_LOADERIMG_PCLS, "dynamicUIListBoxLoader", false, null, null, null);
			
			viewConfigType.addProperty(LSTFD_ENTPROP, "name", false, null, null, null);
			viewConfigType.addProperty(BF_PCLS, "dynamicUIListBox", false, null, null, null);
			
			viewConfigType.addProperty(LSTFD_ITEMS, null, false, null, null, null);
			viewConfigType.addProperty(BF_DEFVAL, "--Select--", false, null, null, null);
			viewConfigType.addProperty(LSTFD_SELECTED_TXT, null, false, null, null, null);
			
		} catch (Exception e) {
			logger.log(Level.SEVERE,"[ListBoxFieldConfigType]::Exception In populateProperties  method :"+e);
		}
}
	
}
