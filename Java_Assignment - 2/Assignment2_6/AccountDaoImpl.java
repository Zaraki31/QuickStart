package com.lnt.assignment2_6;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.lnt.assignment2_5.Account;
import com.lnt.assignment2_5.AccountDao;
import com.lnt.jdbc.DBConnection;
public  class AccountDaoImpl implements AccountDao {

	@Override
	public void addAnAccount(Account account) {
		Connection connect = DBConnection.getConnect();
		String sql="insert into Account values(?,?,?)";
		try {
			PreparedStatement pstmt = connect.prepareStatement(sql);
			pstmt.setInt(1, 103);
			pstmt.setInt(2, 45000);
			pstmt.setString(3, "ani@785");
			int c=pstmt.executeUpdate();
			System.out.println(c+"no of row affected....");
			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}



	@Override
	public void checkBalance(int accountNumber) {
		Connection connect=DBConnection.getConnect();
		String sql="SELECT BALANCE FROM Account where accNo=?";
		try {
			PreparedStatement pstmt=connect.prepareStatement(sql);
			pstmt.setInt(1, accountNumber);
			ResultSet p=pstmt.executeQuery();
			while(p.next()) {
				int bal = p.getInt(1);
				System.out.println("Balance displayed..."+bal);
			}
			
		    connect.close();
		}
		catch (SQLException e) {
			e.printStackTrace();		
			}
		
	}
	
	@Override
	public void withdraw(int accountNumber, double amount) {
		Connection connect=DBConnection.getConnect();
		String sql="Update Account set Balance=(Balance-?) where accno=?";
		try {
			PreparedStatement pstmt=connect.prepareStatement(sql);
			pstmt.setDouble(1,amount);
			pstmt.setInt(2, accountNumber);
			pstmt.executeUpdate();
			System.out.println("rows updated...");
			connect.close();
		}
		catch (SQLException e) {
			e.printStackTrace();		
			}
	}

	@Override
	public void changePassword(int accNo, String oldPassword, String newPassword) {
		Connection connect=DBConnection.getConnect();
		try {
			String sql="Update Account Set Password=? where accNo=?";
			PreparedStatement pstmt=connect.prepareStatement(sql);
			pstmt.setString(1, newPassword);
			pstmt.setInt(2, accNo);
			pstmt.executeUpdate();
			System.out.println("Password Changed successfully");
			connect.close();
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void viewAllAccounts() {
		Connection connect=DBConnection.getConnect();
		try {
			String sql="Select * from Account";
			PreparedStatement pstmt=connect.prepareStatement(sql);
			ResultSet p= pstmt.executeQuery();
			System.out.println("Acc No." +"\t"+"Balance"+"\t"+ "Password"+"\t");
			while(p.next()) {
				int accNo= p.getInt(1);
				double balance=p.getDouble(2);
				String pass=p.getString(3);
				System.out.println(accNo+"\t"+balance+"\t"+pass+"\t");
			}
			connect.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void getAccountDetails(int accNo) {
		Connection connect=DBConnection.getConnect();
		try {
			String sql="Select * from Account where accNo=?";
			PreparedStatement pstmt=connect.prepareStatement(sql);
			pstmt.setInt(1, accNo);
			ResultSet p= pstmt.executeQuery();
			System.out.println("Acc No." +"\t"+"Balance"+"\t"+ "Password"+"\t");
			while(p.next()) {
				double balance=p.getDouble(2);
				String pass=p.getString(3);
				System.out.println(accNo+"\t"+balance+"\t"+pass+"\t");
			}
			connect.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}



}
