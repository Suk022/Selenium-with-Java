package day9;

import java.util.Scanner;

public class wordinstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        int count = 1;

        for (int i =0;i<str.length()-1;i++){
            if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
                count +=1;
            }
        }

        System.out.println("Number of Words in the String is `"+count+"`.");
        sc.close();
    }
}
