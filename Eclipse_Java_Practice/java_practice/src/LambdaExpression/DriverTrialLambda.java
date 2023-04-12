package LambdaExpression;

public class DriverTrialLambda {
	public static void main(String [] args)
	{
		Trial t1= ()->{
			System.out.println("Hi");
			System.out.println("Hello");
		};
		t1.demo();
	}

}
