package exercises;

public class Exercise4 {
	public static int ackermannFunc(int x, int y) {
		if(x==0) {
			return y+1;
		}
		else if(y ==0) {
			return ackermannFunc(x-1,1);
		}
		else {
			return ackermannFunc(x-1,ackermannFunc(x,y-1));
		}
	}
	
	public static void main(String[] args) {
		System.out.println(ackermannFunc(1,1));
		System.out.println(ackermannFunc(2,2));
		System.out.println(ackermannFunc(3,3));
	}

}
