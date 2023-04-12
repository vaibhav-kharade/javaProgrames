import java.util.Scanner;
class ReadProgram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name nummber");
		String name=sc.next();
		System.out.println("Enter your age nummber");
		int age=sc.nextInt();
		System.out.println("Enter your gender nummber");
		char gender=sc.next().charAt(0);

		System.out.println("Name "+name);
		System.out.println("Age "+age);
		System.out.println("Gender "+gender);
	}
}
