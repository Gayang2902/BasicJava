package src.college.student;

import java.util.*;

import src.ch3.scanner;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        Scanner scanner = new Scanner(System.in);

        student1.age = scanner.nextInt();
        student2.age = scanner.nextInt();
        student3.age = scanner.nextInt();

        student1.studentID = scanner.nextInt();
        student2.studentID = scanner.nextInt();
        student3.studentID = scanner.nextInt();

        student1.Address = scanner.nextLine();
        student2.Address = scanner.nextLine();
        student3.Address = scanner.nextLine();
        
        student1.phoneNumber = scanner.nextLine();
        student2.phoneNumber = scanner.nextLine();
        student3.phoneNumber = scanner.nextLine();

        student1.printAllInfo();
        student2.printAllInfo();
        student3.printAllInfo();
    }
}
