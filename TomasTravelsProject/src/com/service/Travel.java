package com.service;

import com.model.Driver;

public class Travel {
	
	public boolean isCarDriver(Driver driver) {
		String category = driver.getCategory();
		boolean result = category.equalsIgnoreCase("Car");
		return result;
	}
	
	public String  retrivebyDriverId(Driver[] drivers, int driverId) {
		for(Driver driver : drivers) {
			if (driver.getDriverId() == driverId) {
				return "Driver name is " + driver.getDriverName() + " Belonging to the category "+ driver.getCategory() + " traveled "+ driver.getTotalDistance() + " KM so far.";
			}
		}
		return "Not Found";	
	}
	
	public int retriveCountOfDriver(Driver[] driver, String category) {
		int count = 0;
		for (Driver dv : driver) {
			if(dv.getCategory().equalsIgnoreCase(category)){
				count++;
			}
		}
		return count;
	}
	
	public Driver[] retriveDriver(Driver[] driver,String category) {
		int count = 0;
		for (Driver dv : driver) {
			if(dv.getCategory().equalsIgnoreCase(category)){
				count++;
			}
		}
		Driver[] result = new Driver[count];
		int Index = 0;
		for (Driver dv : driver) {
			if(dv.getCategory().equalsIgnoreCase(category)){
				result[Index] = dv;
				Index++;
		
			}
		}
		return result;
	}	
	
	public Driver retriveMaximumDistanceTravelledDriver(Driver[] drivers) {
		Driver maxDv = drivers[0];
		for(Driver dv : drivers) {
			if(dv.getTotalDistance()>maxDv.getTotalDistance()) {
				maxDv = dv;
			}
		}
		 
		return maxDv;
	}

}
