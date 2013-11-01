package in.appops.platform.client;

import in.appops.platform.core.entity.Entity;

import java.io.Serializable;

public class EntityContext implements Serializable {
	private String			buffer	= new String();
	private String			contextId;
	private Entity			contextforEntity;
	private EntityContext	parentContext;
	
	public EntityContext() {
		
	}
	
	public EntityContext(Entity entity, Long parentContextId) {
		this.contextId = parentContextId.toString();
		if (entity != null)
			this.contextforEntity = entity;
	}
	
	public EntityContext defineContext(Long parentContextId) {
		EntityContext context = new EntityContext(null, parentContextId);
		parentContext = context;
		return context;
	}
	
	public String getContextId() {
		return contextId;
	}
	
	public void setContextId(String contextId) {
		this.contextId = contextId;
	}
	
	public Entity getContextforEntity() {
		return contextforEntity;
	}
	
	public void setContextforEntity(Entity contextforEntity) {
		this.contextforEntity = contextforEntity;
	}
	
	public EntityContext getParentContext() {
		return parentContext;
	}
	
	public void setParentContext(EntityContext parentContext) {
		this.parentContext = parentContext;
	}
	
	public String getEntityContextString() {
		generateEntityContext(this);
		buffer = buffer.substring(1);
		return buffer;
	}
	
	private void generateEntityContext(EntityContext context) {
		EntityContext currentContext = context;
		buffer = addTobuffer(currentContext);
		if (currentContext.getParentContext() != null) {
			currentContext = currentContext.getParentContext();
			generateEntityContext(currentContext);
		}
	}
	
	private String addTobuffer(EntityContext currentContext) {
		String str = ":" + currentContext.getContextId();
		buffer = str.concat(buffer);
		return buffer;
	}
	
}
