package day12;

public class adderMAIN {
    public static void main(String[] args) {
        adder addnum = new adder();

        addnum.sum();

        addnum.sum(189, 345);

        addnum.sum(12, 13.567);

        addnum.sum(214.34, 10);

        addnum.sum(1000, 1456, 4596);

    }
}
