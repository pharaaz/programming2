package exercises;
import java.util.*;

public class QueueAlgorithms {
	
	public static Queue<Integer> reverse(Queue<Integer> userInput){
		Stack<Integer> stack=new Stack<Integer>();
		Queue<Integer> test = new LinkedList<Integer>();
	
		for(int i:userInput) {
			stack.push(i);
		}
		
		for(int i=0;i<userInput.size();i++) {
			test.add(stack.pop());			
	}

	return test;
	}
	
	public static Boolean isPalindrome(Queue<Integer> userInput, Queue<Integer> test) {
		boolean pali;
		if(userInput.equals(test)) {
			pali = true;
		}
		else {
			pali = false;
		}
		
		return pali;
		
	}
	
	public static int min(Queue<Integer> userInput) {
		int min = userInput.peek();
		Iterator iteratorUserInput = userInput.iterator();
	
		while(iteratorUserInput.hasNext()) {
			int loopy= (int) iteratorUserInput.next();
			if(min>loopy) {
				min=loopy;
			}
		}
		return min;
	}
	
	public static int max(Queue<Integer> userInput) {
		int max = userInput.peek();
		Iterator iteratorUserInput = userInput.iterator();
	
		while(iteratorUserInput.hasNext()) {
			int loopies= (int) iteratorUserInput.next();
			if(max<loopies) {
				max=loopies;
			}
		}
		return max;
	}
	
	public static void main(String []args){
	Queue<Integer> inputQue = new LinkedList<>();
	  
	System.out.println("Enter queue here:");
	Scanner scanner = new Scanner(System.in);
	 
	String userQueue = scanner.nextLine();
	
	String[] arrayQueue = userQueue.split(" ");
	
	for(int i = 0; i < arrayQueue.length; i++){
	if(!arrayQueue[i].isBlank()){
		inputQue.add(Integer.parseInt(arrayQueue[i]));
	}
	}
	System.out.println("Input Queue: " + inputQue);
	Queue<Integer> reversedQue = reverse(inputQue);
	System.out.println("Reversed Queue: " + reversedQue);
	System.out.println("Is Queue a Palindrome (true=yes, false =no): "
			+isPalindrome(inputQue,reversedQue));
	System.out.println("Minimum value in queue is: " +min(inputQue));
	System.out.println("Maximum value in queue is: " +max(inputQue));
	
	
	}
}
	
	
