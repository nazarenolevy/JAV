package com.despegar.altovuelo.examples;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.junit.Assert;

@ContextConfiguration(locations = { "classpath:application-context.xml" })
public class TripGeneratorIntegrationTest extends AbstractJUnit4SpringContextTests {

	@Test
	public void testSprint(){
		TripGenerator tripGenerator = (TripGenerator) applicationContext.getBean("tripGenerator");
		tripGenerator.generateTrip();
		
		Assert.assertNotNull(tripGenerator);
	}
	
	
}
