package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.GroupFieldConfig;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author pallavi@ensarm.com
 * @createdOn 11-Nov-2013
 */

@SuppressWarnings("serial")
public class GroupFieldConfigType extends BaseFieldConfigType{
	
	/** Configurations available **/
	public static final String GF_TYPE = "fieldType";
	public static final String GFTYPE_SINGLE_SELECT = "singleSelect";
	public static final String GFTYPE_MULTISELECT = "multiselect";
	public static final String GF_ALIGNMENT = "alignment";
	public static final String GF_ALIGN_VERTICAL = "alignVertical";
	public static final String GF_ALIGN_HORIZONTAL = "alignHorizontal";
	public static final String GF_LIMIT = "limit";
	public static final String GF_LIST_OF_ITEMS = "listOfItems";
	public static final String GF_ID = "groupFieldid";
	
	public static final String	GROUPFIELDCONFIG		= "GroupFieldConfig";
	private Logger logger = Logger.getLogger("GroupFieldConfigType");
	
	public GroupFieldConfigType() {
		super(true);
		setParentConfigtype(GROUPFIELDCONFIG, false, this.getClass(), GroupFieldConfigType.class, GroupFieldConfig.class);
		populateProperties();
	}
	
	@Override
	public void populateProperties() {
		try {
			viewConfigType.addProperty(GF_TYPE, GFTYPE_SINGLE_SELECT, false, null,null, null);
			viewConfigType.addProperty(GF_ALIGNMENT, GF_ALIGN_VERTICAL, false,null, null, null);
			viewConfigType.addProperty(GF_LIMIT, 3, false, null, null, null);
			viewConfigType.addProperty(GF_LIST_OF_ITEMS, null, false, null, null,null);
			viewConfigType.addProperty(GF_ID, "testGroupField", false, null, null,null);
		} catch (Exception e) {
			logger.log(Level.SEVERE,"[GroupFieldConfigType]::Exception In populateProperties  method :"+e);
		}
	}
	 
	 @Override
	protected void populateAlternateProperties() {
		try {
			viewConfigType.addAlternateProperty(GF_TYPE,GFTYPE_MULTISELECT, false, null, null, null);
			viewConfigType.addAlternateProperty(GF_ALIGNMENT,GF_ALIGN_HORIZONTAL, false, null, null, null);
		} catch (Exception e) {
			logger.log(Level.SEVERE,"[GroupFieldConfigType]::Exception In populateAlternateProperties  method :"+e);
		}
	}
}
