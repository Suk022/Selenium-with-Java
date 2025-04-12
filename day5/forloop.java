package day5;

public class forloop {
	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		
		if (num == 1 || num == 0) {
			System.out.println("factorial is 1");
		}
		
		else {
		for ( int j = 1; j <=num; j++) {
					
			fact = fact *j;
		}
		System.out.println("factorial of "+num+" is "+fact);
	}
}
}

