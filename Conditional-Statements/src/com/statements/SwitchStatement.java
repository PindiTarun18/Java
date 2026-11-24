package com.statements;

import java.util.Scanner;

public class SwitchStatement {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your floor number: ");
		
		Scanner oc = new Scanner(System.in);
		
		int floor = oc.nextInt();
		
		switch(floor) {
		
		case 1 :
			
			System.out.println("1st Floor Reached");
			break;
			
		case 2 :
			
			System.out.println("2nd Floor Reached");
			break;
			
		case 3 :
			
			System.out.println("3rd Floor Reached");
			break;
		
		default :
			
			System.out.println("Invalid Floor");
		}
			
		
	}
	

}
