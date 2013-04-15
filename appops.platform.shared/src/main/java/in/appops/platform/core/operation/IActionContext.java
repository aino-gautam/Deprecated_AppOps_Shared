package in.appops.platform.core.operation;

import java.io.Serializable;

import in.appops.platform.bindings.web.gwt.dispatch.client.action.StandardAction;
import in.appops.platform.core.entity.Entity;


/**
 * @author nitish@ensarm.com
 */
public interface IActionContext extends Serializable{
	String SOURCE = "source";
	String SPACE = "space";
	
	Entity getSource();
	void setSource(Entity source);
	
	Entity getSpace();
	void setSpace(Entity space);
	
	StandardAction getEmbeddedAction();
	void setEmbeddedAction(StandardAction embeddedAction);
}
