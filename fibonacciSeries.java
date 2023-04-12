class fibonacciSeries 
{
	public static void main(String[] args) 
	{
		int count=10, firstNo=0, secondNo=1;
		int thirdNo;
		System.out.println("fibonacci series till "+count+" term");
		for (int i=1;i<=count ;i++ )
		{System.out.print(firstNo+" ");
		thirdNo=firstNo+secondNo;
		firstNo=secondNo;
		secondNo=thirdNo;
		}
	}
}
