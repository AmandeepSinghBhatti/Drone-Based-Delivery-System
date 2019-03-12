package com.qa.walmart.testrunner;

import org.junit.Assert;
import org.junit.Test;

import com.qa.walmart.orders.Orders;

public class OrdersTest {
	
	@Test
	public void shouldCreateANewOrder() {
		
		String orderNum = "O1";
		String coordinates = "N2E10";
		String timeStamp = "5:30:24";
		
		Orders order = new Orders("O1","N2E10","5:30:24");
		
		
		order.setOrderNum(orderNum);
		Assert.assertTrue(orderNum.equals(order.getOrderNum()));		
		
		order.setCoordinates(coordinates);
		Assert.assertTrue(coordinates.equals(order.getCoordinates()));		
		
		order.setTimeStamp(timeStamp);
		Assert.assertTrue(timeStamp.equals(order.getTimeStamp()));
	}

}
