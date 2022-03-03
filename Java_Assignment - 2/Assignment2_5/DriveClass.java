package com.lnt.assignment2_5;

public class DriveClass {
public static void main(String[] args) {
	InMemoryAccountDaoImpl inmem=new InMemoryAccountDaoImpl();
	inmem.addAnAccount(new Account(12345,5000,"abhi@123"));
	inmem.addAnAccount(new Account(47285,3400,"aniket@894"));
	inmem.addAnAccount(new Account(22315,2000,"ritesh@88472"));
	inmem.addAnAccount(new Account(42355,3700,"mhdakj@#4772"));
	inmem.addAnAccount(new Account(32345,4300,"ahsgak@323"));
	//inmem.changePassword(47285, "aniket@894", "abhinav@817");
	inmem.viewAllAccounts();
	inmem.getAccountDetails(12345);
	
}
}
