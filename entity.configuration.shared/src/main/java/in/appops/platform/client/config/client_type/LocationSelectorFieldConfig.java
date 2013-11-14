package in.appops.platform.client.config.client_type;

import in.appops.platform.client.config.entityconfiguration_type.basic.LocationSelectorFieldConfigType;
import in.appops.platform.core.entity.type.MetaType;


/**
 * @author pallavi@ensarm.com
 * @createdOn 12-Nov-2013
 */

@SuppressWarnings("serial")
public class LocationSelectorFieldConfig extends BaseFieldConfig{

	public LocationSelectorFieldConfig() {
		setType(new MetaType(LocationSelectorFieldConfig.class));
	}
	
	public Boolean isShowMapInPopup(){
		return getPropertyByName(LocationSelectorFieldConfigType.LOCNFD_SHOWINPOPUP);
	}
	
	public String getLocationMarkerBlobId(){
		return getPropertyByName(LocationSelectorFieldConfigType.LOCNFD_POPUP_ICON_BLOB);
	}
	
	public String getLocationFieldHeight(){
		return getPropertyByName(LocationSelectorFieldConfigType.LOCNFD_HEIGHT);
	}
	
	public String getLocationFieldWidth(){
		return getPropertyByName(LocationSelectorFieldConfigType.LOCFD_WIDTH);
	}
	
	public Integer getZoomLevel(){
		return getPropertyByName(LocationSelectorFieldConfigType.LOCNFD_ZOOMLEVEL);
	}
	
	public Double getLatitude(){
		return getPropertyByName(LocationSelectorFieldConfigType.LOCNFD_LATITUDE);
	}
	
	public Double getLongitude(){
		return getPropertyByName(LocationSelectorFieldConfigType.LOCNFD_LONGITUDE);
	}
	
	public String getCurrentAddress(){
		return getPropertyByName(LocationSelectorFieldConfigType.LOCNFD_CURRENT_ADDRESS);
	}
	
	public String getSearchBoxPrimaryCss(){
		return getPropertyByName(LocationSelectorFieldConfigType.LOCNFD_SEARCHBOX_PCLS);
	}
	
	public String getSearchBoxDependentCss(){
		return getPropertyByName(LocationSelectorFieldConfigType.LOCNFD_SEARCHBOX_DCLS);
	}
	
	public String getDoneButtonCss(){
		return getPropertyByName(LocationSelectorFieldConfigType.LOCNFD_SEARCHBOX_DCLS);
	}
	
	public String getCurrentLocationLabelCss(){
		return getPropertyByName(LocationSelectorFieldConfigType.LOCNFD_CURR_LOC_LBL_CSS);
	}
	
	public String getLocationImageCss(){
		return getPropertyByName(LocationSelectorFieldConfigType.LOCNFD_LOCATION_IMG_CSS);
	}
	
}
