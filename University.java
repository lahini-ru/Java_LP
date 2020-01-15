package InnerEx;

public class University {

	private String uniName;
	private String location;
	private static String deanName;
	private int uniId;
	
	public String getUniName() {
		return uniName;
	}
	public void setUniName(String uniName) {
		this.uniName = uniName;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public int getUniId() {
		return uniId;
	}
	public void setUniId(int uniId) {
		this.uniId = uniId;
	}

	public static String getDeanName() {
		return deanName;
	}
	public static void setDeanName(String deanName) {
		University.deanName = deanName;
	}

    public void register() {
		
		System.out.println("Registering");
		System.out.println("University Name :"+getUniName()+" "+"Location :"+getLocation()+" "+"Dean Name :"+getDeanName()+" "+"University Id :"+getUniId());
		System.out.println();
	}
	class Department{
		
		private String depName;
		private String majorSub;
		private int depId;
		
		void learn() {
			System.out.println("Learning");
			System.out.println("Department Name :"+getDepName()+" "+"Major Subject :"+getMajorSub()+" "+"Department ID :"+getDepId());
			System.out.println();
		}

		public int getDepId() {
			return depId;
		}
		public void setDepId(int depId) {
			this.depId = depId;
		}

		public String getDepName() {
			return depName;
		}
		public void setDepName(String depName) {
			this.depName = depName;
		}

		public String getMajorSub() {
			return majorSub;
		}
		public void setMajorSub(String majorSub) {
			this.majorSub = majorSub;
		}
		
	}
	
	static class Staff{
		
		private String lecName;
		private static int staffId;
		
		void lecture() {
			System.out.println("Lecturing");
			System.out.println("Lecturer Name :"+getLecName()+" "+"Staff ID :"+getStaffId());
			System.out.println();
		}

		public String getLecName() {
			return lecName;
		}
		public void setLecName(String lecName) {
			this.lecName = lecName;
		}

		public static int getStaffId() {
			return staffId;
		}
		public static void setStaffId(int staffId) {
			Staff.staffId = staffId;
		}
	}

}
