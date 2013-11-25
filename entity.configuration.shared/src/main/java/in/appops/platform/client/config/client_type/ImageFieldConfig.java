package in.appops.platform.client.config.client_type;

import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.server.entityconfiguration_type.basic.ImageFieldConfigType;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */
@SuppressWarnings("serial")
public class ImageFieldConfig extends BaseFieldConfig {
	
	public ImageFieldConfig() {
		super.setType(new MetaType(ImageFieldConfig.class));
	}
	
	public String getImageBlobId(){
		return getPropertyByName(ImageFieldConfigType.IMGFD_BLOBID);
	}
	
	public Integer getImageTitleText(){
		return getPropertyByName(ImageFieldConfigType.IMGFD_TITLE);
	}
}
