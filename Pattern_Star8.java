class Pattern_Star8
{
	public static void main(String[] args) 
	{
		int a,b;
		for (a=5;a>=1;a--)
		{
			for (b=1;b<=5 ;b++ )
			{
				if (a==b||a==1 ||b==5)
				
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
