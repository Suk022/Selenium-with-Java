package day9;

public class palindromestring {
    public static void main(String[] args) {
        String str = "WASTED";
        char[] charArray = str.toCharArray(); //Since String in java is immutable, converted str to array of chars
        int l = 0;
        int h = str.length()-1;
        char temp;
        while (l<h) {
            temp = charArray[l];
            charArray[l] = charArray[h];
            charArray[h] = temp;  
            l++;
            h--;          
        }
        String revString = new String(charArray); // after modification, convert back to string
        if( revString.equals(str)){
            System.out.println("String `"+str+"` is a palindrome.");
        }
        else{
            System.out.println("String `"+str+"` is not a palindrome.");
        }
    }
    
}
