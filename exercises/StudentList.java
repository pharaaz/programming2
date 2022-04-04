package exercises;
import java.util.ArrayList;

public class StudentList{
	
   private ArrayList<Student> person;
   
   public StudentList(){
	   person = new ArrayList<Student>();
   }
  
   public void add(Student found){
	   person.add(found);
   }
  
   public ArrayList<String> enrolledIn(String code){
	   
       ArrayList<String> name = new ArrayList<String>();
       
       for(Student found: person){
           if(found.code.contains(code))
               name.add(found.name);
       }
       return name;
   }

	
public static void main(String[] args) {
StudentList studentList = new StudentList();
studentList.add(new Student("Bob", "COMP503,COMP600"));
studentList.add(new Student("Robin", "COMP501,COMP600"));
studentList.add(new Student("Jamal", "COMP503"));
System.out.println(studentList.enrolledIn("COMP503"));
}
}

