package exercises;

public class ExceptionBasics {
	static boolean CAUSE_EXCEPTION=false;
	public static void main(String args[]){
	try {
	System.out.println("Try Block executed:");
	if(CAUSE_EXCEPTION)
	throw new Exception("This is an exception");
	System.out.println("End of the try block!");
	} catch (Exception e) {
	System.err.println("Catch Block executed on :"+e);
	}
	finally{
	System.out.println("Finally Block is executed");
	}
	}

}


/*
 * output when CAUSE EXCEPTION=true
 * 
 * Catch Block executed on :java.lang.Exception: This is an exception
   Try Block executed:
   Finally Block is executed
 */

/*
 * output when CAUSE EXCEPTION=false
 * 
 * Try Block executed:
   End of the try block!
   Finally Block is executed
 */



