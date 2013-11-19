package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.MediaFieldConfig;

/**
 * @author pallavi@ensarm.com
 * @createdOn 12-Nov-2013
 */

@SuppressWarnings("serial")
public class MediaFieldConfigType extends BaseFieldConfigType{
	
	public static final String MF_MEDIAIMG_BLOB = "blobId";
	public static final String MF_MEDIAIMG_PCLS = "mediaImagePrimaryCss";
	public static final String MF_MEDIAIMG_DCLS = "mediaImageDependentCss";
	public static final String MF_ISPROFILE_IMG = "isProfileImg";
	public static final String MF_VALIDEXTEXNSION_LIST = "extensionList";
	public static final String MF_FILEUPLOADER_CLS = "fileUploadPanelCss";
	public static final String MF_CROSSIMG_BLOBID = "crossImageBlobId";
	public static final String MF_CROSSIMG_PCLS = "crossImageCss";
	public static final String MF_ISMEDIAIMG_VISIBLE = "isMediaImageVisible";
	
	public static final String	MEDIACONFIG		= "MediaFieldConfig";
	
	public MediaFieldConfigType() {
		setParentConfigtype(MEDIACONFIG, false, this.getClass(), BaseFieldConfigType.class, MediaFieldConfig.class);
	}
	
	@Override
	public void populateProperties() {
		ViewConfigType viewConfigType = new ViewConfigType();
		viewConfigType.addProperty(MF_MEDIAIMG_BLOB, "images/Media.png", false, null, null, null);
		viewConfigType.addProperty(MF_MEDIAIMG_DCLS, "fadeInUp", false, null, null, null);
		viewConfigType.addProperty(MF_MEDIAIMG_PCLS, "mediaImage", false, null, null, null);
		viewConfigType.addProperty(MF_ISPROFILE_IMG, true, false, null, null, null);
		viewConfigType.addProperty(MF_FILEUPLOADER_CLS, "appops-webMediaAttachment", false, null, null, null);
		
		addProperty(MODEL, new ModelConfigType());
		addProperty(VIEW, viewConfigType);
		addProperty(PRESENTER, new PresenterConfigType());
	}

}
