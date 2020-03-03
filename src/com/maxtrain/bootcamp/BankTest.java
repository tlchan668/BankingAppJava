package com.maxtrain.bootcamp;

import java.util.ArrayList;



//use an interface because need to put a collection of checking and savings together
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Account account = new Account("Account");
		System.out.println(account.getAccountNumber() +", acct descr "+account.getDescription()+ ", balance "+ account.getBalance());
		account.deposit(100);*/
		
		/*InterestAccount iacct = new InterestAccount(5);
		System.out.println(iacct.getAccountNumber() +", acct descr "+iacct.getDescription()+ ", balance "+ iacct.getBalance() 
				+", interest"+iacct.getInterestRate());
		iacct.deposit(100);
		System.out.println(iacct);
	
		iacct.deposit(0);
		System.out.println(iacct.getAccountNumber() +", acct descr "+iacct.getDescription()+ ", balance "+ iacct.getBalance() 
		+", interest"+iacct.getInterestRate());	
		iacct.withdrawl(50);
		System.out.println(iacct.getAccountNumber() +", acct descr "+iacct.getDescription()+ ", balance "+ iacct.getBalance() 
		+", interest"+iacct.getInterestRate());	*/
		
		//create a Savings
		/*Savings s1 = new Savings(2);
		s1.deposit(500);
		s1.withdrawl(300);
		s1.withdrawl(300);
		System.out.println(s1);
		Checking c1=new Checking(2);
		c1.deposit(400);
		c1.withdrawl(100);
		System.out.println(c1);
		Checking c2 = new Checking(2);
		Savings s2 = new Savings(3);
		s2.deposit(1000);
		System.out.println(s2);
		s1.transfer(50, s2);
		System.out.println(s1);
		System.out.println(s2);*/
		//create a new interface
		IAccounts a1 = new Checking(5);
		a1.deposit(888);
		System.out.println(a1);
		IAccounts a2 = new Savings(4);
		a2.deposit(777);
		System.out.println(a2);
		ArrayList<IAccounts> al = new ArrayList<IAccounts>();
		al.add(a1);
		al.add(a2);
		IAccounts a3 = new Checking(.02);
		a3.deposit(999);
		al.add(a3);
		System.out.println(al);
		
		
		
	}

}
