package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class A1 {
public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		System.out.println(a1.isEmpty());
		a1.add(10);
		a1.add(false);
		a1.add("p");
		a1.add("Hello");
		a1.add(90.45);
		a1.add(10);
		a1.add(false);
		a1.add("Hello");
		System.out.println(a1.isEmpty());
		System.out.println(a1.size());
		//System.out.println(a1);
		for(Object e:a1)
			System.out.println(e);
		System.out.println("********************");
		Iterator iter=a1.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		System.out.println("********************");
		
		ListIterator lit=a1.listIterator();
		//forward
		while(lit.hasNext())
			System.out.println(lit.next());
		System.out.println("_______________________");
		//backward
		while(lit.hasPrevious())
			System.out.println(lit.previous());
		
		
		
		ArrayList a2 = new ArrayList();
		System.out.println(a1.isEmpty());
		a2.add(20);
		a2.add(true);
		a2.add("t");
		a2.add("Hi");
		a2.add(90.45);
		a2.add(20);
		a2.add(null);
		a2.add("Hi");
		a2.add("Hi");
		System.out.println(a2);
		System.out.println(a1.get(2));
		System.out.println(a1.contains(null));
		System.out.println(a2.indexOf("Hi"));
		System.out.println(a2.lastIndexOf("Hi"));
		for(Object e:a2)
			System.out.println(e);
		
	}

}
