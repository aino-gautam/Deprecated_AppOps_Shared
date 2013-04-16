package in.appops.platform.bindings.web.gwt.dispatch.client.action;

import in.appops.platform.core.operation.*;
import javax.xml.ws.Dispatch;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * This is an asynchronous equivalent of the {@link Dispatch} interface on the
 * server side. The reason it exists is because GWT currently can't correctly
 * handle having generic method templates in method signatures (eg.
 * <code>&lt;A&gt; A
 * create( Class<A> type )</code>)
 * 
 */
@SuppressWarnings("rawtypes")
public interface DispatchAsync {
	<A extends Action<R>, R extends Result> void execute(A action, AsyncCallback<R> callback);
	
	<A extends Action<R>, R extends Result> void executeContextAction(ActionContext context, AsyncCallback<R> callback);
	
}
