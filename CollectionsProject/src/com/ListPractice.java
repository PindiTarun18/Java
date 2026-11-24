package com;

import java.util.ArrayList;
import java.util.List;



public class ListPractice {
	
	public static void main(String[] args) {
		
		Students std = new Students(1,23,"Tarun");
		
		ArrayList li = new ArrayList();
		
		li.add(10);   //to insert the data into the array list we use add() method, we can add any type of data
		li.add(20);
		li.add("String");
		li.add(std);
		
		
		
		System.out.println(li.get(3));  //to see the index number we use get() method
		System.out.println(li);
		
		System.out.println(li);
		
		
		Students student =(Students)li.get(3);
		System.out.println(student.getName());
		
		//we do not work with  hetrogenous data
		// we use generics <> it maintain partucular data type
		
		ArrayList<Integer> li2 = new ArrayList<>();
		
		li2.add(2);
		
		System.out.println("-----------------------------------");
		
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		System.out.println(list.size());  // we want to see the length of the list by using .size() method
		list.add(1,22);

		System.out.println(list);
		System.out.println(list.size());
		
		list.set(1, 18);  //we want to replace the number in the list by using .set() method	
		System.out.println(list);
		System.out.println(list.size());
		
		list.remove(3);  //we want to remove the number in the list by using index number, we use .remove() method
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(list.contains(40));  // .contains() method says boolean value, wheather it is true or false
		
		list.add(20);
		System.out.println(list.indexOf(20)); // .index() method gives the first occuring index number of value in the list
		System.out.println(list.lastIndexOf(20));  // .lastIndex() method gives the last occuring index number of value in the list
		
		System.out.println(list.isEmpty());  // .isEmpty() method check the list is empty or not by giving boolean values
		
		List<Integer> list2 = new ArrayList<>();
		System.out.println(list2.isEmpty());
		
		list2.addAll(list);  // .addAll() method is used to copy the data from one list to another list
		System.out.println(list2);
		System.out.println(list2.isEmpty());
		
		list2.clear(); // .clear() is used to clear the list it means it removes data from list
		System.out.println(list2.isEmpty());
		
		list.add(null);  // we can add null into the list
		System.out.println(list);
		
	}
	
	

}
