package com.qa.walmart.launcher;

import java.util.ArrayList;
import java.util.Collections;
import com.qa.walmart.calculations.CalculateNPS;
import com.qa.walmart.calculations.GetInputOrdersFile;
import com.qa.walmart.calculations.OutPutFile;
import com.qa.walmart.orders.Orders;

public class DeliveryTracker {

	public static float  netPromoterScore;
	public static void main(String args[]) {
		ArrayList<Orders> orders = new ArrayList<Orders>();
		GetInputOrdersFile input = new GetInputOrdersFile();
		OutPutFile out = new OutPutFile();
		CalculateNPS nps = new CalculateNPS();
		orders = input.getOrdersList();
		Collections.shuffle(orders);
		out.generateOutPutFile(orders);
		netPromoterScore = nps.NPScalculation(orders);
		System.out.println("Net Promoter Score = "+netPromoterScore);		
	
	}

}
