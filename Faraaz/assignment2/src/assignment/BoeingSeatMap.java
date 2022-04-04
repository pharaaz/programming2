package assignment;
/*
 * This class extends the abstract class SeatMap, shows inheritance. 
 * Initializes the attributes
 * @author Mohammed Faraaz Khan 17985055
 * 
 */ 

public class BoeingSeatMap extends	SeatMap{
	
	public BoeingSeatMap() {
		this.nRows=10;
		this.nColoumns=7;
		this.nFirstClassRows=4;
		initialiseSeatMap();
		
	}
	/*
	 * calls initialiseSeatMap method and populates the seat array according to figure 3. 
	 * to do this, nested for loops are used to span through the rows and columns, and if statements are used to
	 * make sure the right seats are placed correctly in the seat array. 
	 * @return void 
	 * @author 17985055
	 */
	@Override
	protected void initialiseSeatMap() {
		this.seats=new Seat[nRows][nColoumns];
		SeatPosition[][] seatPosition = new SeatPosition[nRows][nColoumns];
		
		for(int i=0; i<nRows;i++) {
			for(int h =0; h<nColoumns; h++) {
				seatPosition[i][h]=new SeatPosition(i+1,(char) ('A'+1));
				
				if(i<4) {
					if(h==0||h==6) {
						this.seats[i][h]= new Seat(seatPosition[i][h], SeatType.WINDOW, true);
					}
					else if(h==1||h==2||h==4||h==5) {
						this.seats[i][h]=new Seat(seatPosition[i][h], SeatType.AISLE, true);
					}
					else if(h==3) {
						this.seats[i][h]=new Seat(seatPosition[i][h], SeatType.MIDDLE, true);
					}
				}
				else {
					if(h==0||h==6) {
						this.seats[i][h]= new Seat(seatPosition[i][h], SeatType.WINDOW, false);
					}
					else if(h==1||h==2||h==4||h==5) {
						this.seats[i][h]=new Seat(seatPosition[i][h], SeatType.AISLE, false);
					}
					else if(h==3) {
						this.seats[i][h]=new Seat(seatPosition[i][h], SeatType.MIDDLE, false);
					}
				}
			}
		}
		
	}

}
