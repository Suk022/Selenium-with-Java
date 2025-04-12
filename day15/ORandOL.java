package day15;

class ABC{
    void m1(int a){
        System.out.println(a);
    }

    void m2(int b){
        System.out.println(b);
    }
}

class XYZ extends ABC{
    //Class XYZ has total of 3 methods

    void m1(int a){
        System.out.println(a*a); //Method overriding(inheritance concpet)
    }

    void m2(int a, int b){
        System.out.println(a+b);  //Method overriding
    }
}

public class ORandOL {
    public static void main(String[] args) {
        XYZ obj1 = new XYZ();
        obj1.m1(5);
        obj1.m2(10);
        obj1.m2(10 , 5);
    }
    
}
