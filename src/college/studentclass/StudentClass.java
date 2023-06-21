package src.college.studentclass;

import src.college.studentclass.*;

public class StudentClass {
    public int age = 10;
    public String no = "20220202";
    public String address = "충북 청주시";
    public String tel = "010-000-0000";

    public void printAge() {
        System.out.println("나이: " + age);
    }
    public void printNo() {
        System.out.println("학번: " + no);
    }
    public void printAddress() {
        System.out.println("주소: " + address);
    }
    public void printTel() {
        System.out.println("전화번호: " + tel);
    }

    public static void main(String[] args) {
        StudentClass s1 = new StudentClass();
        StudentClass s2 = new StudentClass();
        StudentClass s3 = new StudentClass();

        s1.printAge();
        s1.printNo();
        s1.printAddress();
        s1.printTel();
    }
}
