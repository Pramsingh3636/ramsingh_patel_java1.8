package com.rams.zensar;

public class SavingAccount extends Account
{
	double overDraftlimit = 0;

	public void withDraw(double w)
	{
		if(balance -w < overDraftlimit)
		{
			System.out.println("insufficient Fund");
		}
		else
			balance = balance - w;		
	}
}
