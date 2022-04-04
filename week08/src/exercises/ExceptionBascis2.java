package exercises;

public class ExceptionBascis2 {
	static boolean CAUSE_EXCEPTION=true;
	
	public static void main(String args[]){
		
		for(int i = 1; i<11;i++) {
			
			try {
				
				if(CAUSE_EXCEPTION)
				throw new Exception();
				System.out.println("End of the try block!");
				} catch (Exception e) {
				System.err.println(i +" Exception caught!");
				}
	
		}
	}
}
