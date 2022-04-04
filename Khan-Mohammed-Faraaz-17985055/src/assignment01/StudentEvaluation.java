package assignment01;

public class StudentEvaluation {
	static public Student Axel() 
	{
	       
		Student p1Stu = new Student("Axel");
		TechnicalSchool p1TechSc = new TechnicalSchool();
				
		p1Stu.addResultToTranscript(p1TechSc.lookup("PROG101"), Grade.BPLUS);
		p1Stu.addResultToTranscript(p1TechSc.lookup("STAT102"), Grade.C);
		p1Stu.addResultToTranscript(p1TechSc.lookup("DATA222"), Grade.A);
		p1Stu.addResultToTranscript(p1TechSc.lookup("PROG202"), Grade.C);
		p1Stu.addResultToTranscript(p1TechSc.lookup("INSY313"), Grade.AMINUS);
		p1Stu.addResultToTranscript(p1TechSc.lookup("WEBS332"), Grade.A);
		p1Stu.addResultToTranscript(p1TechSc.lookup("TECH103"), Grade.D);
		p1Stu.addResultToTranscript(p1TechSc.lookup("MODC233"), Grade.B);
		p1Stu.addResultToTranscript(p1TechSc.lookup("TOPG233"), Grade.B);
		p1Stu.addResultToTranscript(p1TechSc.lookup("PROJ399"), Grade.CMINUS);
		p1Stu.addResultToTranscript(p1TechSc.lookup("EXTO396"), Grade.C);
		
		return p1Stu;
	}
		
	static public Student Kate() 
	{
		Student p2Stu = new Student("Kate");
		TechnicalSchool p2TechSc = new TechnicalSchool();
		
		p2Stu.addResultToTranscript(p2TechSc.lookup("PROG101"), Grade.APLUS);
		p2Stu.addResultToTranscript(p2TechSc.lookup("STAT102"), Grade.AMINUS);
		p2Stu.addResultToTranscript(p2TechSc.lookup("TECH103"), Grade.BPLUS);
		p2Stu.addResultToTranscript(p2TechSc.lookup("MODC233"), Grade.A);
		p2Stu.addResultToTranscript(p2TechSc.lookup("TOPG233"), Grade.C);
		p2Stu.addResultToTranscript(p2TechSc.lookup("DATA222"), Grade.A);
		p2Stu.addResultToTranscript(p2TechSc.lookup("INSY313"), Grade.BPLUS);
		p2Stu.addResultToTranscript(p2TechSc.lookup("WEBS332"), Grade.AMINUS);
		p2Stu.addResultToTranscript(p2TechSc.lookup("PROJ399"), Grade.B);
		p2Stu.addResultToTranscript(p2TechSc.lookup("EXTO396"), Grade.B);
		
		return p2Stu;
	}
	
	static public Student Jim()
	{
		Student p3Stu = new Student("Jim");
		TechnicalSchool p3TechSc = new TechnicalSchool();
		
		p3Stu.addResultToTranscript(p3TechSc.lookup("PROG101"), Grade.A);
		p3Stu.addResultToTranscript(p3TechSc.lookup("STAT102"), Grade.BPLUS);
		p3Stu.addResultToTranscript(p3TechSc.lookup("DATA222"), Grade.CPLUS);
		p3Stu.addResultToTranscript(p3TechSc.lookup("PROG202"), Grade.C);
		p3Stu.addResultToTranscript(p3TechSc.lookup("INSY313"), Grade.C);
		p3Stu.addResultToTranscript(p3TechSc.lookup("WEBS332"), Grade.CPLUS);
		p3Stu.addResultToTranscript(p3TechSc.lookup("TECH103"), Grade.CMINUS);
		p3Stu.addResultToTranscript(p3TechSc.lookup("THEO111"), Grade.D);
		p3Stu.addResultToTranscript(p3TechSc.lookup("MODC233"), Grade.APLUS);
		p3Stu.addResultToTranscript(p3TechSc.lookup("TOPG233"), Grade.A);
		p3Stu.addResultToTranscript(p3TechSc.lookup("LOGI321"), Grade.B);
		p3Stu.addResultToTranscript(p3TechSc.lookup("PROJ399"), Grade.BMINUS);
		p3Stu.addResultToTranscript(p3TechSc.lookup("EXTO396"), Grade.APLUS);
		
		return p3Stu;
		
	}
	
	static public Student Robin()
	{
		Student p4Stu = new Student("Robin");
		TechnicalSchool p4TechSc = new TechnicalSchool();
		p4Stu.addResultToTranscript(p4TechSc.lookup("PROG101"), Grade.C);
		p4Stu.addResultToTranscript(p4TechSc.lookup("DATA222"), Grade.C);
		p4Stu.addResultToTranscript(p4TechSc.lookup("INSY313"), Grade.CPLUS);
		p4Stu.addResultToTranscript(p4TechSc.lookup("WEBS332"), Grade.CPLUS);
		p4Stu.addResultToTranscript(p4TechSc.lookup("TECH103"), Grade.CPLUS);
		p4Stu.addResultToTranscript(p4TechSc.lookup("MODC233"), Grade.CMINUS);
		p4Stu.addResultToTranscript(p4TechSc.lookup("TOPG2331"), Grade.CMINUS);
		p4Stu.addResultToTranscript(p4TechSc.lookup("PROJ399"), Grade.APLUS);
		
		return p4Stu;
		
	}
	
	
	public static void main(String[] args) {
		TechnicalSchool stuTS = new TechnicalSchool();
		StudentEvaluation.Jim();
		
		System.out.println("According to the Certification Algorithm, the state of Jim"
				+ " being certified is: " +stuTS.isCertified(StudentEvaluation.Jim()));
		System.out.println("According to the Certification Algorithm, the state of Robin"
				+ " being certified is: " +stuTS.isCertified(StudentEvaluation.Robin()));
		System.out.println("According to the Certification Algorithm, the state of Kate"
				+ " being certified is: " +stuTS.isCertified(StudentEvaluation.Kate()));
		System.out.println("According to the Certification Algorithm, the state of Axel"
				+ " being certified is: " +stuTS.isCertified(StudentEvaluation.Axel()));
		System.out.println("According to the Certification Algorithm, the state of Jim"
				+ " being certified is: " +stuTS.isCertified(StudentEvaluation.Jim()));
		
		Result pupilResults[]= StudentEvaluation.Axel().getTranscript();
		Student pupilStudent = StudentEvaluation.Axel();
				
		System.out.println("\nTranscript for " +pupilStudent);
		for(int i=0; i<pupilResults.length; i++) {
			Grade pupilGrade = pupilResults[i].getGrade();
			Module pupilModule = pupilResults[i].getModule();
			System.out.println(pupilModule);
			System.out.println(pupilGrade);
		}

	}
}
