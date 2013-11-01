package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.BaseFieldConfig;
import in.appops.platform.client.config.client_type.TextFieldConfig;
import in.appops.platform.client.config.entityconfiguration_type.ConfigType;

@SuppressWarnings("serial")
public class TextFieldConfigType extends ConfigType {
	
	public static final String TF_VISLINES = "visibleLines";
	public static final String TF_CHARWIDTH = "charWidth";
	public static final String TF_TYPE = "fieldType";
	public static final String TFTYPE_TXTBOX = "txtbox";
	public static final String TFTYPE_PSWBOX = "passowrdTxtbox";
	public static final String TFTTYPE_TXTAREA = "txtarea";
	public static final String TFTYPE_EMAILBOX = "emailbox";
	public static final String TFTYPE_NUMERIC = "numeric";
	public static final String MIN_LEGTH_ERROR_TEXT = "minLengthErrorText";
	public static final String INVALID_EMAIL_TEXT = "invalidEmailText";
	public static final String EMAIL_REGEX = "emailRegex";
	public static final String ALLOWDEC = "allowDecimal";
	public static final String PROPERTY_BY_FIELD_NAME = "propertyByFieldName";
	public static final String DEC_PRECISION = "decPrecision";
	public static final String MAX_VALUE_TEXT = "maxValueText";
	public static final String MIN_VALUE_TEXT = "minValueText";
	public static final String NEGATIVE_VALUE_TEXT = "negativevalTxt";
	public static final String VALIDATEFIELD = "validateField";
	
	public static final String	TEXTFIELD		= "TextFieldConfig";
	
	public TextFieldConfigType() {
		setParentConfigtype(TEXTFIELD, false, this.getClass(), BaseFieldConfig.class, TextFieldConfig.class);
		addProperty(TF_VISLINES, 5, false, null, null, null);
		addProperty(TF_CHARWIDTH, 100, false, null, null, null);
		addProperty(TF_TYPE, TFTYPE_TXTBOX, false, null, null, null);
		addProperty(MIN_LEGTH_ERROR_TEXT, "Enter minimum required characters", false, null, null, null);
		addProperty(INVALID_EMAIL_TEXT, "Invalid email", false, null, null, null);
		addProperty(EMAIL_REGEX, "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$", false, null, null, null);
		addProperty(ALLOWDEC, false, false, null, null, null);
		addProperty(DEC_PRECISION, 2, false, null, null, null);
		addProperty(MAX_VALUE_TEXT, "Value exceeds max value", false, null, null, null);
		addProperty(MIN_VALUE_TEXT, "Value less than min value for the field ", false, null, null, null);
	}
	
	
}
