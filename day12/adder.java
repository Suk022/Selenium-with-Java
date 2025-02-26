package day12;

public class adder {
    int a = 23, b = 47;

    void sum(){
        System.out.println(a+b);
    }

    void sum(int a, int b){
        System.out.println(a+b);
    }

    void sum(int a, double b){
        System.out.println(a+b);
    }

    void sum(double a, int b){
        System.out.println(a+b);
    }

    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
