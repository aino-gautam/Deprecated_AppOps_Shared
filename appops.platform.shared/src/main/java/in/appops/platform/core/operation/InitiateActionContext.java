package in.appops.platform.core.operation;

import java.util.ArrayList;

/**
 * 
 * @author nitish@ensarm.com
 * Will be enhanced/modifed as required
 */
public class InitiateActionContext extends ActionContext{
	private final String MEDIA = "media";
	private final String INTELLITHOUGHT = "intelliThought";

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

}
