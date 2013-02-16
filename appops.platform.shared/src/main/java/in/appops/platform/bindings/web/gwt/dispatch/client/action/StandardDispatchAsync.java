package in.appops.platform.bindings.web.gwt.dispatch.client.action;


import in.appops.platform.bindings.web.gwt.dispatch.client.action.exception.ExceptionHandler;
import in.appops.platform.core.operation.Result;

import javax.xml.ws.Dispatch;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;


/**
 * This class is the default implementation of {@link DispatchAsync}, which is
 * essentially the client-side access to the {@link Dispatch} class on the
 * server-side.
 *
 * @author David Peterson
 */
public class StandardDispatchAsync extends AbstractDispatchAsync {

    private static final StandardDispatchServiceAsync realService = GWT.create( StandardDispatchService.class );

    public StandardDispatchAsync( ExceptionHandler exceptionHandler ) {
        super( exceptionHandler );
    	ServiceDefTarget service = (ServiceDefTarget) realService;
    }
    	
    public <A extends Action<R>, R extends Result> void execute( final A action, final AsyncCallback<R> callback ) {
        realService.execute( action, new AsyncCallback<Result>() {
            public void onFailure( Throwable caught ) {
                StandardDispatchAsync.this.onFailure( action, caught, callback );
            }

            public void onSuccess( Result result ) {
                StandardDispatchAsync.this.onSuccess( action, (R) result, callback );
            }
        } );
    }
}
