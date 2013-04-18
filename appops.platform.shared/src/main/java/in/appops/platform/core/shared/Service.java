package in.appops.platform.core.shared;

import in.appops.platform.core.entity.Entity;
import in.appops.platform.core.entity.Property;

public class Service extends Entity {
	
	// set name of service
	// Service Descriptors
	private String NAME	= "service_name";
	private String ID = "service_id";
	
	public Service() {
	}
	
	public Service(String name, Long id) {
		setServiceName(name);
		setServiceId(id);
	}
	
	public void setServiceName(String servicename) {
		Property<String> serviceNameProp = new Property<String>();
		serviceNameProp.setName(NAME);
		serviceNameProp.setValue(servicename);
		setProperty(serviceNameProp);
	}
	
	public String getServiceName() {
		return getPropertyByName(NAME);
	}
	
	public void setServiceId(Long serviceId) {
		Property<Long> serviceNameProp = new Property<Long>();
		serviceNameProp.setName(ID);
		serviceNameProp.setValue(serviceId);
		setProperty(serviceNameProp);
	}
	
	public Long getServiceId() {
		return getPropertyByName(ID);
	}
}
