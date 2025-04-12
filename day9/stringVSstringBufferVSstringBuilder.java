package day9;

public class stringVSstringBufferVSstringBuilder {
    public static void main(String[] args) {
        String str0 = "You cant change me tatya";
        str0.concat("cant deez nut");
        System.out.println(str0);

        StringBuilder str1 = new StringBuilder("I am Immutable");
        str1.append(" builder builder ");
        System.out.println(str1);

        StringBuffer str2 = new StringBuffer("Hola ");
        str2.append("Amigoss");
        System.out.println(str2);
    }
}
