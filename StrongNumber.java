class StrongNumber 
{
	public static void main(String[] args) 
	{
		int num=145,sum=0,lastDigit;
		int temp=num;
		while (num>0)//134>0 t 14 >0t 1>0t 0>0f
		{
			lastDigit=num%10;//143%10=3, 14%10=10,1%10=1
			sum=sum+fact(lastDigit);//0+6=6+24=30+1=31
			num=num/10;//143/10=14   14/10=1  1/10=0
		}
		if (sum==temp)//31==143f
		System.out.println(temp +" is a stong number");
		else
			System.out.println(temp+" is not a strong number");
	}
	public static int fact(int n)//3  4  1
	{
		int fact=1;
		while(n>0)//3>0 t 2>0t 1>0t 0>0f//////4>0t 3>0t 2>0t 1>0t 0>0f
		{
			fact=fact*n;//1*3=3*2=6*1=6/////1*4=4*3=12*2=24*1=24
			n--;//3--=2--=1--=0/////4--=3--=2--=1---=0
		}
		return fact;//6/////24////////1
	}
}
