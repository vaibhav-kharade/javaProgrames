package MapPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, String>h1=new LinkedHashMap<>();
		h1.put(203, "Hello,hi");
		h1.put(401, "Good Afternoon");
		h1.put(190, "How are you");
		
		System.out.println(h1.keySet());
		System.out.println(h1.values());
		System.out.println(h1.get(401));
		System.out.println(h1.get(105));
		System.out.println(h1.containsKey(190));
		System.out.println(h1.containsValue("Hello,hi"));
		h1.put(null, null);
		System.out.println(h1);
		h1.put(null, "Bye");
		System.out.println(h1);
		h1.remove(203);
		System.out.println("The entry Set:-");
		for(Map.Entry<Integer, String> m1:h1.entrySet())
		//System.out.println(m1);
		System.out.println("Key="+m1.getKey()+" "+"Values="+m1.getValue());
		

	}

}
