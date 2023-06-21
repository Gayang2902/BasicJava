package src.college.student;

public class Student {
    int age;
    int studentID;
    String Address;
    String phoneNumber;

    public void printAge() {
        System.out.println("나이는 " + age + "살이다.");
    }
    public void printStudentID() {
        System.out.println("학번은 " + studentID + "이다.");
    }
    public void printAddress() {
        System.out.printf("주소는 %s이다.\n", Address);
    }
    public void printPhoneNumber() {
        System.out.printf("전화번호는 %s이다.\n", phoneNumber);
    }
    public void printAllInfo() {
        printAge();
        printStudentID();
        printAddress();
        printPhoneNumber();
    }
}
