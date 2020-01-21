package StreamEx;

import java.util.*;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {

		List<Employee> filteredEmp=Emp.getEmployee()
				.stream()
				.filter(e->Emp.getEmployee().contains("i"))
				.collect(Collectors.toList());
		
		System.out.println(filteredEmp);
		
		List<Employee> filteredEmp1=Emp.getEmployee()
				.stream()
				.map(e->new Emp(name::"Dr"+Employee.getEmployee())
				.collect(Collectors.toList());
		
		System.out.println(filteredEmp1);
		
		List<Employee> filteredEmp1=Emp.getEmployee()
				.stream()
				.sorted(Comparator.Comparing(Employee.getName()))
				.collect(Collectors.toList());
		
		System.out.println(filteredEmp1);
		
		List<Employee> filteredEmp1=Emp.getEmployee()
				.stream()
				.sorted(e1,e2)->new Integer(e1,getName().length).compareTo(e2.getName().length)
				.collect(Collectors.toList());
		
		System.out.println(filteredEmp1);
		
	}

}
