package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.ImageFieldConfig;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */

@SuppressWarnings("serial")
public class ImageFieldConfigType extends BaseFieldConfigType {
	
	public static final String IMGFD_TITLE = "title";
	public static final String IMGFD_BLOBID = "blobId";
	public static final String	IMAGE		= "ImageFieldConfig";
	
	public ImageFieldConfigType() {
		setParentConfigtype(IMAGE, false, this.getClass(), BaseFieldConfigType.class, ImageFieldConfig.class);
	}
	
	@Override
	public void populateProperties() {

		ViewConfigType viewConfigType = new ViewConfigType();
		viewConfigType.addProperty(IMGFD_TITLE, "User", false, null, null, null);
		viewConfigType.addProperty(IMGFD_BLOBID, "images/userIcon.jpg", false, null, null, null);
		
		addProperty(MODEL, new ModelConfigType());
		addProperty(PRESENTER, new PresenterConfigType());
		addProperty(VIEW, viewConfigType);
	}
	
}
