package com.maxtrain.bootcamp;

public class Checking implements IAccounts{
	//using composition
	private InterestAccount iacct;
	public int checkNbr;
	
	public void deposit(double amount) {
        iacct.deposit(amount);
    }

    public boolean withdrawl(double amount) {
        checkNbr++;
        return iacct.withdrawl(amount);
    }
    
    public void transfer(double amount, Account toAcct) {
        iacct.transfer(amount, toAcct);
    }

    public void transfer (double amount, Checking toAcct) {
        iacct.transfer(amount, toAcct.iacct);
    }

    

	public int getCheckNbr() {
		return checkNbr;
	}

	public void setCheckNbr(int checkNbr) {
		this.checkNbr = checkNbr;
	}

	public InterestAccount getIacct() {
		return iacct;
	}

	public void setIacct(InterestAccount iacct) {
		this.iacct = iacct;
	}
	
	public Checking (double interestRate) {
		iacct = new InterestAccount();
		iacct.setDescription("Checking");
		iacct.setInterestRate(interestRate);
		
	}
	public Checking() {
		iacct = new InterestAccount();
		iacct.setDescription("Checking");
	}
	public String toString() {
		return String.format("%d/%s/%-9.2f/%-9.2f", iacct.getAccountNumber(), iacct.getDescription(),iacct.getBalance(),iacct.getInterestRate());
	}	

}
