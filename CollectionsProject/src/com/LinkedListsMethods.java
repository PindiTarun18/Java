package com;

import java.util.LinkedList;

public class LinkedListsMethods {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(25);
		list.add(28);
		System.out.println(list);
		
		list.addFirst(22); // .addFirst() use of add the number in the first of list
		list.addLast(21);  //.addLast() use of add the number in last of the list
		
		System.out.println(list);
		
	}

}
