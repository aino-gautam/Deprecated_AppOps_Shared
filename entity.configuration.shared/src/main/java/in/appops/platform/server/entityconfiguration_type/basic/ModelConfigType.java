package in.appops.platform.server.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.ModelConfig;
import in.appops.platform.server.entityconfiguration_type.ConfigType;

/**
 * @author pallavi@ensarm.com
 */

@SuppressWarnings("serial")
public class ModelConfigType extends ConfigType{
	
	public static final String	OPERATIONNAME		= "operationname";
	public static final String	OPERATIONPARAM		= "operationParam";
	public static final String	QUERYNAME		= "queryname";
	public static final String	QUERYPARAM		= "queryParam";
	
	public static final String	MODEL		= "ModelConfig";
	
	public ModelConfigType() {
		setParentConfigtype(MODEL, false, this.getClass(), null, ModelConfig.class);
	}
}
