package in.appops.platform.server.entityconfiguration_type.basic;

import java.util.logging.Level;
import java.util.logging.Logger;

import in.appops.platform.client.config.client_type.ImageFieldConfig;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */

@SuppressWarnings("serial")
public class ImageFieldConfigType extends BaseFieldConfigType {
	
	/**Configurations available **/
	public static final String IMGFD_TITLE = "title";
	public static final String IMGFD_BLOBID = "blobId";
	public static final String	IMAGE		= "ImageFieldConfig";
	
	private Logger logger = Logger.getLogger("ImageFieldConfigType");
	
	public ImageFieldConfigType() {
		super(true);
		setParentConfigtype(IMAGE, false, this.getClass(), BaseFieldConfigType.class, ImageFieldConfig.class);
		populateProperties();
	}
	
	@Override
	public void populateProperties() {
		try {
			viewConfigType.addProperty(IMGFD_TITLE, "User", false, null, null, null);
			viewConfigType.addProperty(IMGFD_BLOBID, "images/userIcon.jpg", false, null, null, null);
		} catch (Exception e) {
			logger.log(Level.SEVERE,"[ImageFieldConfigType]::Exception In populateProperties  method :"+e);
		}
	}
	
}
