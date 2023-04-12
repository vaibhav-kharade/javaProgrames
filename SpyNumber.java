class SpyNumber 
{
	public static void main(String[] args) 
	{
		int num=123,sum=0,lastDigit,prod=1;
		while (num>0)//123>0true  12>0true 1>0true 0>0flase
		{
			lastDigit=num%10;//312%10=2,1%10=1
			sum=sum+lastDigit;//0+3=3+2=5
			prod=prod*lastDigit;//1*3=3*2=6*1=6
			num=num/10;//123/10=12, 12/12=1 1/10=0
		}
		if (sum==prod)//6==6
		{
			System.out.println("spy Number");
		}else
		{
		System.out.println("Not a spy Number");
		}
	}
}
