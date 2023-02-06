package ch4;

import java.util.*;

public class gendercheck {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        char gender;
        String resident_num;
        
        System.out.print("Input your resident register number: ");
        resident_num = scanner.nextLine();

        gender = resident_num.charAt(7);

        switch (gender) {
            case '1': case '3': 
                System.out.println("You are male.");
                break;
            case '2': case '4':
                System.out.println("You are female.");
                break;
            default:
                System.out.println("Error");
        }
    }    
}
