import java.util.Scanner;
class Pattern1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for (int i=1; i<=a;i++ )
		{
			for (int j=7;j>=i ;j-- )
			{
				System.out.print(b);
			}
			System.out.println();
		}
		
	}
}
