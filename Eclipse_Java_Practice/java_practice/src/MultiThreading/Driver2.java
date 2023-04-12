package MultiThreading;

public class Driver2 {

	public static void main(String[] args) {
		
		TablePrint t0=new TablePrint(5);
		t0.setName("table Printing");
		System.out.println("Thread Id="+t0.getId());
	    System.out.println("Default Thread Priority="+t0.getPriority());
		t0.setPriority(9);
		System.out.println("Change Thread Priority="+t0.getPriority());
		System.out.println("ClassName="+t0.getClass());
	    t0.start();

	}

}
