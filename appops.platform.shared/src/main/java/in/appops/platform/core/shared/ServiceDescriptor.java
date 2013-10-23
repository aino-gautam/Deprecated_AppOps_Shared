package in.appops.platform.core.shared;

import in.appops.platform.core.entity.Entity;

import java.util.HashMap;

public class ServiceDescriptor extends Entity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// private final String EXPORT_PACKAGE = "exportPackage";
	private final String INTERFACE_DESCRIPTOR_PROP = "interfaceDescriptors";
	private final String NAME_PROP = "name";
	private final String TYPE_DESCRIPTORS_PROP = "typeDescriptors";
	private final String ACTION_DESCRIPTORS_PROP = "actionDescriptors";
	
	private String SERVICEID = "serviceId";

	public ServiceDescriptor() {
		HashMap<String, InterfaceDescriptor> interfaceDescriptorMap = new HashMap<String, InterfaceDescriptor>();
		setPropertyByName(INTERFACE_DESCRIPTOR_PROP, interfaceDescriptorMap);
		
		HashMap<String, TypeDescriptor> typeDescriptorMap = new HashMap<String, TypeDescriptor>();
		setPropertyByName(TYPE_DESCRIPTORS_PROP, typeDescriptorMap);
		
		HashMap<Long, ActionDescriptor> actionDescriptors = new HashMap<Long, ActionDescriptor>();
		setPropertyByName(ACTION_DESCRIPTORS_PROP, actionDescriptors);
		
	}

	public ServiceDescriptor(String serviceName) {
		this();
		setName(serviceName);
	}

	public Long getServiceId() {
		return getPropertyByName(SERVICEID);
	}

	public void setServiceId(Long id) {
		setPropertyByName(SERVICEID, id);
	}

	
	/*
	 * public void setExportPackage(String exportPackage) {
	 * setPropertyByName(EXPORT_PACKAGE, exportPackage); Property<String>
	 * exportPackageProp = new Property<String>();
	 * exportPackageProp.setName(EXPORT_PACKAGE);
	 * exportPackageProp.setValue(exportPackage);
	 * setProperty(exportPackageProp); }
	 */

	public void addInterfaceDescriptor(String interfaceName, InterfaceDescriptor descriptor) {
		HashMap<String, InterfaceDescriptor> interfaceDescriptorMap = getPropertyByName(INTERFACE_DESCRIPTOR_PROP);
		if (interfaceDescriptorMap != null) {
			interfaceDescriptorMap.put(interfaceName, descriptor);
			setPropertyByName(INTERFACE_DESCRIPTOR_PROP, interfaceDescriptorMap);
		}
	}

	public InterfaceDescriptor getInterfaceDescriptor(String interfaceName) {
		HashMap<String, InterfaceDescriptor> interfaceDescriptorMap = getPropertyByName(INTERFACE_DESCRIPTOR_PROP);
		return interfaceDescriptorMap != null ? interfaceDescriptorMap.get(interfaceName) : null;
	}

	public HashMap<String, InterfaceDescriptor> getInterfaceDescriptors() {
		HashMap<String, InterfaceDescriptor> interfaceDescriptorMap = getPropertyByName(INTERFACE_DESCRIPTOR_PROP);
		return interfaceDescriptorMap;
	}

	public void addTypeDescriptor(String type, TypeDescriptor descriptor) {
		HashMap<String, TypeDescriptor> typeDescriptorMap = getPropertyByName(TYPE_DESCRIPTORS_PROP);
		if (typeDescriptorMap != null) {
			typeDescriptorMap.put(type, descriptor);
			setPropertyByName(TYPE_DESCRIPTORS_PROP, typeDescriptorMap);
		}
	}

	public TypeDescriptor getTypeDescriptor(String type) {
		HashMap<String, TypeDescriptor> typeDescriptorMap = getPropertyByName(TYPE_DESCRIPTORS_PROP);
		return typeDescriptorMap != null ? typeDescriptorMap.get(type) : null;
	}

	public HashMap<String, TypeDescriptor> getTypeDescriptors() {
		HashMap<String, TypeDescriptor> typeDescriptorMap = getPropertyByName(TYPE_DESCRIPTORS_PROP);
		return typeDescriptorMap;
	}
	
	public ActionDescriptor getActionDescriptor(Long actiond) {
		HashMap<Long, ActionDescriptor> actionDescriptorMap = getPropertyByName(ACTION_DESCRIPTORS_PROP);
		return actionDescriptorMap != null ? actionDescriptorMap.get(actiond) : null;
	}

	public HashMap<Long, ActionDescriptor> getActionDescriptors() {
		HashMap<Long, ActionDescriptor> actionDescriptorMap = getPropertyByName(ACTION_DESCRIPTORS_PROP);
		return actionDescriptorMap;
	}
	
	public void addActionDescriptor(Long actionId, ActionDescriptor actionDescriptor) {
		HashMap<Long, ActionDescriptor> actionDescriptorMap = getPropertyByName(ACTION_DESCRIPTORS_PROP);
		if (actionDescriptorMap != null) {
			actionDescriptorMap.put(actionId, actionDescriptor);
			setPropertyByName(ACTION_DESCRIPTORS_PROP, actionDescriptorMap);
		}
	}

	public String getServiceName() {
		return getPropertyByName(NAME_PROP);
	}

	public void setName(String interfaceName) {
		setPropertyByName(NAME_PROP, interfaceName);
	}

	/*
	 * public String getExportPackage() { return
	 * this.getPropertyByName(EXPORT_PACKAGE); }
	 */
}
