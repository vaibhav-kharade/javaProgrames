class Pattern_Star_10
{
	public static void main(String[] args) 
	{
		int a,b;
		for (a=5;a>=1;a--)
		{
			for (b=5;b>=1 ;b-- )
			{
				if (a>=b)				
				   System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
