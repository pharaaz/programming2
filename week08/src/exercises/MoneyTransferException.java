package exercises;

public class MoneyTransferException extends IllegalArgumentException{
	private long timeStamp;
	
	public MoneyTransferException(String message){
		super(message);
		}
		public MoneyTransferException(){
		super();
		}
		
		public long getTimeStamp() {
			return timeStamp;
		}
		public void setTimeStamp(long timeStamp) {
			this.timeStamp=timeStamp;
		}

}
