package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(2);
		list.add(13);
		list.add(24);
		list.add(17);
		list.add(5);
		
		System.out.println(list);
		
		Collections.sort(list);   //.sort() method is used to sort it in ascending order
		System.out.println(list);
		
		Collections.reverse(list);   //,reverse() method is used to sort in reverse order
		System.out.println(list);
		
		List<Integer> list2 = List.of(10,20,30,40);   // we can directly give the values in the list by using list.of() method
		System.out.println(list2);
		
		List<Integer> list3 = Arrays.asList(22,33,44,55);  // we can directly give the values in the list by using Arrays.asList()  method also
		System.out.println(list3);
		
		
	}

}
