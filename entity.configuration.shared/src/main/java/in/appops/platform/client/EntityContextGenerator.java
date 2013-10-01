package in.appops.platform.client;

import java.io.Serializable;

import in.appops.platform.core.entity.Entity;

public class EntityContextGenerator implements Serializable {
	private static String	buffer	= new String();
	
	public EntityContextGenerator() {
	}
	
	public static EntityContext defineContext(Entity entity, Long parentcontextId) {
		EntityContext context = new EntityContext(entity, parentcontextId);
		return context;
	}
	
	public static String getEntityContextString(EntityContext context) {
		generateEntityContext(context);
		buffer = buffer.substring(1);
		return buffer;
	}
	
	private static void generateEntityContext(EntityContext context) {
		EntityContext currentContext = context;
		buffer = addTobuffer(currentContext);
		if (currentContext.getParentContext() != null) {
			currentContext = currentContext.getParentContext();
			generateEntityContext(currentContext);
		}
	}
	
	private static String addTobuffer(EntityContext currentContext) {
		String str = ":" + currentContext.getContextId();
		buffer = str.concat(buffer);
		return buffer;
	}
}
