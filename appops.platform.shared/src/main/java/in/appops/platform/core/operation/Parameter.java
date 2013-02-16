/**
 * 
 */
package in.appops.platform.core.operation;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.google.common.annotations.GwtCompatible;

/**
 * @author Debasish Padhy Created it on 16-Aug-2012
 * 
 * Used for representing parameters being passed from client to server while invoking an operation. 
 * 
 * Typically used in gwt only. Could also be used in a Java REST Api set
 *
 */
@SuppressWarnings("serial")
@GwtCompatible
public class Parameter<T extends Serializable> implements Serializable{

	private Operation parent ;
	
	public Parameter(){
		
	}
	
	/**
	 * @param p parent operation
	 */
	public Parameter(Operation p){
		parent = p ;
	}
	
	/**
	 * @param string
	 */
	public Parameter(Operation op, String string) {
		// TODO Auto-generated constructor stub
	}

	private Map<String, T> parameterMap = null ;
	
	public void setParameter(String name, T t){
		Map<String, T> temp = getParameterMap();
		temp.put(name , t);
	}
	
	public T getParameter(String key){
		return getParameterMap().get(key);
	}

	/**
	 * @return
	 */
	private Map<String, T> getParameterMap() {
		
		if (parameterMap == null)
			parameterMap = new HashMap<String, T>();
		return parameterMap;
	}

	/**
	 * @return the parent
	 */
	public Operation getParent() {
		return parent;
	}
	
}
