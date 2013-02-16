package in.appops.platform.bindings.web.gwt.dispatch.client.action;

import in.appops.platform.core.entity.type.Type;
import in.appops.platform.core.operation.*;

import java.io.Serializable;
import java.util.Map;

@SuppressWarnings("rawtypes")
public interface Action<R extends Result> extends Serializable {

	public Type getParentType();

	public String getActionName();

	public boolean useDefaultHandler();
	
	public Map<String,Serializable> getParameters();
	
	public void setParameters(Map<String,Serializable> parameters);

}
