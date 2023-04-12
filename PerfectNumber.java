class  PerfectNumber //exclude the number itself
{
	public static void main(String[] args) 
	{
		int num=28, sum=0;
		int i;
		for (i=1;i<=num/2 ;i++ )
		{
			if (num%i==0)
			{
				sum=sum+i;
			}
		}
		if (sum==num)
			System.out.println("Perfect Number");
		else
		    System.out.println("Not a perfect Number");
	}
}
