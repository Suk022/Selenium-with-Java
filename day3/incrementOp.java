package day3;

public class incrementOp {

	public static void main(String args[]) {
		
		//Case 1
		int a = 10;
		a = a+1;
		System.out.println(a);
		
		//Case 2 
		int res1 = a++;
		System.out.println(res1);
		System.out.println(a);
		
		//Case 3
		int res2 = ++a;
		System.out.println(res2);
		System.out.println(a);
		
	}

}
