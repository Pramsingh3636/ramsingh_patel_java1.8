package com.rams.zensar;

public class CheckingAccount extends Account
{
	double overDraft = -1000;

	public void checking(double i)
	{
		double balance = 0.0;
		if(balance - i <overDraft)
		{
			System.out.println("you can not overDraft");
			balance = balance - 25;
		}
		else
			balance = balance - i;
	}
}
