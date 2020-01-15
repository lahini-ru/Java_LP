package EncTest;

import java.util.Scanner;

public class EncapsulationEx {
	
	private int accountNumber=0;
	private double bankBalance=0;
	private double debitAmount=0;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
		System.out.println("Account accessed");
	}
	public double getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(double bankBalance) {
		this.bankBalance = bankBalance;
	}
	public double getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}
	

}
