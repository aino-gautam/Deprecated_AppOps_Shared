/**
 * 
 */
package in.appops.platform.core.entity;

import com.google.common.annotations.GwtCompatible;

/**
 * @author Debasish Padhy Created it on 16-Aug-2012
 *
 * Property to represent geo location 
 * 
 * Defaults to 0
 * 
 */
@SuppressWarnings("serial")
@GwtCompatible
final public class GeoLocation extends Property {

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	private double latitude ;
	private double longitude ; 
	private double distanceFromCurrentLocation;
	
	public boolean equals(Object obj) {
		// TODO Must be custom implemented .. consider precision values while implementing 
		return super.equals(obj);
	}
	/**
	 * @return the distanceFromCurrentLocation
	 */
	public double getDistanceFromCurrentLocation() {
		return distanceFromCurrentLocation;
	}
	/**
	 * @param distanceFromCurrentLocation the distanceFromCurrentLocation to set
	 */
	public void setDistanceFromCurrentLocation(double distanceFromCurrentLocation) {
		this.distanceFromCurrentLocation = distanceFromCurrentLocation;
	}
	
}
