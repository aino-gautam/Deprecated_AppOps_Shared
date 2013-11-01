package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.ImageFieldConfig;
import in.appops.platform.client.config.entityconfiguration_type.ConfigType;

@SuppressWarnings("serial")
public class ImageConfigType extends ConfigType {
	
	public static final String IMGFD_TITLE = "title";
	public static final String IMGFD_BLOBID = "blobId";
	public static final String	IMAGE		= "ImageFieldConfig";
	
	public ImageConfigType() {
		setParentConfigtype(IMAGE, false, this.getClass(), BaseFieldConfigType.class, ImageFieldConfig.class);
		addProperty(IMGFD_TITLE, true, false, null, null, null);
		addProperty(IMGFD_BLOBID, "images/test2.jpg", false, null, null, null);
	}
	
}
