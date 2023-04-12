import java.util.Scanner;
class NeonNumber_Scanner 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sq=n*n;//9*9=81
		int ld, sum=0;
		while (sq>0)//81>0 t 8>0t 0>0t
		{
			ld=sq%10;//81%10=1 8%10=8
			sum=sum+ld;//0+1=1+8=9
			sq=sq/10;//81/10=8 8/10=0
		}
		if (n==sum)//9==9 t
		System.out.println(n+" is a neon number");
		else
			System.out.println(n+" is not  a neon number");		
	}
}