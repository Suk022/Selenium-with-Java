package day9;

public class removewhitespace {
    public static void main(String[] args) {
        String str = "Yamate Kuda Saii";
        System.out.println("String is : "+str);
        StringBuffer s = new StringBuffer();
        for (char ch : str.toCharArray()){
            if (Character.isWhitespace(ch)){
                continue;
            }
            s.append(ch);
        }
        System.out.println("String without white spaces: "+s);

    }
}
