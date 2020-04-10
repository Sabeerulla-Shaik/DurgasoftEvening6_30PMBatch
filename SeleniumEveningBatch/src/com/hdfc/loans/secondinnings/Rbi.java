package com.hdfc.loans.secondinnings;

public interface Rbi 
{
	void withdraw();
	void deposit();
	
	public static void main(String[] args) 
	{
		Hdfc h=new Hdfc();
		h.withdraw();
		h.deposit();
		
		Icici i=new Icici();
		i.withdraw();
		i.deposit();
		
	}
}
