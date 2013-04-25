package in.appops.platform.core.operation;

import in.appops.platform.bindings.web.gwt.dispatch.client.action.StandardAction;
import in.appops.platform.core.entity.Entity;

import java.io.Serializable;


/**
 * @author nitish@ensarm.com
 */
public interface IActionContext extends Serializable{
	String SOURCE = "source";
	String SPACE = "space";
	String ACTION = "action";
	
	Entity getSource();
	void setSource(Entity source);
	
	Entity getSpace();
	void setSpace(Entity space);

	Entity getActionEntity();
	void setActionEntity(Entity action);

	StandardAction getEmbeddedAction();
	void setEmbeddedAction(StandardAction embeddedAction);
}
