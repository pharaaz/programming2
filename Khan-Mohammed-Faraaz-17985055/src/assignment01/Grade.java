package assignment01;
/*
 * 
 * Enumerated type called grade, and has a list of possible grades a student can have.
 * Using encapsulation by having 3 private instance variables for each grade,
 * acts as a boundary consisting of a high and low integer, also a boolean value 
 * representing if the grade is a fail or not. 
 * 
 * 
 * 
 * @author Mohammed Faraaz Khan 17985055
 */

public enum Grade {
	APLUS(90,100,true),
	A(85,89,true),
	AMINUS(80,84,true),
	BPLUS(75,79,true),
	B(70,74,true),
	BMINUS(65,69,true),
	CPLUS(60,64,true),
	C(55,59,true),
	CMINUS(50,54,true),
	D(0,49,false);
	
	private int low;
	private int high;
	private boolean pass;
/*
 * Constructor with three input variables for all the instance variables in this enumerator to  
 * initialize the Grade objects.
 * @17985055
 */
	
	private Grade(int low, int high, boolean pass) {
		this.low=low;
		this.high=high;
		this.pass=pass;
	}
	/*
	 * the tostring() below is used when called to pass on information currently help by it.
	 * @return type is a string in this case which is passed on, if there was no return type,
	 * the tostring would have printed the address memory.  
	 * 
	 */
	
	public String toString() {
		return "grade is" +this.low +this.high;
	}
	/*
	 * the boolean isPass() checks the current state of the boolean value which represents
	 * if the student failed or not. 
	 * @return is a boolean true or false value which states if the grade was a pass or false 
	 * otherwise. 
	 * @17985055
	 */
	public boolean isPass() {
		return this.pass;
	}
	
	public int getHigh() {
		return this.high;
		
	}
	
	public int getLow() {
		return this.low;
	}
	
	

	

}
