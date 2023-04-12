package com.Jspiders.java_practice;
import java.util.Arrays;

public class MobileDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Mobile []m1= {new Mobile("Lenovo",12000.0),
    		 new Mobile("Oppo",13000.0),
    		 new Mobile("Redmi",15000.0)};
     Arrays.sort(m1);
     for(Mobile m:m1)
     {
    	 System.out.println("Mobile brand= "+m.brand+" "+ "Mobile price= "+m.price);
     }
	}

}
