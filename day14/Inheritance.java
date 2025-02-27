package day14;

class A{
    int a;
    void display(){
        System.out.println("Value of a is "+a);
    }
}

class B extends A{
    int b;
    void show(){
        System.out.println("Value of b is "+b);
    }
}

class C extends B{
    int c;
    void print(){
        System.out.println("value of c is "+c);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        C objC = new C();
        objC.a = 100;
        objC.b = 200;
        objC.c = 300;

        objC.display();
        objC.show();
        objC.print();
    }

}
