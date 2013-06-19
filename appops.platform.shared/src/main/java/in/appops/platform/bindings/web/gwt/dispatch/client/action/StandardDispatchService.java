package in.appops.platform.bindings.web.gwt.dispatch.client.action;

import in.appops.platform.core.operation.Result;
import in.appops.platform.core.util.AppOpsException;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * @author Debasish Padhy Created it on 25-Apr-2012
 * 
 *         This is the real dispatch interface responsible for communicating
 *         actions and results from client and server
 */

@RemoteServiceRelativePath("dispatch")
public interface StandardDispatchService extends RemoteService {

	Result execute(Action<?> action) throws AppOpsException;

}
