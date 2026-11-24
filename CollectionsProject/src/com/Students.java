package com;

public class Students {
	
	
	private int Stu_Id;
	
	private int age;
	
	private String name;
	
	

	public Students() {
		
	}

	public Students(int stu_Id, int age, String name) {
		Stu_Id = stu_Id;
		this.age = age;
		this.name = name;
	}

	public int getStu_Id() {
		return Stu_Id;
	}

	public void setStu_Id(int stu_Id) {
		Stu_Id = stu_Id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Students [Stu_Id=" + Stu_Id + ", age=" + age + ", name=" + name + "]";
	}
	
	
	

}
