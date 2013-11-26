package in.appops.platform.client.config.client_type;

import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.server.entityconfiguration_type.basic.ListBoxFieldConfigType;

import java.util.HashMap;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */

@SuppressWarnings("serial")
public class ListBoxFieldConfig extends BaseFieldConfig {
	
	public ListBoxFieldConfig() {
		super.setType(new MetaType(ListBoxFieldConfig.class));
	}
	
	public Integer getVisibleItemCount(){
		return getPropertyByName(ListBoxFieldConfigType.LSTFD_VISIBLE_ITEM_CNT);
	}
	
	public String getQueryName(){
		return getPropertyByName(ListBoxFieldConfigType.LSTFD_QUERYNAME);
	}
	
	public String getOperationName(){
		return getPropertyByName(ListBoxFieldConfigType.LSTFD_OPRTION);
	}
	
	public Integer getQueryMaxResult(){
		return getPropertyByName(ListBoxFieldConfigType.LSTFD_QUERY_MAXRESULT);
	}
	
	public String getEntityPropertyToDisplay(){
		return getPropertyByName(ListBoxFieldConfigType.LSTFD_ENTPROP);
	}
	
	public HashMap<String, Object> getQueryRestriction(){
		return getPropertyByName(ListBoxFieldConfigType.LSTFD_QUERY_RESTRICTION);
	}
	
	public String getDefaultSelectedText() {
		return getPropertyByName(ListBoxFieldConfigType.LSTFD_SELECTED_TXT);
	}
	
	public String getLoaderImageBlobId(){
		return getPropertyByName(ListBoxFieldConfigType.LSTFD_LOADERIMG_BLOBID);
	}
	
	public String getLoaderImagePrimaryCss() {
		return getPropertyByName(ListBoxFieldConfigType.LSTFD_LOADERIMG_PCLS);
	}
	
	public String getLoaderImageDependentCss() {
		return getPropertyByName(ListBoxFieldConfigType.LSTFD_LOADERIMG_DCLS);
	}
	
	public Object getStaticListOfItems() {
		return getPropertyByName(ListBoxFieldConfigType.LSTFD_ITEMS);
	}
}
