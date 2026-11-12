package com;

public class Test { // public class
	
	public int a; //instance or public variable
	
	private int b; // private variable
	
	protected int c; // protected variable
	
	int d; //default variable

	
	public Test() {   //public constructor
		
	}
	
	private Test(int a, int b) { //private constructor
		
		this.a = a;
		this.b = b;
	}
	
	protected Test(int a) { // protected constructor
		
		this.a = a;
	}
	
	public void hi() {
		System.out.println("hi...");   //public method
	}
	
	private void party() {
		System.out.println("Private party...");  //private method
	}
	
	protected void bye() {
		System.out.println("Protected method");  //protected method
	}
	
	void dummy() {
		System.out.println("default access modifier"); //default method
	}

	
	public static void main(String[] args) {
		
		Test t = new Test(10,22);
		
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);
		System.out.println(t.d);
		
		t.hi();
		t.party();
		t.bye();
		t.dummy();
		
		Test t2 = new Test(12);
		System.out.println(t2.a);
	}
}
