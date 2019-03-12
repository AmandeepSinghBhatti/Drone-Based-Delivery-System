package com.qa.walmart.testrunner;

import java.util.ArrayList;

import org.junit.Test;

import com.qa.walmart.calculations.GetInputOrdersFile;
import com.qa.walmart.orders.Orders;

import junit.framework.Assert;

public class GetOrdersInputFileTest {
	GetInputOrdersFile getOrdersFile = new GetInputOrdersFile();
	ArrayList<Orders> ordersList; 

	@Test
	public void shouldGetOrdersList() {	
		
		ordersList = getOrdersFile.getOrdersList();
		Assert.assertTrue(ordersList.size()==4);
	}
	
	@Test
	public void orderListShouldNotBeEmpty() {
		
		ordersList = getOrdersFile.getOrdersList();
		Assert.assertTrue(!ordersList.isEmpty());
	}
	
}
