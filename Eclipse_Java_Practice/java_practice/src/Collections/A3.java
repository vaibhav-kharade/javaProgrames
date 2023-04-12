package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class A3 {

	public static void main(String[] args) {
		ArrayList<Integer> a2=new ArrayList<>();
		System.out.println(a2.isEmpty());
		a2.add(20);
		a2.add(30);
		a2.add(65);
		a2.add(92);
		a2.add(94);
		a2.add(20);
		a2.add(12);
		System.out.println(a2); 
		//convert  ArrayList into Array
		Object [] obj = a2.toArray();
		System.out.println("Arraylsit converted into Array "+Arrays.toString(obj));
	}

}
