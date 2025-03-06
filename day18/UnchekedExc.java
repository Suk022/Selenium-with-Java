package day18;

public class UnchekedExc {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("program started.");
        System.out.println("program executing..");

        Thread.sleep(5000);
        /*
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){}
         */
        System.out.println("program executed..");
        System.out.println("program finished.");

    }
}
