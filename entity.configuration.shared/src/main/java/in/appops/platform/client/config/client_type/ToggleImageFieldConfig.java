package in.appops.platform.client.config.client_type;

import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.core.shared.Configuration;
import in.appops.platform.server.entityconfiguration_type.basic.ToggleImageFieldConfigType;

/**
 * @author pallavi@ensarm.com
 * @createdOn 11-Nov-2013
 */

@SuppressWarnings("serial")
public class ToggleImageFieldConfig extends Configuration{

	public ToggleImageFieldConfig() {
		setType(new MetaType(ToggleImageFieldConfig.class));
	}
	
	public String getUpStateUrl(){
		return getPropertyByName(ToggleImageFieldConfigType.TIMGFD_UPSTATE_URL);
	}
	
	public String getDownStateUrl(){
		return getPropertyByName(ToggleImageFieldConfigType.TIMGFD_UPSTATE_URL);
	}
	
	public String getUpStateTitleText(){
		return getPropertyByName(ToggleImageFieldConfigType.TIMGFD_DWNSTATE_TITLE);
	}
	
	public String getDownStateTitleText(){
		return getPropertyByName(ToggleImageFieldConfigType.TIMGFD_DWNSTATE_TITLE);
	}
	
	public String getStateImagePrimaryCss(){
		return getPropertyByName(ToggleImageFieldConfigType.TIMGFD_STATEIMG_PCLS);
	}
	
	public String getStateImageDependentCss(){
		return getPropertyByName(ToggleImageFieldConfigType.TIMGFD_STATEIMG_DCLS);
	}
}
