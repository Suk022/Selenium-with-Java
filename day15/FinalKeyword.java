package day15;

class c1{
    final int x =100;
    void show(){
        System.out.println("value of x is "+x);
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        c1 ob1 = new c1();
        //ob1.x = 200; //Invalid, can modify final variables
        ob1.show();
        
    }
}
