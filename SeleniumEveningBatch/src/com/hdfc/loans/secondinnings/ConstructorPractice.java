package com.hdfc.loans.secondinnings;

public class ConstructorPractice 

{
	int a, b, c;
	

	public ConstructorPractice()
	{
		System.out.println("I am no argument constructor");
	}
	public ConstructorPractice(int a)
	{
		this.a=a;
		System.out.println(a);
		System.out.println("I am one argument constructor");
	}
	
	public ConstructorPractice(int a, int b) 
	
	{
		this.a=a;
		this.b=b;
		System.out.println(a);
		System.out.println(b);
		System.out.println("I am three argument constructor");
		
	}
	
	public ConstructorPractice(int i, int j, int k)

	{
		this.a=i;
		this.b=j;
		this.c=k;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println("I am three argument constructor");
	}

	void add()
	
	{
		int a=100;
		int b=300;
		int c;
		c=a+b;
		System.out.println("Addition of a & b is " + c);
	}



	public static void main(String[] args) 
	
	{	ConstructorPractice c0= new ConstructorPractice();
		ConstructorPractice c1= new ConstructorPractice(10);
		ConstructorPractice c2= new ConstructorPractice(10,20);
		ConstructorPractice c3= new ConstructorPractice(10,20,30);
		c1.add();
	}




}
