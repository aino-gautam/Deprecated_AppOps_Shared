package in.appops.platform.client.config.client_type;

import in.appops.platform.client.config.entityconfiguration_type.basic.IntellithoughtFieldConfigType;
import in.appops.platform.client.config.entityconfiguration_type.basic.QueryThoughtFieldConfigType;
import in.appops.platform.core.entity.Entity;
import in.appops.platform.core.entity.type.MetaType;

/**
 * @author pallavi@ensarm.com
 * @createdOn 12-Nov-2013
 */

@SuppressWarnings("serial")
public class QueryThoughtFieldConfig extends IntellithoughtFieldConfig{
	
	public QueryThoughtFieldConfig() {
		setType(new MetaType(QueryThoughtFieldConfig.class));
	}
	
	public Entity getSchemaEntity(){
		return getPropertyByName(QueryThoughtFieldConfigType.QRYTHOUGHT_SCHEMA);
	}
	
	public Entity getServiceEntity(){
		return getPropertyByName(QueryThoughtFieldConfigType.QRYTHOUGHT_SERVICE);
	}

}
