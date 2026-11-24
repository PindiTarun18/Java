package com.tester;

import com.model.Driver;
import com.service.Travel;

public class Test {
	
	public static void main(String[] args) {
		
		Driver driver1 = new Driver(1,"Tarun","Car",250);
		System.out.println(driver1);
		
		Travel travel = new Travel();
		System.out.println(travel.isCarDriver(driver1));
		
		Driver[] drivers = new Driver[4];
		drivers[0] = new Driver(2,"Fayaz","Car",222);
		drivers[1] = new Driver(3,"Hari","Bike",252);
		drivers[2] = new Driver(4,"Suresh","Bus",500);
		drivers[3] = new Driver(5,"Aman","Lorry",600);
		
		System.out.println(travel.retrivebyDriverId(drivers, 2));
		
		System.out.println(travel.retriveCountOfDriver(drivers, "Car"));
		
		Driver[] resultDriver = travel.retriveDriver(drivers, "Car");
		for(Driver dv :resultDriver) {
			System.out.println(dv);
		}
		
		System.out.println(travel.retriveMaximumDistanceTravelledDriver(drivers));
		
	}

}
