package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.ToggleImageFieldConfig;

/**
 * @author pallavi@ensarm.com
 * @createdOn 11-Nov-2013
 */
@SuppressWarnings("serial")
public class ToggleImageFieldConfigType extends BaseFieldConfigType{
	
	public static final String TIMGFD_UPSTATE_URL = "upStateUrl";
	public static final String TIMGFD_DWNSTATE_URL = "downStateUrl";
	public static final String TIMGFD_UPSTATE_TITLE = "upStateTitle";
	public static final String TIMGFD_DWNSTATE_TITLE = "downStateTitle";
	public static final String TIMGFD_STATEIMG_PCLS = "stateImgPrimaryCss";
	public static final String TIMGFD_STATEIMG_DCLS = "stateImgDependentCss";
	
	public static final String	TOGGLEIMAGECONFIG		= "ToggleImageFieldConfig";
	
	public ToggleImageFieldConfigType() {
		setParentConfigtype(TOGGLEIMAGECONFIG, false, this.getClass(), null, ToggleImageFieldConfig.class);
		addProperty(TIMGFD_UPSTATE_URL, "images/pinkHeart.jpg", false, null, null, null);
		addProperty(TIMGFD_UPSTATE_TITLE,"unlike", false, null, null, null);
		addProperty(TIMGFD_DWNSTATE_URL, "images/grayHeart.jpg", false, null, null, null);
		addProperty(TIMGFD_DWNSTATE_TITLE,"like", false, null, null, null);
		addProperty(TIMGFD_STATEIMG_PCLS,"toggleImageCss", false, null, null, null);
	}

}
