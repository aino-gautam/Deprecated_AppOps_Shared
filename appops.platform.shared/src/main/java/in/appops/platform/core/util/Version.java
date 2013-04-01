/**
 * 
 */
package in.appops.platform.core.util;

import in.appops.platform.core.entity.Key;
import in.appops.platform.core.entity.type.Type;

import java.io.Serializable;

/**
 * @author Debasish Padhy Created it on 15-Aug-2012
 *
 */
public interface Version extends Serializable {

	public String getVersionAsString();
	
	public long getVersionAsLong() ;
	
	public Type getParentType() ;
	
	public Key getParentKey();
}
