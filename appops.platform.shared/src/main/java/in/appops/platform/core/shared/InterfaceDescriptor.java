package in.appops.platform.core.shared;

import in.appops.platform.core.entity.Entity;
import in.appops.platform.core.entity.Property;

import java.util.HashMap;

public class InterfaceDescriptor extends Entity {
	private static final String	PARENT_SERVICE			= "parentService";
	private final String		DEFAULT_IMPL			= "defaultImpl";
	private final String		METHOD_DESCRIPTOR_PROP	= "methodDescriptors";
	private final String		NAME_PROP				= "name";
	private final String		QNAME_PROP				= "qname";
	
	public InterfaceDescriptor() {
		Property<HashMap<String, OperationDescriptor>> methodDescriptorMapProp = new Property<HashMap<String, OperationDescriptor>>();
		methodDescriptorMapProp.setName(METHOD_DESCRIPTOR_PROP);
		
		HashMap<String, OperationDescriptor> methodDescriptorMap = new HashMap<String, OperationDescriptor>();
		methodDescriptorMapProp.setValue(methodDescriptorMap);
		setProperty(methodDescriptorMapProp);
	}
	
	public InterfaceDescriptor(String interfaceName) {
		this();
		setQName(interfaceName);
		String name = retrieveInterfaceName(interfaceName);
		setName(name);
	}
	
	private String retrieveInterfaceName(String interfaceName) {
		String[] substrings = interfaceName.split("\\.");
		return substrings[substrings.length - 1];
		
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
	
	public String getDefaultImplName() {
		return getPropertyByName(DEFAULT_IMPL);
	}
	
	public void setDefaultImpl(String implName) {
		setPropertyByName(DEFAULT_IMPL, implName);
		/*
		 * Property<String> defaultImplProp = new Property<String>();
		 * defaultImplProp.setName(DEFAULT_IMPL);
		 * defaultImplProp.setValue(implName); setProperty(defaultImplProp);
		 */
	}
	
	public HashMap<String, OperationDescriptor> getMethodDescriptors() {
		HashMap<String, OperationDescriptor> methodDescriptorMap = getPropertyByName(METHOD_DESCRIPTOR_PROP);
		return methodDescriptorMap;
	}
	
	public void addMethodDescriptor(String methodName, OperationDescriptor descriptor) {
		HashMap<String, OperationDescriptor> methodDescriptorMap = getPropertyByName(METHOD_DESCRIPTOR_PROP);
		if (methodDescriptorMap != null) {
			methodDescriptorMap.put(methodName, descriptor);
			setPropertyByName(METHOD_DESCRIPTOR_PROP, methodDescriptorMap);
		}
	}
	
	public OperationDescriptor getMethodDescriptor(String methodName) {
		HashMap<String, OperationDescriptor> methodDescriptorMap = getPropertyByName(METHOD_DESCRIPTOR_PROP);
		return methodDescriptorMap != null ? methodDescriptorMap.get(methodName) : null;
	}
	
	public ServiceDescriptor getServiceDescriptor() {
		ServiceDescriptor serviceDescriptor = getPropertyByName(PARENT_SERVICE);
		return serviceDescriptor;
	}
	
	public void setServiceDescriptor(ServiceDescriptor serviceDescriptor) {
		setPropertyByName(PARENT_SERVICE, serviceDescriptor);
	}
}
