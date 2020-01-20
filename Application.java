package Compare;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		
		List<Employee> employee=new ArrayList<Employee>();
		employee.add(new Employee("Lahini",80));
		employee.add(new Employee("Lahini1",65));
		employee.add(new Employee("Lahini2",55));
		employee.add(new Employee("Lahini3",72));
		employee.add(new Employee("Lahini4",50));
		employee.add(new Employee("Lahini5",63));
		employee.add(new Employee("Lahini6",90));
		employee.add(new Employee("Lahini7",82));
		 
		
		System.out.println(employee);
		
		Collections.sort(employee,new EmployeeRanker());
		System.out.println(employee);
		 
		
		
	}

}
