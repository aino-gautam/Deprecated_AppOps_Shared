/**
 * 
 */
package in.appops.platform.core.operation;

import in.appops.platform.bindings.web.gwt.dispatch.client.action.Action;
import in.appops.platform.bindings.web.gwt.dispatch.client.action.RestAction;
import in.appops.platform.core.entity.type.Type;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.google.common.annotations.GwtCompatible;

/**
 * @author Debasish Padhy Created it on 16-Aug-2012
 * IsServiceOperation objects are immutable
 */

@SuppressWarnings("serial")
@GwtCompatible
final public class Operation implements Serializable {
	private boolean						async;
	private boolean						batchSupported;
	private String						name;
	private Map<String, Serializable>	parameters;
	private Type						parent;
	private boolean 					isRestOperation;		
	
	public Operation() {
		async = false;
		batchSupported = true;
	}
	
	/**
	 * @param action
	 */
	public Operation(Action<?> action) {
		this();
		this.name = action.getActionName();
		this.parent = action.getParentType();
		this.parameters = action.getParameters();
		if(action instanceof RestAction)
			this.isRestOperation = true;
		else
			this.isRestOperation = false;
	}
	
	public Operation(Type t, String nm, boolean b, boolean a) {
		parent = t;
		name = nm;
		batchSupported = b;
		async = a;
	}
	
	public Operation clone() {
		Operation clone = null;
		try {
			clone = new Operation(parent, name, batchSupported, async);
			if (parameters != null) {
				HashMap map = (HashMap) ((HashMap<String, Serializable>) parameters).clone();
				if (map != null) {
					clone.setParameters(map);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clone;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Serializable> getParameters() {
		return parameters;
	}
	
	/**
	 * @return the parent
	 */
	public Type getParentType() {
		return parent;
	}
	
	/**
	 * @return the async
	 */
	public boolean isAsync() {
		return async;
	}
	
	/**
	 * @return the batchSupported
	 */
	public boolean isBatchSupported() {
		return batchSupported;
	}
	
	public void setParameters(Map<String, Serializable> parameters) {
		this.parameters = parameters;
	}

	public boolean isRestOperation() {
		return isRestOperation;
	}

	public void setRestOperation(boolean isRestOperation) {
		this.isRestOperation = isRestOperation;
	}
	
}
