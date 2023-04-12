package com.Jspiders.java_practice;
import java.util.Comparator;

public class LaptopPriceComparator implements Comparator {
	public int compare(Object o1, Object o2)
	{
		Laptop l1,l2;
		l1=(Laptop)o1;
		l2=(Laptop)o2;
		if(l1.price==l2.price)
			return 0;
		else if(l1.price>l2.price)
			return 1;
		else
			return -1;
	}

}
