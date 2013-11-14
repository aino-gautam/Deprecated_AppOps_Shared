package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.QueryThoughtFieldConfig;
import in.appops.platform.core.entity.Entity;
import in.appops.platform.core.entity.Key;
import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.core.schema.SchemaDefinition;
import in.appops.platform.core.shared.Service;

/**
 * @author pallavi@ensarm.com
 * @createdOn 12-Nov-2013
 */

@SuppressWarnings("serial")
public class QueryThoughtFieldConfigType extends IntellithoughtFieldConfigType{
	
	public static final String QRYTHOUGHT_SERVICE = "service";
	public static final String QRYTHOUGHT_SCHEMA = "schema";
	
	public static final String	QUERYTHOUGHTCONFIG		= "QueryThoughtFieldConfig";
	
	public QueryThoughtFieldConfigType() {
		setParentConfigtype(QUERYTHOUGHTCONFIG, false, this.getClass(), IntellithoughtFieldConfigType.class, QueryThoughtFieldConfig.class);
		
		Entity serviceEnt = new Entity();
		serviceEnt.setType(new MetaType(Service.class));
		serviceEnt.setPropertyByName("id", new Key<Long>(27L));
		Entity schemaEnt = new Entity();
		schemaEnt.setType(new MetaType(SchemaDefinition.class));
		schemaEnt.setPropertyByName("id", new Key<Long>(93L));
		
		addProperty(QRYTHOUGHT_SERVICE, serviceEnt, false, null, null, null);
		addProperty(QRYTHOUGHT_SERVICE, serviceEnt, false, null, null, null);
	}

}
