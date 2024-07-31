package MVC_Pattern_Example;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public String getStudentName() { return model.getName(); }
    public void setStudentName(String name) { model.setName(name); }

    public int getStudentId() { return model.getId(); }
    public void setStudentId(int id) { model.setId(id); }

    public String getStudentGrade() { return model.getGrade(); }
    public void setStudentGrade(String grade) { model.setGrade(grade); }

    public String getStudentEmail() { return model.getEmail(); }
    public void setStudentEmail(String email) { model.setEmail(email); }

    public String getStudentPhoneNumber() { return model.getPhoneNumber(); }
    public void setStudentPhoneNumber(String phoneNumber) { model.setPhoneNumber(phoneNumber); }

    public String getStudentAddress() { return model.getAddress(); }
    public void setStudentAddress(String address) { model.setAddress(address); }

    public void updateView() {
        view.displayStudentDetails(model.getName(), model.getId(), model.getGrade(),
                                   model.getEmail(), model.getPhoneNumber(), model.getAddress());
       
    }
}
