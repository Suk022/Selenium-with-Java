package day17;

public class WrapperClass{
    public static void main(String args[]){
        String i1 = "23";
        String i2 = "57";
        System.out.println(Integer.parseInt(i1)+Integer.parseInt(i2));

        String b1 = "45.5";
        String b2 = "35.40";
        System.out.println(Double.parseDouble(b1)+Double.parseDouble(b2));

        String bool = "Welcome";
        System.out.println(Boolean.parseBoolean(bool));

        int i = 347;
        double d = 45.9;
        char ch = 'P';
        boolean b = true;

        String s = String.valueOf(i);
        System.out.println(s);

        s = String.valueOf(d);
        System.out.println(s);

        s = String.valueOf(ch);
        System.out.println(s);

        s= String.valueOf(b);
        System.out.println(s);

    }
}