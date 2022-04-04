package assignment01;
/*
 * this class stores the semester one module  offerings of a course. 
 * 
 * @author Mohammed Faraaz Khan 17985055
 */
public class TechnicalSchool {
	private Module[] offerings;
	
	/*
	 * Below is a default constructor, therefore have no input parameters. it instantiates 
	 * the offerings variable with an appropriate Module object. 
	 * @author 17985055
	 */
	public TechnicalSchool() 
	{
		 this.offerings = TechnicalSchool.semesterOneModuleOfferings();
	}
	
	public Module[] getSemesterOfferings() 
	{
		return this.offerings;
	}
	/*
	 * the method below searches offerings array and 
	 * @returns a module with the matching code.
	 * @para input is a string code which is used to match against the offerings array. 
	 * for the search a for loop is used which keeps iterating for the whole length of
	 * the offerings array. 
	 * if statement is used to determine if  the codes are matching, in which case 
	 * the module are equal to each other and 
	 * @returned as the output of the method. 
	 * @author Mohammed Faraaz Khan 17985055
	 */
	public Module lookup(String code) 
	{
		Module matchingModule = offerings[0];
		for(int i=0; i<offerings.length; i++)
		{
			if(offerings[i].getCode().equals(code)) 
			{	
				matchingModule = offerings[i];
			}
		}
		
		return matchingModule;
	}
	/*
	 * below method has a
	 * @return of Module[] which returns a primitive array and
	 * has stored 13 Module objects.
	 * 
	 * @author 17985055
	 */
	private static Module[] semesterOneModuleOfferings(){
		Module[] modules = new Module[] {
		new Module(ModuleType.TAUGHT, "Programming", "PROG101", Level.ONE),
		new Module(ModuleType.TAUGHT, "Statistics", "STAT102", Level.ONE),
		new Module(ModuleType.TAUGHT, "Database Design", "DATA222", Level.TWO),
		new Module(ModuleType.TAUGHT, "Object-Oriented Programming", "PROG202", Level.TWO),
		new Module(ModuleType.TAUGHT, "Information Systems", "INSY313", Level.THREE),
		new Module(ModuleType.SELF_STUDY, "Web Services", "WEBS332", Level.THREE),
		new Module(ModuleType.SELF_STUDY, "Technology Applications", "TECH103", Level.ONE),
		new Module(ModuleType.SELF_STUDY, "Theory of Computation", "THEO111", Level.ONE),
		new Module(ModuleType.SELF_STUDY, "Model Checking", "MODC233", Level.TWO),
		new Module(ModuleType.SELF_STUDY, "Topology", "TOPG233", Level.TWO),
		new Module(ModuleType.SELF_STUDY, "Logic", "LOGI321", Level.THREE),
		new Module(ModuleType.PROJECT, "Web App Dev", "PROJ399", Level.THREE),
		new Module(ModuleType.CLIENT_PROJECT, "Great Code Company", "EXTO396", Level.THREE)};
		
		return modules;
		
	}
	/*
	 * recieved a student object as input parameter
	 * called getTranscript() method for student then used modles student pass and used loop
	 * to go thru modules one by one to check grade and level and see if was following the 
	 * conditions. 
	 */
	public boolean isCertified(Student p1) 
	{
		int conditionA = 0;
		int conditionB = 0;
		int conditionC = 0;
		int conditionD = 0;
		int numTaught = 0;
		int numSelfStudy = 0;
		boolean pass;
		
		Result p1Results[]= p1.getTranscript();
	
		for(int i=0; i<p1Results.length; i++)
		{
			Module p1Module = p1Results[i].getModule();
			Level p1Level = p1Module.getLevel();
			ModuleType p1type = p1Module.getType();
			Grade p1Grade = p1Results[i].getGrade();
			boolean p1Pass = p1Grade.isPass();
			
			if(p1Level.equals(Level.ONE)) {
				if(p1Pass) {
					if(p1type.equals(ModuleType.TAUGHT)||p1type.equals(ModuleType.SELF_STUDY)) {
						conditionA++;
					}
				}
				
			}
			else if(p1Level.equals(Level.TWO)) {
				if(p1Pass) {
					conditionB++;
					if(p1type.equals(ModuleType.TAUGHT)) { 
						numTaught++;
					}
				}
			}
			else if(p1Level.equals(Level.THREE)) {
				if(p1Pass) {
					conditionC++;
					if(p1type.equals(ModuleType.SELF_STUDY)) {
						numSelfStudy++;
					}	
				}
			}
			if(p1Pass) {
				if(p1type.equals(ModuleType.PROJECT)||p1type.equals(ModuleType.CLIENT_PROJECT)) {
					conditionD++;
				}
			}
		}
		
		if(conditionA>=3&&(conditionB>=3&&numTaught>1)&&(conditionC>=4&&numSelfStudy>=2)&&(conditionD>=1)) {
			pass = true;
		}
		else {
			 pass = false;
		}
		
		return pass;
		
	}
	
}
	


