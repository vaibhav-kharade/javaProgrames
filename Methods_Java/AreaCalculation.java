//menue driven Program
//case: 1) area of circle=pi*r*r
//case2 Area of square=side *side   scaneer
//case area of a triangle=lenght * breadth
import java.util.Scanner;
class  AreaCalculation
{
	public static double areac(double a, int b)
	{
		CircleArea=pi*r*r;
		System.out.println(CircleArea);
	}
	public static int areas(int a, int b)
	{
		SquareArea=s*s;
		System.out.println(SquareArea);
	}
	public static double arear(double a, int b)
	{
		RectangleArea=l*b;
		System.out.println(RectangleArea);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a side value");
		int s=sc.nextInt();
		System.out.println("Enter a radius value");
		int r=sc.nextInt();
		System.out.println("Enter a length value");
		int l=sc.nextInt();
		System.out.println("Enter a breadth value");
		int b=sc.nextInt();
		System.out.println("Enter a height value");
		int h=sc.nextInt();
		int pi=3.14;
		areac();
		areas();
		arear();
	}
}
