package Exception;

public class NullPointerEx {
	
	public void nullString() {
		try {
			String str=null;
			System.out.println(str.charAt(0));
		} 
		catch (NullPointerException e) {
			System.out.println("Null pointer exception occured");
		}
		
	}

}
