package ch5;

import java.util.*;

public class bingo {
    public static void main(String args[]) {
        final int SIZE = 5;
        int x = 0;
        int y = 0;
        int num = 0;
        int[][] bingo = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);

        // inititalizing bingo board
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                bingo[i][j] = i * SIZE + j + 1;
            }
        }

        // shffule bingo board
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                x = (int)(Math.random() * SIZE);
                y = (int)(Math.random() * SIZE);

                int temp = bingo[i][j];
                bingo[i][j] = bingo[x][y];
                bingo[x][y] = temp;
            }
        }

        do {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.printf("%2d ", bingo[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            System.out.printf("Input 1 ~ %d range number: ", SIZE * SIZE);
            String temp = scanner.nextLine();
            num = Integer.parseInt(temp);

            outer : for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (bingo[i][j] == num) {
                        bingo[i][j] = 0;
                        break outer;
                    }
                }
            }
        } while (num != 0);
    }
}
