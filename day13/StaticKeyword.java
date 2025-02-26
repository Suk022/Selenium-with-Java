package day13;

public class StaticKeyword {
    static int x = 10;
    int y = 20;

    static void m1(){
        System.out.println("this is Static method m1....");
    }

    void m2(){
        System.out.println("this is non-static method m2....");
    }

    void m(){
        System.out.println(x);
        System.out.println(y);
        m1();
        m2();
    }

    public static void main(String[] args) {

        //Static method and var can be accessed directly(without objects)
        System.out.println(x);
        m1();

        //System.out.println(y);  Cannot access non static var & meth directly
        //m2();

        StaticKeyword sk = new StaticKeyword();
        System.out.println(sk.y);
        sk.m2();

        sk.m();
    }
}
