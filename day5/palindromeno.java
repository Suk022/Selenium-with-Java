package day5;

public class palindromeno {

	public static void main(String[] args) {
	  
	  String num = "123421";
	  int i = 0;
	  int j = num.length()-1;
	  boolean isPalindrome = true;
	  
	  
	  if (num.length() >=2) {
	   while( i<j) {
		  if (num.charAt(i) != num.charAt(j)) {
			  isPalindrome = false;
		  }
		  i++;
		  j--;
	  }
	}
	  
	  if (isPalindrome == true) {
		  System.out.println(num+" is a palindrome number.");
	  }
	  else{
		  System.out.println(num+" is a not a palindrome number.");
	  }
	 
	  
  }
}
