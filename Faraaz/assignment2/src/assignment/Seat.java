package assignment;
/*
 * This class consists of data regarding if a seat is reserved or is in first class.
 *  Has data regarding the type of seat, e.g if the seat is a AISLE, MIDDLE or WINDOW seat. 
 *  has a Seat position object to form a seat position map. 
 * 
 * @author Mohammed Faraaz Khan 17985055
 * 
 */
public class Seat {
	private SeatType seatType;
	private boolean firstClass;
	private boolean reserved;
	private SeatPosition seatPosition;
	
	public Seat(SeatPosition seatPosition, SeatType seatType, boolean firstClass) {
		this.seatPosition=seatPosition;
		this.seatType=seatType;
		this.firstClass=firstClass;
	}
	
	public SeatType getSeatType() {
		return this.seatType;
	}
	
	public boolean 	isFirstClass() {
		return this.firstClass;
	}
	
	public boolean 	isReserved() {
		return this.reserved;
	}
	
	public void setReserved(boolean reserved) {
		this.reserved=reserved;
	}
	
	public SeatPosition getSeatposition() {
		return this.seatPosition;
	}
	
	/*
	 * @return The bellow method out puts a String which has a text description of the seat
	 * 
	 *  @author 17985055
	 */
	public String toDescription() {
		if(reserved==true) {
			if(firstClass== true) {
				return "The First class " +this.seatType +" seat at "
						+this.seatPosition.getRow() +this.seatPosition.getColumn()
						+" is reserved.";
			}
			else {
				return "The Economy class " +this.seatType +" seat at "
						+this.seatPosition.getRow() +this.seatPosition.getColumn()
						+" is reserved.";
			}
		}
		else {
			if(firstClass== true) {
				return "The First class " +this.seatType +" seat at "
						+this.seatPosition.getRow() +this.seatPosition.getColumn()
						+" is not reserved.";
			}
			else {
				return "The Economy class " +this.seatType +" seat at "
						+this.seatPosition.getRow() +this.seatPosition.getColumn()
						+" is not reserved.";
			}
		}
	}
	
	public String toString(){
		if(seatType ==seatType.WINDOW && reserved == false) {
			return "[W ]";
		}
		return null;
	}

}
