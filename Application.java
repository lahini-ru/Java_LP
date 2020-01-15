package EncTest;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		EncapsulationEx obj=new EncapsulationEx();

		System.out.println("Enter the account number");
		Scanner sc=new Scanner(System.in);
		obj.setAccountNumber(sc.nextInt());
		
		System.out.println("Enter the bank balance");
		obj.setBankBalance(sc.nextDouble());
		
		System.out.println("Enter the debit amount");
		obj.setDebitAmount(sc.nextDouble());
		
		double bBal=(double)obj.getBankBalance();
		double dBal=(double)obj.getDebitAmount();
		double remainBal=bBal-dBal;
		System.out.println("Your remaining balance is "+remainBal);
		
	}

}
