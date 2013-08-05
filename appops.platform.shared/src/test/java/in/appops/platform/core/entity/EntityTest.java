package in.appops.platform.core.entity;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test case that will test methods from entity class
 * @author mahesh@ensarm.com
 * @createdOn 05-Aug-2013
 */
public class EntityTest {

	/**
	 * Will set properties to an entity using the graph setter method
	 * @return
	 */
	@Test
	public Entity testSetGraphPropertyValue() {
		try{
			Entity entity = new Entity();
			entity.setGraphPropertyValue("id", "2",null);
			assertTrue(entity.getPropertyByName("id") !=null);
			
			Entity subEnt = new Entity();
			entity.setGraphPropertyValue("child", subEnt,null);
			assertTrue(entity.getPropertyByName("child") !=null);
			
			entity.setGraphPropertyValue("child.id", "1",null);
			assertTrue(((Entity)entity.getPropertyByName("child")).getPropertyByName("id") !=null);
			
			Entity level2ent = new Entity();
			entity.setGraphPropertyValue("child.subChild", level2ent, null);
			
			assertTrue(((Entity)entity.getPropertyByName("child")).getPropertyByName("subChild") !=null);
			assertTrue(((Entity)entity.getPropertyByName("child")).getPropertyByName("subChild") instanceof Entity);

			entity.setGraphPropertyValue("child.subChild.id", "5",null);
			assertTrue(((Entity)((Entity)entity.getPropertyByName("child")).getPropertyByName("subChild")).getPropertyByName("id") !=null);
			
			return entity; 
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 *  Will set properties to an entity using the graph setter method and 
	 *  later test getter method for fetching properties for graph
	 */
	@Test
	public void testGetGraphPropertyValue() {
		try{
			Entity entity = testSetGraphPropertyValue();
			assertTrue(entity.getGraphPropertyValue("id",null) !=null);

			assertTrue(entity.getGraphPropertyValue("child",null) !=null);
			
			assertTrue(entity.getGraphPropertyValue("child.id",null) != null);

			assertTrue(entity.getGraphPropertyValue("child.subChild",null) != null);
			
			assertTrue(entity.getGraphPropertyValue("child.subChild",null) instanceof Entity);

			assertTrue(entity.getGraphPropertyValue("child.subChild.id",null) != null );
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
