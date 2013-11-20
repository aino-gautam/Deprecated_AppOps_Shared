package in.appops.platform.client.config.entityconfiguration_type.basic;

import java.util.logging.Level;
import java.util.logging.Logger;

import in.appops.platform.client.config.client_type.StateFieldConfig;

/**
 * @author pallavi@ensarm.com
 * @createdOn 11-Nov-2013
 */
@SuppressWarnings("serial")
public class StateFieldConfigType extends BaseFieldConfigType{

	/** Configurations available **/
	public static final String IS_STATIC_BOX = "isStaticBox";
	public static final String ITEMS_LIST = "itemsList";
	public static final String STFD_QUERYNAME = "queryName";
	public static final String STFD_OPRTION = "operation";
	public static final String STFD_QUERY_MAXRESULT = "queryMaxresult";
	public static final String STFD_ENTPROP = "propertyToDisplay";
	public static final String STFD_QUERY_RESTRICTION = "queryRestriction";
	public static final String IS_SEARCH_QUERY = "isSearchQuery";
	public static final String IS_AUTOSUGGESTION = "isAutoSuggestion";
	public static final String	STATEFIELD		= "StateFieldConfig";
	
	private Logger logger = Logger.getLogger("StateFieldConfigType");
	
	public StateFieldConfigType() {
		super(true);
		setParentConfigtype(STATEFIELD, false, this.getClass(), BaseFieldConfigType.class, StateFieldConfig.class);
		populateProperties();
	}
	
	@Override
	public void populateProperties() {
		try {
			modelConfigType.addProperty(ModelConfigType.OPERATIONNAME, null, false, null, null, null);
			modelConfigType.addProperty(ModelConfigType.OPERATIONPARAM, null, false, null, null, null);
			modelConfigType.addProperty(ModelConfigType.QUERYNAME, null, false, null, null, null);
			modelConfigType.addProperty(ModelConfigType.QUERYPARAM, null, false, null, null, null);
			
			viewConfigType.addProperty(IS_STATIC_BOX, false, false, null, null, null);
			viewConfigType.addProperty(IS_SEARCH_QUERY, false, false, null, null, null);
			viewConfigType.addProperty(IS_AUTOSUGGESTION, false, false, null, null, null);
			viewConfigType.addProperty(STFD_ENTPROP, "name", false, null, null, null);
			viewConfigType.addProperty(BF_SUGGESTION_POS, BF_SUGGESTION_INLINE, false, null, null, null);
			viewConfigType.addProperty(BF_SUGGESTION_TEXT, "Enter suggestion text", false, null, null, null);
			viewConfigType.addProperty(ITEMS_LIST, null, false, null, null, null);
			viewConfigType.addProperty(STFD_QUERY_MAXRESULT, 10, false, null, null, null);
			viewConfigType.addProperty(STFD_QUERY_RESTRICTION, null, false, null, null, null);
		} catch (Exception e) {
			logger.log(Level.SEVERE,"[StateFieldConfigType]::Exception In populateProperties  method :"+e);
		}
				
	}
}
