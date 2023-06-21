package src.Project;

import javax.swing.JOptionPane;

public class Main_2020011767 {
    public static void main(String[] args) {
        BookManage_2020011767 BookManage = new BookManage_2020011767();

        JOptionPane.showMessageDialog(null, "환영합니다, 점장님.");
        for (;;) {
            String choice = JOptionPane.showInputDialog(null, "[서점 관리]\n\n[1] 책 현황 관리\n[2] 책 판매\n\n[0] 프로그램 종료");

            if (choice.equals("1")) {
                BookManage.statusManage();
            } else if (choice.equals("2")) {
                BookManage.sellBook();
            } else if (choice.equals("0")) {    
                if (JOptionPane.showConfirmDialog(null,"정말 종료하시겠습니까?", null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
                    System.exit(0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "잘못된 선택입니다. 다시 입력해주세요.");
            }
        }
    }
}