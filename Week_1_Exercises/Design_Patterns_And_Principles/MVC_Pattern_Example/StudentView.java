package MVC_Pattern_Example;

public class StudentView {
    public void displayStudentDetails(String studentName, int studentId, String studentGrade, String email, String phoneNumber, String address) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("ID: " + studentId);
        System.out.println("Grade: " + studentGrade);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }

   
       
    }

