package CollectionProgress;
//convert ArrayList to LinkdList
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class A10 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(78);
		a1.add(56.0);
		a1.add(false);
		
		LinkedHashSet l1=new LinkedHashSet(a1);
		System.out.println(l1);
		// TODO Auto-generated method stub

		
		System.out.println("*******************************");
		//convert HashSet to TreeSet using constructor
		HashSet<Integer> h1 =new HashSet<>();
		
		h1.add(10);
		h1.add(70);
		h1.add(120);
		h1.add(30);
		h1.add(90);
		TreeSet<Integer> t1=new TreeSet<>(h1);
		for(Integer o:t1)
			System.out.println(o);
		System.out.println("**************");
		//convert HashSet to TreeSet  using addAll()
		HashSet<String> h2=new HashSet<>();
		h2.add("Ten");
		h2.add("Seven");
		h2.add("Twenty");
		h2.add("Three");
		h2.add("Nine");
		TreeSet<String> t2=new TreeSet<>();
		t2.addAll(h2);
		for(String o:t2)
			System.out.println(o);
		System.out.println("**************");
		//convert HashSet into treeSet using for -each
        HashSet<String> h3 =new HashSet<>();
		
        h3.add("Ten");
		h3.add("Seven");
		h3.add("Twenty");
		h3.add("Three");
		h3.add("Nine");
		TreeSet<String> t3=new TreeSet<>();
		for(String o:h3)
		{
			t3.add(o);
		}
			System.out.println(t3);
		System.out.println("**************");
		
		
	}

}
