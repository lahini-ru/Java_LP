package Map;

import java.util.ArrayList;
import java.util.List;

public class StudentMap {
	public static List<Student> getStudent(){
		List<Student> student=new ArrayList<>();
		student.add(new Student("Lahini",80));
		student.add(new Student("Lahini1",65));
		student.add(new Student("Lahini2",55));
		student.add(new Student("Lahini3",72));
		student.add(new Student("Lahini4",50));
		student.add(new Student("Lahini5",63));
		student.add(new Student("Lahini6",90));
		student.add(new Student("Lahini7",82));
		
		return student;
	}

}
