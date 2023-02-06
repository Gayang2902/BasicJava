package ch5;

public class charTostring {
    public static void main(String args[]) {
        String src = "ABCDE";

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            System.out.println("src.charAt(" + i + "): " + ch);
        }
        
        // String to char[]
        char[] chArr = src.toCharArray();

        System.out.println(chArr);
    }
}
