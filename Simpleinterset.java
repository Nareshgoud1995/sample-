package com.naresh;

public class Simpleinterset {
	private int p;
	private int t;
	private int r;
	public Simpleinterset(int p,int t,int r) {
		super();
		this. p=p;
		this. t=t;
		this. r=r;
		// TODO Auto-generated constructor stub
	}
	public void Smple() {
		int a=(p*t*r)/100;
		System.out.println("sim inst is equal to"+a);

	}
	public static void main(String[] args) {
		Simpleinterset val=new Simpleinterset(25, 50, 20);
		val.Smple();
	}
}






