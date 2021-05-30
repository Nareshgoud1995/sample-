package com.naresh;

public class multiplication
{

	private int c;
	private int d;
	public multiplication(int c, int d) {
		super();
		this.c = c;
		this.d = d;
	}
public void mul() {
	int f=c*d;
	System.out.println("mul is eual to"+f);
}


public static void main(String[] args) {
	

multiplication num1 =new multiplication(14,10);
num1.mul();


}

}
