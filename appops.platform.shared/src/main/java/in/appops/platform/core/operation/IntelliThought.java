package in.appops.platform.core.operation;

import java.io.Serializable;

public class IntelliThought implements Serializable{
	
	// More methods to provide List<User Entity>, List<Space Entity>, List<AllEntities>
	
	private String intelliText;
	private String intelliHtml;

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

}
