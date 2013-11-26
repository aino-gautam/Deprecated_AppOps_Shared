package in.appops.platform.server.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.LinkFieldConfig;

import java.util.logging.Level;
import java.util.logging.Logger;

@SuppressWarnings("serial")
public class LinkFieldConfigType extends BaseFieldConfigType {
	
	/** Configurations available **/
	public static final String LNK_TYPE = "LinkType";
	public static final String LNKTYPE_HYPERLINK = "Hyperlink";
	public static final String LNKTYPE_ANCHOR = "Anchor";
	public static final String LNK_DISPLAYTEXT = "displayText";
	public static final String LNK_TITLE = "title";
	public static final String LNK_HISTORYTOKEN = "historyToken";
	public static final String LNK_HREF = "href";
	public static final String LNK_TARGET_FRAME = "targetFrame";
	
	public static final String	LINK		= "LinkFieldConfig";
	private Logger logger = Logger.getLogger("LinkFieldConfigType");
	
	public LinkFieldConfigType() {
		super(true);
		setParentConfigtype(LINK, false, this.getClass(), BaseFieldConfigType.class, LinkFieldConfig.class);
		populateProperties();
	}
	
	@Override
	protected void populateProperties(){
		try {
			viewConfigType.addProperty(LNK_TYPE, LNKTYPE_ANCHOR, false, null, null, null);
			viewConfigType.addProperty(LNK_DISPLAYTEXT, null, false, null, null, null);
			viewConfigType.addProperty(LNK_TITLE, "", false, null, null, null);
			viewConfigType.addProperty(LNK_HISTORYTOKEN, LNK_HREF, false, null, null, null);
			viewConfigType.addProperty(BF_BINDPROP, null, false, null, null, null);
			//populateAlternateProperties();
		} catch (Exception e) {
			logger.log(Level.SEVERE,"[LinkFieldConfigType]::Exception In populateProperties  method :"+e);
		}
	}
	
	@Override
	protected void populateAlternateProperties() {
		try {
			viewConfigType.addAlternateProperty(LNK_TYPE, LNKTYPE_HYPERLINK, false, null, null, null);
			viewConfigType.addAlternateProperty(LNK_HISTORYTOKEN, LNK_TARGET_FRAME, false, null, null, null);
		} catch (Exception e) {
			logger.log(Level.SEVERE,"[LinkFieldConfigType]::Exception In populateAlternateProperties  method :"+e);
		}
	}

}
