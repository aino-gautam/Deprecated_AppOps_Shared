package in.appops.platform.client.config.client_type;

import in.appops.platform.client.config.entityconfiguration_type.basic.ImageFieldConfigType;
import in.appops.platform.core.entity.type.MetaType;

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
