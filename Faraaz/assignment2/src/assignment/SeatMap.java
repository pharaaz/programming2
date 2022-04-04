package assignment;

/*
 * This class is an abstract class with a abstract method which is overridden by the child class of this one. 
 *  Two dimensional array of seat object based on figure 1, given in brief.  
 * the number of rows and columns stored in this class make up the matrix.
 * Contains the number of rows in first class seats. 
 * @author Mohammed Faraaz Khan 17985055
 * 
 */

public abstract class SeatMap {
	protected Seat[][] seats;
	protected int nRows;
	protected int nColoumns;
	protected int nFirstClassRows;
	
	//Abstract method which is overridden by the child class of this one.
	abstract protected void initialiseSeatMap();
	
	/*
	 * @return the last column in seating map, which is a single char value. 
	 * @author 17985055
	 */
	public char lastSeatColumn() {
		
		return (char) ('A' + nColoumns);
	}
	/*
	 * @return the last row in seating map, which is a integer value. 
	 * @author 17985055
	 */
	public int lastSeatRow() {
		
		return nRows;
		
	}
	/*
	 *@return this method refers to figure 1 and returns a seat in a  
	 *. specified seat position. 
	 * @author 17985055
	 */
	public Seat getSeat(int seatRow, char seatColumn) {
		return  seats[seatRow][seatColumn];
	}
	/*
	 * @param Seat inputted innto this method to check if seat has a valid seat on its left. 
	 * this method uses the seat position to find the seat in the 2D array .
	 *. @return the seat to the inputs left, or else null will be returned. 
	 * @author 17985055
	 */
	
	public Seat getLeft(Seat aSeat) {
		int leftSeatRow = aSeat.getSeatposition().getRow();
		char leftSeatColumn = (char) (aSeat.getSeatposition().getColumn()-1);
		if(leftSeatColumn <='@') {
			return null;
		}
		else {
			return seats[leftSeatRow][leftSeatColumn];
		}
	}
	/*
	 * @param Seat inputed into this method to check if seat has a valid seat on its right. 
	 * this method uses the seat position to find the seat in the 2D array .
	 *. @return the seat to the inputs right, or else null will be returned. 
	 * @author 17985055
	 */
	public Seat getRight(Seat aSeat) {
		int rightSeatRow = aSeat.getSeatposition().getRow();
		char rightSeatColumn = (char) (aSeat.getSeatposition().getColumn()+1);
		if(rightSeatColumn < (nColoumns+64)) {
			return null;
		}
		else {
			return seats[rightSeatRow][rightSeatColumn];
		}
	}
	/*
	 * method has nested for loops to search the 2D array of seats, first for loop spans the rows n the second one spans the columns. 
	 * the first nested for loop will return a seat if it finds a seat in the economy class that is not reserved and
	 * is the same type as the input seat type. 
	 * if unsuccessful the second nested for loop searches for any seat in economy that is not reserved.  
	 * @param a seat type is inputed to find a seat with the same type. 
	 * @returned a seat is returned if method was successful in finding a desired seat or else null is returned. 
	 * @author 17985055
	 */
	public Seat queryAvailableEconomySeat(SeatType aType) {
		Seat found= null;
		int completed = 0;
		for(int i =0; i<nRows; i++) {
			for(int h = 0; h<nColoumns; h++) {
				if(seats[i][h].getSeatType()==aType && seats[i][h].isReserved() == false && seats[i][h].isFirstClass()==false) {
					found= seats[i][h];
					completed=1;
					break;
				}
				
			}
			if(completed==1) {
				break;
			}
		}
		
		if(found == null) {
			for(int i =0; i<nRows; i++) {
				for(int h = 0; h<nColoumns; h++) {
					if( completed == 0 && seats[i][h].isFirstClass()==false && seats[i][h].isReserved() == false) {
						found= seats[i][h];
						completed=1;
						break;
				}
					
				}
				if(completed==1) {
					break;
				}
			}
		}
			
		return found;
	}

	/*
	 * method has nested for loops to search the 2D array of seats, first for loop spans the rows n the second one spans the columns. 
	 * the first nested for loop will return a seat if it finds a seat in the first class that is not reserved and
	 * is the same type as the input seat type. 
	 * if unsuccessful the second nested for loop searches for any seat in first class that is not reserved.  
	 * @param a seat type is inputed to find a seat with the same type. 
	 * @returned a seat is returned if method was successful in finding a desired seat or else null is returned. 
	 * @author 17985055
	 */
	public Seat queryAvailableFirstClassSeat(SeatType aType) {
		Seat found= null;
		int completed = 0;
		for(int i =0; i<nRows; i++) {
			for(int h = 0; h<nColoumns;h++) {
				if(seats[i][h].getSeatType()==aType && seats[i][h].isReserved() == false && seats[i][h].isFirstClass()==true) {
						found= seats[i][h];
						completed=1;
						break;
				}
			}
			if(completed==1) {
				break;
			}
		}
		if(found==null) {
			for(int i =0; i<nRows; i++) {
				for(int h = 0; h<nColoumns;h++) {
					if(seats[i][h].isFirstClass()==true && seats[i][h].isReserved() == false) {
						found =seats[i][h];
						completed=1;
						break;
					}
				}
				if(completed==1) {
					break;
				}
			}
		}
		return found;
	}
	

	public Seat[][] getSeatsArray() {
		return this.seats;
		
	}
	
	public int getNRows() {
		return this.nRows;
	}
	
	public int getNColumns() {
		return this.nColoumns;
	}
	
	public int getNFirstClassRows() {
		return this.nFirstClassRows;
	}
	/*
	 *@returns string  containing text representing the seat map. 
	 * 
	 * @author 17985055
	 */
	public String toString() {
		
		StringBuilder seatMap = new StringBuilder();
		
		char a = 'A';
		
		System.out.print("     ");
		for(int h =0; h<nColoumns; h++) {
			System.out.print(a +"      ");
			a++;
		}
		System.out.println();
		
		for(int i=0; i<nRows;i++) {
			if(i<9) {
				System.out.print(" "+(i+1) +" ");
			}
			else {
				System.out.print((i+1) +" ");
			}
			for(int h =0; h<nColoumns; h++) {
				System.out.print(" [");
				if(seats[i][h].isFirstClass()==true) {
					if(seats[i][h].getSeatType()== SeatType.WINDOW) {
						System.out.print("W");
					}
					else if(seats[i][h].getSeatType()== SeatType.MIDDLE) {
						System.out.print("M");
					}
					else if(seats[i][h].getSeatType()== SeatType.AISLE) {
						System.out.print("A");
					}
				}
				else if(seats[i][h].isFirstClass()==false) {
					if(seats[i][h].getSeatType()== SeatType.WINDOW) {
						System.out.print("w");
					}
					else if(seats[i][h].getSeatType()== SeatType.MIDDLE) {
						System.out.print("m");
					}
					else if(seats[i][h].getSeatType()== SeatType.AISLE) {
						System.out.print("a");
					}
					
				}
				if(seats[i][h].isReserved()==true) {
					System.out.print(" X ]");
				}
				else {
					System.out.print(" _ ]");
				}

			}
			System.out.println();
		} 
		
		return seatMap.toString();
		
	}

}

