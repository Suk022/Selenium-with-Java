package day5;

public class evenorodd {

	public static void main(String[] args) {
		int i = 1;
		
		while (i <= 10) {
			if (i % 2 ==0) {
				System.out.println(i +" is a even no");
			}
			
			else {
				System.out.println(i + " is a odd no");
			}
			i+=1;
		}
	}
}
