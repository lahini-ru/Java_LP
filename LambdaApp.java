package Compare;

import java.util.*;

public class LambdaApp {

	public static void main(String[] args) {
		
		List<Employee> employee=new ArrayList<>();
		employee.add(new Employee("Lahini",80));
		employee.add(new Employee("Lahini1",65));
		employee.add(new Employee("Lahini2",55));
		employee.add(new Employee("Lahini3",72));
		employee.add(new Employee("Lahini4",50));
		employee.add(new Employee("Lahini5",63));
		employee.add(new Employee("Lahini6",90));
		employee.add(new Employee("Lahini7",82));
		
		Comparator<Employee> empComparator=(e1,e2)->
		(e1.getMarks()>e2.getMarks()?+1:
			(e1.getMarks()<e2.getMarks()?-1:0));
		
		Collections.sort(employee, empComparator);
		System.out.println(employee);
	}

}
