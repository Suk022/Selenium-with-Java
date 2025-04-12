package day6;

public class objectarray {
    public static void main(String[] args) {
        
        Object array[] = {10, 10.98, 'A',"String1",true};

        for (Object x : array){
            System.out.print(x+", ");
        }
    }
}
