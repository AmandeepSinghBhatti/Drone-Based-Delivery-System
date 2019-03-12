package com.qa.walmart.testrunner;

import org.junit.Test;

import com.qa.walmart.calculations.CalculateTimeForDelivery;

public class CalculateTimeForDeliveryTest {
	
	CalculateTimeForDelivery timeTaken;
	
	@Test
	public void DroneTravelTimeTest() {
		
		timeTaken =new CalculateTimeForDelivery(); 
		
		System.out.println(timeTaken.calculateTime("N50E3", "2:30:45"));
	}

}
