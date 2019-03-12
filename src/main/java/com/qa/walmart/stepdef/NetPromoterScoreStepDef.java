package com.qa.walmart.stepdef;

import java.util.ArrayList;
import com.qa.walmart.calculations.CalculateNPS;
import com.qa.walmart.constants.Constants;
import com.qa.walmart.orders.Orders;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NetPromoterScoreStepDef {

	String filePath = Constants.outPutFilePath;
	ArrayList<Orders> al = new ArrayList<Orders>();
	float netPromoterScore;
	Orders placeOrder1; 
	String order1 = "WM001";
	String coordinates1 = "N0W0";
	String timestamp1 = "3:50:54";
	Orders placeOrder2;
	String order2 = "WM002";
	String coordinates2 = "S0W0";
	String timestamp2 = "5:07:05";
	CalculateNPS nps;

	@Given("^a list of orders$")
	public void a_list_of_orders() throws Throwable {
		order1 = "WM001";
		coordinates1 = "N8W3";
		timestamp1 = "3:50:54";
		Orders placeOrder2;
		order2 = "WM002";
		coordinates2 = "S80W12";
		timestamp2 = "5:07:05";
		placeOrder1 = new Orders(order1, coordinates1, timestamp1);
		al.add(placeOrder1);
		placeOrder2 = new Orders(order2, coordinates2, timestamp2);
		al.add(placeOrder2);	    			    
	}

	@When("^list is passed to the system$")
	public void list_is_passed_to_the_system() throws Throwable {

		nps = new CalculateNPS();
		netPromoterScore = nps.NPScalculation(al);	   
	}

	@Then("^nps is calculated correctly as per requirement$")
	public void nps_is_calculated_correctly_as_per_requirement() throws Throwable {

		//Write assertions
		System.out.println("Net Promoter Score= "+netPromoterScore);
	}
	
	@Given("^coordinates and timestamp$")
	public void coordinates_and_timestamp() throws Throwable {
	   
	}

	@When("^coordinates and timestamp are given to the system$")
	public void coordinates_and_timestamp_are_given_to_the_system() throws Throwable {
	    
	}

	@Then("^time for delivery is calculated correctly$")
	public void time_for_delivery_is_calculated_correctly() throws Throwable {
	    
	}

}
