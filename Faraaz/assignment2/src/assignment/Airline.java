package assignment;
/*
 * This class is an abstract class with a abstract method which is overridden by the child class of this one. 
 * @author Mohammed Faraaz Khan 17985055
 * 
 */

public abstract class Airline {
	private String airlineName; 
	
	//these two methods below are abstract methods whitch are overridden in the child class. 
	
	abstract public Seat reserveFirstClass(Flight aFlight, SeatType aType);
	abstract public Seat reserveEconomy(Flight aFlight, SeatType aType);

	public String getAirlineName() {
		return this.airlineName;
	}
	
	public void setAirlineName(String airlineName) {
		this.airlineName=airlineName;
	}
	
	/*
	 *@returns string  containing text representing the object.
	 * @author 17985055
	 */
	public String toString() {
		return "Welcome to the " +airlineName +" Airline reservation system";
	}

}