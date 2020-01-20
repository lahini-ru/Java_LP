package Compare;

import java.util.Comparator;

public class EmployeeRanker implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		if(e1.getMarks()>e2.getMarks())
			return +1;
		if(e1.getMarks()<e2.getMarks())
			return -1;
		return 0;
	}

}
