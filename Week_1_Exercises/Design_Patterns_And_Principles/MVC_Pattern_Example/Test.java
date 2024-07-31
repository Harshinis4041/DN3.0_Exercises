package MVC_Pattern_Example;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        Student student = new Student("HARSHINI S", 1, "A", "harshini@example.com", "123-456-7890", "123 Abc Street");

       
        StudentView view = new StudentView();

       
        StudentController controller = new StudentController(student, view);

       
        controller.updateView();

        
        System.out.println("Update student details:");
        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        controller.setStudentName(name);

        System.out.print("Enter new grade: ");
        String grade = scanner.nextLine();
        controller.setStudentGrade(grade);

        System.out.print("Enter new email: ");
        String email = scanner.nextLine();
        controller.setStudentEmail(email);

        System.out.print("Enter new phone number: ");
        String phoneNumber = scanner.nextLine();
        controller.setStudentPhoneNumber(phoneNumber);

        System.out.print("Enter new address: ");
        String address = scanner.nextLine();
        controller.setStudentAddress(address);

      
        controller.updateView();
        scanner.close();
    }
}
