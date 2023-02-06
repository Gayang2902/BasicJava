package ch5;

public class morse {
    public static void main(String args[]) {
        String source = "SOSHELP";
        String[] morse = {".-", "-...", "-.-.", "-..", ".",
                          "..-.", "--.", "....", "..", ".---",
                          "-.-", ".-..", "--", "-.", "---",
                          ".--.", "--.-", ".-.", "...", "-",
                          "..-", "...-", ".--", "-..-", "-.--",
                          "--.."};
        
        String result = new String();

        for (int i = 0; i < source.length(); i++) {
            result += morse[source.charAt(i) - 'A'];
        }
        System.out.println("source: " + source);
        System.out.println("morse: " + result);
    }
}
