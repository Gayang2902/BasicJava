package src.college;

public class ArrTest {
    public static void main(String[] args) {
        int[] eng_grade = new int[]{100, 95, 90, 80, 99, 56, 78, 68, 70, 58};
        int[] mat_grade = {99, 95 , 70};

        for (int i = 0; i < eng_grade.length; i++) {
            System.out.println("영어: " + eng_grade[i]);
        }
        for (int i = 0; i < mat_grade.length; i++) {
            System.out.println("수학: " + mat_grade[i]);
        }

        // 배열 선언 후 각 인덱스 번호로 할당
        int[] kor_grade = new int[5];
        kor_grade[0] = 100;
        kor_grade[1] = 90;
        kor_grade[2] = 88;
        kor_grade[3] = 79;
        kor_grade[4] = 92;
        for (int i = 0; i < 5; i++) {
            System.out.println("국어: " + kor_grade[i]);
        }
    }    
}
