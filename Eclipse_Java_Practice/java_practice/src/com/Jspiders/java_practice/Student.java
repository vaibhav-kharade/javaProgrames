package com.Jspiders.java_practice;

public class Student {
	public int id;
	public String name;
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public void display() {
		System.out.println("Id is a:"+this.id);
		System.out.println("name is a: " +this.name);
		
	}

}
