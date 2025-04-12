package day7;

public class missingnumber {
    public static void main(String[] args) {
        int arr[] ={4,2,6,7,3};

        int min = arr[0];
        int max = arr[0];
        int expected_sum = 0;
        int actual_sum = 0;
        
        for (int i = 1; i<arr.length;i++){
            if (arr[i] < min ){
                min = arr[i];
            }
            else if( arr[i] > max){
                max = arr[i];
            }
        }

        for (int i = min; i<=max;i++){
             expected_sum += i;
        }

        for (int x:arr){
            actual_sum +=x;
        }

        System.out.println("Missing Element in range "+min+" to "+max+" is "+(expected_sum-actual_sum)+".");
    }
}
