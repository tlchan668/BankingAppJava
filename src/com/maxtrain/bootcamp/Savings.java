package com.maxtrain.bootcamp;

public class Savings extends InterestAccount implements IAccounts {
	
	
	public Savings (String description, double balance, double interest) {
		super (description,balance,interest);
	
	}
	public Savings(double interest) {
		this("Savings", 0,interest);
	}
	public Savings () {
		this(3.0);
	}

}
