package TH;

import java.util.Scanner;

public class ArrValue {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of students");
        String inputName = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)){
                System.out.println("position of the student " + inputName + " is: " + i);
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("student not found"+ inputName + "in the list of students");
        }

    }
}
