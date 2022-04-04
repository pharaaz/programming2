package assignment;

/*
 * This class stores information about a flight, such as origin, destination cities,departure time,	
 * flight number, and a	SeatMap.
 * @author Mohammed Faraaz Khan 17985055
 * 
 */ 

public class Flight{
	private String flightIdentifier;
	private String originCity;
	private String destCity;
	private String departureTime;
	private SeatMap seating;
	
	public Flight(String flightIdentifier, String originCity, String destCity, String departureTime, SeatMap seating) {
		this.flightIdentifier=flightIdentifier;
		this.originCity=originCity;
		this.destCity=destCity;
		this.departureTime=departureTime;
		this.seating=seating;
	}
	
	public String getFlightIdentifier() {
		return this.flightIdentifier;
	}
	
	public String getOriginCity() {
		return this.originCity;
	}
	
	public void setOriginCity(String originCity) {
		this.originCity=originCity;
	}
	
	public String getDestCity() {
		return this.destCity;
	}
	
	public void setDestCity(String destCity) {
		this.destCity=destCity;
	}
	
	public SeatMap getSeating() {
		return this.seating;
	}
	
	public void setSeating(SeatMap seating) {
		this.seating=seating;
	}
	
	public String getTime() {
		return this.departureTime;
	}
	
	public void setTime(String departureTime) {
		this.departureTime=departureTime;
	}
	
	/*
	 *@returns string  containing text representing the flight information.
	 * @author 17985055
	 */
	
	public String toString() {
		return "Flight: " +this.flightIdentifier +" from: " +this.originCity +" to: " +this.destCity +" departing: " +this.departureTime;
	}


}
