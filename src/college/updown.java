package src.college;

import java.util.Random;
import javax.swing.JOptionPane;

public class updown {
    public static void main(String[] args) {
        int ranNum = new Random().nextInt(101);
        int count = 0;
        System.out.println("생성된 난수: " + ranNum);

        for (;;) {
            String num = JOptionPane.showInputDialog(null, "UP, DOWN 게임.\n1 ~ 100 사이의 숫자 입력");
            int chonum = Integer.parseInt(num);
            count++;
            if (chonum == ranNum) {
                break;
            } else if (chonum < ranNum) {
                JOptionPane.showMessageDialog(null, "UP");
                continue;
            } else if (chonum > ranNum) {
                JOptionPane.showMessageDialog(null, "DOWN");
                continue;
            }
        }
        JOptionPane.showMessageDialog(null, count + "번 만에 맞추셨습니다!!");
    }
}
