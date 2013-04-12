package in.appops.platform.core.operation;

import in.appops.platform.bindings.web.gwt.dispatch.client.action.StandardAction;
import in.appops.platform.core.entity.Entity;

/**
 * @author nitish@ensarm.com
 */
public class ActionContext extends Entity implements IActionContext{
	private StandardAction action;

	@Override
	public Entity getSource() {
		return getPropertyByName(SOURCE);
	}

	@Override
	public void setSource(Entity source) {
		setPropertyByName(SOURCE, source);
	}

	@Override
	public Entity getSpace() {
		return getPropertyByName(SPACE);
	}

	@Override
	public void setSpace(Entity space) {
		setPropertyByName(SPACE, space);
	}

	@Override
	public StandardAction getAction() {
		return action;
	}

	@Override
	public void setAction(StandardAction action) {
		this.action = action;
	}
}
