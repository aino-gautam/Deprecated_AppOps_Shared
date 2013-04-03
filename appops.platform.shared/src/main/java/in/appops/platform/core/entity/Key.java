
package in.appops.platform.core.entity;

import java.io.Serializable;
import java.math.BigInteger;

import com.google.common.annotations.GwtCompatible;

/**
 * @author Debasish Padhy Created it on 15-Aug-2012
 * 
 * Default value for keyType is BigInt ;
 */
@SuppressWarnings("serial")
@GwtCompatible
public class Key<T extends Serializable> implements Serializable {
	
	public enum KeyType {
		BigInt, Uuid, String ;
		
	}
	
	private T keyValue  ;
	private KeyType keyType  ;
	
	Key() {
		keyValue = null;
		keyType = null;
	}
	
	public Key(T value){
		this.keyValue =  value ;
		this.keyType = determineKeyType(value);
	}
	
	/**
	 * @return
	 */
	private KeyType determineKeyType(Object value) {

		if ( isValueUuid(value))
			return KeyType.Uuid ;
		
		else if (value instanceof BigInteger)
			return KeyType.BigInt ;
		
		else 
			return KeyType.String; 
	}

	/**
	 * @param value
	 * @return
	 */
	private boolean isValueUuid(Object value) {
		return false;
	}

	public Key(T val, KeyType tp){
		this.keyValue = val ;
		this.keyType = tp;
	}
	
	public KeyType getKeyType(){
		return keyType ;
	}
	
	
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	public T getKeyValue(){
		return this.keyValue ;
	}
}
