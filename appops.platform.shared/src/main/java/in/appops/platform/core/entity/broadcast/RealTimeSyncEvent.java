/**
 * 
 */
package in.appops.platform.core.entity.broadcast;

import java.io.Serializable;

import in.appops.platform.core.entity.Entity;


/**
 * @author mahesh@ensarm.com
 *
 */
public class RealTimeSyncEvent implements Serializable{

	private Entity entity;
	
	public RealTimeSyncEvent() {
	}

	public RealTimeSyncEvent(Entity entity) {
		this.entity = entity;
	}

	public Entity getEntity() {
		return entity;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}

}
