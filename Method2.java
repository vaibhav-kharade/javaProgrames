class Method2 
{
	public static void main(String[] args) 
	{
		System.out.println(test(10));
	}
	public static void test(int n)
	{
		int x;
		for (x=1;x<=n ;x++ )
		{
			if (n%x==0)
				break;
			
		}	return x;
	}
}
