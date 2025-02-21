package day7;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = { 19, 3 , 45, 34, 13 , 10 , 78};
        int target = 13;
        boolean isfound = false;

        for (int i = 0 ; i< arr.length ; i ++){
            if ( arr[i] == target){
                System.out.println("Element found, and is at index "+i+"th.");
                isfound = true;
                break;
            }

        }

        if(isfound!=true){
        System.out.println("Element was not found.");
      }
    }
}
