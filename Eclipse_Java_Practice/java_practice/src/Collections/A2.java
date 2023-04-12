package Collections;

import java.util.ArrayList;
public class A2 {
	public static void main(String[] args) {
		ArrayList a2=new ArrayList();
		//ArrayList<E> a2=new ArrayList();
		System.out.println(a2.isEmpty());
		a2.add(20);
		a2.add(true);
		a2.add('t');
		a2.add("hi");
		a2.add(90.45);
		a2.add(null);
		a2.add("hi");
		a2.add("hi");
		//System.out.println(a2);
		System.out.println(a2.get(2));
		System.out.println(a2.contains(null));
		System.out.println(a2.indexOf("hi"));
		System.out.println(a2.lastIndexOf("hi"));
		
		ArrayList a1=new ArrayList();
		a1.add(90);
		a1.add('l');
		a1.add("good");
		a1.add(true);
		a1.add("hi");
		a2.add(a1);
		
		System.out.println(a2);
		System.out.println(a2.get(8));
		
		a2.addAll(5,a1);
		System.out.println(a2);
		
		a2.remove(90.45);
		System.out.println(a2);
		
		a2.retainAll(a1);
		System.out.println(a2);
		
		a2.clear();
		System.out.println(a2.size());
		System.out.println(a2);
	}

}
