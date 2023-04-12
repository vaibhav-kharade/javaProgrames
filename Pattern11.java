class Pattern11
{
	public static void main(String[] args) 
	{
		int a,b;
		for (a=1;a<=5 ;a++)
		{
			for (b=1;b<=5;b++ )
			{
				if ((a+b)%2==0)
				System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
		
	}
}