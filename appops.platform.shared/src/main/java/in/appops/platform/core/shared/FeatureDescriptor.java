package in.appops.platform.core.shared;

import in.appops.platform.core.entity.Entity;

public class FeatureDescriptor extends Entity {
	
	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	private static final String	PRIORITY			= "priority";
	private final String		ORDER				= "order";
	private final String		IS_ASYNC			= "isAsync";
	private final String		IS_POST_EXECUTION	= "isPostExecution";
	private final String		IS_PRE_EXECUTION	= "isPreExecution";
	private final String		NAME_PROP			= "name";
	private final String		QNAME_PROP			= "qname";
	
	public FeatureDescriptor() {
	}
	
	public String getName() {
		return getPropertyByName(NAME_PROP);
	}
	
	public void setName(String name) {
		setPropertyByName(NAME_PROP, name);
	}
	
	public String getQName() {
		return getPropertyByName(QNAME_PROP);
	}
	
	public void setQName(String qname) {
		setPropertyByName(QNAME_PROP, qname);
	}
	
	public void setIsAsync(Boolean isAsync) {
		setPropertyByName(IS_ASYNC, isAsync);
	}
	
	public Boolean isAsync() {
		return getPropertyByName(IS_ASYNC);
	}
	
	public void setIsPreExecution(Boolean isPreExecution) {
		setPropertyByName(IS_PRE_EXECUTION, isPreExecution);
	}
	
	public Boolean isPreExecution() {
		return getPropertyByName(IS_PRE_EXECUTION);
	}
	
	public void setIsPostExecution(Boolean isPostExecution) {
		setPropertyByName(IS_POST_EXECUTION, isPostExecution);
	}
	
	public Boolean isPostExecution() {
		return getPropertyByName(IS_POST_EXECUTION);
	}
	
}
