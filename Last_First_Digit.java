class Last_First_Digit 
{
	public static void main(String[] args) 
	{
		int num=4263;
		int temp=num;
		int firstDigit=0;
		int lastDigit=num%10;
	
		System.out.println("The last digit of "+num+" = "+lastDigit);
		while(num>0)
		{
			firstDigit=num%10;
			num/=10;
		}
		System.out.println("The First digit of "+temp+" = "+firstDigit);
	}
}
