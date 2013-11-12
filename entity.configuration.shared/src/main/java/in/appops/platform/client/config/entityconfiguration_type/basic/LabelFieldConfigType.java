package in.appops.platform.client.config.entityconfiguration_type.basic;

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
	
	public LabelFieldConfigType() {
		setParentConfigtype(LABEL, false, this.getClass(), BaseFieldConfigType.class, LabelFieldConfig.class);
		addProperty(LBLFD_ISWORDWRAP, true, false, null, null, null);
		addProperty(LBLFD_DISPLAYTXT, "Label Text", false, null, null, null);
		addProperty(LBLFD_TITLE, 500, false, null, null, null);
	}
	
}
