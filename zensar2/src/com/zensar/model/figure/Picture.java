package com.zensar.model.figure;

public class Picture 
{
    Parellelogram[] parellelogram;

	public Picture( Parellelogram[] pgm)
	{
		super();
		this.parellelogram = new Parellelogram[4]; //array size 4
		add(pgm);
	}
	public boolean add(Parellelogram[] pgm)
	{
		boolean r = false;
		for(int i= pgm.length-1; i>=0; i--)
		{
			if(parellelogram[i]==null)
			{
				parellelogram[i]=pgm[i];
				r=true;
			}
			else
			{
				r=false;
			}
		}
		return r;
	}
	//add getter setter
	public Parellelogram[] getParellelogram() {
		return parellelogram;
	}
	public void setParellelogram(Parellelogram[] parellelogram) {
		this.parellelogram = parellelogram;
	}
}
