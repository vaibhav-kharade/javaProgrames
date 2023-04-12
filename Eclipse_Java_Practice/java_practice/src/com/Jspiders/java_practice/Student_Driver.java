package com.Jspiders.java_practice;
// creating an array  of pbject using the constructor
public class Student_Driver {
	public static void main(String [] args) {
		Student[]a=new Student[3];
		a[0]=new Student(101,"Sumit");
		a[0].display();
		a[1]=new Student(721,"Amit");
		a[2]=new Student(390,"Adithi");
		
		a[1].display();
		a[2].display();
		
	}
	

}
