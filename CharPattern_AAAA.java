class CharPattern_AAAA
{
	public static void main(String[] args) 
	{
		char ch='A';
		for (int i=1;i<=5 ;i++ )
		{
			//ch='A';// to reinitiate alphabate in every iterationB--->A
			for (int j=i;j<=5 ;j++ )
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}		
	}
} 

