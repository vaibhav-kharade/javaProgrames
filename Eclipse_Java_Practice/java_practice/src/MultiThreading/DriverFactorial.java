package MultiThreading;

public class DriverFactorial {

	public static void main(String[] args) {
		Factorial factThread=new Factorial(5);
      factThread.setName("Factorial Thread");
      factThread.start();
      
      EvenNumbers evenThread=new EvenNumbers(4);
      evenThread.setName("Even Thread");
      evenThread.start();
	}

}
