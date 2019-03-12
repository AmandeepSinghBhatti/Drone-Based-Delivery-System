package com.qa.walmart.calculations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.qa.walmart.constants.Constants;
import com.qa.walmart.orders.Orders;

public class CalculateNPS {

	public float NPScalculation(ArrayList<Orders> orderList) {

		File file = new File(Constants.outPutFilePath); 
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		} 

		String st=null;
		long difference = 0;	
		int i=0;
		String ordersOutputArray[];
		float promoter = 0;
		float detractor = 0;
		
		try {
			while ((st = br.readLine()) != null) {	
				if(st.isEmpty()) break;
				ordersOutputArray =  new String[2];
				ordersOutputArray = st.split(" ");				
				System.out.println(ordersOutputArray[0]+"  "+orderList.get(i).getOrderNum());
				SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");

				if(orderList.get(i).getOrderNum().equals(ordersOutputArray[0])) {
					try {
						Date date1 = format.parse(orderList.get(i).getTimeStamp());
						System.out.println("Date1= "+date1.getTime());
						Date date2 = format.parse(ordersOutputArray[1]);
						System.out.println("Date2= "+date2.getTime());
						difference = date2.getTime() - date1.getTime();
						System.out.println("Difference in minutes = "+difference/3600000);
						if(difference/60>=8.5) {promoter++;}
						else if(difference/60>=0 && difference<6.5) {detractor++;} 
						i++;
					} catch (ParseException e) {						
						e.printStackTrace();
					}
				}		
				
				else continue;
			}
			System.out.println("Number of Promoters= "+promoter);
			System.out.println("Number of Detractors= "+detractor);
			
			System.out.println((promoter*100/orderList.size())-(detractor*100/orderList.size()));			
			
		} catch (IOException e) {		
			e.printStackTrace();
		}
		
		return ((promoter*100/orderList.size())-(detractor*100/orderList.size()));
	}

}
