package in.appops.platform.bindings.web.gwt.dispatch.client.action.exception;

/**
 * 
 * @author Debasish Padhy Created it on 26-Apr-2012
 * 
 */

public class ActionException extends DispatchException {

	protected ActionException() {
	}

	public ActionException(String message) {
		super(message);
	}

	public ActionException(Throwable cause) {
		super(cause);
	}

	public ActionException(String message, Throwable cause) {
		super(message, cause);
	}

}
