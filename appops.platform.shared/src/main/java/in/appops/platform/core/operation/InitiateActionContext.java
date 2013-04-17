package in.appops.platform.core.operation;

import java.util.ArrayList;

/**
 * 
 * @author nitish@ensarm.com
 * Will be enhanced/modifed as required
 */
public class InitiateActionContext extends ActionContext {
	public static final String	MEDIA			= "media";
	public static final String	INTELLITHOUGHT	= "intelliThought";
	public static final String	ACTION			= "action";
	
	public ArrayList<String> getUploadedMedia() {
		return getPropertyByName(MEDIA);
	}
	
	public void setUploadedMedia(ArrayList<String> uploadedMedia) {
		setPropertyByName(MEDIA, uploadedMedia);
	}
	
	public IntelliThought getIntelliThought() {
		return getPropertyByName(INTELLITHOUGHT);
	}
	
	public void setIntelliThought(IntelliThought intelliThought) {
		setPropertyByName(INTELLITHOUGHT, intelliThought);
	}
	
	public void setAction(String action) {
		setPropertyByName(ACTION, action);
	}
	
	public String getAction() {
		return getPropertyByName(ACTION);
	}
	
}
