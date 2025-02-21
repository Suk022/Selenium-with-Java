package day7;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of num: ");   
    int num = sc.nextInt();
    System.out.println("value of num is: "+num);

    System.out.println("Enter the value of decimal number: ");   
    double val = sc.nextDouble();
    System.out.println("value of decimal number is: "+val);

    System.out.println("Enter the String: ");   
    String str = sc.next();
    System.out.println("String is: "+str);
    
    
    
    sc.close();
    
    }
}
