package com.qa.walmart.stepdef;

import com.qa.walmart.orders.Orders;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import cucumber.api.java.en.And;
import junit.framework.Assert;

public class InputFileStepDef {

	Orders order;
	String orderNumber;
	String coordinate;
	String timestamp;

	@Given("^order Number, coordinates, timeStamp$")
	public void order_Number() throws Throwable {
		orderNumber="WM001";
		coordinate="N3E6";
		timestamp="6:12:45";			
	}
	

	@When("^these values are sent for creating an Order$")
	public void these_values_are_sent_for_creating_an_Order() throws Throwable {
		order = new Orders(orderNumber,coordinate,timestamp);
	}

	@Then("^a new customer order is created$")
	public void a_new_customer_order_is_created() throws Throwable {
		Assert.assertTrue(order.getOrderNum()==orderNumber);
		Assert.assertTrue(order.getCoordinates()==coordinate);
		Assert.assertTrue(order.getTimeStamp()==timestamp);
	}


//	@Given("^Order Number and timestamp$")
//	public void order_Number_and_timestamp() throws Throwable {
//		orderNumber =  "WM002";
//		coordinate = null;
//		timestamp = "11:30:55";
//	}
//
//	@When("^coordinates are passed as blank$")
//	public void coordinates_are_passed_as_blank() throws Throwable {
//		blankCoords.setOrderNum(orderNumber);
//		blankCoords.setCoordinates(coordinate);
//		blankCoords.setTimeStamp(timestamp);
//	}
//
//	@Then("^new record should not be created$")
//	public void new_record_should_not_be_created() throws Throwable {
//		Assert.assertEquals(orderNumber, blankCoords.getOrderNum());
//		Assert.assertEquals(timestamp, blankCoords.getTimeStamp());
//		Assert.assertNotNull(coordinate);
//	}

}
