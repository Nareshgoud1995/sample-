package com.naresh;

public class Task1 {
	private int f;
	private int g;
	
	public Task1(int f, int g) {
		super();
		this.f = f;
		this.g = g;
	}
	public void multiplication() {
		int h=f*g;
		System.out.println("mul is equal to"+h);
	}
	public void Addition() {
		int h=f+g;
		System.out.println("add is equal to"+h);
	}
	public void substraction() {
		int h=f-g;
		System.out.println("sub is eual to "+h);
	}
	public static void main(String[] args) {
		Task1 topic=new Task1(80,20);
		topic.multiplication();
		
		Task1 topic1=new Task1(80,20);
		topic1.Addition();
		
		Task1 topic2=new Task1(80,20);
		topic2.substraction();
	}
	
	
// @formatter:on

 
// @formatter:on

		
	}


