//6) WAJP to read one number as an input from the 
//user and print the Addition of factors of that number.

import java.util.Scanner;
class  Factor_Num_Add
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.print("Factros of "+num+" are :");
		//System.out.println(" ");
		int add=0;
		for (int i=1;i<=num ;i++)
		{
			if (num%i==0)
			{
				System.out.print(i+" ");
				add=add+i;
			}
		}
		System.out.println(" ");
		System.out.println("-------------------------");
		System.out.println("Addition of "+num+" Factors  is : "+add);
	}
}
