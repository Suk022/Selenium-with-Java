package day7;

import java.util.Arrays;

public class sorting1 {
    public static void main(String[] args) {
        int arr[] = { 38, 45, 100, 141, 9 , 232, 120, 250};
        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(arr));

    }
}
