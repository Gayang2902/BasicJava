package src.Project;

import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BookManage_2020011767 {
    private HashMap<String, BookInfo_2020011767> Books = new HashMap<>();

    private HashMap<String, ArrayList<String>> genreKey = new HashMap<>();
    private HashMap<Integer, ArrayList<String>> yearPublicationKey = new HashMap<>();

    // 책 판매 기능
    public void sellBook() {
        String title = JOptionPane.showInputDialog(null, "판매할 책 제목 입력");
        
        if (Books.containsKey(title)) {
            int sellCount = 0;
            try {
                sellCount = Integer.parseInt(JOptionPane.showInputDialog(null, "판매 수량 입력 (숫자만)"));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "수량은 숫자만 입력해야합니다.\n현황 관리 목록으로 돌아갑니다.");
            }
            Books.get(title).subCount(sellCount);
        } else {
            JOptionPane.showMessageDialog(null, "해당되는 책이 없습니다.");
        }
    }

    // 책 현황 관리 목록
    public void statusManage() {
        for (;;) {
            String choice = JOptionPane.showInputDialog
            (null, "[책 현황 관리]\n\n[1] 전체 책 현황 확인\n[2] 신규 책 입고\n[3] 책 추가 입고\n[4] 책 폐기\n[5] 책 검색\n\n[0] 목록으로 돌아가기");

            if (choice.equals("1")) {
                this.showAllBooks();
            } else if (choice.equals("2")) {
                this.addBook();
            } else if (choice.equals("3")) {
                this.addBookCount();
            } else if (choice.equals("4")) {
                this.deleteBook();
            } else if (choice.equals("5")) {
                this.searchBook();
            } else if (choice.equals("0")) {
                return;
            } else {
                JOptionPane.showMessageDialog(null, "잘못된 선택입니다. 다시 입력해주세요.");
            }
        }
    }

    // 전체 책을 책의 종류별로 출력
    private void showAllBooks() {
        String message = "서점 내 전체 책 현황\n";
        Set<String> keySet = genreKey.keySet();

        for (String key : keySet) {
            message += "\n" + "[" + key + "]\n";
            for (int i = 0; i < genreKey.get(key).size(); i++) {
                BookInfo_2020011767 info = Books.get(genreKey.get(key).get(i));
                message += genreKey.get(key).get(i) + " (" + info.getAuthor() + " 저, " + info.getPublisher() + ") " + info.getYearPublication() + "년\n"
                + "보유 수량: " + info.getCount() + "개\n";
                }
            }
        JOptionPane.showMessageDialog(null, message);
    }

    // 서점 내에 책 추가
    private void addBook() {
        JOptionPane.showMessageDialog(null, "입고할 책의 정보를 입력해주세요.");
        for (;;) {
            String title = JOptionPane.showInputDialog(null, "[제목]");
            String genre = JOptionPane.showInputDialog(null, "[분류]\n[교재, 소설, 동화, 만화 중 선택]");
            if (genreKey.containsKey(genre)) {
                genreKey.get(genre).add(title);
            } else {
                ArrayList<String> titleList = new ArrayList<>();
                titleList.add(title);
                genreKey.put(genre, titleList);    
            }
            String author = JOptionPane.showInputDialog(null, "[저자]");
            String publisher = JOptionPane.showInputDialog(null, "[출판사]");
            int yearPublication = 0; 
            try {
                yearPublication = Integer.parseInt(JOptionPane.showInputDialog(null, "[출판년도]\n(20** 과 같이 숫자만 입력)"));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "출판년도는 숫자만 입력해야합니다.\n책의 정보를 다시 입력해 주세요.");
                continue;
            }
            if (yearPublicationKey.containsKey(yearPublication)) {
                yearPublicationKey.get(yearPublication).add(title);
            } else {
                ArrayList<String> titleList = new ArrayList<>();
                titleList.add(title);
                yearPublicationKey.put(yearPublication, titleList);
            }
            int count = 0;
            try {
                count = Integer.parseInt(JOptionPane.showInputDialog(null, "[입고수량]\n숫자만 입력"));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "입고수량은 숫자만 입력해야합니다.\n책의 정보를 다시 입력해 주세요.");
                continue;
            }
            BookInfo_2020011767 Info = new BookInfo_2020011767(genre, author, publisher, yearPublication, count);
            Books.put(title, Info);
            break;
        }
    }

    // 책 수량 추가
    private void addBookCount() {
        String title = JOptionPane.showInputDialog(null, "수량을 추가할 책 제목 입력");

        if (Books.containsKey(title)) {
            int addingCount = 0;
            try {
                addingCount = Integer.parseInt(JOptionPane.showInputDialog(null, "추가 수량 입력 (숫자만)"));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "수량은 숫자만 입력해야합니다.\n현황 관리 목록으로 돌아갑니다.");
            }
            Books.get(title).addCount(addingCount);
        } else {
            JOptionPane.showMessageDialog(null, "해당되는 책이 없습니다.");
        }
    }

    // 책 삭제
    private void deleteBook() {
        String title = JOptionPane.showInputDialog(null, "폐기할 책 제목 입력");

        if (Books.containsKey(title)) {
            JOptionPane.showMessageDialog(null, "책 \"" + title + "\"을 삭제합니다.");
            genreKey.get(Books.get(title).getGenre()).remove(title);
            if (genreKey.get(Books.get(title).getGenre()).size() == 0) {
                genreKey.remove(Books.get(title).getGenre());
            }
            Books.remove(title);
        } else {
            JOptionPane.showMessageDialog(null, "해당되는 책이 없습니다.");
        }
    }

    // 제목으로 책 찾기
    private void searchBook() {
        String title = JOptionPane.showInputDialog(null, "찾기를 원하는 책 제목 입력");
        String message;
    
        if (Books.containsKey(title)) {
            message
            = "[" + Books.get(title).getGenre() + "] 제목: " + title + "\n저자: " + Books.get(title).getAuthor()
            + "\n출판사: " + Books.get(title).getPublisher() + "\n출판년도: " + Books.get(title).getYearPublication() + "년\n\n" 
            + "수량: " + Books.get(title).getCount() + "개";
            JOptionPane.showMessageDialog(null, "찾으시는 책의 정보입니다.\n\n" + message);
        } else {
            JOptionPane.showMessageDialog(null, "존재하지 않는 책입니다.");
        }
    }   
}