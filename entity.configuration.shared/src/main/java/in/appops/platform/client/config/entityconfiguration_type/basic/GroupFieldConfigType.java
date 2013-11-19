package in.appops.platform.client.config.entityconfiguration_type.basic;

import in.appops.platform.client.config.client_type.GroupFieldConfig;
import java.util.ArrayList;

/**
 * @author pallavi@ensarm.com
 * @createdOn 11-Nov-2013
 */

@SuppressWarnings("serial")
public class GroupFieldConfigType extends BaseFieldConfigType{
	
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
	
	public GroupFieldConfigType() {
		setParentConfigtype(GROUPFIELDCONFIG, false, this.getClass(), BaseFieldConfigType.class, GroupFieldConfig.class);
	}
	
	 @Override
	public void populateProperties() {
		 ViewConfigType viewConfigType = new ViewConfigType();
			
			viewConfigType.addProperty(GF_TYPE, GFTYPE_SINGLE_SELECT, false, null, null, null);
			//viewConfigType.addAlternateProperty(GF_TYPE,GFTYPE_MULTISELECT, false, null, null, null);
			
			viewConfigType.addProperty(GF_ALIGNMENT,GF_ALIGN_VERTICAL, false, null, null, null);
			//viewConfigType.addAlternateProperty(GF_ALIGNMENT,GF_ALIGN_HORIZONTAL, false, null, null, null);
			
			viewConfigType.addProperty(GF_LIMIT, 3, false, null, null, null);
			
			ArrayList<String> listOfItems = new ArrayList<String>();
			listOfItems.add("radio1");
			listOfItems.add("radio2");
			listOfItems.add("radio3");
			listOfItems.add("radio4");
			
			viewConfigType.addProperty(GF_LIST_OF_ITEMS,listOfItems, false, null, null, null);
			viewConfigType.addProperty(GF_ID, "testGroupField", false, null, null, null);
			
			addProperty(MODEL, new ModelConfigType());
			addProperty(PRESENTER, new PresenterConfigType());
			addProperty(VIEW, viewConfigType);
	}
}
