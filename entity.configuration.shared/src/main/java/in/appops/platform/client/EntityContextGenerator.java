package in.appops.platform.client;

import java.io.Serializable;

import in.appops.platform.core.entity.Entity;

public class EntityContextGenerator implements Serializable {
	
	public EntityContextGenerator() {
	}
	
	public static EntityContext defineContext(Entity entity, Long parentcontextId) {
		EntityContext context = new EntityContext(entity, parentcontextId);
		return context;
	}
	
	public static String getEntityContextString(EntityContext context) {
		return context.getEntityContextString();
	}
		
}
