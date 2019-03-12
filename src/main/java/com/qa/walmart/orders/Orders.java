package com.qa.walmart.orders;

public class Orders {
	
	public String orderNum;
	public String coordinates;
	public String timeStamp;

	public Orders(String orderNum, String coordinates, String timeStamp) {
		this.orderNum = orderNum;
		this.coordinates = coordinates;
		this.timeStamp = timeStamp;
	}
	
	public String getOrderNum() {
		
		return orderNum;
	}	
	
	
	public void setOrderNum(String orderNum) {		
		this.orderNum = orderNum;
	}
	public String getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}	

}
