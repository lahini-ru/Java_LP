package Weight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws InputMismatchException{

		int weight;
		System.out.println("Enter a weight");
		Scanner sc=new Scanner(System.in);
		weight=sc.nextInt();
		
		WeightApp wapp=new WeightApp();
		wapp.findWeights(weight);
		
	}

}
