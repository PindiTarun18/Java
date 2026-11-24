package com.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsPractise {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(30);
		set.add(50);
		set.add(70);
		set.add(10);
		set.add(30);
		
		System.out.println(set);
		
		for(Integer num : set) {
			System.out.println(num);
		}
		
		set.add(null);  // we can add null into the set , but duplicate null is not allowed
		System.out.println(set);
		
		
		
		LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>();
		
		lset.add(20);
		lset.add(20);
		lset.add(30);
		lset.add(40);
		lset.add(20);
		lset.add(45);
		lset.add(10);
		lset.add(15);
		lset.add(null);
		
		System.out.println(lset.size());
		System.out.println(lset);
		
		
		TreeSet<Integer> tset = new TreeSet<Integer>();
		
		tset.add(50);
		tset.add(20);
		tset.add(10);
		tset.add(70);
		tset.add(10);
		tset.add(30);
	//	tset.add(null);   TreeSet does not accept null it gives null pointer exception, in background it do Comparision operation
		
		System.out.println(tset.size());
		System.out.println(tset);
		
	}

}
