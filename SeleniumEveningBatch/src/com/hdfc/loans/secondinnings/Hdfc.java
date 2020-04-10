package com.hdfc.loans.secondinnings;

public class Hdfc  implements Rbi
{
	

	public static void main(String[] args) 
	{
		Hdfc h=new Hdfc();
		h.withdraw();
		h.deposit();
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("I am overridden withdraw from HDFC");
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
		System.out.println("I am overridden deposit from HDFC");
		
	}

}
