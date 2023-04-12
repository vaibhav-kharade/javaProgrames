package ExceptionHandling;

public class A8 {

	public static void main(String[] args) {

		int a=10,b=0,c;
		//outer try block
		try
		{ 
			//inner try catch block 1
		
		try 
		{
			c=a/b;//10/0-->Exception
		} 
		catch (ArithmeticException e1) 
		{
			System.out.println("Arithmetic Exception Handled");
		}
		//statement belongs to outer try block
		System.out.println("Outer try block Statement");
	}
		finally 
		{
		   System.out.println("Finally Block");	
		}
	}

}
