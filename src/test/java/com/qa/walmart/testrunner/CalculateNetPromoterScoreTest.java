package com.qa.walmart.testrunner;

import java.util.ArrayList;

import org.junit.Test;

import com.qa.walmart.calculations.CalculateNPS;
import com.qa.walmart.calculations.GetInputOrdersFile;
import com.qa.walmart.orders.Orders;

import junit.framework.Assert;

public class CalculateNetPromoterScoreTest {
	GetInputOrdersFile getOrdersFile = new GetInputOrdersFile();
	CalculateNPS nps;
	ArrayList<Orders> ordersList;
	float netPromoterScore =0;	
	
	@Test// When a valid list of orders is given to calculateNPS()...
	public void calculateNPSTest() {
		ordersList = getOrdersFile.getOrdersList();
		nps = new CalculateNPS();
		netPromoterScore=nps.NPScalculation(ordersList);
		Assert.assertNotNull(netPromoterScore);
	}
	
	@Test// When a blank file is passed as feed to this program.
	public void blankOrdersInputFile() {
		netPromoterScore=nps.NPScalculation(ordersList);
		Assert.assertNotNull(netPromoterScore);
	}

}
