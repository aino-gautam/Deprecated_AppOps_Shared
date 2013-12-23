package in.appops.platform.core.shared;

import in.appops.platform.core.entity.Entity;
import in.appops.platform.core.entity.Property;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class InterfaceDescriptor extends Entity {
	private static final String	PARENT_SERVICE			= "parentService";
	private final String		DEFAULT_IMPL			= "defaultImpl";
	private final String		METHOD_DESCRIPTOR_PROP	= "methodDescriptors";
	private final String		NAME_PROP				= "name";
	private final String		QNAME_PROP				= "qname";
	private String INTERFACEID = "interfaceId";
	
	
	public InterfaceDescriptor() {
		Property<HashMap<String, ArrayList<OperationDescriptor>>> methodDescriptorMapProp = new Property<HashMap<String, ArrayList<OperationDescriptor>>>();
		methodDescriptorMapProp.setName(METHOD_DESCRIPTOR_PROP);
		
		HashMap<String, ArrayList<OperationDescriptor>> methodDescriptorMap = new HashMap<String, ArrayList<OperationDescriptor>>();
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
	
	public Long getId() {
		return getPropertyByName(INTERFACEID);
	}
	
	public void setId(Long interfaceId) {
		setPropertyByName(INTERFACEID, interfaceId);
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
	
	public HashMap<String, ArrayList<OperationDescriptor>> getMethodDescriptors() {
		HashMap<String, ArrayList<OperationDescriptor>> methodDescriptorMap = getPropertyByName(METHOD_DESCRIPTOR_PROP);
		return methodDescriptorMap;
	}
	
	public void addMethodDescriptor(String methodName, OperationDescriptor descriptor) {
		HashMap<String, ArrayList<OperationDescriptor>> methodDescriptorMap = getPropertyByName(METHOD_DESCRIPTOR_PROP);
		if (methodDescriptorMap != null) {
			ArrayList<OperationDescriptor> operationDescriptorsList = null;
			if(methodDescriptorMap.containsKey(methodName))
				operationDescriptorsList = methodDescriptorMap.get(methodName);
			else
				operationDescriptorsList = new ArrayList<OperationDescriptor>();
			operationDescriptorsList.add(descriptor);
			methodDescriptorMap.put(methodName, operationDescriptorsList);
			setPropertyByName(METHOD_DESCRIPTOR_PROP, methodDescriptorMap);
		}
	}
	
	public OperationDescriptor getMethodDescriptor(String methodName, Map<String, Serializable> paramMap) {
		HashMap<String, ArrayList<OperationDescriptor>> methodDescriptorMap = getPropertyByName(METHOD_DESCRIPTOR_PROP);
		if(methodDescriptorMap!=null){
			for(String name : methodDescriptorMap.keySet()){
				if(name.equals(methodName)){
					ArrayList<OperationDescriptor> operationDescriptorList = methodDescriptorMap.get(name);
					for(OperationDescriptor operationDescriptor: operationDescriptorList){
						LinkedHashMap<String, String> opParamMap = operationDescriptor.getParameters();
						
						if(paramMap.containsKey("action")){
							if (paramMap.size()-1 == opParamMap.size()){
								Set<String> keysInIncomingMap = new HashSet<String>(paramMap.keySet());
								Set<String> keysInComparingMap = new HashSet<String>(opParamMap.keySet());
								if(keysInIncomingMap.equals(keysInComparingMap))
									return operationDescriptor;
								else
									continue;
							}
						}else if (paramMap.size() == opParamMap.size()){
							Set<String> keysInIncomingMap = new HashSet<String>(paramMap.keySet());
							Set<String> keysInComparingMap = new HashSet<String>(opParamMap.keySet());
							if(keysInIncomingMap.equals(keysInComparingMap))
								return operationDescriptor;
							else
								continue;
						}
					}
				}
			}
		}
		return null;
	}
	
	public ServiceDescriptor getServiceDescriptor() {
		ServiceDescriptor serviceDescriptor = getPropertyByName(PARENT_SERVICE);
		return serviceDescriptor;
	}
	
	public void setServiceDescriptor(ServiceDescriptor serviceDescriptor) {
		setPropertyByName(PARENT_SERVICE, serviceDescriptor);
	}
}
