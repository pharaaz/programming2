package assignment01;
/*
 * this class maintains the types of modules in a course, having the instance variables for type,title,
 * code and level.
 * encapsulation is practiced through the private instance variables. 
 * 
 * @author Mohammed Faraaz Khan 17985055
 */
public class Module {
	private String title;
	private String code;
	private Level level;
	private ModuleType type;
	/* 
	 * Initializes all instance variables with one constructor, 
	 * therefore constructor has 4 input parameters used for initializing the instance variable.
	 *  @author 17985055
	 */
	public Module(ModuleType type, String title, String code, Level level) {
		this.type=type;
		this.title=title;
		this.code=code;
		this.level=level;
	}
	
	public String getTitle()
	{
		return title;
		
	}
	
	public String getCode() 
	{
		return code;
	}
	
	public Level getLevel() 
	{
		return level;
	}
	
	public ModuleType getType() 
	{
		return type;
	}
	
	public void setTitle(String title)
	{
		this.title=title;
	}
	
	public void setCode(String code)
	{
		this.code=code;
	}
	
	public void setLevel(Level level)
	{
		this.level=level;
	}
	
	public void setType(ModuleType type)
	{
		this.type=type;
	}
	/*
	 * instead of the tostring returning the address memory the tostring is overridden 
	 * returning a String type which is used to return a formed sentence.
	 * @author 17985055
	 */
	@Override
	public String toString()
	{
		return "The class: " +this.title +", whose code is " +this.code 
				+"is a level " +this.level +"class, and has a Module type of:"
				+this.type;
	}
	
	

}
