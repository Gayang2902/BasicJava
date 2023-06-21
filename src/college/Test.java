package src.college;

import javax.swing.JOptionPane;
public class Test {
    public static void main(String[] args) {
        while (true) {
            String menu = JOptionPane.showInputDialog(null, "메뉴를 입력하세요\n1:등록, 0:종료");

            if (menu == null) {
                JOptionPane.showMessageDialog(null, "메뉴를 입력하세요.");
                continue;
            }

            if (menu.equals("0")) {
                JOptionPane.showMessageDialog(null, "프로그램을 종료합니다");
                System.exit(0);
            } else if (menu.equals("1")) {
                String korScore = JOptionPane.showInputDialog(null, "국어성적을 입력하세요.");
                String engScore = JOptionPane.showInputDialog(null, "영어성적을 입력하세요.");
                String mathScore = JOptionPane.showInputDialog(null, "수학성적을 입력하세요.");

                int korScoreNum = 0;
                int mathScoreNum = 0;
                int engScoreNum = 0;

                try {
                    korScoreNum = Integer.parseInt(korScore);
                    engScoreNum = Integer.parseInt(engScore);
                    mathScoreNum = Integer.parseInt(mathScore);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "성적은 반드시 숫자를 입력해야 합니다.\n0점 처리합니다.");
                }
                double summary = korScoreNum + mathScoreNum + engScoreNum;
                double avg = summary / 3;
                JOptionPane.showMessageDialog(null, "국어성적: " + korScoreNum
                                                + ", 영어성적: " + engScoreNum + ", 수학성적: " + mathScoreNum
                                                + ",\n평균: " + avg);
            }
        }
    }
}
