package in.appops.platform.core.shared;

import in.appops.platform.core.entity.Entity;
import java.util.HashMap;

public class ActionDescriptor extends Entity {
	
	private final String		ACTIONID						= "id";
	private final String		OPERATION_DESCRIPTOR			= "operationDescriptor";
	
	
	public ActionDescriptor() {
	}
	
	public ActionDescriptor(Long id) {
		this();
		setActionId(id);
	}
	
	public String getActionId() {
		return getPropertyByName(ACTIONID);
	}
	
	public void setActionId(Long id) {
		setPropertyByName(ACTIONID, id);
	}
	
	public void addOperationDescriptor(Long actionId, OperationDescriptor descriptor) {
		HashMap<Long, OperationDescriptor> actionDescriptorMap = getPropertyByName(OPERATION_DESCRIPTOR);
		if (actionDescriptorMap != null) {
			actionDescriptorMap.put(actionId, descriptor);
			setPropertyByName(OPERATION_DESCRIPTOR, actionDescriptorMap);
		}
	}
	
	public OperationDescriptor getOperationDescriptor(Long actionId) {
		HashMap<Long, OperationDescriptor> actionDescriptorMap = getPropertyByName(OPERATION_DESCRIPTOR);
		return actionDescriptorMap != null ? actionDescriptorMap.get(actionId) : null;
	}
	
}
