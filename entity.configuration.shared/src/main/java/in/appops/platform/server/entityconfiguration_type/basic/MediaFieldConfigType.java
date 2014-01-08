package in.appops.platform.server.entityconfiguration_type.basic;

import java.util.logging.Level;
import java.util.logging.Logger;
import in.appops.platform.client.config.client_type.MediaFieldConfig;

/**
 * @author pallavi@ensarm.com
 * @createdOn 12-Nov-2013
 */

@SuppressWarnings("serial")
public class MediaFieldConfigType extends BaseFieldConfigType{
	
	/** Configurations available **/
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
	private Logger logger = Logger.getLogger("MediaFieldConfigType");
	
	public MediaFieldConfigType() {
		super(true);
		setParentConfigtype(MEDIACONFIG, false, this.getClass(), BaseFieldConfigType.class, MediaFieldConfig.class);
		populateProperties();
	}
	
	@Override
	public void populateProperties() {
		try {
			viewConfigType.addProperty(MF_MEDIAIMG_BLOB, "images/Media.png", false, null, null, null);
			viewConfigType.addProperty(MF_MEDIAIMG_DCLS, "fadeInUp", false, null, null, null);
			viewConfigType.addProperty(MF_MEDIAIMG_PCLS, "mediaImage", false, null, null, null);
			viewConfigType.addProperty(MF_ISPROFILE_IMG, true, false, null, null, null);
			viewConfigType.addProperty(MF_FILEUPLOADER_CLS, "appops-webMediaAttachment", false, null, null, null);
			viewConfigType.addProperty(MF_VALIDEXTEXNSION_LIST, null, false, null, null, null);
			viewConfigType.addProperty(MF_CROSSIMG_BLOBID, "images/crossIconSmall.png", false, null, null, null);
			viewConfigType.addProperty(MF_CROSSIMG_PCLS, null, false, null, null, null);
			viewConfigType.addProperty(MF_ISMEDIAIMG_VISIBLE, true, false, null, null, null);
		} catch (Exception e) {
			logger.log(Level.SEVERE,"[MediaFieldConfigType]::Exception In populateProperties  method :"+e);
		}
	}

}
