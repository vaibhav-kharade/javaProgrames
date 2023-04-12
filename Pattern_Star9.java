class Pattern_Star9
{
	public static void main(String[] args) 
	{
		int a,b;
		for (a=1;a<=5;a++)
		{
			for (b=1;b<=5 ;b++ )
			{
				if (a==b||a==5 ||b==1)				
				   System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
