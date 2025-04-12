package day4;

public class largestofthree {
	public static void main(String[] args) {
		int a = 10, b = 29, c = 28;
		if (a>b) {
			if(a>c) {
				System.out.println("a is greatest among all");
			}
		}
		else if ( b>c) {
			System.out.println("b is greatest among all");
		}
		else {
			System.out.println("c is greatest among all");
		}		
	}
}

