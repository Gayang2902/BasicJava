package ch4;

import java.util.*;

public class matching_num_do_while {
    public static void main(String args[]) {
        int input;
        int answer;
        Scanner scanner = new Scanner(System.in);

        // 1 ~ 100사이의 임의의 수
        answer = (int)(Math.random() * 100) + 1;

        do {
            System.out.print("Input 1 to 100 number: ");
            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("Try smaller num");
            } else if (input < answer) {
                System.out.println("Try larger num");
            } 
        } while (input != answer);

        System.out.println("Matching!");
    }
}
