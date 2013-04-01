/**
 * 
 */
package in.appops.platform.bindings.web.gwt.dispatch.client.action;

import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.core.entity.type.Type;

import java.util.Map;

/**
 * @author Debasish Padhy Created it on 19-Sep-2012
 * 
 */
@SuppressWarnings({ "serial", "rawtypes", "unchecked" })
public class StandardAction implements Action {
	
	private String	actionName	= null;
	private Map		map			= null;
	private Type	type		= null;
	
	public StandardAction() {
		
	}
	
	public StandardAction(Class tp, String action, Map parameters) {
		type = new MetaType(tp);
		actionName = action;
		map = parameters;
	}
	
	public String getActionName() {
		return actionName;
	}
	
	public Map getParameters() {
		
		return map;
	}
	
	public Type getParentType() {
		return type;
	}
	
	public void setParameters(Map parameters) {
		map = parameters;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see in.appops.platform.bindings.web.gwt.dispatch.client.action.Action#useDefaultHandler()
	 */
	
	public boolean useDefaultHandler() {
		// TODO Auto-generated method stub
		return false;
	}
};
