package assignment;
/*
 * This class extends the abstract class Airline, shows inheritance. 
 * @author Mohammed Faraaz Khan 17985055
 * 
 */
public class SimpleWay extends Airline{
	
	public SimpleWay(String name) {
		setAirlineName(name);
		
	}
	
	/*
	 * Overrides the abstract methods from the parent class.
	 * @param a is a Flight attribute and 
	 * @param b is a Seat type
	 * theses two inputs are used to find a corresponding 
	 *@returns seat that abides by the booking rules of SimpleWay Airlines for a particular seat. 
	 *to do this nested for loops and if statements are used.
	 *Also the method if it finds the seat, it will book the seat.  
	 * @author 17985055
	 */
	
	@Override
	public Seat reserveFirstClass(Flight aFlight, SeatType aType) {
		Seat found = null;
		Seat checkNeighbour = null;
		Seat neighbour = null;
		int rows =aFlight.getSeating().getNRows();
		int coloumns = aFlight.getSeating().getNColumns();
		int complete = 0;
		Seat[][] seats = aFlight.getSeating().getSeatsArray();
		
		if(aFlight.getSeating().queryAvailableFirstClassSeat(aType) != null) {
			found = aFlight.getSeating().queryAvailableFirstClassSeat(aType);
			found.setReserved(true);

		}
		else {
			
			for(int i =0; i<rows; i++) {
				for(int h = 0; h<coloumns; h++) {
					if(seats[i][h].getSeatType()==SeatType.WINDOW || seats[i][h].getSeatType()==SeatType.MIDDLE ) {
						if(seats[i][h].isReserved() == false && seats[i][h].isFirstClass()==false) {
							checkNeighbour =seats[i][h];
							if(aFlight.getSeating().getRight(checkNeighbour)!=null) {
								found =seats[i][h];
								neighbour = aFlight.getSeating().getRight(checkNeighbour);
								found.setReserved(true);
								neighbour.setReserved(true);
								complete=1;
								break;
							}
							else if(aFlight.getSeating().getLeft(checkNeighbour)!=null) {
								found =seats[i][h];
								neighbour = aFlight.getSeating().getLeft(checkNeighbour);
								found.setReserved(true);
								neighbour.setReserved(true);
								complete=1;
								break;
							}
						}
					}
				}
				
				if(complete == 1) {
					break;
				}
			}
		}
		return found; 
	}
	
	/*
	 * Overrides the abstract methods from the parent class.
	 * @param a is a Flight attribute and 
	 * @param b is a Seat type
	 * theses two inputs are used to find a corresponding 
	 *@returns seat that abides by the booking rules of SimpleWay Airlines for a particular seat. 
	 *to do this nested for loops and if statements are used.
	 *Also the method if it finds the seat, it will book the seat. 
	 * @author 17985055
	 */

	@Override
	public Seat reserveEconomy(Flight aFlight, SeatType aType) {
		Seat found;
		if(aFlight.getSeating().queryAvailableEconomySeat(aType)==null) {
			found=null;
		}
		else {
			found =aFlight.getSeating().queryAvailableEconomySeat(aType);
			found.setReserved(true);
		}
		
		return found;
	}
}
