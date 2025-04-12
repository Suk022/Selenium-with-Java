package day19;

class Parent{
    int v1 = 100;
    void m1(){
        System.out.println("you entered m1 method *Seesh*");
    }
}

class Child extends Parent{
    int v2 = 1000;
    void m2(){
        System.out.println("you entered m2 method *ohh boy*");
    }
}

public class Objects {
    public static void main(String[] args) {
        /* 
        Child objc = new Child();
        System.out.println(objc.v1);
        objc.m1();
        System.out.println(objc.v2);
        objc.m2(); 
        */

        /*Parent objp = new Child(); //upcasting 
        System.out.println(objp.v1);
        objp.m1();
        System.out.println(objp.v2); //cannot access
        objp.m2(); //cannot access
        */

        /*Parent P = new Parent();
        Child C = (Child)P;
        System.out.println(C.name);
        System.out.println(C.id);
        C.m1();
        C.m2();
        */
    }
}
