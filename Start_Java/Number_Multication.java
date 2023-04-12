//WAJP to read two number as an input from the user and print the Multiplication of those numbers.
import java.util.Scanner;
class  Number_Multication
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number");
		int num1=sc.nextInt();
		System.out.println("Enter Second number");
		int num2=sc.nextInt();
		System.out.println("The sum of given two numbers is : "+(num1*num2));
	}
}
