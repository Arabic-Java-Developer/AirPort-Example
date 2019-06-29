package com.codingelab.somy.airport.plane;

public class Plane {
	private static Plane P [] = new Plane[10];
	private static int COUNTER = 0;
	private String planeNumber;
	private int travelNumber;
	private String day; // plane day to air 
	
	// travel name
	private String firstTrip;
	private String secondTrip;
	private String thirdTrip;
	
	
	// constructor
	public Plane() {
		
		P[COUNTER] = this;
		COUNTER++;
		
	}

	// get information about plane
	public void getPlaneInfo() {
		System.out.println("Plane number : " + this.getPlaneNumber() + "\n" +  
												 "Travel number :  " + this.getTravelNumber() + "\n"  +  
												 "Plane day : " + this.getDay() + "\n" +
												 "Countries traveled : " + this.getFirstTrip() + " , " + this.getSecondTrip() + " , " + this.getThirdTrip());
	}
	
	public static Plane[] getPlanes() {
		return P;
	}
	
	// setter method(s)
	public  void setPlaneNumber(String planeNumber) {	this.planeNumber = planeNumber;	}
	public  void setTravelNumber(int travelNumber) {	this.travelNumber = travelNumber;	}
	public  void setDay(String day) {	this.day = day;	}
	public  void setFirstTrip(String firstTrip) {this.firstTrip = firstTrip;	}
	public  void setSecondTrip(String secondTrip) {this.secondTrip = secondTrip;	}
	public  void setThirdTrip(String thirdTrip) { this.thirdTrip = thirdTrip;	}
	
	// getter method(s)
	public  String getDay() {return day;	}
	public  String getFirstTrip() {	return firstTrip;	}
	public  String getSecondTrip() {return secondTrip;	}
	public  String getThirdTrip() {	return thirdTrip;	}
	public  String getPlaneNumber() { return planeNumber; }
	public  int getTravelNumber() { return travelNumber; }
}
