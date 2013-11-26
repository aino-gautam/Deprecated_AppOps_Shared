package in.appops.platform.client.config.client_type;

import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.core.shared.Configuration;
import in.appops.platform.server.entityconfiguration_type.basic.StringConfigType;

/**
 * @author pallavi@ensarm.com
 * @createdOn 1-Nov-2013
 */

@SuppressWarnings("serial")
public class StringConfig extends Configuration {
	// respective methods to get properties / mvp / event maps etc..
	
	public StringConfig() {
		super.setType(new MetaType(StringConfig.class));
	}
	
	public Integer getMinLength(){
		return getPropertyByName(StringConfigType.MIN_LENGTH);
	}
	
	public Integer getMaxLength(){
		return getPropertyByName(StringConfigType.MAX_LENGTH);
	}
	
	public String getCharset(){
		return getPropertyByName(StringConfigType.CHARSET);
	}
}
