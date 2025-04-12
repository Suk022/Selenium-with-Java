package day9;

public class revstring{
    public static void main(String[] args) {
        String str = "WELCOME TO MAIN COURSE";
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
        System.out.println("Reverse of string str is: "+revString);
    
        //Approach 2

        //convert String to StringBuilder or String Buffer class to access more built-in-methods
        
        String str2 = "DEEZ REVERSEEE";
        StringBuffer s = new StringBuffer(str2);
        System.out.println("Reversing using .reverse function: "+s.reverse());
        
        //Strings are only things Immutable in java
        String str3 = "Concat";
        String concatString = str3.concat("Deez Strings");
        System.out.println(concatString);
    }
}