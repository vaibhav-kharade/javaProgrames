package com.Jspiders.java_practice;

import java.util.Comparator;

public class Laptopcomparator implements Comparator{
	public int compare(Object o1,Object o2)
	{
		Laptop l1, l2;
		l1=(Laptop)o1;
		l2=(Laptop)o2;
		return (l1.color.compareTo(l2.color));//ascending
	}
}
