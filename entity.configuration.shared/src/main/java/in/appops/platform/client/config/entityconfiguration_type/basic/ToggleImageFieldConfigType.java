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
		setParentConfigtype(TOGGLEIMAGECONFIG, false, this.getClass(), BaseFieldConfigType.class, ToggleImageFieldConfig.class);
	}
	
	@Override
	public void populateProperties() {
		ViewConfigType viewConfigType = new ViewConfigType();
		viewConfigType.addProperty(TIMGFD_UPSTATE_URL, "images/disclosureRightArrow.png", false, null, null, null);
		viewConfigType.addProperty(TIMGFD_UPSTATE_TITLE,"down", false, null, null, null);
		viewConfigType.addProperty(TIMGFD_DWNSTATE_URL, "images/disclosureDownArrow.png", false, null, null, null);
		viewConfigType.addProperty(TIMGFD_DWNSTATE_TITLE,"up", false, null, null, null);
		viewConfigType.addProperty(TIMGFD_STATEIMG_PCLS,"toggleImageFieldPreview", false, null, null, null);
		
		addProperty(MODEL, new ModelConfigType());
		addProperty(PRESENTER, new PresenterConfigType());
		addProperty(VIEW, viewConfigType);
	}
}
