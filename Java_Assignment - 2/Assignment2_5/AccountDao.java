package com.lnt.assignment2_5;

public interface AccountDao {
public abstract void addAnAccount(Account account);
public abstract void withdraw(int accountNumber,double amount);
public abstract void checkBalance(int accountNumber);
public abstract void changePassword(int accNo, String oldPassword, String newPassword);
public abstract void viewAllAccounts();
public abstract void getAccountDetails(int accNo);
}
