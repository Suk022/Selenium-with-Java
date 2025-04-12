package day6;

public class twodimensional {
    public static void main(String[] args) {
        int array[][] = new int[3][2];

        array[0][0]= 1;
        array[0][1] = 2;
        array[1][0] =3;
        array[1][1] = 4;
        array[2][0] = 5;
        array[2][1] =6;

        System.out.println("Row length is: "+array.length);
        System.out.println("Columns length is: "+array[0].length);

        for (int r = 0; r <array.length; r ++){
            for( int c = 0; c< array[r].length;c ++){
                System.out.println("elements at position "+ r+c+" is: "+ array[r][c]);
            }
        }

        //Using Enhanced for-loop for 2d Array

        System.out.println("Below o/p is using enhanced for-loop");

        for (int arr[]:array){
            for(int element: arr){
                System.out.print(element+ " ");
            }
            System.out.println();
        }

    }
    
}
