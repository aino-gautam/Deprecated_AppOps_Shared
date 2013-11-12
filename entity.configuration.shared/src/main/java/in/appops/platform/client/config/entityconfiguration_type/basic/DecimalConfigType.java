package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.DecimalConfig;
import in.appops.platform.client.config.entityconfiguration_type.ConfigType;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */

public class DecimalConfigType extends ConfigType {
	
	private static final long serialVersionUID = 1L;
	public static final String MAX_VALUE = "maxValue";
	public static final String MIN_VALUE = "minValue";
	public static final String IS_SIGNED = "isSigned";
	public static final String PRECISION = "precision";
	public static final String	DECIMAL		= "DecimalConfig";
	
	public DecimalConfigType() {
		setParentConfigtype(DECIMAL, false, this.getClass(), null, DecimalConfig.class);
		addProperty(MAX_VALUE, 1000, false, null, null, null);
		addProperty(MIN_VALUE, 0, false, null, null, null);
		addProperty(IS_SIGNED, false, false, null, null, null);
		addProperty(PRECISION, 2, false, null, null, null);
	}
	
	/**
	 * The minimum value permitted for eg. 0 
	 * @return
	 */
	public Float getMinValue() {
		return (Float) (getPropertyByName(MIN_VALUE) != null ? getPropertyByName(MIN_VALUE) : Float.MIN_VALUE);
	}
	
	/**
	 * The maximum value permitted for eg. 1000
	 * @return
	 */
	public Float getMaxValue() {
		return (Float) (getPropertyByName(MAX_VALUE) != null ? getPropertyByName(MAX_VALUE) : Float.MAX_VALUE);
	}
	
	/**
	 * Whether negative values are allowed or not. 
	 * @return true if allowed, 0 if not.
	 */
	public Boolean isSigned() {
		return getPropertyByName(IS_SIGNED);
	}
	
	public Integer getPrecision() {
		return  (Integer) (getPropertyByName(PRECISION) != null ? getPropertyByName(PRECISION) : 0);
	}
	
	
}
