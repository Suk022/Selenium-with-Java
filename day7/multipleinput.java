package day7;

import java.util.Scanner;

public class multipleinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.next();

        System.out.println("Enter you Age: ");
        int age = sc.nextInt();

        System.out.println("What is your Sex?: Male(M) or Female(F)");
        char sex = sc.next().charAt(0);

        System.out.println("What is your BMI?");
        double bmi = sc.nextDouble();

        System.out.println("Summary of info provided: ");

        System.out.println("Name: "+name+", " +"Age: "+age+", Sex: "+sex+", BMI: "+bmi+".");

        sc.close();
    }
}
