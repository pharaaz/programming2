package exercises;

public class Data extends Standard{
	
	private int data;
	private int dataLimit;
	
	public Data(int minutes, int text, int datalil) {
		super(minutes,text);
		this.dataLimit=datalil;
		this.data=0;
	
	}
	
	public void transfer(int n) {
		
		this.data=n;
		if(data>=dataLimit) {
			System.out.println("YOu have reached your data limit.");
		}
	}
	

}
