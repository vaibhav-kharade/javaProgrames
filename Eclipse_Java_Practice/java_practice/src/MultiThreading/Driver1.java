package MultiThreading;

public class Driver1 {

	public static void main(String[] args) {
		MyThread1 t0=new MyThread1();
		
		t0.setName("NumberPrinting");
		System.out.println("Thread Id= "+t0.getId());
		System.out.println("Default Thread Priority= "+t0.getPriority());
		t0.setPriority(9);
		//t0.setPriority(11);----> IllegalArgumentException(if we channge priority above 10)
		System.out.println("Changed Thread Priority ="+t0.getPriority());
		System.err.println("ClassName= "+t0.getClass());
		System.out.println(t0.getThreadGroup());
		t0.start();

	}

}
