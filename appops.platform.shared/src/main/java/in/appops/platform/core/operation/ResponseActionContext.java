package in.appops.platform.core.operation;

import in.appops.platform.bindings.web.gwt.dispatch.client.action.StandardAction;

/**
 * 
 * @author nitish@ensarm.com
 * Will be enhanced/modifed as required
 */
public class ResponseActionContext extends ActionContext{
	private StandardAction responseAction;
	
	public StandardAction getResponseAction(){
		return responseAction;
	}
	
	public void setResponseAction(StandardAction responseAction){
		this.responseAction =  responseAction;
	}
}
