package assignment01;
/*
 * this class contains an array of results called a transcript
 * @author Mohammed Faraaz Khan 17985055
 */

public class Student {
	private String name;
	private final static int MAX_TRANSCRIPT_LENGTH=20;
	private int numberOfResults;
	private Result[] transcript;
	
	public Student(String name) {
		this.name=name;
		transcript = new Result[MAX_TRANSCRIPT_LENGTH];
	}
		 /*
		  * the method below creates a result object and adds it to the end of the transcript
		  * using the current max array input to do so. 
		  * only creates an result object and places it in it if it is not already at max length, 20. 
		  * at the end updates number of results. 
		  */
	public void addResultToTranscript(Module module, Grade grade)
	{
		Result newResult = new Result(module, grade);
		if(numberOfResults < MAX_TRANSCRIPT_LENGTH) {
			transcript[numberOfResults]=newResult;
		}
		numberOfResults++;
	}
	 
	 public String getName()
		{
			return name;
		}
	 public int getNResults()
		{
			return numberOfResults;
		}
	 
	/*
	 *  returns an array of the result objects using a for loop and if statement to make sure the 
	 *  array does not contain  any null entities. 
	 */
	
	 public Result[] getTranscript() {
		   Result[] returnTranscript = new Result[numberOfResults];
	       for(int i=0;i<numberOfResults;i++) {
	           if(transcript[i]!=null) {
	        	   returnTranscript[i]=transcript[i];
	           }
	       }
	       return returnTranscript;
	   }
	
	public void setTranscript(Result[] transcript)
	{
		this.transcript=transcript;
	}
	
	public void setnumberOfResults(int numberOfResults)
	{
		this.numberOfResults=numberOfResults;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	@Override
	public String toString()
	{
		return "Name of student: " +this.name;
	}
	
}
