package ExceptionHandling;

public class A2 {

	public static void main(String[] args) {
			System.out.println("From div() Hello");
			int a=10,b=0,c;
			int []m=new int[3];//m[0],m[1],m[2],
			try 
			{
				c=a/b;//10/0-->Exception
			} 
			catch (ArithmeticException e) 
			{
				System.out.println("From catch block");
				System.out.println("ArithmeticException is handled and caught the reference of throwable type exception");
			}
			try 
			{
				m[3]=78;//beyond the declared size
			} 
			catch (ArrayIndexOutOfBoundsException e) 
			{
				System.out.println("Array Exception is handled and caught the reference of throwable type exception");
			}
		}

	}
