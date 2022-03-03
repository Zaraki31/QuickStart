package com.lnt.assignment2_3;

public class IciciAtm implements ATM {
private double balance=1000.0; //default 1000 
	
	@Override
	public double withdraw(int accNo, double amount) {
		System.out.println("Rs. "+amount+" has been withdrawn from A/c "+accNo);
		return balance-amount;
	}

	@Override
	public void changePassword(int accNo, String oldPassword, String newPassword) {
		System.out.println("Your password has been changed successfully!");
	} 
	
	@Override
	public double checkBalance() {
		System.out.println("Balance "+balance);
		return 0;
	}


}
