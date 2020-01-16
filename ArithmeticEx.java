package Exception;

public class ArithmeticEx {
		
		public void divideByZero(){
			try {
				int num1=30, num2=0;
				int div=num1/num2;
				System.out.println(div);
			}
			catch(ArithmeticException e){
				System.out.println("Cannot devided by zero");
			}
			
		}

}
