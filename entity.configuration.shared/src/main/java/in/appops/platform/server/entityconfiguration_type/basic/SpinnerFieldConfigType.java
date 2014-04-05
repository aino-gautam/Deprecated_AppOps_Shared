package in.appops.platform.server.entityconfiguration_type.basic;

import java.util.logging.Level;
import java.util.logging.Logger;

import in.appops.platform.client.config.client_type.SpinnerFieldConfig;

/**
 * @author pallavi@ensarm.com
 * @createdOn 12-Nov-2013
 */

@SuppressWarnings("serial")
public class SpinnerFieldConfigType extends BaseFieldConfigType{
	
	/** Configurations available **/
	public static final String SP_TYPE = "spinnerType";
	public static final int SP_TYPENUMERIC = 1;
	public static final int SP_TYPELIST = 2;
	public static final String SP_STEP = "step";
	public static final String SP_UNIT = "unit";
	public static final String SP_CIRCULAR = "circular";
	public static final String SP_ALLOWBLNK = "allowBlank";
	public static final String SP_ALLOWDEC = "allowDecimal";
	public static final String SP_ERRMSGMAX = "maxMsg";
	public static final String SP_ERRMSGMIN = "minMsg";
	public static final String SP_ERRMSGNEG = "negMsg";
	public static final String SP_ERRMSGBLNK = "blankMsg";
	public static final String SP_ERRMSGINVLD = "invalidMsg";
	public static final String SP_VALUELIST = "valueList";
	public static final String SP_VALUEIDX = "valueListIndex";
	
	public static final String	SPINNERCONFIG		= "SpinnerFieldConfig";
	
	private Logger logger = Logger.getLogger("SpinnerFieldConfigType");
	
	public SpinnerFieldConfigType() {
		super(false);
		setParentConfigtype(SPINNERCONFIG, false, this.getClass(), BaseFieldConfigType.class, SpinnerFieldConfig.class);
		populateProperties();
	}
	
	@Override
	public void populateProperties() {
		try {
			viewConfigType.addProperty(SP_TYPE, SP_TYPENUMERIC, false, null, null, null);
			viewConfigType.addProperty(SP_STEP, 3, false, null, null, null);
			viewConfigType.addProperty(SP_UNIT, "km", false, null, null, null);
			viewConfigType.addProperty(SP_CIRCULAR, true, false, null, null, null);
			viewConfigType.addProperty(BF_DEFVAL, 25, false, null, null, null);
			viewConfigType.addProperty(BF_ERRPOS, BF_BOTTOM, false, null, null, null);
			viewConfigType.addProperty(SP_ALLOWDEC, false, false, null, null, null);
			viewConfigType.addProperty(BF_VALIDATEONCHANGE, true, false, null, null, null);
			viewConfigType.addProperty(BF_VALUETYPE, "DecimalValueType", false, null, null, null);
			viewConfigType.addProperty(DecimalConfigType.MAX_VALUE, 50, false, null, null, null);
			viewConfigType.addProperty(DecimalConfigType.MIN_VALUE, 15, false, null, null, null);
			viewConfigType.addProperty(SP_VALUELIST, null, false, null, null, null);
			viewConfigType.addProperty(SP_VALUEIDX, 0, false, null, null, null);
			
			viewConfigType.addProperty(SP_ERRMSGMAX, "please check max value for the field", false, null, null, null);
			viewConfigType.addProperty(SP_ERRMSGMIN, "please check min value for the field", false, null, null, null);
			viewConfigType.addProperty(SP_ERRMSGNEG, "Negative value not allowed", false, null, null, null);
			
		} catch (Exception e) {
			logger.log(Level.SEVERE,"[SpinnerFieldConfigType]::Exception In populateProperties  method :"+e);
		}
	}
	
	@Override
	protected void populateAlternateProperties() {
		try {
			super.populateAlternateProperties();
			viewConfigType.addAlternateProperty(SP_TYPE, SP_TYPELIST, false, null, null, null);
		} catch (Exception e) {
			logger.log(Level.SEVERE,"[SpinnerFieldConfigType]::Exception In populateProperties  method :"+e);
		}
	}
	

}
