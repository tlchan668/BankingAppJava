package com.maxtrain.bootcamp;

public class InterestAccount extends Account {
	@Override
	public String toString() {
		return String.format("%d/%s/%-9.2f/%-9.2f", getAccountNumber(), getDescription(),getBalance(),getInterestRate());
		
	}

	public double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	//constructors
	public InterestAccount (String desc, double balance, double interest) {
		super(desc, balance);
		this.setInterestRate(interest);
		
	}
	public InterestAccount(double interest) {
		this("Interestacct", 0, interest);
	}
	public InterestAccount () {
		this(3.0);

	}
}
