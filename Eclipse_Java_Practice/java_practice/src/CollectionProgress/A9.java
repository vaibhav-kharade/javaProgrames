package CollectionProgress;

import java.util.Iterator;
import java.util.LinkedHashSet;

//LinkedHashSet
//No duplicate element
//maintain the insertion order
//we can predict iteration order
//accepts homogenious+heterogeneous
public class A9 {
	public static void main(String [] args) {

		 LinkedHashSet l1 =new LinkedHashSet();
		 l1.add(90);
		 l1.add('g');
		 l1.add("hi");
		 l1.add(965.23);
		 l1.add(true);
		 System.out.println(l1.size());
		 for(Object o:l1)
			 System.out.println(o);
		 System.out.println("**************************************************");

		 LinkedHashSet l2 =new LinkedHashSet();
		 l2.add(900);
		 l2.add('l');
		 l2.add("helo");
		 l2.add(65.2);
		 l2.add(false);
		 for(Object o:l2)
			 System.out.println(o);
		 System.out.println("**************************************************");
		 l1.addAll(l2);
		 Iterator iter=l1.iterator();
		 while(iter.hasNext())
			 System.out.print(iter.next()+" ");
		 System.out.println();
		 System.out.println("**************************************************");
		 
	}
}
