package com.codingelab.somy.airport.airport;

 
public class Airport {
	
	private String planes[];
	private int travels[];
	
	private String days [] = new  String [7];
	
	public Airport() {
		
		this.days[0] = "Saturday";
		this.days[1] = "Sunday";
		this.days[2] = "Monday"; 
		this.days[3] = "Tuesday";
		this.days[4] = "Wednesday";
		this.days[5] = "Thursday";
		this.days[6] = "Friday";
	}
	
	// setter method(s)
	public void setPlans(String[] plans) { this.planes = plans; }
	public void setTravels(int travels[]) { 	this.travels = travels ; }
	public void setDays(String[] days) { this.days = days;	}
	
	// getter method(s)
	public String[] getPlans() { return planes; }
	public int[] getTravels() { 	return this.travels; }
	public String[] getDays() { return days; }
	

 
 
	
	
	
}
