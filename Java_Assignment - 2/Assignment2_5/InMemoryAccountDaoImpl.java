package com.lnt.assignment2_5;

import java.util.ArrayList;
import java.util.List;

public class InMemoryAccountDaoImpl implements AccountDao {

	private static List<Account> db=new ArrayList<>();
	
	@Override
	public void addAnAccount(Account account) {
		db.add(account);
		//System.out.println("Account added successfully");
	}

	@Override
	public void withdraw(int accountNumber,double amount) {
		boolean flag=false;
		for(Account ac:db) {
			if(ac.getAccNo()==accountNumber){
				ac.setBalance(ac.getBalance()-amount);
				System.out.println("Amount has been withdrawn from ac "+accountNumber);
				flag=true;
			}
		}
		if(!flag) {
			System.out.println("Invalid account");
		}
	}

	@Override
	public void checkBalance(int accountNumber) {
		for(Account ac:db)
		{
			if(ac.getAccNo()==accountNumber) {
				System.out.println("Balance of ac"+accountNumber+"is: "+ac.getBalance()); 
				
			}
			else
				System.out.println("Enter correct acc no.");
		}
	}

	@Override
	public void changePassword(int accNo, String oldPassword, String newPassword) {
		for(Account ac:db)
		{
			if(ac.getPassword().equals(oldPassword))
			{
				System.out.println("Password changed successfully");
			}
		}
		
	}

	@Override
	public void viewAllAccounts() {
		System.out.println(db);
	}

	@Override
	public void getAccountDetails(int accNo) {
		for(Account ac:db)
		{
			if(ac.getAccNo()==accNo)
			{
				System.out.println(ac);
			}
		}
	}

}
