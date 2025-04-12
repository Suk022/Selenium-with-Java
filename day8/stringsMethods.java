package day8;

import java.util.Arrays;

public class stringsMethods {
    public static void main(String[] args) {
        String s1 = "This";
        String s2 = "is a ";
        String s3 = "String";

        //String s1 = new String("This");
        //String s2 = new String("is a");
        //String s3 = new String("String");

        //lenght()
        System.out.println("Lenghts of string s1 is "+s1.length());

        //concat()
        System.out.println("Concatinating s1 and s2: ");
        System.out.println(s1.concat(s2));
        System.out.println("Concatinating s1 and s2 and s3 ");
        System.out.println(s1.concat(s2).concat(s3));

        //trim()
        String s4 = "   String    ";
        System.out.println("length of s4 before trimming is "+s4.length());
        System.out.println("length of s4 after trimming: "+s4.trim().length());

        //charAt()
        System.out.println("Char at index 2 in s3 is "+ s3.charAt(2));

        //contains()
        System.out.println(s3.contains("rin"));
        System.out.println(s2.contains("a"));
        System.out.println(s1.concat(s4.trim()).contains("a"));

        //equals() equalsIgnoreCase()
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals("String"));
        System.out.println(s3.equalsIgnoreCase(s4.trim()));

        //replace
        String s5 = "It was clearly an act of aggression, and hereby we declare a WAR !!";
        System.out.println(s5.replace('a', 'Z'));
        System.out.println(s5.replace("WAR","FARTT"));

        //Substring()
        System.out.println(s5.substring(3,17));
        System.out.println(s5.substring(0, 1));
    
        //toUpperCase() , toLowerCase()
        System.out.println(s5.toUpperCase());
        System.out.println(s3.toLowerCase());

        //split()

        String s6 = "user1x34@domain.com";
        String a[] = s6.split("@");
        System.out.println(Arrays.toString(a));
        System.out.println(a[0]);

        //ex1
        String s7 = "$24,35,67";
        System.out.println(s7.replace("$", ""));
        System.out.println(s7.replace("$","").replace(",", ""));

        //ex2
        String s8 = "usesr,12345@domains";
        String a1[] = s8.split(",");
        String a2[] = a1[1].split("@");
        System.out.println(a1[0]);
        System.out.println(a2[0]);
        System.out.println(a2[1]);

        //ex3
        String s9 = "user 123";
        String a3[]= s9.split(" ");
        System.out.println(Arrays.toString(a3));

        //ex4
        String name = "Levi Ackernman";
        System.out.println(name.replace('L', 'l').contains("levi"));
        
    }
}
 