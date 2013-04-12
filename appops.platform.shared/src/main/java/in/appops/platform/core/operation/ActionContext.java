package in.appops.platform.core.operation;

import in.appops.platform.core.entity.Entity;

/**
 * @author nitish@ensarm.com
 */
public class ActionContext extends Entity implements IActionContext{
	@Override
	public Entity getSource() {
		return (Entity) getProperty(SOURCE);
	}

	@Override
	public void setSource(Entity source) {
		setProperty(SOURCE, source);
	}

	@Override
	public Entity getSpace() {
		return (Entity) getProperty(SPACE);
	}

	@Override
	public void setSpace(Entity space) {
		setProperty(SPACE, space);
	}
}
