package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.DateLabelFieldConfig;

import java.util.Date;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */

@SuppressWarnings("serial")
public class DateLabelFieldConfigType extends BaseFieldConfigType {
	
	public static final String DTLBL_DSPLY_FORM = "DisplayFormat";
	public static final String LIVETIMESTAMP_DSPLY = "liveTimeStamp";
	public static final String DATETIME_DSPLY = "dateTimeDisplay";
	public static final String DATETIME_FORMAT = "conversionFormat";
	public static final String DATETIME_TO_DISPLAY = "dateTimeToDisplay";
	public static final String IS_TITLE_VISIBLE = "isTitleVisible";
	
	public static final String	DATELABEL		= "DateLabelFieldConfig";
	
	public DateLabelFieldConfigType() {
		setParentConfigtype(DATELABEL, false, this.getClass(), BaseFieldConfigType.class, DateLabelFieldConfig.class);
	}
	
	@Override
	public void populateProperties(){
		ViewConfigType viewConfigType = new ViewConfigType();
		viewConfigType.addProperty(DTLBL_DSPLY_FORM, DATETIME_DSPLY, false, null, null, null);
		//viewConfigType.addAlternateProperty(DTLBL_DSPLY_FORM, LIVETIMESTAMP_DSPLY, false, null, null, null);
		viewConfigType.addProperty(DATETIME_FORMAT, "MMM dd ''yy 'at' HH:mm", false, null, null, null);
		viewConfigType.addProperty(DATETIME_TO_DISPLAY, new Date(), false, null, null, null);
		viewConfigType.addProperty(IS_TITLE_VISIBLE, false, false, null, null, null);
		viewConfigType.addProperty(BF_PCLS, "dateTimelabel", false, null, null, null);
		
		addProperty(MODEL, new ModelConfigType());
		addProperty(PRESENTER, new PresenterConfigType());
		addProperty(VIEW, viewConfigType);
	}
}
