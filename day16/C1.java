package day16;

public class C1 extends C2 implements I1, I2{

    public void m1(){
        System.out.println("C1 implementing inherited abstract method m1, a is "+a);
    }

    public void m2(){
        System.out.println("C2 implementing inherited abstract method m2, b is "+b);
    }

    public static void main(String[] args) {

        C1 objC1 = new C1();
        objC1.m1();
        objC1.m2();
        objC1.m3();
        
    }
}
