package in.appops.platform.bindings.web.gwt.dispatch.client.action;

import com.google.gwt.user.client.rpc.AsyncCallback;
import in.appops.platform.core.operation.*;

/**
 * 
 * @author Debasish Padhy Created it on 25-Apr-2012
 * 
 */
public interface StandardDispatchServiceAsync {

	/**
	 * Executes the specified action.
	 * 
	 * @param action
	 *            The action to execute.
	 * @param callback
	 *            The callback to execute once the action completes.
	 * 
	 * @see net.customware.gwt.dispatch.server.Dispatch
	 */
	<R extends Result> void execute(Action<?> action, AsyncCallback<R> callback);
}
