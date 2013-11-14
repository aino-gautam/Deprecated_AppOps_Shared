package in.appops.platform.client.config.client_type;

import in.appops.platform.client.config.entityconfiguration_type.basic.StateFieldConfigType;
import in.appops.platform.core.entity.type.MetaType;
import java.util.HashMap;

/**
 * @author pallavi@ensarm.com
 * @createdOn 11-Nov-2013
 */

@SuppressWarnings("serial")
public class StateFieldConfig extends BaseFieldConfig{
	
	public StateFieldConfig() {
		setType(new MetaType(StateFieldConfig.class));
	}
	
	public Boolean isStaticStateField(){
		return getPropertyByName(StateFieldConfigType.IS_STATIC_BOX);
	}
	
	public Object getListOfItems(){
		return getPropertyByName(StateFieldConfigType.ITEMS_LIST);
	}
	
	public Boolean getQueryName(){
		return getPropertyByName(StateFieldConfigType.STFD_QUERYNAME);
	}
	
	public Boolean getOperationName(){
		return getPropertyByName(StateFieldConfigType.STFD_OPRTION);
	}
	
	public Integer getQueryMaxResult(){
		return getPropertyByName(StateFieldConfigType.STFD_QUERY_MAXRESULT);
	}
	
	public String getEntityPropertyToDisplay(){
		return getPropertyByName(StateFieldConfigType.STFD_ENTPROP);
	}
	
	public HashMap<String, Object> getQueryRestriction(){
		return getPropertyByName(StateFieldConfigType.STFD_QUERY_RESTRICTION);
	}
	
	public Boolean isSearchQuery(){
		return getPropertyByName(StateFieldConfigType.IS_SEARCH_QUERY);
	}
	
	public Boolean isAutoSuggestion(){
		return getPropertyByName(StateFieldConfigType.IS_AUTOSUGGESTION);
	}
	
}
