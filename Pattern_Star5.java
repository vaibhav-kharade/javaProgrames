class Pattern_Star5
{
	public static void main(String[] args) 
	{
		int a,b;
		for (a=1;a<=5;a++)
		{
			for (b=5;b>=1 ;b-- )
			{
				if (a<=b)
				
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
