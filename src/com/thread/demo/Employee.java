package com.thread.demo;

public class Employee {
	private String name;
	private int age;
	private String dept;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public Employee(String name, int age, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", dept=" + dept + "]";
	}
	

}
