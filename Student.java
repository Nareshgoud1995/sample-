package com.naresh;

public class Student {

	private int id;
	private String name;
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public void printmsg()
	{
		System.out.println(id+"-->"+name);
	}
	public static void main(String[] args) {
		
		Student s=new Student(10,"naresh");
		s.printmsg();
	}

}
