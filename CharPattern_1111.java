class CharPattern_1111
{
	public static void main(String[] args) 
	{
		//char ch='A';
		for (int i=1;i<=5 ;i++ )
		{
			//ch='A';// to reinitiate alphabate in every iterationB--->A
			for (int j=1;j<=i ;j++ )
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();			
		}		
	}
} 

