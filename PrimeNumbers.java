import java.util.Scanner;
class PrimeNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a nummber");
		int num=sc.nextInt();//11;
		boolean b=false;
		for (int i=2;i<=num/2 ;i++ )//2<(20/2)---10t
		{
			if (num%i==0)//20%2==0 t
			{
				b=true;//true
				break;
			}
		}
		if (!b)
		System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not a prime number");
	}
}
