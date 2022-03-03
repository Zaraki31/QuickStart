package com.lnt.assignment2_6;

import com.lnt.assignment2_5.Account;

public class DriverClass {
public static void main(String[] args) {
	AccountDaoImpl acc=new AccountDaoImpl();
	//acc.addAnAccount(new Account());
	acc.checkBalance(103);
	acc.withdraw(101, 5000);
	acc.viewAllAccounts();
	acc.getAccountDetails(102);
	acc.changePassword(102, "abhin@849", "abhin@788");

}
}
