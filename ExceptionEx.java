package Exception;

public class ExceptionEx extends Exception {

	private static int stId[]= {001,002,003};
	private static String name[]= {"Kamal","Amal","Nimal"};
	private static int marks[]= {65,80,195};
	
	ExceptionEx(String str){
		super(str);
	}
	public static void main(String[] args) {
		
		try {
			System.out.println("StNo"+"\t"+"Name"+"\t"+"Marks");
			for(int i=0;i<3;i++) {
				System.out.println(stId[i]+"\t"+name[i]+"\t"+marks[i]);
				if(marks[i]>100) {
					ExceptionEx e=new ExceptionEx("Marks are invalid");
					throw e;
				}
			}
		}
		catch(ExceptionEx e) {
			e.printStackTrace();
		}
	}

}
