//case 2: When the Exception is Occured and Handled
class Demo2 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		try
		{
			System.out.println("From try-block");
			int res=a/b;//Arithmetic Exception is occured.
			System.out.println(res);//never gets executed when execution occured
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Exception is handled from the catch-block");
		}
		System.out.println("Normal flow continues......");
	}
}
/*
OutPut->
From try-block
Exception is handled from the catch-block
Normal flow continues......
*/