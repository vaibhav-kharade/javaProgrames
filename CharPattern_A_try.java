class CharPattern_A_try
{
	public static void main(String[] args) 
	{
		char ch='A';
		for (int i=1;i<=5 ;i++ )
		{
			ch='A';// to reinitiate alphabate in every iterationB--->A
			for (int j=1;j<=i ;j++ )
			{
				ch++;
				System.out.print(ch+ " ");
				ch++;
			}
			System.out.println();			
		}		
	}
} 

