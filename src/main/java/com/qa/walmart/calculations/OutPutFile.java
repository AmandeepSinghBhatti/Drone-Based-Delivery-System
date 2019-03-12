package com.qa.walmart.calculations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import com.qa.walmart.constants.Constants;
import com.qa.walmart.launcher.DeliveryTracker;
import com.qa.walmart.orders.Orders;

public class OutPutFile {

	Orders order;
	CalculateTimeForDelivery calculateTime;
	CalculateNPS nps = new CalculateNPS();

	public void generateOutPutFile(ArrayList<Orders> input) {
		
		System.out.println("Inside OutPut File class");
		File out = new File(Constants.outPutFilePath);
		FileOutputStream fos=null;
		try {
			fos = new FileOutputStream(out);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

		for (int i = 0; i < input.size(); i++) {
			//write logic to split the time
			calculateTime = new CalculateTimeForDelivery();
			try {								
				//bw.write(input.get(i).getOrderNum()+" "+input.get(i).getTimeStamp());
				bw.write(input.get(i).getOrderNum()+" "+calculateTime.calculateTime
						(input.get(i).getCoordinates(), input.get(i).getTimeStamp()));
				bw.newLine();				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			bw.newLine();
			bw.write("*******");
			bw.newLine();
			bw.write("NPS ");
			
			float netPromoterScore = nps.NPScalculation(input);
			System.out.println("Value = "+netPromoterScore);
			bw.write(Float.toString(netPromoterScore));
			//bw.write(Float.toString(DeliveryTracker.netPromoterScore));
			bw.close();
		}
			
		 catch (IOException e) {
			e.printStackTrace();
		}
		//return bw;

	}
}
