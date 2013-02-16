/**
 * 
 */
package in.appops.platform.core.entity;

/**
 * @author Debasish Padhy Created it on 15-Aug-2012
 *
 */

import in.appops.platform.core.entity.type.Type;

import java.io.Serializable;
import java.util.HashMap;
import com.google.common.annotations.GwtCompatible;

/**
 * This is a common base of all typed pojos in an appops application.

 * 
 * 
 * @author Debasish - deba@ensarm.com Created on Feb 8, 2012 - 10:11:40 AM
 * 
 */
@SuppressWarnings("serial")
@GwtCompatible
public class Entity extends Property<HashMap<String, Property<? extends Serializable >>>{

	private boolean partial = true;
	/**
	 * @return the partial - defaults to true
	 */
	public boolean isPartial() {
		return partial;
	}

	/**
	 * @param partial
	 *            the partial to set
	 */
	public void setPartial(boolean partial) {
		this.partial = partial;
	}

	/**
	 * provided only for serialization. Must use the overridden version
	 */
	public Entity() {

	}
	
	public Entity(Type t){
		
	}

	private Type type = null;
	/**
	 * Sets the Type of the entity
	 * @param Type
	 */
	public void setType(Type t) {
		this.type = t;
	}
	
	public Type getType() {
		return type ;
	}

	public boolean isCacheable(boolean server) {

		return false;
	}

	public Property<?> getProperty(String name) {
			return getValue().get(name);
	}

	/**
	 * @param name
	 *            - name of the property, can't be null
	 * @param prop
	 *            - a property object representing the property
	 */
	public void setProperty(String name, Property<?> prop) {

		getValue().put(name, prop);

	}
	
	/**
	 * @param name 
	 *            - name of the property, can't be null
	 * @param prop
	 *            - a property object representing the property
	 */
	public void setProperty(Property<?> prop) {

		if (getValue() == null) {
			setValue(new HashMap<String, Property<?>>());
		}
		getValue().put(prop.getName(), prop);
	}

	
	/**
	 * guaranteed to return a Map object even if no properties exist or even on a blank entity object
	 * @return
	 */
	
	public HashMap<String, Property<? extends Serializable>> getValue() {
		if (value == null ){
			setValue(new HashMap<String, Property<? extends Serializable>>());
		}
		
		return value;
	}
	
	/**
	 * @param string
	 * @param nm
	 */
	@SuppressWarnings("unchecked")
	public <M extends Serializable> void setPropertyByName(String name, M val) {
		
		// TODO validate that the property is of valid type here
		
		Property<M> tempProp = (Property<M>) getProperty(name);
		
		if (tempProp == null) 
			tempProp = new Property<M>(name, val);
		
		setProperty(tempProp);
	}
	
	@SuppressWarnings("unchecked")
	public <M extends Serializable> M getPropertyByName(String name) {
		
		Property<M> tempProp = (Property<M>) getProperty(name);

		return tempProp != null ? tempProp.getValue() : null;
	}


}
