package spring.boot.gradle;

import static org.junit.Assert.assertEquals;



import org.junit.Test;


public class APIControllerTest {
	@Test public void testHello() {
        APIController classUnderTest = new APIController();
        String expected = "Spring Boot Elango";
        assertEquals(expected, classUnderTest.hello());
    }
}
