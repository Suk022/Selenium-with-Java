package day7;
import java.util.Arrays;
public class sorting2 {
    public static void main(String[] args) {
        String str[] = {"Interstellar" , "Wall-E", "All at once", "Lost in Space", "Dark"};
        System.out.println("string before sorting: ");
        System.out.println(Arrays.toString(str));

        Arrays.sort(str);

        System.out.println("string after sorting: ");
        System.out.println(Arrays.toString(str));


    }
}
