package in.appops.platform.bindings.web.gwt.dispatch.client.action;

import in.appops.platform.bindings.web.gwt.dispatch.client.action.exception.ExceptionHandler;
import in.appops.platform.core.operation.ActionContext;
import in.appops.platform.core.operation.Result;
import in.appops.platform.core.entity.Entity;

import java.io.Serializable;
import java.util.HashMap;

import javax.xml.ws.Dispatch;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.googlecode.gwtphonegap.client.PhoneGap;
import com.googlecode.gwtphonegap.client.util.PhonegapUtil;

/**
 * This class is the default implementation of {@link DispatchAsync}, which is
 * essentially the client-side access to the {@link Dispatch} class on the
 * server-side.
 *
 * @author David Peterson
 */
public class StandardDispatchAsync extends AbstractDispatchAsync {

	private static final StandardDispatchServiceAsync	realService		= GWT.create(StandardDispatchService.class);
	private static final String							OPERATIONNAME	= "coreplatform.CorePlatformService.executeContextAction";
	private static final String							ACTIONCONTEXT	= "actionContext";

	private static final PhoneGap phoneGap = GWT.create(PhoneGap.class );

	public StandardDispatchAsync(ExceptionHandler exceptionHandler) {
		super(exceptionHandler);
		ServiceDefTarget service = (ServiceDefTarget) realService;
		try{			
			if(phoneGap.isPhoneGapDevice()){
				phoneGap.initializePhoneGap();
				String url =  GWT.getModuleBaseURL();
				String subUrl = url.substring(0, url.lastIndexOf("/"));
				String module = subUrl.substring(subUrl.lastIndexOf("/"));
				String moduleUrl;
				moduleUrl = "http://server.ensarm.com:4080/Trumart" + module.trim() +"/";
				PhonegapUtil.prepareService(service, moduleUrl, "dispatch");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public <A extends Action<R>, R extends Result> void execute(final A action, final AsyncCallback<R> callback) {
		realService.execute(action, new AsyncCallback<Result>() {
			public void onFailure(Throwable caught) {
				StandardDispatchAsync.this.onFailure(action, caught, callback);
			}

			public void onSuccess(Result result) {
				StandardDispatchAsync.this.onSuccess(action, (R) result, callback);
			}
		});
	}

	public <A extends Action<R>, R extends Result> void executeContextAction(ActionContext actionContext, final AsyncCallback<R> callback) {
		HashMap<String, Serializable> paramMap = new HashMap<String, Serializable>();
		paramMap.put(ACTIONCONTEXT, actionContext);
		StandardAction action = new StandardAction(Entity.class,OPERATIONNAME, paramMap);
		this.execute(action, callback);
	}
}
