package exercises;

public class Standard {
	private int minutes;
	private int text;
	private int minLimit;
	private int textLimit;
	private int sPack;
	
	public Standard(int min,int txt)
	{
		this.minLimit = min;
		this.textLimit = txt;
		this.minutes = 0;
		this.text =0;
		
	}

	public void talk(int nMinsTalked) {
		this.minutes = nMinsTalked;
		if(this.minutes >= minLimit) {
			System.out.println("You have reached yourlimit for talk minutes");
		}
	}
	
	public void sendTexts(int nTextSent) {
		this.text=nTextSent;
		if(this.text >= textLimit) {
			System.out.println("You have reached your limit for text.");
		}
	}
	
	publi
	
	

}
