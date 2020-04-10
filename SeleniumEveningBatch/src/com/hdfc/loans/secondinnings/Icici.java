package com.hdfc.loans.secondinnings;

public class Icici  implements Rbi 

{
	 

	public static void main(String[] args) {
		
		Icici i=new Icici();
		i.withdraw();
		i.deposit();

	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("I am withdrawl from ICICI");
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("I am deposit from ICICI");
		
	}

}
