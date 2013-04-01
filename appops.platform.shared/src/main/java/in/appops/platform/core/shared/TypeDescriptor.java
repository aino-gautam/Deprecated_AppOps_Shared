package in.appops.platform.core.shared;

import java.util.HashMap;

import in.appops.platform.core.entity.Entity;

public class TypeDescriptor extends Entity {

	private static final long serialVersionUID = 1L;
	private final String ID_PROP = "id";
	private final String PROPERTY_DESCRIPTOR_PROP = "propertyDescriptors";
	private final String NAME_PROP = "name";
	private final String QNAME_PROP = "qname";
	private final String IS_POJO_EXISTS_PROP = "ispojoExists";
	private final String PARENT_SERVICE = "parentService";

	public TypeDescriptor() {
		HashMap<String, PropertyDescriptor> propertyDescMap = new HashMap<String, PropertyDescriptor>();
		setPropertyByName(PROPERTY_DESCRIPTOR_PROP, propertyDescMap);

	}

	public Boolean getIsPojoExists() {
		return getPropertyByName(IS_POJO_EXISTS_PROP);
	}

	public void setIsPojoExists(boolean val) {
		setPropertyByName(IS_POJO_EXISTS_PROP, val);
	}
	
	public ServiceDescriptor getServiceDescriptor() {
		ServiceDescriptor serviceDescriptor = getPropertyByName(PARENT_SERVICE);
		return serviceDescriptor;
	}

	public void setServiceDescriptor(ServiceDescriptor serviceDescriptor) {
		setPropertyByName(PARENT_SERVICE, serviceDescriptor);
	}

	public Long getId() {
		return getPropertyByName(ID_PROP);
	}

	public void setId(Long id) {
		setPropertyByName(ID_PROP, id);
	}
	
	public String getName() {
		return getPropertyByName(NAME_PROP);
	}

	public void setName(String interfaceName) {
		setPropertyByName(NAME_PROP, interfaceName);
	}

	public String getQName() {
		return getPropertyByName(QNAME_PROP);
	}

	public void setQName(String interfaceName) {
		setPropertyByName(QNAME_PROP, interfaceName);
	}

	public void addPropertyDescriptor(String propName,
			PropertyDescriptor descriptor) {
		HashMap<String, PropertyDescriptor> propertyDescriptorMap = getPropertyByName(PROPERTY_DESCRIPTOR_PROP);
		if (propertyDescriptorMap != null) {
			propertyDescriptorMap.put(propName, descriptor);
			setPropertyByName(PROPERTY_DESCRIPTOR_PROP, propertyDescriptorMap);
		}
	}

	public PropertyDescriptor getPropertyDescriptor(String propName) {
		HashMap<String, PropertyDescriptor> propertyDescriptorMap = getPropertyByName(PROPERTY_DESCRIPTOR_PROP);
		return propertyDescriptorMap != null ? propertyDescriptorMap
				.get(propName) : null;
	}

	public HashMap<String, PropertyDescriptor> getPropertyDescriptors() {
		HashMap<String, PropertyDescriptor> propertyDescriptorMap = getPropertyByName(PROPERTY_DESCRIPTOR_PROP);
		return propertyDescriptorMap;
	}
}
