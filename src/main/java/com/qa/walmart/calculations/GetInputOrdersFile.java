package com.qa.walmart.calculations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.qa.walmart.constants.Constants;
import com.qa.walmart.orders.Orders;

public class GetInputOrdersFile {

	public ArrayList<Orders> getOrdersList(){

		File file = new File(Constants.inputFilePath); 
		Orders order=null;	
		ArrayList<Orders> ordersList = new ArrayList<Orders>();
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} 
			

		String st=null;
		String ordersArray[] =  new String[3];
		try {
			while ((st = br.readLine()) != null) {				
				
				//order=new Orders();
				ordersArray = st.split(" ");
				order = new Orders(ordersArray[0], ordersArray[1], ordersArray[2]);
//				order.setOrderNum(ordersArray[0]);
//				order.setCoordinates(ordersArray[1]);
//				order.setTimeStamp(ordersArray[2]);
				ordersList.add(order);	
				
			}
		} catch (IOException e) {		
			e.printStackTrace();
		} 

		return ordersList;
	}
}

