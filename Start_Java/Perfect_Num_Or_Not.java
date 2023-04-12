//7) WAJP to Accept one number from the 
//user and check whether the number is prfect or not?
import java.util.Scanner;
class  Perfect_Num_Or_Not
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num =sc.nextInt();
		int sum=0;
		for (int i=1;i<num ;i++ )
		{
			if (num%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("--------------------------");
		if (num==sum)
		{
			System.out.println(num+" is a Perfect Number.");
		}
		else
			System.out.println(num+ " is not a Perfect Number.");
	}
}
