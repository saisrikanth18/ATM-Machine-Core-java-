package com.resume.ATM;

public class ATM {
	
	private double balance;
	private double depositeBalance;
	private double withdrawBalance;
	
	//default constructor
	public ATM() {
		
	}


	//getters and setters
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDepositeBalance() {
		return depositeBalance;
	}

	public void setDepositeBalance(double depositeBalance) {
		this.depositeBalance = depositeBalance;
	}

	public double getWithdrawBalance() {
		return withdrawBalance;
	}

	public void setWithdrawBalance(double withdrawBalance) {
		this.withdrawBalance = withdrawBalance;
	}
	
}
