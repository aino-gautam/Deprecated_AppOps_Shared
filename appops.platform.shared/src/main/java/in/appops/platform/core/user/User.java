/**
 * 
 */
package in.appops.platform.core.user;

import in.appops.platform.core.entity.Key;

/**
 * @author Debasish Padhy Created it on 24-Aug-2012
 *
 */
public class User {
	
	private Key userKey ;

	/**
	 * @return the userKey
	 */
	public Key getUserKey() {
		return userKey;
	}

	/**
	 * @param userKey the userKey to set
	 */
	public void setUserKey(Key userKey) {
		this.userKey = userKey;
	}
	
}
