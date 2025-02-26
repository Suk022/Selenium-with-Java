package day11;

public class Constructor {
    int x,y;

    Constructor(){
        x = 140;
        y = 160;
    }

    Constructor(int a, int b){
        x=a;
        y=b;
    }
    
    void sum(){
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        Constructor cs = new Constructor(500,769);
        cs.sum();    
    }
}
