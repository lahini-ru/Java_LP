package Model;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String employeeName;
    private int marks;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public List<Employee> getAllEmployees(){
        List<Employee> employees=new ArrayList<>();

        Employee employee=new Employee();
        employee.setEmployeeName("Saman");
        employee.setMarks(80);
        employees.add(employee);
        Employee employee1=new Employee();
        employee1.setEmployeeName("Nimal");
        employee1.setMarks(70);
        employees.add(employee1);
        Employee employee2=new Employee();
        employee2.setEmployeeName("Kamal");
        employee2.setMarks(60);
        employees.add(employee2);

        return employees;
    }
}
