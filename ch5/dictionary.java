package ch5;

import java.util.*;

public class dictionary {
    public static void main(String args[]) {
        String[][] words = {
            {"chair", "의자"},
            {"computer", "컴퓨터"},
            {"integer", "정수"}
        };

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d) meaning of %s? >> ", i + 1, words[i][0]);

            String temp = scanner.nextLine();

            if (temp.equals(words[i][1])) { System.out.println("Correct!\n\n"); }
            else { System.out.println("Wrong!\n\n"); }
        } 
    }
}
