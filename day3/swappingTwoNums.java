package day3;

public class swappingTwoNums {

	public static void main(String[] args) {
		int a = 100, b = 200;
		int temp;
		
		System.out.println("Before swapping, a is: "+a+" b is: "+b);
		
		temp = a;
		a = b;
		b = temp;

		System.out.println("After swapping, a is: "+a+" b is: "+b);
	}

}
