/* 
 1. 데이터는 객체 기반 기록, 데이터들은 Collection Framework을 사용하여 
    등록, 삭제, 목록 조회를 기본으로 기능을 추가
 2. 사용자의 의지에 의한 프로그램 종료 (중간에 강제 종료되면 감점)
 3. 각 데이터는 입력, 삭제, 목록 조회가 필수
 */

package src.Project;

import javax.swing.JOptionPane;

public class ReadingRoom_2020011767 {
    final int BOARD_WIDTH = (4 * 3) + 4;
    final int BOARD_HEIGHT = (2 * 3) + 4;

    char[][] sitsBoard = {
        {'*', '-', '-', '-', '-', '*', '-', '-', '-', '-', '*', '-', '-', '-', '-', '*'},
        {'|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|'},
        {'|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|'},
        {'*', '-', '-', '-', '-', '*', '-', '-', '-', '-', '*', '-', '-', '-', '-', '*'},
        {'|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|'},
        {'|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|'},
        {'*', '-', '-', '-', '-', '*', '-', '-', '-', '-', '*', '-', '-', '-', '-', '*'},
        {'|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|'},
        {'|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', '|'},
        {'*', '-', '-', '-', '-', '*', '-', '-', '-', '-', '*', '-', '-', '-', '-', '*'}
    };

    // 열람실 관리 메뉴
    public void showChoice() {
        JOptionPane.showMessageDialog(null, "열람실을 관리합니다.");
        for (;;) {
            String choice = JOptionPane.showInputDialog
            (null, "[열람실 관리]\n[1] 자리 현황\n[2] 사용 인원 목록\n[3] 인원 입실\n[4] 인원 퇴실\n[5] 자리 현황 및 사용 인원 목록\n[0] 목록으로 돌아가기");
            if (choice.equals("1")) { // 자리 현황
                this.showCurrentSits();
                JOptionPane.showMessageDialog(null, "현재 열람실의 자리 현황입니다. 터미널을 확인해주세요.");
            
            } else if (choice.equals("2")) { // 사용 인원 목록
                this.showPeopleList();
            
            } else if (choice.equals("3")) { // 인원 입실
                this.addPerson();
            
            } else if (choice.equals("4")) { // 인원 퇴실
                this.deletePersion();
            
            } else if (choice.equals("5")) { // 자리 현황 및 사용 인원 목록
                this.showCurrentSits();
                this.showPeopleList();
            
            } else if (choice.equals("0")) { // 목록으로 돌아가기
                JOptionPane.showMessageDialog(null, "목록으로 돌아갑니다.");
                break;
            
            } else { // 지정된 목록 이외에 입력을 받을 경우
                JOptionPane.showMessageDialog(null, "메뉴를 다시 입력해주세요.");
            }
        }
    }

    // 열람실 자리 현황
    public void showCurrentSits() {
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            for (int j = 0; j < BOARD_WIDTH; j++) {
                System.out.printf("%c ", sitsBoard[i][j]);
            }
            System.out.print('\n');
        }
    }

    // 열람실 사용 인원 목록
    public void showPeopleList() {

    }

    // 열람실 인원 입실 (추가))
    public void addPerson() {

    }

    // 열람실 인원 퇴실 (삭제)
    public void deletePersion() {

    }
}