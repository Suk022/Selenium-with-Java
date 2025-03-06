package day18;

public class FinallyBlock {
    public static void main(String[] args) {
        String s = null;
        try{
            System.out.println(s.length());
        }
        catch(Exception e){
            System.out.println("Handling exception..");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("i am unavoidable, you have to go through me, no matter what");
        }
        System.out.println("program finished.");
    }
}
