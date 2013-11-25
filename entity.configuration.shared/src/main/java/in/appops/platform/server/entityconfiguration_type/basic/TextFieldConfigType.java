package in.appops.platform.server.entityconfiguration_type.basic;

import java.util.logging.Level;
import java.util.logging.Logger;

import in.appops.platform.client.config.client_type.TextFieldConfig;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */

@SuppressWarnings("serial")
public class TextFieldConfigType extends BaseFieldConfigType {
	
	/** Configurations available **/
	public static final String TF_VISLINES = "visibleLines";
	public static final String TF_CHARWIDTH = "charWidth";
	public static final String TF_TYPE = "fieldType";
	public static final String TFTYPE_TXTBOX = "txtbox";
	public static final String TFTYPE_PSWBOX = "passowrdTxtbox";
	public static final String TFTTYPE_TXTAREA = "txtarea";
	public static final String TFTYPE_EMAILBOX = "emailbox";
	public static final String TFTYPE_NUMERIC = "numeric";
	public static final String INVALID_EMAIL_TEXT = "invalidEmailText";
	public static final String EMAIL_REGEX = "emailRegex";
	public static final String ALLOWDEC = "allowDecimal";
	public static final String PROPERTY_BY_FIELD_NAME = "propertyByFieldName";
	public static final String DEC_PRECISION = "decPrecision";
	public static final String MAX_VALUE_TEXT = "maxValueText";
	public static final String MIN_VALUE_TEXT = "minValueText";
	public static final String NEGATIVE_VALUE_TEXT = "negativeValTxt";
	public static final String VALIDATEFIELD = "validateField";
	public static final String MIN_LEGTH_ERRTXT = "minLengthErrText";
	
	public static final String	TEXTFIELD		= "TextFieldConfig";
	private Logger logger = Logger.getLogger("TextFieldConfigType");
	
	public TextFieldConfigType() {
		super(false);
		setParentConfigtype(TEXTFIELD, false, this.getClass(), BaseFieldConfigType.class, TextFieldConfig.class);
		populateProperties();
	}
	
	@Override
	public void populateProperties() {

    	try {
			viewConfigType.addProperty(BF_PCLS, "textFieldPreview", false, null, null, null);
			viewConfigType.addProperty(TF_VISLINES, 5, false, null, null, null);
			viewConfigType.addProperty(TF_CHARWIDTH, 100, false, null, null, null);
			viewConfigType.addProperty(TF_TYPE, TFTYPE_TXTBOX, false, null, null, null);
			viewConfigType.addProperty(EMAIL_REGEX, "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$", false, null, null, null);
			viewConfigType.addProperty(ALLOWDEC, false, false, null, null, null);
			viewConfigType.addProperty(DEC_PRECISION, 2, false, null, null, null);
			viewConfigType.addProperty(MAX_VALUE_TEXT, "Value exceeds max value", false, null, null, null);
			viewConfigType.addProperty(MIN_VALUE_TEXT, "Value less than min value for the field ", false, null, null, null);
			viewConfigType.addProperty(NEGATIVE_VALUE_TEXT, "Field value cannot be -ve", false, null, null, null);
			viewConfigType.addProperty(MIN_LEGTH_ERRTXT, "Enter minimum required characters", false, null, null, null);
			viewConfigType.addProperty(INVALID_EMAIL_TEXT, "Invalid email", false, null, null, null);
			viewConfigType.addProperty(VALIDATEFIELD, false, false, null, null, null);
			viewConfigType.addProperty(BF_DEFVAL, "This is a text box", false, null, null, null);
			viewConfigType.addProperty(BF_VALUETYPE, "StringValueType", false, null, null, null);
			viewConfigType.addProperty(PROPERTY_BY_FIELD_NAME, null, false, null, null, null);
			
			//	populateAlternateProperties();
		} catch (Exception e) {
			logger.log(Level.SEVERE,"[TextFieldConfigType]::Exception In populateProperties  method :"+e);
		}
		
	}
	
	@Override
	protected void populateAlternateProperties() {
		super.populateAlternateProperties();
		viewConfigType.addAlternateProperty(TF_TYPE, TFTTYPE_TXTAREA, false, null, null, null);
		viewConfigType.addAlternateProperty(TF_TYPE, TFTYPE_EMAILBOX, false, null, null, null);
		viewConfigType.addAlternateProperty(TF_TYPE, TFTYPE_NUMERIC, false, null, null, null);
		viewConfigType.addProperty(TF_TYPE, TFTYPE_PSWBOX, false, null, null, null);
	}
	
	
}
