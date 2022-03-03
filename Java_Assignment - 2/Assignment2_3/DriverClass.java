package com.lnt.assignment2_3;

public class DriverClass {
public static void main(String[] args) {
	SbiAtm sbi=new SbiAtm();
	sbi.checkBalance();
	sbi.withdraw(12345,100);
	sbi.changePassword(12345, "458Fgh", "1234As");
}
}
