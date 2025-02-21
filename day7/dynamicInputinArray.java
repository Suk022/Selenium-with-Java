package day7;

import java.util.Scanner;

public class dynamicInputinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Input Elements: ");
        for (int i =0; i< arr.length;i++){
            arr[i] = sc.nextInt();     
        }

        System.out.println("Elements in array are: ");
        for(int x: arr){
            System.out.print(x+" ");
        }

        sc.close();
    }
}
