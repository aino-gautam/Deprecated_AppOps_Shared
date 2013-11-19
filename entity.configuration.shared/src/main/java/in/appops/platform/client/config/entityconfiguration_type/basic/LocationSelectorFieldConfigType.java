package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.LocationSelectorFieldConfig;

/**
 * @author pallavi@ensarm.com
 * @createdOn 12-Nov-2013
 */
@SuppressWarnings("serial")
public class LocationSelectorFieldConfigType extends BaseFieldConfigType{

	public static final String LOCNFD_SHOWINPOPUP = "isMapInPopup";
	public static final String LOCNFD_POPUP_ICON_BLOB = "blobId";
	public static final String LOCNFD_HEIGHT = "height";
	public static final String LOCFD_WIDTH = "width";
	public static final String LOCNFD_ZOOMLEVEL = "zoomlevel";
	public static final String LOCNFD_LATITUDE = "latitude";
	public static final String LOCNFD_LONGITUDE = "longitude";
	public static final String LOCNFD_CURRENT_ADDRESS = "currentAddress";
	public static final String LOCNFD_SEARCHBOX_PCLS = "searchBoxPrimarycss";
	public static final String LOCNFD_SEARCHBOX_DCLS = "searchBoxDependantcss";
	public static final String LOCNFD_DONEBTN_CSS = "doneBtnCss";
	public static final String LOCNFD_CURR_LOC_LBL_CSS = "currentLocationLabelCss";
	public static final String LOCNFD_LOCATION_IMG_CSS = "locationImageCss";
	public static final String LOCNFD_ERRPOS = "errorPosForInvalidLocation";
	public static final String LOCNFD_INVALID_LOCNMSG = "invalidMsg";
	
	public static final String	LOCATIONSELECTORCONFIG		= "LocationSelectorFieldConfig";
	
	public LocationSelectorFieldConfigType() {
		setParentConfigtype(LOCATIONSELECTORCONFIG, false, this.getClass(), BaseFieldConfigType.class, LocationSelectorFieldConfig.class);
		
		ViewConfigType viewConfigType = new ViewConfigType();
		viewConfigType.addProperty(LOCNFD_ZOOMLEVEL, 8, false, null, null, null);
		viewConfigType.addProperty(LOCFD_WIDTH, "400px", false, null, null, null);
		viewConfigType.addProperty(LOCNFD_HEIGHT, "200px", false, null, null, null);
		viewConfigType.addProperty(LOCNFD_LATITUDE, 18.5398, false, null, null, null);
		viewConfigType.addProperty(LOCNFD_LONGITUDE, 73.9081, false, null, null, null);
		viewConfigType.addProperty(LOCNFD_SHOWINPOPUP, true, false, null, null, null);
		viewConfigType.addProperty(LOCNFD_DONEBTN_CSS, "appops-Button", false, null, null, null);
		viewConfigType.addProperty(LOCNFD_LOCATION_IMG_CSS, "locationImage", false, null, null, null);
		viewConfigType.addProperty(LOCNFD_SEARCHBOX_PCLS, "locationSearchBox", false, null, null, null);
		viewConfigType.addProperty(LOCNFD_SEARCHBOX_DCLS, "fadeInRight", false, null, null, null);
		viewConfigType.addProperty(BF_ERRPOS, BF_ERRINLINE, false, null, null, null);
		viewConfigType.addProperty(BF_INVLDMSG, "Invalid location", false, null, null, null);
		
		addProperty(MODEL, new ModelConfigType());
		addProperty(VIEW, viewConfigType);
		addProperty(PRESENTER, new PresenterConfigType());
	}
}
