package day7;

public class repetition {
    public static void main(String[] args) {
        int arr[] = {10, 23, 10, 45, 11 , 10,9};
        int target = 10;
        int count = 0;

        for (int x : arr){
            if ( target == x){
                count +=1;
            }
        }

        System.out.println("target element "+target+" appears "+ count+" time.");
    }
}
