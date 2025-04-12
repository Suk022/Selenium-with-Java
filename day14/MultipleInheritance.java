package day14;

class parent{
    void show(int a){
        System.out.println("this is parent class integer "+a);
    }
}

class child_A extends parent{
    void display(int b){
        System.out.println("this is child class A integer "+b);
    }
}

class child_B extends parent{
    void print(int c){
        System.out.println("this is child class B integer "+c);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        child_A obj1 = new child_A();
        obj1.display(123);
        obj1.show(321);

        child_B obj2 = new child_B();
        obj2.print(45);
        obj2.show(34);
    }
}
