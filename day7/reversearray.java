package day7;

public class reversearray {
    public static void main(String[] args) {
        int arr[] = {23, 6, 33, 4, 11, 39, 19 , 45};

        System.out.println("reversing elements of array: ");
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
