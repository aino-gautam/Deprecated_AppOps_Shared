package in.appops.platform.client.config.client_type;

import in.appops.platform.client.config.entityconfiguration_type.basic.IntegerConfigType;
import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.core.shared.Configuration;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */

@SuppressWarnings("serial")
public class IntegerConfig extends Configuration {
	
	public IntegerConfig() {
		super.setType(new MetaType(IntegerConfig.class));
	}
	
	/**
	 * The minimum value permitted for eg. 0 
	 * @return
	 */
	public Integer getMinValue(){
		return (Integer) (getPropertyByName(IntegerConfigType.MIN_VALUE) != null ? getPropertyByName(IntegerConfigType.MIN_VALUE) : Integer.MIN_VALUE);
	}
	
	/**
	 * The maximum value permitted for eg. 1000
	 * @return
	 */
	public Integer getMaxValue(){
		return (Integer) (getPropertyByName(IntegerConfigType.MAX_VALUE) != null ? getPropertyByName(IntegerConfigType.MAX_VALUE) : Integer.MAX_VALUE);
	}
	
	/**
	 * Whether negative values are allowed or not. 
	 * @return true if allowed, 0 if not.
	 */
	public Boolean isSigned(){
		return getPropertyByName(IntegerConfigType.IS_SIGNED);
	}
}
