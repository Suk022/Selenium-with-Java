package day18;

public class ExceptionCatching {
    public static void main(String[] args) {
        String s = null;
        try{
            System.out.println(s.length());
        }
        catch(Exception e){
            System.out.println("Handling exception..");
            System.out.println(e.getMessage());
        }
        System.out.println("program finished.");
    }
}
