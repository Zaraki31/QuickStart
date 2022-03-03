package com.lnt.assignment2_2;

abstract class Account {
	private int accNo;
	private double balance;
	private String password;
	private static String bankName;

	public static String getBankName() {
		return bankName;
	}

	public Account() {
		System.out.println("Default Constructor");
	}

	

	public Account(int accNo, double balance, String password) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.password = password;
	}

	public int getAccNo() {
		return accNo;
	}

	public double getBalance() {
		return balance;
	}

	public String getPassword() {
		return password;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void setBankName(String bankName) {
		Account.bankName = bankName;
	}

	public void displayAccount() {
		System.out.println("Bank Name " + getBankName());
		System.out.println("Account number " + getAccNo());
		System.out.println("Balance " +getBalance());
	}
	public  abstract double withdraw(double amount);
	
}