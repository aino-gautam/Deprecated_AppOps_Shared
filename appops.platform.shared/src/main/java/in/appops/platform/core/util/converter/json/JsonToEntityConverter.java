/**
 * 
 */
package in.appops.platform.core.util.converter.json;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONNumber;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.json.client.JSONValue;

import in.appops.platform.core.entity.Entity;
import in.appops.platform.core.entity.GeoLocation;
import in.appops.platform.core.entity.Key;
import in.appops.platform.core.entity.Property;
import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.core.entity.type.Type;
import in.appops.platform.core.util.EntityList;




/**
 * @author mahesh@ensarm.com
 *
 */
public class JsonToEntityConverter {

	private Logger logger = Logger.getLogger(JsonToEntityConverter.class.getSimpleName());
	
	public EntityList getConvertedJsonToEntity(String jsonObjectStr){
		EntityList entityList = null;
		try {
			entityList = new EntityList();
			JSONValue jsonVal = JSONParser.parseLenient(jsonObjectStr);
			
			JSONObject jsonObj = jsonVal.isObject();
			for (String strId : jsonObj.keySet()) {
				JSONObject json = (JSONObject) jsonObj.get(strId);
				Entity entity = getConvertedEntity(json);
				entityList.add(entity);
			}
			
		} catch (Exception e) {
			logger.log(Level.SEVERE, "[JsonToEntityConverter] :: [getConvertedJsonToEntity] :: Exception", e);
		}
		return entityList;
	}

	public EntityList getConvertedJsonToEntity(JSONObject jsonObj){
		EntityList entityList = null;
		try {
			entityList = new EntityList();
			for (String strId : jsonObj.keySet()) {
				JSONObject json = (JSONObject) jsonObj.get(strId);
				Entity entity = getConvertedEntity(json);
				entityList.add(entity);
			}
			
		} catch (Exception e) {
			logger.log(Level.SEVERE, "[JsonToEntityConverter] :: [getConvertedJsonToEntity] :: Exception", e);
		}
		return entityList;
	}
	
	protected Entity getConvertedEntity(JSONObject json) {
		Entity entity = null;
		try{
			entity = new Entity();
			JSONArray mainKeyArray = json.isArray();
			JSONValue mainKey = mainKeyArray.get(0);
			JSONObject childJson = (JSONObject) json.get(mainKey.toString()).isObject();
			String[] splitter = mainKey.toString().split("##");
			
			Class clientClass = Class.forName(splitter[0]);
			Type type = new  MetaType(clientClass);
			
			entity.setType(type);
			
			JSONArray propNameArray = childJson.isArray();
	
			for (int i = 0; i < propNameArray.size(); i++) {
				String propName = ((JSONValue)propNameArray.get(i)).toString();
				JSONObject propValueJson = ((JSONValue)childJson.get(propName)).isObject();
				
				entity = addProperty(propValueJson, propName, entity);
			}
		}
		catch (Exception e) {
			logger.log(Level.SEVERE, "[JsonToEntityConverter] :: [getConvertedEntity] :: Exception", e);
		}
		return entity;
	}

	private Entity addProperty(JSONObject propValueJson, String propName,Entity entity) {
		try{
			JSONArray propNameArray = propValueJson.isArray();
			
			String primitiveTypeName = ((JSONValue)propNameArray.get(0)).toString();
			if(!primitiveTypeName.contains("##")){
				if(primitiveTypeName.equals("Date")){
					Property<Date> dateProp = new Property<Date>();
					dateProp.setName(propName);
					Long val = Long.parseLong(((JSONNumber)propValueJson.isNumber()).toString());
					Date date = new Date(val);
					dateProp.setValue(date);
					entity.setProperty(propName, dateProp);
				}
				else if (primitiveTypeName.equals("Key")) {
					JSONObject actulalId = (JSONObject) propValueJson.get(primitiveTypeName);
					JSONArray actulalIdArray = actulalId.isArray();
					String primitiveTypeNameMain = actulalIdArray.get(0).toString();
					Long value = Long.parseLong(actulalId.get(primitiveTypeNameMain).toString());
					Key<Long> key = new Key<Long>(value);
					Property<Key<Long>> keyProperty = new Property<Key<Long>>(key);
					entity.setProperty(propName, keyProperty);
				}
				else if(primitiveTypeName.equals("Double")){
					Property<Double> doubleProp = new Property<Double>();
					doubleProp.setName(propName);
					Double val = propValueJson.get(primitiveTypeName).isNumber().doubleValue();
					doubleProp.setValue(val);
					entity.setProperty(propName, doubleProp);
				}
				else if(primitiveTypeName.equals("String")){
					Property<String> stringProp = new Property<String>();
					stringProp.setName(propName);
					String val = propValueJson.get(primitiveTypeName).toString();
					stringProp.setValue(val);
					entity.setProperty(propName, stringProp);
				}
				else if(primitiveTypeName.equals("Integer")){
					Property<Integer> integerProp = new Property<Integer>();
					integerProp.setName(propName);
					Integer val = Integer.parseInt(propValueJson.get(primitiveTypeName).toString());
					integerProp.setValue(val);
					entity.setProperty(propName, integerProp);
				}
				else if(primitiveTypeName.equals("Float")){
					Property<Float> floatProp = new Property<Float>();
					floatProp.setName(propName);
					String val = propValueJson.get(primitiveTypeName).toString();
					Float floatValue = Float.parseFloat(val);
					floatProp.setValue(floatValue);
					entity.setProperty(propName, floatProp);
				}
				else if(primitiveTypeName.equals("Boolean")){
					Property<Boolean> booleanProp = new Property<Boolean>();
					booleanProp.setName(propName);
					Boolean val = propValueJson.get(primitiveTypeName).isBoolean().booleanValue();
					booleanProp.setValue(val);
					entity.setProperty(propName, booleanProp);
				}
				else if(primitiveTypeName.equals("Byte")){
					Property<Byte> byteProp = new Property<Byte>();
					byteProp.setName(propName);
					String val = propValueJson.get(primitiveTypeName).toString();
					Byte byteVal = new Byte(val);
					byteProp.setValue(byteVal);
					entity.setProperty(propName, byteProp);
				}
				else if(primitiveTypeName.equals("Long")){
					Property<Long> longProp = new Property<Long>();
					longProp.setName(propName);
					Long val = Long.parseLong(propValueJson.get(primitiveTypeName).toString());
					longProp.setValue(val);
					entity.setProperty(propName, longProp);
				}
				else if(primitiveTypeName.equals("GeoLocation")){
					JSONObject geoLocJson = (JSONObject) propValueJson.get(primitiveTypeName);
					Double lat,lng;
					JSONObject latJson = (JSONObject) geoLocJson.get("lattitude");
					JSONObject lngJson = (JSONObject) geoLocJson.get("longitude");
					
					lat = latJson.get("Double").isNumber().doubleValue();
					lng = lngJson.get("Double").isNumber().doubleValue();
					GeoLocation geoLoc = new GeoLocation();
					geoLoc.setLatitude(lat);
					geoLoc.setLongitude(lng);
					
					Property<GeoLocation> geoProp = new Property<GeoLocation>();
					geoProp.setName(propName);
					geoProp.setValue(geoLoc);
					
					entity.setProperty(propName, geoProp);
				}
			}
			else{
				Entity childEntity = getConvertedEntity(propValueJson);
				entity.setProperty(propName, childEntity);
			}
		}
		catch (Exception e) {
			logger.log(Level.SEVERE, "[JsonToEntityConverter] :: [addProperty] :: Exception", e);

		}
		return entity;
	}
}
