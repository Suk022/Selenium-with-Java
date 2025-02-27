package day15;

class Bank{
    double roi(){
        return 0;
    }
}

class ICICI extends Bank{
    double roi(){
        return 11.5;
    }
}

class HDFC extends Bank{
    double roi(){
        return 7.5;
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        ICICI bank1 = new ICICI();
        System.out.println(bank1.roi());

        HDFC bank2 = new HDFC();
        System.out.println(bank2.roi());
    }
}