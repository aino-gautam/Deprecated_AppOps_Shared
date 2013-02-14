/**
 * 
 */
package in.appops.platform.core.util;

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
	private String	msg;
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public AppOpsException() {
		
	}
	
	// TODO needs to evolve.. for now I am getting the dispatch mechanism to work
	public AppOpsException(String msg) {
		//temporary
		System.out.println(msg);
		this.msg = msg;
	}
	
}
