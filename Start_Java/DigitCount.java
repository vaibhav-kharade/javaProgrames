// WAJP to Count digit of a number
import java.util.Scanner;
class DigitCount
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int count=0;
		/*for (int i=num;i!=0 ;i=i/10 )
		{
			count++;
		}*/
		while(num>0)
		{
			num=num/10;w
			count++;
		}
		
		System.out.println(count);
	}
}
