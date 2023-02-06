package ch5;

public class multidimensinal_array {
    public static void main(String args[]) {
        int[][] score = {{100, 100, 100}, {20, 20, 20},
                         {30, 30, 30}, {40, 40, 40}};
        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d] = %d\n", i, j, score[i][j]);
            }
        }

        // temp에는 score의 각 행
        for (int[] temp : score) {
            // i에는 temp의 element가 차례대로
            for (int i : temp) {
                sum += i;
            }
        }

        System.out.println("sum = " + sum);
    }
}
