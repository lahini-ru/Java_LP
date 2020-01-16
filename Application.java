package Exception;

public class Application {

	public static void main(String[] args) {
		
		ArithmeticEx obj1=new ArithmeticEx();
		obj1.divideByZero();
		
		ArrayIndexEx obj2=new ArrayIndexEx();
		obj2.arrIndexOutbound();
		
		FileNotFoundEx obj3=new FileNotFoundEx();
		obj3.fileNotFound();
		
		NullPointerEx obj4=new  NullPointerEx();
		obj4.nullString();
	}

}
