package com.lnt.assignment2_4;

public class InsufficientFundException extends RuntimeException{
@Override
public String getMessage() {
	return "InsufficientFundsException";
}
@Override
	public String toString() {
		return "InsufficientFundsException";
	}
}
