class  IfElseIfLadderSmallestNumber1
{
	public static void main(String[] args) 
	{
		int a=3;
		int b=5;
		int c=4;
		if(a<b && a<c)
		{
			System.out.println(a +" is a Smallest number");
		}
		else if (b<c)
		{
			System.out.println(b+ " is a Smallest number");
		}
		else 
		{
			System.out.println(c+ " is a Smallest number");
		}
	}
}