package com.rams.zensar;

public class Assignment1 {
	SavingAccount saving = new SavingAccount();
	CheckingAccount checking = new CheckingAccount();
	Account account;
	public static void main(String[] args)
	{
		Account account = new Account();
	}
	public static void Print(double x)
	{
		System.out.printf("The current balance is " + " $ " + "%4.2f" + "%n" , x);
	}
}
class Account
{
	private int id;
	double balance;
	private static double annualInterestRate1;
	private java.util.Date dateCreated;
	int annualInterestRate;

	public Account()
	{
		dateCreated = new java.util.Date();
	}
	public Account(long newacNumber, double newBalance)
	{
		int newId;
		balance = newBalance;
		dateCreated = new java.util.Date();
	}
	public long getacNumber()
	{
		return this.id;
	}
	public double getBalance()
	{
		return balance;
	}
	public static double getAnnualInterestRate()
	{
		return annualInterestRate1;
	}
	public void setacNumber(long newacNumber)
	{
		int newId;
	}
	public void setBalance(double newBalance)
	{
		balance = newBalance;
	}
	public static void setAnnualInterestRate(double newAnnualInterestRate)
	{
		annualInterestRate1 = newAnnualInterestRate; 
	}
	public double getMonthlyInterest()
	{
		return balance * (annualInterestRate1/1200);
	}
	public java.util.Date getdateCreated()
	{
		return dateCreated;
	}
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	public void deposit(double amount)
	{
		balance += amount;
	}
}








