package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterations {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(60);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-------------------------");
		
		for(Integer num : list) {
//			if(num == 30) {
//				int index = list.indexOf(30);
//				list.remove(index);
//			}
//			System.out.println(num);
		}
		
		System.out.println("----------------");
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {      // .hasNext() method is used to check if the values is there or not, it gives true or false 
			int num = iterator.next();
			if(num == 30) {
				iterator.remove();
			}
			System.out.println(num);
		}
		System.out.println(list);
		
		System.out.println("-------------------------");
		
		list.add(2,30);
		System.out.println(list);
		ListIterator<Integer> iterator2 = list.listIterator();
		
		
		System.out.println(iterator2.hasNext());
		System.out.println(iterator2.next());
		System.out.println(iterator2.hasNext());
		System.out.println(iterator2.next());
		System.out.println(iterator2.hasNext());
		System.out.println(iterator2.next());
		System.out.println(iterator2.hasPrevious());
		System.out.println(iterator2.previous());
		System.out.println(iterator2.hasPrevious());
		System.out.println(iterator2.previous());
		System.out.println(iterator2.hasPrevious());
		System.out.println(iterator2.previous());
//		System.out.println(iterator2.hasPrevious());
//		System.out.println(iterator2.previous());
		
	}

}
