package Map;

import java.util.*;
import java.util.stream.*;

public class Application {

	public static void main(String[] args) {

		List<Student> filteredStd=StudentMap.getStudent()
				.stream()
				.map(e->new Student(name+"Dr"+Student.getName()))
				.sorted(Comparator.comparing(Student.getStudent()))
				.collect(Collector.toList());
		
		System.out.println(filteredStd);
	}

}
