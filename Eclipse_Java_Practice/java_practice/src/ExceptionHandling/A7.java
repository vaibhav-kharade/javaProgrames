package ExceptionHandling;
//try catch finally nested
public class A7 {

	public static void main(String[] args) {
		int []m=new int[3];//m[0],m[1],m[2]
		int a=10,b=0,c;
		//outer try
		try
		{ 
			//inner try catch block 1
		try 
		{
			m[0]=20;
			m[1]=56;
			m[2]=22;
			m[3]=78;
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Array Exception Handled");
		}
       
		//inner try catch finally block 2
		try 
		{
			c=a/b;//10/0-->Exception
		} 
		catch (ArithmeticException e1) 
		{
			System.out.println("Arithmetic Exception Handled");
		}
		finally 
		{
		   System.out.println("Finally Block");	
		}
		//statement belongs to outer try block
		System.out.println("This is outer try block");
	}
		catch(Exception e3) 
		{
		   System.out.println("Exception Handled");	
		}
		finally
		{
			System.out.println("Nested try is closed");
		}
	}

}
