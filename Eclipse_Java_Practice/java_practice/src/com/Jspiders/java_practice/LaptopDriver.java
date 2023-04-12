package com.Jspiders.java_practice;
import java.util.Arrays;
public class LaptopDriver {

	public static void main(String[] args) {
		Laptop[] l1 = { new Laptop("Yellow",65000),
				 new Laptop("Pink",51000),
				 new Laptop("White",71000),
				 new Laptop("Red",45000),
				 new Laptop("Grey",55000)};
		System.out.println("Sorting in the terms of laptop price");
		Arrays.sort(l1, new LaptopPriceComparator());
		for(Laptop l:l1)
			System.out.println(l.color+" "+l.price);
		System.out.println("***************************************");
		
		System.out.println("Sorting in the terms of Laptop price");
		Arrays.sort(l1,new LaptopPriceComparator());
		for(Laptop l:l1)
			System.out.println(l.color+" "+l.price);
		
		// TODO Auto-generated method stub

	}

}
