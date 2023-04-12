import java.util.Scanner;
class Method4 
{
	public static void calculate(int n, char ch)
	{
		if (ch=='s')
	     {
			if(n%7==0)
		    System.out.println(n+"is Divisible by 7");
		    else
			System.out.println(n+"is not divisibble by 7");
	     }
	     else
		{
			if(n%10==7)
				System.out.println("In "+n+" last digit is 7");
			else
				System.out.println("in "+n+" last digit is not 7");
		}
	}
	public static void calculate(int n, int m, char ch)
	{
		if (ch=='g')
		System.out.println(n>m? n+"is the Greatest ":m+"is the greatest");
		else
		System.out.println(n<m? n+"is the smallest ":m+"is the smallest");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer number and a char value");
		int a=sc.nextInt();
		char ch=sc.next().charAt(0);
		calculate(a,ch);
		System.out.println("Enter two integer values and a char value");
		int a1=sc.nextInt();
		int b=sc.nextInt();
		char ch1=sc.next().charAt(0);
		calculate(a1,b,ch1);
	}
}
