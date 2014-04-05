package in.appops.platform.client;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EntityContextGeneratorTest {
	EntityContext	context;
	
	@Before
	public void setUp() throws Exception {
		EntityContext context1 = EntityContextGenerator.defineContext(null, 1L);
		context = context1;
		EntityContext context2 = context1.defineContext(2L);
		EntityContext context3 = context2.defineContext(3L);
		EntityContext context4 = context3.defineContext(4L);
	}
	
	@Test
	public void test() {
		String contextStr = EntityContextGenerator.getEntityContextString(context);
		assertEquals(contextStr, "4:3:2:1");
	}
	
}
