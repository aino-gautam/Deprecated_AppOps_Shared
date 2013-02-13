package in.appops.platform.bindings.web.gwt.dispatch.client.action.exception;

import in.appops.platform.core.util.AppOpsException;

import java.io.Serializable;


/**
 * An abstract superclass for exceptions that can be thrown by the Action
 * Dispatch system.
 * 
 */
public abstract class DispatchException extends AppOpsException implements
		Serializable {

	private String causeClassname;

	protected DispatchException() {

	}

	public DispatchException(String message) {
		super(message);
	}

	public DispatchException(Throwable cause) {
		super(cause.getMessage());
		this.causeClassname = cause.getClass().getName();
	}

	public DispatchException(String message, Throwable cause) {
		super(message + " (" + cause.getMessage() + ")");
		this.causeClassname = cause.getClass().getName();
	}

	public String getCauseClassname() {
		return causeClassname;
	}

	
	public String toString() {
		return super.toString()
				+ (causeClassname != null ? " [cause: " + causeClassname + "]"
						: "");
	}
}
