package in.appops.platform.core.operation;

import in.appops.platform.core.entity.Entity;

/**
 * 
 * @author nitish@ensarm.com
 * Will be enhanced/modifed as required
 */
public class ResponseActionContext extends ActionContext{
	private Entity responseEntity;

	public Entity getResponseEntity() {
		return responseEntity;
	}

	public void setResponseEntity(Entity responseEntity) {
		this.responseEntity = responseEntity;
	}
	
}
