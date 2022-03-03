package com.lnt.assignment2_4;

public class DriverClass {
public static void main(String[] args) {
	DriverClass dc=new DriverClass();
	
	dc.withdraw(-300);
}
double withdraw(double amount) throws InsufficientFundException, InvalidAmountException
{
	double balance=10000.0;
	if(amount>balance)
	{
		throw new InsufficientFundException();
	}
	if (amount<=0)
	{
		throw new InvalidAmountException();
	}
	return balance-amount;
}
}
