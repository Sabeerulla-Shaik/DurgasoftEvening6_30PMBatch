package com.hdfc.loans.secondinnings;

public class ConstructorPracticeTwo 

{
	int a, b, c;
	

	public ConstructorPracticeTwo()
	{
		System.out.println("I am no argument constructor");
	}
	public ConstructorPracticeTwo(int a)
	{
		this();
		System.out.println("I am one argument constructor");
	}
	
		public ConstructorPracticeTwo(int a, int b) 
	
	{
		this(10);
		this.a=a;
		this.b=b;
		System.out.println("I am two argument constructor");
		
	}
	
	public ConstructorPracticeTwo(int a, int b, int c)

	{
		this(10,20);
	
		System.out.println("I am three argument constructor");
	}

	void add()
	
	{
		c=a+b;
		System.out.println("Addition of a & b is " + c);
	}



	public static void main(String[] args) 
	
	{	/*ConstructorPracticeTwo c0= new ConstructorPracticeTwo();
		ConstructorPracticeTwo c1= new ConstructorPracticeTwo(10);
		ConstructorPracticeTwo c2= new ConstructorPracticeTwo(10,20);*/
		ConstructorPracticeTwo c3= new ConstructorPracticeTwo(10,20,30);
		c3.add();
	}
}