package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.DatePickerFieldConfig;

/**
 * @author pallavi@ensarm.com
 * @createdOn 12-Nov-2013
 */

@SuppressWarnings("serial")
public class DatePickerFieldConfigType extends BaseFieldConfigType{
	
	public static final String DP_BXPCLS = "dateBoxPrimaryCss";
	public static final String DP_BXDCLS = "dateBoxDependentCss";
	public static final String DP_MAXDATE = "maxDate";
	public static final String DP_MINDATE = "minDate";
	public static final String DP_FORMAT = "format";
	public static final String DP_ALTFORMAT= "altformat";
	public static final String DP_ALLOWBLNK = "allowBlank";
	public static final String DP_ERRMSGBLNK = "blnktxt";
	public static final String DP_ERRMSGMIN = "minText";
	public static final String DP_ERRMSGMAX = "maxText";
	
	public static final String	DATEPICKERCONFIG		= "DatePickerFieldConfig";
	
	public DatePickerFieldConfigType() {
		super(false);
		setParentConfigtype(DATEPICKERCONFIG, false, this.getClass(), BaseFieldConfigType.class, DatePickerFieldConfig.class);
		populateProperties();
	}
	
	@Override
	protected void populateProperties() {
		viewConfigType.addProperty(BF_DEFVAL, "01.07.2013", false, null, null, null);
		viewConfigType.addProperty(DP_MAXDATE, "03.08.2013", false, null, null, null);
		viewConfigType.addProperty(DP_MINDATE, "05.06.2013", false, null, null, null);
		viewConfigType.addProperty(DP_FORMAT, "dd.MM.yyyy", false, null, null, null);
		viewConfigType.addProperty(DP_ALLOWBLNK, false, false, null, null, null);
		viewConfigType.addProperty(DP_ERRMSGBLNK, "value can not be blank" , false, null, null, null);
		viewConfigType.addProperty(DP_ERRMSGMIN, "please check minimum date" , false, null, null, null);
		viewConfigType.addProperty(DP_ERRMSGMAX, "please check max date", false, null, null, null);
		//populateAlternateProperties();
	}
	
	@Override
	protected void populateAlternateProperties() {
		super.populateAlternateProperties();
	}
	
}
