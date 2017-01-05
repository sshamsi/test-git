package com.practice.misc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class CreditCardAccount implements Comparable<CreditCardAccount>{

	private final static double AVERAGE_MILLIS_PER_MONTH = 365.0 * 24 * 60 * 60 * 1000 / 12;
	private static DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	private Date referenceDate = dateFormat.parse("7/12/2014");
	
	private double accountScore;
	private int ageOfAccountInMonths;
	private double creditLimit;
	private double accountBalance;
	private Date date;
	private String name;
	
	public CreditCardAccount(String name, Date date, double creditLimit, double accountBalance) throws ParseException{
		this.creditLimit = creditLimit;
		this.accountBalance = accountBalance;
		this.date = date;
		this.name = name;
		setAgeOfAccountInMonths();
		setScore();
	}
	
	public static void main(String args[]) throws ParseException{
		
		CreditCardAccount a = new CreditCardAccount("a", dateFormat.parse("1/12/2012"), 1000.0, 750.0);
		CreditCardAccount b = new CreditCardAccount("b", dateFormat.parse("11/12/2011"), 9001.0, 5800.0);
		CreditCardAccount c = new CreditCardAccount("c", dateFormat.parse("2/12/2012"), 8000.0, 2000.0);
		System.out.println("Name is "+a.getName()+" Age is "+a.getAgeOfAccountInMonths()+" Score is "+a.getAccountScore());
		System.out.println("Name is "+b.getName()+" Age is "+b.getAgeOfAccountInMonths()+" Score is "+b.getAccountScore());
		System.out.println("Name is "+c.getName()+" Age is "+c.getAgeOfAccountInMonths()+" Score is "+c.getAccountScore());
		List<CreditCardAccount> accounts = new ArrayList<CreditCardAccount>();
		accounts.add(a);
		accounts.add(b);
		accounts.add(c);
		Collections.sort(accounts);
		String results[] = getAccounts(accounts);
		for(int i=0 ; i<results.length ; i++){
			System.out.println(results[i]);
		}
	}
	
	public static String[] getAccounts(List<CreditCardAccount> accounts){
		List<CreditCardAccount> qualifiedAccounts = new ArrayList<CreditCardAccount>();
		for(CreditCardAccount account : accounts){
			if(account.getAgeOfAccountInMonths()<24){
				continue;
			}
			if(account.getCreditLimit()<1000 || account.getCreditLimit()>10000){
				continue;
			}
			if(account.getAccountScore() <= 0){
				continue;
			}
			qualifiedAccounts.add(account);
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

	@Override
	public int compareTo(CreditCardAccount a) {
		if(this.getAccountScore()>a.accountScore){
			return -1;
		}
		else if (this.getAccountScore()>a.accountScore){
			return 1;
		}
		else return 0;
	}
	

}
