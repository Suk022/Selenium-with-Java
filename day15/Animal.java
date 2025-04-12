package day15;

public class Animal {
    String color = "White";
    void showColor(){
        System.out.println("The color is "+color);
    }

    void eat(){
        System.out.println("This animal eats nothing.");
    }
}

class Dog extends Animal{
    String color = "Black";
    void showColor(){
        System.out.println("Dog color is "+super.color);
    }

    void eat(){
        //System.out.println("Dog eats Meat");
        super.eat();
    }
}