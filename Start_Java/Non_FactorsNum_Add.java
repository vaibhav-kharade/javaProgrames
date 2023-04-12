//8) WAJP to read one number as an input from the user 
//and print the Addition of non-factors of that number.
import java.util.Scanner;
class  Non_FactorsNum_Add
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num =sc.nextInt();
		int sum=0;
		System.out.println("---------------------------------------");
		System.out.print("Non-Factor of a "+num+" are : ");
		for (int i=1;i<=num ;i++ )
		{
			if (num%i!=0)
			{
				System.out.print(i+" ");
				sum=sum+i;
			}
		}
		System.out.println(" ");
		System.out.println("---------------------------------------");
		System.out.println("Sum of non-factors of a "+num+" is "+sum+".");
	}
}
