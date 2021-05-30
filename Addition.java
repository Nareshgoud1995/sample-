package com.naresh;// package

public class Addition {//class classname

private int a; // datatypes,variables
private int b;


public Addition(int a, int b) {// constuctor
	super();
	this.a = a;
	this.b = b;
	
}

public void sum()// business logic
{
	int c=a+b;
	System.out.println(c);
	}


public static void main(String[] args) { //main method

Addition ob=new Addition(10,30);//object creation
ob.sum();// calling business logic

	
	
}

}
