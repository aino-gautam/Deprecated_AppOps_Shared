/**
 * 
 */
package in.appops.platform.core.util.converter.json;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import in.appops.platform.core.entity.Entity;
import in.appops.platform.core.entity.GeoLocation;
import in.appops.platform.core.entity.Key;
import in.appops.platform.core.entity.Property;
import in.appops.platform.core.entity.type.Type;
import in.appops.platform.core.util.EntityList;

import org.json.JSONObject;


/**
 * @author mahesh@ensarm.com
 *
 */
public class EntityToJsonConverter {
	
	private Logger logger = Logger.getLogger(EntityToJsonConverter.class.getSimpleName());


	public JSONObject getConvertedEntityList(EntityList entList) {
		JSONObject jsonObj=null;
		try{
			jsonObj= new JSONObject();
			if(entList!=null){
				Integer cnt = 0;
				for(Entity entity : entList){
					JSONObject childJson = createChildJson(entity);
					jsonObj.put(cnt.toString(), childJson);
					cnt++;
				}
			}
		}
		catch (Exception e) {
			logger.log(Level.SEVERE, "[EntityToJsonConverter] : [getConvertedEntityList] : Exception" , e);
		}
		return jsonObj;
	}


	private JSONObject createChildJson(Entity entity) {
		JSONObject mainJson = null;
		JSONObject childJson=null;
		try{
			childJson = new JSONObject();
			HashMap<String, Property<? extends Serializable>> propMap = entity.getValue();
			for(String propName : propMap.keySet()){

				Property prop = entity.getProperty(propName);
				if(prop instanceof Entity){
					Entity childEnt = (Entity) prop;
					JSONObject subChildJson = createChildJson(childEnt);
					childJson.put(propName, subChildJson);
				}
				else{
					Object value = prop.getValue();

					if(value instanceof Key){
						value = ((Key) value).getKeyValue();

						JSONObject actualJsonVal= new JSONObject();
						actualJsonVal.put("Long", value);

						JSONObject keyJson = new JSONObject();
						keyJson.put("Key", actualJsonVal);

						childJson.put(propName, keyJson);
					}
					else if(value instanceof GeoLocation){
						GeoLocation geoLoc = (GeoLocation) value;
						Double latitude = geoLoc.getLatitude();
						Double longitude = geoLoc.getLongitude();

						JSONObject actualLatJson = new JSONObject();
						actualLatJson.put("Double", latitude.toString());

						JSONObject actualLngJson = new JSONObject();
						actualLngJson.put("Double", longitude.toString());

						JSONObject geoJson = new JSONObject();
						geoJson.put("lattitude", actualLatJson);
						geoJson.put("longitude", actualLngJson);

						JSONObject geoLocJson = new JSONObject();
						geoLocJson.put("GeoLocation", geoJson);
						
						childJson.put(propName, geoLocJson);
					}
					else if(value instanceof Integer){
						JSONObject intJson = new JSONObject();
						intJson.put("Integer", value.toString());

						childJson.put(propName, intJson);
					}
					else if(value instanceof Double){
						JSONObject doubleJson = new JSONObject();
						doubleJson.put("Double", value.toString());

						childJson.put(propName, doubleJson);
					}
					else if(value instanceof Long){
						JSONObject longJson = new JSONObject();
						longJson.put("Long", value.toString());

						childJson.put(propName, longJson);
					}
					else if(value instanceof Float){
						JSONObject floatJson = new JSONObject();
						floatJson.put("Float", value.toString());

						childJson.put(propName, floatJson);
					}
					else if(value instanceof Date || value instanceof Timestamp || value instanceof java.sql.Date){
						Long time = 0L;
						JSONObject dateJson = new JSONObject();
						if(value instanceof Date){
							time = ((Date)value).getTime();
							dateJson.put("Date", time.toString());
						}
						else if(value instanceof Timestamp){
							time = ((Timestamp)value).getTime();
							dateJson.put("Timestamp", time.toString());
						}
						else if(value instanceof java.sql.Date){
							time = ((java.sql.Date)value).getTime();
							dateJson.put("java.sql.Date", time.toString());
						}
						childJson.put(propName, dateJson);
					}
					else if(value instanceof String){
						JSONObject strJson = new JSONObject();
						strJson.put("String", value.toString());

						childJson.put(propName, strJson);
					}
					else if(value instanceof Boolean){
						JSONObject booleanJson = new JSONObject();
						booleanJson.put("Boolean", value.toString());

						childJson.put(propName, booleanJson);
					}
					else if(value instanceof Byte){
						JSONObject byteJson = new JSONObject();
						byteJson.put("Byte", value.toString());

						childJson.put(propName, byteJson);
					}
				}
			}
			
			Key<Long> value = entity.getPropertyByName("id");
			String val =  value.getKeyValue().toString();

			Type type = entity.getType();

			String key = type.getTypeName()+"##"+val;
            mainJson = new JSONObject();
            mainJson.put(key, childJson);
		}
		catch (Exception e) {
			logger.log(Level.SEVERE, "[EntityToJsonConverter] : [createChildJson] : Exception" , e);
		}
		return mainJson;
	}

}
