package Employee_Management_System;

public class EmployeeManagementDemo {
    public static void main(String[] args) {
        EmployeeArray employeeArray = new EmployeeArray(2);

        Employee emp1 = new Employee(1, "A", "Developer", 60000);
        Employee emp2 = new Employee(2, "B", "Designer", 55000);
        Employee emp3 = new Employee(3, "C", "Manager", 75000);

        employeeArray.addEmployee(emp1);
        employeeArray.addEmployee(emp2);
        employeeArray.addEmployee(emp3);

        System.out.println("Traverse Employees:");
        employeeArray.traverseEmployees();

        System.out.println("\nSearch for Employee with ID 2:");
        Employee foundEmployee = employeeArray.searchEmployee(2);
        System.out.println(foundEmployee != null ? foundEmployee : "Employee not found");

        System.out.println("\nDelete Employee with ID 2:");
        boolean isDeleted = employeeArray.deleteEmployee(2);
        System.out.println(isDeleted ? "Employee deleted" : "Employee not found");

        System.out.println("\nTraverse Employees after deletion:");
        employeeArray.traverseEmployees();
    }
}
