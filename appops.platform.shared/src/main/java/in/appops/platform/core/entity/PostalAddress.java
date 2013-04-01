/**
 * 
 */
package in.appops.platform.core.entity;

import java.io.Serializable;

/**
 * @author Debasish Padhy Created it on 16-Aug-2012
 * To be used to represent an address 
 * 
 * Optionally may have a Geolocation embedded
 * 
 * Provides client side equality of value for two address objects. 
 * 
 */
@SuppressWarnings("serial")
public class PostalAddress extends Property{
	
	/**
	 * @return the geo location of this postal address optional value may or may not be available
	 */
	public GeoLocation getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(GeoLocation location) {
		this.location = location;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the zipCode
	 */
	public int getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the longForm
	 */
	public String getLongForm() {
		return longForm;
	}
	/**
	 * @param longForm the longForm to set
	 */
	public void setLongForm(String longForm) {
		this.longForm = longForm;
	}
	private GeoLocation location = null ;
	
	private String street = null ;
	private int zipCode = 0 ;
	private String city = null ;
	private String state = null ;
	private String country = null ;
	private String longForm = null;
	
	
	public boolean equals(Object o){
		
		// TODO must implement 
		return false ; 
	}
	

}
