package com.hdfc.loans.secondinnings;

public class FirstClass
{
	int a=10,b=20,c;
	
	void add()
	{
		c=a+b;
		System.out.println("Addition of a and b is"  + c);
	}
	void sub()
	{
		c=a-b;
		System.out.println("Substraction of a and b is"+ c);
	}
	public static void main(String[] args)
	{
	 FirstClass obj = new FirstClass();
	 obj.add();
	 obj.sub();

	}

}
