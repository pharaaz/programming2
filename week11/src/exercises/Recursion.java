package exercises;

public class Recursion {
	public String plusString(String in) {
		 if ((in.length() == 0)||(in.length() == 1)){
			 return in;
		 }else if(in.charAt(0) == in.charAt(1)) {
			 return in.charAt(0) +"+"+ plusString(in.substring(1, in.length()));
		 }else {
			 return in.charAt(0) + plusString(in.substring(1, in.length()));
		 }
	}
	
	public static int fib(int n) {
		 if(n == 1)
	            return 1;
	        if(n == 2)
	            return 1;
	        return fib(n-1) + fib(n-2);
	}
	
	public int[] fibSubSequence(int i,int j) {
		int[] between = new int[(j-i)-1];
		int key =0;
		int diff = 1,y=0;
		int x=i;
		while(key==0) {
			between[y]=fib(x);
			if((j-i)==diff) {
				key =1;
			}
			diff++;
			x++;
			y++;
		}
		return between;
	}
	/*
	 * recursion is not best appropriate for implementing this method.
	 * 
	 */
	
	public static int multiply(int a,int b) {
		 if(a==0||b==0){
			 return 0;
		 }
		 if(a==1) {
			 return b;
		 }
		 if(b==1) {
			 return a;
		 }
		 
	       return a + multiply(a , b-1);
	}
	
	public static String reverse(String in) {
		if(in.length()==0) {
			return in;
		}
		else {
			return reverse(in.substring(1)) +in.charAt(0);
		}
		
	}
	
	public static boolean ispal(String in) {
		if(in.length()==0||in.length()==1) {
			return true;
		}
		if(in.charAt(0)!=in.charAt(in.length()-1)) {
			return false;
		}
		
		return ispal(in.substring(1, in.length()-1));
		
	}
	
	public static Boolean contains(String in,char ch) {
		if(in.length()==0) {
			return false;
		}
		if(in.charAt(0)==ch) {
			return true;
		}
		return contains(in.substring(1), ch);
	}
	
	public static Boolean alphaContains(String in,char ch) {
		if(in.length()==0) {
			return false;
		}
		if(in.charAt(0)==ch) {
			return true;
		}
		return contains(in.substring(1), ch);
	}
	
	public static int gcd(int n,int m) {
		if(n%m==0) {
			return m;
		}
		else if(n<m) {
			return gcd(m,n);
		}
		else {
			return gcd(m,n%m);
		}
		
	}
	
	public static void main(String[] args) {
		Recursion recursionExample = new Recursion();
		System.out.println(multiply(4,6));
		System.out.println(reverse("testy"));
		System.out.println(contains("testy", 'k'));
		System.out.println(ispal("liammail"));
		System.out.println(recursionExample.plusString("Hello Bunny Rabbit!!!!"));
		System.out.println(gcd(53,11));
	}
}
