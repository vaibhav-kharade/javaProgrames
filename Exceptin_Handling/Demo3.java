//case 3: When the Exception is occured but not handled.
class  Demo3
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		try
		{
			System.out.println("From try-block");
			int res=a/b;//ArithmeticException is Occured
			System.out.println(res);//Never gets executed when exception is occured.
		}
		catch (NullPointerException ae)
		{
			System.out.println("Exception is handled from catch-block");
		}
		System.out.println("Normal flows continues........");
	}
}
/*
Output:-
From try-block
Exception in thread 'main' java.lang.ArithmethicException by zero at (Demo.java.11) 
*/