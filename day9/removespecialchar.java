package day9;

public class removespecialchar {
    public static void main(String[] args) {
        String str = "This$ is a%^ String1#*";
        System.out.println("The string before the removal of special characters: "+str);

        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()){
            if (Character.isLetterOrDigit(ch) || Character.isWhitespace(ch)){
                sb.append(ch);
            }
        }

        System.out.println("The string after removal of special characters: "+sb);

    }
}
