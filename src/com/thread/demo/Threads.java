package com.thread.demo;

import java.util.ArrayList;
import java.util.List;

public class Threads implements Runnable {
	Employee e1 = new Employee("name", 23, "CS");

	public void run() {
		// TODO Auto-generated method stub
		System.out.println(e1);
        
	}

	public static void main(String[] args) {
		/*
		 * List<Employee> l1=new ArrayList<>(); l1.add(new Employee("name",23,"CS"));
		 * l1.add(new Employee("dhanu",45,"EC"));
		 */
		Runnable r1 = new Threads();
	    
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		t1.start();
		t2.start();

	}

}
