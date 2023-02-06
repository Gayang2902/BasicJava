package ch4;

import java.util.*;

public class ro_si_pa {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int user;
        // Math class의 random 메소드는 0.0 <= double < 1.0의 값을 반환해준다
        int com = (int)(Math.random() * 3) + 1;

        System.out.print("Input Rock(1), Scissor(2), Paper(3): ");
        user = scanner.nextInt();

        System.out.println("Your choice: " + user);
        System.out.println("Com's choice: " + com);

        switch (user - com) {
            case 2: case -1:
                System.out.println("You lose");
                break;
            case 1: case -2:
                System.out.println("You win");
                break;
            case 0:
                System.out.println("No winner");
                break;
        }
    }
}
