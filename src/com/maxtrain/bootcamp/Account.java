package com.maxtrain.bootcamp;

public abstract class Account {
	@Override
	public String toString() {
		return String.format("%d/%s/%-9.2f", getAccountNumber(), getDescription(),getBalance());
	}
	
	private static int nextId=1;
	
	public int accountNumber;
	public String description;
	public double balance;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String name) {
		this.description = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//methods
	private boolean checkAmountGTZero(double amount) {
        return (amount <= 0) ? false : true;
    }
	
	private boolean isSufficientFunds(double amount) {
		if (getBalance() >= amount) {
                return true;
            }
                return false;
    }
		
	public void deposit(double amt) {
		if (checkAmountGTZero(amt))
		setBalance(getBalance()+amt);
	
	}
	public boolean withdrawl(double amt) {
		if(isSufficientFunds(amt) && checkAmountGTZero(amt)){
			setBalance(getBalance()-amt);
			return true;
		}return false;
	}
	
	public void transfer(double amount, Account toAcct) {

        if (this.withdrawl(amount)) {//this will execute only if do withdrawl
            toAcct.deposit(amount);
        }
    }
		
	
	//constructors
	public Account(String desc, double balance) {
		this.setAccountNumber(nextId++);
		this.setDescription(desc);
		this.setBalance(balance);
	}
	public Account(String desc) {
		this(desc,0);		
	}
	public Account() {
		this(null);
	}

}
