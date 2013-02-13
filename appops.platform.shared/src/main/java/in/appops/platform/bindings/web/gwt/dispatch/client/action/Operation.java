package in.appops.platform.bindings.web.gwt.dispatch.client.action;

import java.io.Serializable;
import java.util.Map;

import in.appops.platform.core.entity.type.*;
import in.appops.platform.core.operation.*;

@SuppressWarnings({"rawtypes","serial"})
public class Operation implements Action<Result> {

	public Operation() {
		
	}

	/**
	 * @param string
	 */
	public Operation(String string) {
		name = string;
	}

	private String name;

	private Map<String, Serializable> parameters;

	private Type type;

	
	public String getActionName() {
		return name;
	}

	
	public Map<String, Serializable> getParameters() {
		return parameters;
	}

	
	public Type getParentType() {
		return type;
	}

	public void setActionName(String name) {
		this.name = name;
	}

	
	public void setParameters(Map<String, Serializable> parameters) {
		this.parameters = parameters;
	}

	public void setParentType(Type type) {
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see in.appops.platform.bindings.web.gwt.dispatch.client.action.Action#useDefaultHandler()
	 */
	
	public boolean useDefaultHandler() {
		// TODO Auto-generated method stub
		return false;
	}

}
