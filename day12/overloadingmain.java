package day12;

public class overloadingmain {
    void main(int x){
        System.out.println(x+" lvl up.");
    }

    void main(String x){
        System.out.println("Saitama ft."+x);
    }

    void main(String a, String b){
        System.out.println("Welcome "+a+" "+b);
    }
    public static void main(String[] args) {
        overloadingmain ov = new overloadingmain();
        ov.main(79);
        ov.main("kubo");
        ov.main("Captain", "Price");

    }
}
