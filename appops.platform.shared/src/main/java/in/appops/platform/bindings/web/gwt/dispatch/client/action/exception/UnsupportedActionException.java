package in.appops.platform.bindings.web.gwt.dispatch.client.action.exception;

import in.appops.platform.bindings.web.gwt.dispatch.client.action.*;
import in.appops.platform.core.operation.*;

public class UnsupportedActionException extends ActionException {

    /**
     * For serialization.
     */
    UnsupportedActionException() {
    }
    
    @SuppressWarnings({"unchecked"})
    public UnsupportedActionException( Action<? extends Result> action ) {
        this( ( Class<? extends Action<? extends Result>> ) action.getClass() );
    }

    public UnsupportedActionException( Class<? extends Action<? extends Result>> actionClass ) {
        super( "No handler is registered for " + actionClass.getName() );
    }

}
