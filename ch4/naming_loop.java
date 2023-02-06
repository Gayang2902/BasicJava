package ch4;

import java.util.*;

// 반복문에 이름을 붙힘으로써 break와 continue의 취사선택이 가능하다.

public class naming_loop {
    public static void main(String args[]) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        // 반복문에 tag 설정
        outer : while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("Select menu(1 ~ 3). (0 to terminate): ");

            menu = scanner.nextInt();

            if (menu == 0) {
                System.out.println("Program terminating");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("Selecting wrong menu! (0 to terminate)");
                continue;
            }

            for (;;) {
                System.out.print("Input calculating num (0: cal exit, exit: 99): ");
                num = scanner.nextInt();

                if (num == 0) { break; }
                if (num == 99) { break outer; }
                switch (menu) {
                    case 1:
                        System.out.println("Result = " + num * num);
                        break;
                    case 2:
                        System.out.println("Result = " + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("Result = " + Math.log(num));
                        break;
                }
            }
        }
    }
}
