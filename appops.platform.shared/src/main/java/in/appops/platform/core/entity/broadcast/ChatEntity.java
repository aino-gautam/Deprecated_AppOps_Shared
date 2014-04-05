/**
 * 
 */
package in.appops.platform.core.entity.broadcast;

import in.appops.platform.core.entity.Entity;
import in.appops.platform.core.util.EntityList;

import java.util.HashMap;

/**
 * @author mahesh@ensarm.com
 * Domain entity which which contain the reference of :
 * 1. is the entity a group chat
 * 2. who is the user
 * 3. what is header title
 * 4. chat record map for this specific entity. 
 * 5. participantEntity list
 */
public class ChatEntity extends Entity{
	
	private String isGroupChat = "isGroupChat";
	private String spaceGroupEntity = "spaceGroupEntity" ;
	private String participantEntity = "participantEntity";
	private String headerTitle = "headerTitle";
	private String chatRecordMap = "chatRecordMap";
	private String participantContactEntity = "participantContactEntity";
	
	public void setIsGroupChat(Boolean isGroupChat){
		setPropertyByName(this.isGroupChat, isGroupChat);
	}
	
	public Boolean getIsGroupChat(){
		return getPropertyByName(this.isGroupChat);
	}
	
	public void setSpaceEntity(Entity spaceGroupEntity){
		setPropertyByName(this.spaceGroupEntity, spaceGroupEntity);
	}
	
	public Entity getSpaceEntity(){
		return getPropertyByName(this.spaceGroupEntity);
	}
	
	public void setParticipantEntity(EntityList participantEntity){
		setPropertyByName(this.participantEntity, participantEntity);
	}
	
	public EntityList getParticipantEntity(){
		return getPropertyByName(this.participantEntity);
	}
	
	public void setHeaderTitle(String headerTitle){
		setPropertyByName(this.headerTitle, headerTitle);
	}
	
	public String getHeaderTitle(){
		return getPropertyByName(this.headerTitle);
	}
	
	public void setChatRecordMap(HashMap<Long,HashMap<Entity, Entity>>  chatRecordMap){
		setPropertyByName(this.chatRecordMap, chatRecordMap);
	}
	
	public HashMap<Long,HashMap<Entity, Entity>> getChatRecordMap(){
		return getPropertyByName(this.chatRecordMap);
	}
	
	public void setParticipantContactEntity(EntityList participantContactEntity){
		setPropertyByName(this.participantContactEntity, participantContactEntity);
	}
	
	public EntityList getParticipantContactEntity(){
		return getPropertyByName(this.participantContactEntity);
	}
}
