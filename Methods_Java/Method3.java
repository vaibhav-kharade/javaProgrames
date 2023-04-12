class Method3
{
	public static void main(String[] args) 
	{
		System.out.println(test1(12));
		System.out.println(test2(4,17));
		System.out.println(test3('f','e'));
	}
		public static int test3(char c1, char c2)
	{
		return c1+c2;
	}
	public static int test2(int a, int b)
	{
		while (a==b)
		{
			if (a>b)
			{
				a=a-b;
			}
			else
				a=b-a;
		}
		return a+b;
	}
	public static int test1(int n)//12
	{
		int x;
		for (x=1;x<=n ;x++ )//a<==12t 2<=12t 3<=12t 4<=12t 5<=12t 6<=12t...13<=12f
		{
			if (n%x==0)//12%12==0 f
				continue;
			
		}	return x;//13
	}	
}
