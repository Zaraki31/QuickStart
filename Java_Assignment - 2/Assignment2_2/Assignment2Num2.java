package com.lnt.assignment2_2;

public class Assignment2Num2 {
	public static void main(String[] args) {
		Account.setBankName("State Bank of India");
		Account a1 = new SavingsAccount(101, 50000.0, "45678ghh@", 10000.0);
		System.out.println("After withdrawal "+a1.withdraw(4500.0));
		a1.displayAccount();
		System.out.println("------------");
		Account a2 = new CurrentAccount(102, 45000.0, "454778ghh@", 20000.0);
		System.out.println("After Withdrawal " + a2.withdraw(5000.0));
		a2.displayAccount();
	}
}

class SavingsAccount extends Account {
	private double minimumBalance;

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public SavingsAccount(int accNo, double balance, String password, double minimumBalance) {
		super(accNo, balance, password);
		this.minimumBalance = minimumBalance;
	}

	public void displayAccount() {
		super.displayAccount();
		System.out.println("Minimum balance: " + minimumBalance);
	}

	@Override
	public double withdraw(double amount) {
		setBalance(getBalance() - amount);
		return getBalance();
				
	}

}

class CurrentAccount extends Account {
	private double overdraftLimitAmount;

	public double getOverdraftLimitAmount() {
		return overdraftLimitAmount;
	}

	public void setOverdraftLimitAmount(double overdraftLimitAmount) {
		this.overdraftLimitAmount = overdraftLimitAmount;
	}

	public CurrentAccount(int accNo, double balance, String password, double overdraftLimitAmount) {
		super(accNo, balance, password);
		this.overdraftLimitAmount = overdraftLimitAmount;
	}

	public void displayAccount() {
		super.displayAccount();
		System.out.println("Overdraft Limit Amount " + overdraftLimitAmount);
	}

	@Override
	public double withdraw(double amount) {
		setBalance(getBalance() - amount);
		return getBalance();
	}

}
