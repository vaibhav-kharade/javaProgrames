class Method2 
{
	public static void main(String[] args) 
	{
		System.out.println(test(12));
	}
	public static int test(int n)//12
	{
		int x;
		for (x=1;x<=n ;x++ )//a<==12t 2<=12t 3<=12t 4<=12t 5<=12t 6<=12t...13<=12f
		{
			if (n%x==0)//12%12==0 f
				continue;
			
		}	return x;//13
	}
}
