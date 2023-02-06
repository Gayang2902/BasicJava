package ch4;

import java.util.*;

public class while_sum {
    public static void main(String args[]) {
        int num;
        int sum = 0;
        boolean flag = true;
        String temp;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input to sum number(0 to terminate): ");

        while (flag) {
            System.out.print(">>");

            temp = scanner.nextLine();
            num = Integer.parseInt(temp);

            if (num != 0) { sum += num; }
            else { flag = false; }
        }

        System.out.println("Sum: " + sum);
    }
}
