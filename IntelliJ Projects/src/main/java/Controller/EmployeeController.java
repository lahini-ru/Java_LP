package Controller;

import Model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/services")
public class EmployeeController {

    /*@RequestMapping("/hello")
    public String greeting(){
        return "<h1>Hello</h1>";
    }*/

    @RequestMapping("/employees")
    public List<Employee> getAllEmployees(){
        Employee employee=new Employee();
        return employee.getAllEmployees();
    }

}
