package com.etrade.test;

public class MoneyWithdrawal implements Runnable{

	private Account acct = new Account();
	
	public static void main(String args[]){
		MoneyWithdrawal moneyWithdrawal = new MoneyWithdrawal();
		Thread one = new Thread(moneyWithdrawal);
		Thread two = new Thread(moneyWithdrawal);
		one.setName("Tom");
		two.setName("Hanks");
		one.start();
		two.start();
	}
	
	public void run(){
		
		for(int x=0; x<5; x++){
			makeWithdrawal(10);
			System.out.println("Account Balance: " + acct.getBalance());
		}
	}
	
	
	/*
	 * 1. The makeWithdrawal() method is not thread safe
	 * 2. Account can be prevented from being overdrawn by making makeWithdrawal() method synchronized
	 * 
	 */
	private synchronized void makeWithdrawal(int amt){
		if(acct.getBalance()>=amt){
			System.out.println(Thread.currentThread().getName() + " is going to withdraw");
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException exp) {
				System.out.println(exp.getMessage());
			}
			
			acct.withdraw(amt);
			System.out.println(Thread.currentThread().getName() + " complete with withdrawal");
		}
	}
	
}
