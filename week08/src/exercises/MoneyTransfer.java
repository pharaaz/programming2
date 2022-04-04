package exercises;
import java.util.Date;

public class MoneyTransfer {
	private CustomerAccount to;
	private CustomerAccount from;
	private double amount;
	private long timeStamp;
	
	public MoneyTransfer(CustomerAccount to, CustomerAccount from, double amount)throws MoneyTransferException{
		if(to==null) {
			MoneyTransferException me = new
					 MoneyTransferException("To customer accounts cannot be null");
					 me.setTimeStamp(this.timeStamp);
					 throw me;
		}
		else if(from==null) {
			MoneyTransferException me = new
					 MoneyTransferException("From customer accounts cannot be null");
					 me.setTimeStamp(this.timeStamp);
					 throw me;
		}
		else if(to==from) {
			MoneyTransferException me = new
					 MoneyTransferException("To and From customer accounts cannot be identical");
					 me.setTimeStamp(this.timeStamp);
					 throw me;
		}
		else if(amount==0) {
			MoneyTransferException me = new
					 MoneyTransferException("Transfer amount cannot be zero");
			 me.setTimeStamp(this.timeStamp);
			 throw me;
		}
		else if(amount<0) {
			MoneyTransferException me = new
					 MoneyTransferException("Transfer amount cannot be negative");
					 me.setTimeStamp(this.timeStamp);
					 throw me;
					}
		
		this.to=to;
		this.from=from;
		this.amount=amount;
		this.timeStamp=System.currentTimeMillis();
	}
	
	public CustomerAccount getTo() {
		return to;
	}
	
	public CustomerAccount getFrom() {
		return from;
	}
	
	public double getAmmount() {
		return amount;
	}
	
	public long getTimeStamp() {
		return timeStamp;
	}
	
	public void setTo(CustomerAccount to)throws MoneyTransferException {
		if(to==null) {
			MoneyTransferException me = new
					 MoneyTransferException("To customer accounts cannot be null");
					 me.setTimeStamp(this.timeStamp);
					 throw me;
		}
		else if(to==from) {
			MoneyTransferException me = new
					 MoneyTransferException("To and From customer accounts cannot be identical");
					 me.setTimeStamp(this.timeStamp);
					 throw me;
		}
		this.to=to;
	}
	
	public void setFrom(CustomerAccount from)throws MoneyTransferException {
		if(from==null) {
			MoneyTransferException me = new
					 MoneyTransferException("From customer accounts cannot be null");
					 me.setTimeStamp(this.timeStamp);
					 throw me;
		}
		else if(to==from) {
			MoneyTransferException me = new
					 MoneyTransferException("To and From customer accounts cannot be identical");
					 me.setTimeStamp(this.timeStamp);
					 throw me;
		}
		this.from=from;
	}
	
	public void setAmount(double amount)throws MoneyTransferException {
		if(amount==0) {
			MoneyTransferException me = new
					 MoneyTransferException("Transfer amount cannot be zero");
			 me.setTimeStamp(this.timeStamp);
			 throw me;
		}
		else if (amount < 0) {
			 MoneyTransferException me = new
					 MoneyTransferException("Transfer amount cannot be negative");
					 me.setTimeStamp(this.timeStamp);
					 throw me;
					}
	}
	
	public void setTimeStamp(long timeStamp) {
		this.timeStamp=timeStamp;
	}
	
	@Override
	public String toString() {
		Date date=new Date(timeStamp);
		String dateString = date.toString();
		return "to: " +to +", from:" +from + ", amount:" +amount +", timestamp:" +dateString;
		
	}
		
	

}
