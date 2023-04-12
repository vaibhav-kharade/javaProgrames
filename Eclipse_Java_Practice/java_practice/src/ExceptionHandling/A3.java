package ExceptionHandling;

public class A3 {
	public static void main(String[] args){
			System.out.println("Hello From div()");
			int a=10,b=0,c;
			int []m=new int[3];//m[0],m[1],m[2],
			try 
			{
				c=a/b;//10/0-->Exception
			} 
			//most specific to most general catch block
			catch (ArithmeticException e) 
			{
				System.out.println("From catch block 1");
				System.out.println("ArithmeticException is handled");
			}
			 catch (ClassCastException e) {
				System.out.println("Class Cast Exception is handled");
			}
			catch (Exception e) 
			{
					System.out.println("Array Exception is Handled");
			}
			catch (Throwable e) 
			{
			   System.out.println();	
			}
		}
}
