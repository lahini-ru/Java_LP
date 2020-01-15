package InnerEx;

import InnerEx.University.Staff;

public class Application {

	public static void main(String[] args) {

		University uni=new University(); //encapsulation achieved here
		uni.setUniName("UOC");
		uni.setLocation("Colombo");
		uni.setUniId(001);
		University.setDeanName("A. Perera");
		uni.register();
		
		University.Department dep=uni.new Department(); //member inner class declared here
		dep.setDepId(1001);
		dep.setDepName("UCSC");
		dep.setMajorSub("CS");
		dep.learn();
		
		University.Staff stf=new University.Staff(); //static inner class declared here
		stf.setLecName("B. Silva");
		Staff.setStaffId(101);
		stf.lecture();
		
		Student std=new Student() {

			@Override
			public void registerStd() {
				System.out.println(stdNum+" is registered");
				
			}
			
		};
		std.registerStd();
		//anonymous class declared here
		
	}

}
