package day9;

public class stringcomparison {
    public static void main(String[] args) {
        //case1
        String s1 = "deez lectures";
        String s2 = "deez lectures";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));


        //case2
        String s3 = new String("deez lectures");
        String s4 = new String("deez lectures");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    
        //case3
        String s5 = "string123";
        String s6 = new String("string123");
        System.out.println(s5==s6);
        System.out.println(s5.equals(s6));

        //case4
        String s7 = "auuuooooiii";
        String s8 = new String("auuuooooiii");
        String s9 = s8;

        System.out.println(s7==s8);
        System.out.println(s7.equals(s8));

        System.out.println(s8==s9);
        System.out.println(s8.equals(s9));

        System.out.println(s7==s9);
        System.out.println(s7.equals(s9));


    }   
}
