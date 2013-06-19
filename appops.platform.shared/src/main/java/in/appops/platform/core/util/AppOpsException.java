/**
 * 
 */
package in.appops.platform.core.util;

import in.appops.platform.bindings.web.gwt.dispatch.client.action.StandardAction;
import in.appops.platform.core.entity.Entity;

import com.google.common.annotations.GwtCompatible;

/**
 * @author Debasish Padhy Created it on 16-Aug-2012
 * Represents the base class of all exceptions 
 * 
 */
@SuppressWarnings("serial")
@GwtCompatible
public class AppOpsException extends Exception {
	
	// TODO lots need to be done here to make exception handling an easy job.
	
	/**
	 * ###################### On the client side 
	 * 
	 * Error messages to be displayed to user should be a part of the object
	 * 
	 * All user specific messages auto flash notification
	 * 
	 * System crash should flash a feedback panel on client end. 
	 * 
	 * ################################### On server
	 * 
	 * IsService failures should be auto logged into an logging service
	 * 
	 * Specific Failures should generate admin level alerts as suitable 
	 * 
	 * It should be possible to build an alert/dashboard mechanism from error messages configured through intelligent search
	 * 
	 * It should be possible to attempt a recovery mechanism for specific failures. 
	 * 
	 * We should be able to map exceptions to operations.	
	 * 
	 */
	private String			causeName;
	private String			msg;
	private Entity			actionContext;
	private StandardAction	standardAction;
	
	public AppOpsException() {
		
	}
	
	public AppOpsException(Entity actionContext, StandardAction standardAction, String cause, String msg) {
		this.causeName = cause;
		this.msg = msg;
		this.actionContext = actionContext;
		this.standardAction = standardAction;
	}
	
	public AppOpsException(Entity actionContext, String cause, String msg) {
		this.causeName = cause;
		this.msg = msg;
		this.actionContext = actionContext;
	}
	
	public AppOpsException(String msg) {
		this.msg = msg;
	}
	
	// TODO needs to evolve.. for now I am getting the dispatch mechanism to work
	public AppOpsException(String cause, String msg) {
		this.causeName = cause;
		this.msg = msg;
	}
	
	public Entity getActionContext() {
		return actionContext;
	}
	
	public String getCauseName() {
		return causeName;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public StandardAction getStandardAction() {
		return standardAction;
	}
	
	public void setActionContext(Entity actionContext) {
		this.actionContext = actionContext;
	}
	
	public void setCauseName(String cause) {
		this.causeName = cause;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void setStandardAction(StandardAction standardAction) {
		this.standardAction = standardAction;
	}
	
}
