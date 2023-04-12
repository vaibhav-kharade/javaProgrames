class  IfElseIfLadderGreatestNumber
{
	public static void main(String[] args) 
	{
		int a=3;
		int b=5;
		int c=4;
		if(a>b && a>c)
		{
			System.out.println(a +" is a Greatest number");
		}
		else if (b>c)
		{
			System.out.println(b+ " is a greatest number");
		}
		else 
		{
			System.out.println(c+ " is a greatest number");
		}
	}
}