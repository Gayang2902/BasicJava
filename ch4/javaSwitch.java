package ch4;

import java.util.*;

public class javaSwitch {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.print("Input current month: ");
        input = scanner.nextInt();

        switch (input) {
            case 3: case 4: case 5:
                System.out.println("Current season is spring");
            case 6: case 7: case 8:
                System.out.println("Current season is summer");
            case 9: case 10: case 11:
                System.out.println("Curren season is fall");
            default:
                System.out.println("Current season is winter");
        }
    }
}
