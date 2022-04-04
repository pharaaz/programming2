package assignment01;
/*
 * result class stores the module and grade objects. 
 * @author Mohammed Faraaz Khan 17985055
 */
public class Result {
	private Module module;
	private Grade grade;
	/*constructor initializing both instance variables.
	 * @author 17985055
	 */
	
	public Result(Module module, Grade grade) {
		this.module=module;
		this.grade=grade;
	}
	
	public Module getModule()
	{
		return module;
	}
	
	public Grade getGrade() 
	{
		return grade;
	}
	
	public void setModule(Module module)
	{
		this.module=module;
	}
	
	public void setGrade(Grade grade)
	{
		this.grade=grade;
	}
	/*
	 * tostring going to return the String type which is the sentence below and not the 
	 * memory address. 
	 * @author  17985055
	 */
	@Override
	public String toString() {
		return "The result is" +this.grade;
	}
	
	

}
