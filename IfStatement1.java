class  IfStatement1
{
	public static void main(String[] args) 
	{
		int a=3;
		int b=5;
		int c=4;
		if(a==b && b!=c)//true---> block will be executed   // false--->skip the block of code
		{
			System.out.println(a*b);
			System.out.println(b%c);
		}
        if(a!=b || b==c)//true---> block will be executed   // false--->skip the block of code
		{
			System.out.println(a+b);
			System.out.println(b-c);
		}
	}
}