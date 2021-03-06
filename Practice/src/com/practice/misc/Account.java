package com.practice.misc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
	
	private final static double AVERAGE_MILLIS_PER_MONTH = 365.0 * 24 * 60 * 60 * 1000 / 12;
	private static DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	private Date referenceDate = dateFormat.parse("7/12/2014");
	
	private double accountScore;
	private int ageOfAccountInMonths;
	private double creditLimit;
	private double accountBalance;
	private Date date;
	private String name;
	
	public Account(String name, Date date, double accountBalance, double creditLimit) throws ParseException{
		this.creditLimit = creditLimit;
		this.accountBalance = accountBalance;
		this.date = date;
		this.name = name;
		setAgeOfAccountInMonths();
		setScore();
	}
	
	public static void main(String args[]) throws ParseException{
		
		Account a = new Account("a", dateFormat.parse("1/12/2012"), 750.0, 1000.0);
		Account b = new Account("b", dateFormat.parse("1/12/2011"), 10000, 10000);
		Account c = new Account("c", dateFormat.parse("9/12/2011"), 1999, 4200);
		System.out.println("Name is "+a.getName()+" Age is "+a.getAgeOfAccountInMonths()+" Score is "+a.getAccountScore());
		System.out.println("Name is "+b.getName()+" Age is "+b.getAgeOfAccountInMonths()+" Score is "+b.getAccountScore());
		System.out.println("Name is "+c.getName()+" Age is "+c.getAgeOfAccountInMonths()+" Score is "+c.getAccountScore());
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(a);
		accounts.add(b);
		accounts.add(c);
		String results[] = getAccounts(accounts);
		for(int i=0 ; i<results.length ; i++){
			System.out.println(results[i]);
		}
	}
	
	public static String[] getAccounts(List<Account> accounts){
		List<Account> qualifiedAccounts = new ArrayList<Account>();
		for(int i=0; i < accounts.size() ; i++){
			Account account = accounts.get(i);
			if(account.getAgeOfAccountInMonths()<=24){
				continue;
			}
			if(account.getCreditLimit()<1000 || account.getCreditLimit()>10000){
				continue;
			}
			if(account.getAccountBalance()<0 || account.getAccountBalance()>10000){
				continue;
			}
			qualifiedAccounts.add(account);
		}
		
		
		
		for(int j=0 ; j<qualifiedAccounts.size()-1 ; j++){
			for(int k=1 ; k<qualifiedAccounts.size() ; k++){
				if(qualifiedAccounts.get(j).getAccountScore()<qualifiedAccounts.get(k).getAccountScore()){
					Account temp = qualifiedAccounts.get(j);
					qualifiedAccounts.set(j, qualifiedAccounts.get(k));
					qualifiedAccounts.set(k, temp);
				}
			}
			for(int z=0 ; z<qualifiedAccounts.size() ;z++){
				System.out.println(qualifiedAccounts.get(z).getAccountScore() + " " +j);
			}
		}
		
		String[] results = new String[3];
		
		for(int l=0 ; l<qualifiedAccounts.size() ; l++){
			if(l==3){
				break;
			}
			results[l] = qualifiedAccounts.get(l).getName();
		}
		
		return results;
	}
	
	public double getAccountScore() {
		return accountScore;
	}

	public void setAccountScore(double accountScore) {
		this.accountScore = accountScore;
	}

	public int getAgeOfAccountInMonths() {
		return ageOfAccountInMonths;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAgeOfAccountInMonths() throws ParseException{
		this.ageOfAccountInMonths = (int) ((referenceDate.getTime() - this.date.getTime()) / AVERAGE_MILLIS_PER_MONTH);
	}
	
	public void setScore(){
		double availableCreditLimit = this.creditLimit - this.accountBalance; 
		this.accountScore = (((availableCreditLimit * 100) / creditLimit) / 100) * ageOfAccountInMonths ; 
	}
	
}
