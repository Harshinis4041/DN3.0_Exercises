package MVC_Pattern_Example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int id;
    private String grade;
    private String email;
    private String phoneNumber;
    private String address;
    private List<String> history = new ArrayList<>();

   
    public Student(String name, int id, String grade, String email, String phoneNumber, String address) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        history.add("Initial Grade: " + grade);
    }

   
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) {
        this.grade = grade;
        history.add("Grade changed to: " + grade);
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public List<String> getHistory() { return history; }
}
