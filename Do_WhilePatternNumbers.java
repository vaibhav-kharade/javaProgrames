class Do_WhilePatternNumbers 
{
	public static void main(String[] args) 
	{
		int a=1;
		do
		{
			int b=1;
			do
			{
				System.out.print(b);//1
				b++;//2
			}while (b<=a);//2<=1
			System.out.println();
			a++;//2
		}while (a<=5);//2<=5
	}
}
