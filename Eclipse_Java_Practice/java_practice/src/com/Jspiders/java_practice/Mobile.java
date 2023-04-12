package com.Jspiders.java_practice;

public class Mobile implements Comparable{
String brand;
double price;
public Mobile(String brand, double price) {
	this.brand = brand;
	this.price = price;
}
public int compareTo(Object o)
{
	//downCasting
	Mobile temp=(Mobile)o;
	//compare current object price with the passed object price
	if(this.price==temp.price)
		return 0;
	else if(this.price==temp.price)
		return 1;
	else
		return -1;
	//return this.brand.compareTo(
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
