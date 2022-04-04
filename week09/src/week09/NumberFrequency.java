package week09;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Map.Entry;

public class NumberFrequency {
	public static  HashMap<Integer,Integer> populate(Queue<Integer> q){
		HashMap<Integer,Integer> obs =
				new HashMap<Integer,Integer>();
		
		for(Integer i : q){
			if(!obs.containsKey(i)) {
				obs.put(i, 0);
			}
			else {
				obs.put(i,obs.get(i)+1);
			}
		}
		return obs;
	}
	
	public static Integer highestFrequency(Queue<Integer> q) {
		HashMap<Integer,Integer> frquency =populate(q);
		Integer maxKey = -1;
		Integer obs = null; 
		
		for(Integer i:frquency.keySet()){
			Integer key = frquency.get(i);
		if(key>=maxKey)
		{
			maxKey=key;
			obs=i;
		}
		}
		return obs;
	}
	
	public static void main(String[] args) {
		
	       Queue<Integer> n1 = new LinkedList<Integer>();
	       Queue<Integer> n2 = new LinkedList<Integer>();
	       Queue<Integer> n3 = new LinkedList<Integer>();
	       Queue<Integer> n4 = new LinkedList<Integer>();
	      
	       n1.add(1);
	       n1.add(2);
	       n1.add(3);
	       n1.add(2);
	       n1.add(1);
	      
	       n2.add(1);
	       n2.add(9);
	       n2.add(8);
	       n2.add(5);
	       n2.add(8);
	       n2.add(1);
	       n2.add(2);
	      
	       n4.add(7);
	       n4.add(2);
	       n4.add(1);
	       n4.add(9);
	       n4.add(2);
	       n4.add(2);
	       n4.add(4);
	       n4.add(3);
	       n4.add(1);
	       n4.add(6);
	      
	       System.out.println("highestFrequency " +n1 +" returns " +highestFrequency(n1));
	       System.out.println("highestFrequency " +n2 +" returns " +highestFrequency(n2));
	       System.out.println("highestFrequency " +n3 +" returns " +highestFrequency(n3));
	       System.out.println("highestFrequency " +n4 +" returns " +highestFrequency(n4));
	   }
}
