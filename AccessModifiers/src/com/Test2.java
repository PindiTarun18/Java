package com;

public class Test2 {
	
	
	public static void main(String[] args) {
		
		Test t1 = new Test();
		
		System.out.println(t1.a);
		System.out.println(t1.c);
		System.out.println(t1.d);
		
		t1.hi();
		t1.bye();
		t1.dummy();
		
		Test t2 = new Test(12);
		System.out.println(t2.a);
	}

}
