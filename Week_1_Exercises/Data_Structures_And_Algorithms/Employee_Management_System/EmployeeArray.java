package Employee_Management_System;

import java.util.Arrays;

public class EmployeeArray {
    private Employee[] employees;
    private int count;

    public EmployeeArray(int size) {
        employees = new Employee[size];
        count = 0;
    }

    public void addEmployee(Employee employee) {
        if (count == employees.length) {
            employees = Arrays.copyOf(employees, employees.length * 2);
        }
        employees[count++] = employee;
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public boolean deleteEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                employees[i] = employees[--count];
                employees[count] = null;
                return true;
            }
        }
        return false;
    }
}
