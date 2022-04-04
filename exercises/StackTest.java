package exercises;
import java.util.*;
/*
 * 
 * 
 * for question one output is:
 * 2
 * 1
 */

public class StackTest {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(1);
		stack.push(2);
		Integer i = stack.pop();
		Integer j = stack.pop();
		System.out.println(i);
		System.out.println(j);
	}
}

