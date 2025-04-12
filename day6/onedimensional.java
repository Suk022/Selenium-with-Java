package day6;

public class onedimensional {
    public static void main(String[] args) {
        int a[] = new int[3];

        a[0] = 100;
        a[1] = 200;
        a[2] = 300;

        System.out.println("Length of array a is "+ a.length);

        for (int i = 0; i < a.length; i++){
            System.out.println("Element "+(i+1)+" is "+a[i]);
        }
             
    //dynamic decleration

    int b[] = {1,3,5,2,4,6};

    //enhanced for-loop
    System.out.println("Elements of array b : ");

    for (int x : b){
        System.out.println(x);
    }
 
    }

}


