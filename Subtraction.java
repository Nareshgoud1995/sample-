package com.naresh;

public class Subtraction 
{
	private int p;//num1
	int q;
	public Subtraction(int p, int q) {
		super();
		this.p = p;
		this.q = q;
	}

	public void sub() {
		int z=p-q;
		System.out.println("sub is eaual to::"+z);
	}

	public static void main (String []args)
	{
		Subtraction subtraction=new Subtraction(50, 20);
		subtraction.sub();}
}


//01-NareshJavaCalculatorApp
//	Addition
//Substraction
//multiplication
//division
//percentage