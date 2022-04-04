package exercises;

public class MoneyTransferTester {
	public static void main(String args[]){
		CustomerAccount to = new CustomerAccount("Bob");
		CustomerAccount from = new CustomerAccount("Alice");
		try{
		new MoneyTransfer(to,from,100.00);
		}catch(MoneyTransferException me){
		System.err.println(me);
		}
		try{
		new MoneyTransfer(to,from,-99.00);
		}catch(MoneyTransferException me){
		System.err.println(me);
		}
		try{
			new MoneyTransfer(to,from, 0);
			}catch(MoneyTransferException me){
			System.err.println(me);
			}
		try{
			new MoneyTransfer(null,from,-99.00);
			}catch(MoneyTransferException me){
			System.err.println(me);
			}
		try{
			new MoneyTransfer(to,null,-99.00);
			}catch(MoneyTransferException me){
			System.err.println(me);
			}
		try{
			new MoneyTransfer(to,to,-99.00);
			}catch(MoneyTransferException me){
			System.err.println(me);
			}
		}
}
