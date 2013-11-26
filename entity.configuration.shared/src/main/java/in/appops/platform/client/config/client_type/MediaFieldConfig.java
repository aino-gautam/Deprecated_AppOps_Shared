package in.appops.platform.client.config.client_type;

import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.server.entityconfiguration_type.basic.MediaFieldConfigType;

/**
 * @author pallavi@ensarm.com
 * @createdOn 12-Nov-2013
 */

@SuppressWarnings("serial")
public class MediaFieldConfig extends BaseFieldConfig{
	
	public MediaFieldConfig() {
		setType(new MetaType(MediaFieldConfig.class));
	}
	
	public String getMediaImageBlobId(){
		return getPropertyByName(MediaFieldConfigType.MF_MEDIAIMG_BLOB);
	}
	
	public String getMediaImagePrimaryCss(){
		return getPropertyByName(MediaFieldConfigType.MF_MEDIAIMG_PCLS);
	}
	
	public String getMediaImageDependentCss(){
		return getPropertyByName(MediaFieldConfigType.MF_MEDIAIMG_DCLS);
	}
	
	public Boolean isProfileImage(){
		return getPropertyByName(MediaFieldConfigType.MF_ISPROFILE_IMG);
	}
	
	public String getValidExtentionList(){
		return getPropertyByName(MediaFieldConfigType.MF_VALIDEXTEXNSION_LIST);
	}
	
	public String getFileUploaderPanelCss(){
		return getPropertyByName(MediaFieldConfigType.MF_FILEUPLOADER_CLS);
	}
	
	public String getCrossImageBlobId(){
		return getPropertyByName(MediaFieldConfigType.MF_CROSSIMG_BLOBID);
	}
	
	public String getCrossImageCss(){
		return getPropertyByName(MediaFieldConfigType.MF_CROSSIMG_PCLS);
	}
	
	public Boolean isMediaImageVisible(){
		return getPropertyByName(MediaFieldConfigType.MF_ISMEDIAIMG_VISIBLE);
	}
}
