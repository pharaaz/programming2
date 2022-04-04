package assignment;
/*
 * This class is designed to consist of the row and column values of a seat in the seat map.
 * The row values are stored as integer values and the column values are stored as char values. 
 * 
 * @author Mohammed Faraaz Khan 17985055
 * 
 */

public class SeatPosition {
	private int row; 
	private char column; 
	
	public SeatPosition(int row, char column) {
		this.row=row;
		this.column=column;
	}
	
	public int getRow() {
		return this.row;
	}
	
	public char getColumn() {
		return this.column;
	}
	
}
