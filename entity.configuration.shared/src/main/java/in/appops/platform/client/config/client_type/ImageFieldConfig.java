package in.appops.platform.client.config.client_type;

import in.appops.platform.client.config.entityconfiguration_type.basic.ImageConfigType;
import in.appops.platform.core.entity.type.MetaType;

@SuppressWarnings("serial")
public class ImageFieldConfig extends BaseFieldConfig {
	
	public ImageFieldConfig() {
		super.setType(new MetaType(ImageFieldConfig.class));
	}
	
	public String getImageBlobId(){
		return getPropertyByName(ImageConfigType.IMGFD_BLOBID);
	}
	
	public Integer getImageTitleText(){
		return getPropertyByName(ImageConfigType.IMGFD_TITLE);
	}
}
