/* 기말과제와 비슷한 형식의 프로그램 */

package src.Project.Collection;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        
        for (;;) {
            String menu = JOptionPane.showInputDialog(null, 
            "메뉴 입력\n0: 종료, 1: 학생 등록, 2: 학생목록 출력, 3: 전체학생 평균 출력");

            if (menu.equals("0")) {
                JOptionPane.showMessageDialog(null, "종료합니다.");
                break;
            } else if (menu.equals("1")) {
                String name = JOptionPane.showInputDialog("이름을 입력하세요.");
                int score = 0;
                try {
                    score = Integer.parseInt(JOptionPane.showInputDialog("점수를 입력하세요."));    
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "학생의 점수는 숫자만 입력가능합니다.");
                    continue;
                }
                Student stu = new Student();
                stu.name = name;
                stu.score = score;

                list.add(stu);
            } else if (menu.equals("2")) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Student tmpStudent = (Student)it.next();
                    JOptionPane.showMessageDialog(null, "이름: " + tmpStudent.name + " 점수: " + tmpStudent.score);
                }
            } else if (menu.equals("3")) {
                double total = 0;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Student tmpStudent = (Student)it.next();
                    total += tmpStudent.getScore();
                }
                double average = total / list.size();
                JOptionPane.showMessageDialog(null, "전체 학생의 평균 점수는 " + average + "입니다.");
            }
        }
    }
}