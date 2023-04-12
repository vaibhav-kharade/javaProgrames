package CollectionProgress;

import java.util.LinkedList;

//Queue(I)
//offer(Object),poll(),peek()
//LinkedList,PriorityQueue
public class A11 {
	public static void main(String args []) {
		LinkedList l1=new LinkedList();
		l1.offer(13);
		l1.offer('p');
		l1.offer("Good");
		l1.offer(false);
		System.out.println(l1);
		System.out.println(l1.poll());
		System.out.println(l1.poll());
		System.out.println(l1.peek());
		System.out.println(l1.isEmpty());
		System.out.println(l1.size());
		
		
		System.out.println("*************************");
		LinkedList l2=new LinkedList();
		l2.offer(130);
		l2.offer('u');
		l2.offer("food");
		l2.offer(true);
		while(!(l2.isEmpty()))
			System.out.println(l2.poll());
		System.out.println(l2.isEmpty());
		System.out.println(l2.size());
		
		
	}

}
