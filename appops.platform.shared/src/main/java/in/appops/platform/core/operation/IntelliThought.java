package in.appops.platform.core.operation;

import in.appops.platform.core.entity.Entity;

import java.io.Serializable;
import java.util.ArrayList;

public class IntelliThought implements Serializable{
	
	// More methods to provide List<User Entity>, List<Space Entity>, List<AllEntities>
	
	private String intelliText;
	private String intelliHtml;
	private ArrayList<Entity> linkedEntities;
	private ArrayList<Entity> linkedUsers;
	private ArrayList<Entity> linkedSpaces;
	
	public String getIntelliText() {
		return intelliText;
	}

	public void setIntelliText(String intelliText) {
		this.intelliText = intelliText;
	}

	public String getIntelliHtml() {
		return intelliHtml;
	}

	public void setIntelliHtml(String intelliHtml) {
		this.intelliHtml = intelliHtml;
	}

	public ArrayList<Entity> getLinkedEntities() {
		return linkedEntities;
	}

	public void setLinkedEntities(ArrayList<Entity> linkedEntities) {
		this.linkedEntities = linkedEntities;
	}

	public ArrayList<Entity> getLinkedUsers() {
		return linkedUsers;
	}

	public void setLinkedUsers(ArrayList<Entity> linkedUsers) {
		this.linkedUsers = linkedUsers;
	}

	public ArrayList<Entity> getLinkedSpaces() {
		return linkedSpaces;
	}

	public void setLinkedSpaces(ArrayList<Entity> linkedSpaces) {
		this.linkedSpaces = linkedSpaces;
	}

}
