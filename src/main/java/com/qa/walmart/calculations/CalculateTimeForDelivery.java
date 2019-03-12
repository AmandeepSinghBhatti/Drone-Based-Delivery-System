package com.qa.walmart.calculations;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculateTimeForDelivery {

	public String calculateTime(String coordinates, String timestamp) {

		int additionalMinutes = 0;
		String orderTime[] = timestamp.split(":");
		Pattern p = Pattern.compile("[a-z]+|\\d+");
		Matcher m = p.matcher(coordinates);
		ArrayList<String> allMatches = new ArrayList<String>();
		while (m.find()) {
			allMatches.add(m.group());
		}

		additionalMinutes = Integer.parseInt(allMatches.get(0)) + Integer.parseInt(allMatches.get(1))
		+((Integer.parseInt(orderTime[0])*60))+((Integer.parseInt(orderTime[2])/60));

		//		additionalMinutes = additionalMinutes+((Integer.parseInt(orderTime[0])*60))+((Integer.parseInt(orderTime[2])/60));

		int hours = (int)additionalMinutes / 60;
		int minutes = (int)additionalMinutes % 60;
		BigDecimal secondsPrecision = new BigDecimal((additionalMinutes - Math.floor(additionalMinutes))
				* 100).setScale(2, RoundingMode.HALF_UP);
		int seconds = secondsPrecision.intValue();

		boolean nextDay = false;

		if (seconds > 59) {
			minutes++; //increment minutes by one
			seconds = seconds - 60; //recalculate seconds
		}

		if (minutes > 59) {
			hours++;
			minutes = minutes - 60;
		}

		//next day
		if (hours > 23) {
			hours = hours - 24;
			nextDay = true;
		}

		//if seconds >=10 use the same format as before else pad one zero before the seconds
		final String myFormat = seconds >= 10 ? "%d:%02d:%d" : "%d:%02d:0%d";
		final String time = String.format(myFormat, hours, minutes, seconds);
		//		    System.out.print(time);
		//		    System.out.println(" " + (nextDay ? "The next day" : "Current day"));		

		return time;
	}
}
