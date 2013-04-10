package in.appops.platform.core.shared;

import in.appops.platform.core.entity.Entity;
import in.appops.platform.core.entity.Property;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class OperationDescriptor extends Entity {
	
	/**
	 * 
	 */
	private static final long	serialVersionUID			= 1L;
	private static final String	PARENT_INTERFACE			= "parentInterface";
	private static final String	POST_FEATURE_DESCRIPTORS	= "postFeatureDescriptors";
	private final String		PARAMETER_MAP_PROP			= "parameters";
	private final String		NAME_PROP					= "name";
	private final String		MAPPED_TO					= "mappedTo";
	private final String		PRE_FEATURE_DESCRIPTORS		= "preFeatureDescriptors";
	
	public final String SELFMSG = "selfMsg";
	public final String GENERALMSG = "generalMsg";
	public final String PARTICIPANTMSG = "participantMsg";
	public final String SCOPE = "scope";
	
	public OperationDescriptor() {
		Property<LinkedHashMap<String, String>> parameterMapProp = new Property<LinkedHashMap<String, String>>();
		parameterMapProp.setName(PARAMETER_MAP_PROP);
		
		LinkedHashMap<String, String> parameterMap = new LinkedHashMap<String, String>();
		parameterMapProp.setValue(parameterMap);
		setProperty(parameterMapProp);
		
		ArrayList<FeatureDescriptor> preFeatureDescriptorList = new ArrayList<FeatureDescriptor>();
		setPropertyByName(PRE_FEATURE_DESCRIPTORS, preFeatureDescriptorList);
		
		ArrayList<FeatureDescriptor> postFeatureDescriptorList = new ArrayList<FeatureDescriptor>();
		setPropertyByName(POST_FEATURE_DESCRIPTORS, postFeatureDescriptorList);
	}
	
	public boolean isMapped() {
		if (getMappedOperation() != null)
			return true;
		else
			return false;
	}
	
	public String getMappedOperation() {
		String mappedOperation = getPropertyByName(MAPPED_TO);
		return mappedOperation;
	}
	
	public void setMappedToOperation(String mappedTo) {
		setPropertyByName(MAPPED_TO, mappedTo);
	}
	
	public OperationDescriptor(String methodName) {
		this();
		setName(methodName);
	}
	
	public String getName() {
		return getPropertyByName(NAME_PROP);
	}
	
	public void setName(String methodName) {
		setPropertyByName(NAME_PROP, methodName);
	}
	
	public LinkedHashMap<String, String> getParameters() {
		LinkedHashMap<String, String> parameterMap = getPropertyByName(PARAMETER_MAP_PROP);
		return parameterMap;
	}
	
	public void addParameter(String paramName, String paramType) {
		LinkedHashMap<String, String> parameterMap = getPropertyByName(PARAMETER_MAP_PROP);
		if (parameterMap != null) {
			parameterMap.put(paramName, paramType);
			setPropertyByName(PARAMETER_MAP_PROP, parameterMap);
		}
	}
	
	public String getParameterType(String paramName) {
		LinkedHashMap<String, String> parameterMap = getPropertyByName(PARAMETER_MAP_PROP);
		return parameterMap != null ? parameterMap.get(paramName) : null;
	}
	
	public InterfaceDescriptor getInterfaceDescriptor() {
		InterfaceDescriptor interfaceDescriptor = getPropertyByName(PARENT_INTERFACE);
		return interfaceDescriptor;
	}
	
	public void setInterfaceDescriptor(InterfaceDescriptor interfaceDescriptor) {
		setPropertyByName(PARENT_INTERFACE, interfaceDescriptor);
	}
	
	public ArrayList<FeatureDescriptor> getFeatureDescriptors(boolean ispre) {
		ArrayList<FeatureDescriptor> featureDescriptorList = null;
		if (ispre)
			featureDescriptorList = getPropertyByName(PRE_FEATURE_DESCRIPTORS);
		else
			featureDescriptorList = getPropertyByName(POST_FEATURE_DESCRIPTORS);
		return featureDescriptorList;
	}
	
	public void addPreFeatureDescriptor(FeatureDescriptor descriptor) {
		ArrayList<FeatureDescriptor> preFeatureDescriptorList = getPropertyByName(PRE_FEATURE_DESCRIPTORS);
		if (preFeatureDescriptorList != null) {
			preFeatureDescriptorList.add(descriptor);
			setPropertyByName(PRE_FEATURE_DESCRIPTORS, preFeatureDescriptorList);
		}
	}
	
	public void addPostFeatureDescriptor(FeatureDescriptor descriptor) {
		ArrayList<FeatureDescriptor> preFeatureDescriptorList = getPropertyByName(POST_FEATURE_DESCRIPTORS);
		if (preFeatureDescriptorList != null) {
			preFeatureDescriptorList.add(descriptor);
			setPropertyByName(POST_FEATURE_DESCRIPTORS, preFeatureDescriptorList);
		}
	}
	
	public boolean hasFeatures(boolean ispre) {
		if (getFeatureDescriptors(ispre).size() > 0)
			return true;
		return false;
	}
	
	public String getSelfMsg() {
		return getPropertyByName(SELFMSG);
	}
	
	public void setSelfMsg(String selfMsg) {
		setPropertyByName(SELFMSG, selfMsg);
	}
	
	public String getGeneralMsg() {
		return getPropertyByName(GENERALMSG);
	}
	
	public void setGeneralMsg(String generalMsg) {
		setPropertyByName(GENERALMSG, generalMsg);
	}
	
	public String getParticipantMsg() {
		return getPropertyByName(PARTICIPANTMSG);
	}
	
	public void setParticipantMsg(String participantMsg) {
		setPropertyByName(PARTICIPANTMSG, participantMsg);
	}
	
	public String getScope() {
		return getPropertyByName(SCOPE);
	}
	
	public void setScope(String scope) {
		setPropertyByName(SCOPE, scope);
	}
}