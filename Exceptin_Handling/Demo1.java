//cas1 1:- when the Exception is not occured
class  Demo1
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=2;
		try
		{
			System.out.println("From try-block");
			int res=a/b;//Statement which is responsible for causing exception
			System.out.println(res);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Exception is handled from the catch-block");
		}
		System.out.println("Normal Flow continues.......");
	}
}
/* 
OutPot-->
From try-block
5
Normal Flow continues.......
*/