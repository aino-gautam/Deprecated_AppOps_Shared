/**
 * 
 */
package in.appops.platform.core.entity.broadcast;

import java.util.Date;

import in.appops.platform.core.entity.Entity;

/**
 * @author mahesh@ensarm.com	
 * Entity to wrap the entity to broadcast and some basic details like
 * Who initiated the broadcast and when it was initiated and also
 * whether its an update or delete or new entity. 
 */
public class BroadcastEntity extends Entity{
	
	private String ISUPDATE = "isUpdate";
	private String ISDELETE = "isDelete";
	private String ISCREATED = "isCreated";
	private String BROADCASTEDBY = "broadcastedBy";
	private String BROADCASTTIME = "broadcastTime";
	private String BROADCASTENTITY = "broadcastEntity";
	private String SERVICE = "service";
	private String ISNEARBYBROADCAST = "isNearByBroadCast";
	
	public Boolean getIsNearByBroadCast(){
		return getPropertyByName(ISNEARBYBROADCAST);
	}
	
	public void setIsNearByBroadCast(Boolean value){
		setPropertyByName(ISNEARBYBROADCAST, value);
	}
	
	public void setService(Entity value){
		setPropertyByName(SERVICE, value);
	}
	
	public Entity getService(){
		return getPropertyByName(SERVICE);
	}
	
	public void setIsUpadte(Boolean value){
		setPropertyByName(ISUPDATE, value);
	}
	
	public Boolean getIsUpadte(){
		return getPropertyByName(ISUPDATE);
	}
	
	public void setIsDelete(Boolean value){
		setPropertyByName(ISDELETE, value);
	}
	
	public Boolean getIsDelete(){
		return getPropertyByName(ISDELETE);
	}
	
	public void setIsCreated(Boolean value){
		setPropertyByName(ISCREATED, value);
	}
	
	public Boolean getIsCreated(){
		return getPropertyByName(ISCREATED);
	}
	
	public void setBrocastedBy(Entity value){
		setPropertyByName(BROADCASTEDBY, value);
	}
	
	public Entity getBrocastedBy(){
		return getPropertyByName(BROADCASTEDBY);
	}
	
	public void setBroadcastTime(Date value){
		setPropertyByName(BROADCASTTIME, value);
	}
	
	public Date getBroadcastTime(){
		return getPropertyByName(BROADCASTTIME);
	}
	
	public void setBroadcastEntity(Entity value){
		setPropertyByName(BROADCASTENTITY, value);
	}
	
	public Entity getBroadcastEntity(){
		return getPropertyByName(BROADCASTENTITY);
	}
}
