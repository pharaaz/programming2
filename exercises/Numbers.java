package exercises;
import java.util.ArrayList;
import java.util.Collections;

public class Numbers {
	private ArrayList<Integer> list;
	
	public Numbers() {
		list = new ArrayList<Integer>();
	}
	
	public void addNumber(Integer i) {
		list.add(i);
	}
	
	public void clear() {
		list.clear();
	}
	
	public void printList()
	{
		if(list.isEmpty()) {
			System.out.println("List is empty");
		}
		else {
			System.out.println(list);
		}
	}
	
	public Integer min(){
		return Collections.min(list);
	}
	
	public Integer max() {
		return Collections.max(list);
	}
	
	
	public static void main(String[] args) {
		
		Numbers test = new Numbers();
	
		test.addNumber(5);
		test.addNumber(9);
		test.addNumber(18);
		test.addNumber(11);
		test.addNumber(99);
		test.addNumber(19);
		test.addNumber(24);
		test.addNumber(23);
		test.addNumber(72);
		test.addNumber(43);
		test.addNumber(6);
		test.addNumber(34);
		test.addNumber(94);
		
		System.out.print("List is: " );
		test.printList();
		System.out.println("Minimum number in list: " +test.min());
		System.out.println("Maximum number in list: " +test.max());
		System.out.print("Clearing list\n" );
		test.clear();
		test.printList();
	}

}


