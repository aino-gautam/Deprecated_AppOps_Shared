package in.appops.platform.client.config.entityconfiguration_type.basic;

import java.util.logging.Level;
import java.util.logging.Logger;

import in.appops.platform.client.config.client_type.LabelFieldConfig;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */
@SuppressWarnings("serial")
public class LabelFieldConfigType extends BaseFieldConfigType {
	
	public static final String LBLFD_ISWORDWRAP = "isWordWrap";
	public static final String LBLFD_DISPLAYTXT = "displayTxt";
	public static final String LBLFD_TITLE = "title";
	public static final String	LABEL		= "LabelFieldConfig";
	private Logger logger = Logger.getLogger("LabelFieldConfigType");
	
	public LabelFieldConfigType() {
		super(true);
		setParentConfigtype(LABEL, false, this.getClass(), BaseFieldConfigType.class, LabelFieldConfig.class);
		populateProperties();
	}
	
	@Override
	public void populateProperties() {
		try {
			viewConfigType.addProperty(LBLFD_ISWORDWRAP, true, false, null, null, null);
			viewConfigType.addProperty(LBLFD_DISPLAYTXT, "I am a Label Field", false, null, null, null);
			viewConfigType.addProperty(LBLFD_TITLE, 500, false, null, null, null);
			viewConfigType.addProperty(BF_PCLS, "labelFieldPreview", false, null, null, null);
			viewConfigType.addProperty(BF_BINDPROP, null, false, null, null, null);
		} catch (Exception e) {
			logger.log(Level.SEVERE,"[LabelFieldConfigType]::Exception In populateProperties  method :"+e);
		}
	}
}
