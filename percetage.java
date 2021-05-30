package com.naresh;

public class percetage {
	
	private int x;
	private int y;
	
	public percetage(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public void  per() {

		int z=(x%y);
		System.out.println("per is eqal to"+z+"%");
	}
	public static void main(String[] args) {
		percetage res=new percetage(200,11);
		res.per();
	}
}
