package day15;

final class A{
    final void show(){
        System.out.println("This is method of class A");
    }
}

//Cant extend final cllass
/* 
class B extends A{ 
    void show(){  //Invalid, cant override the final methods
        System.out.println("This is method of class B");
    }

}*/

public class FinalKeyword2 {
    public static void main(String[] args) {
        A o1 = new A();
        o1.show();
    }
}
