class  IfElseIfLaddersmallestNumber
{
	public static void main(String[] args) 
	{
		int a=3;
		int b=5;
		int c=4;
		int d=2;
		int e=1;
		if(a<b && a<c && a<d &&a<e)
		{
			System.out.println(a +" is a Smallest number");
		}
		else if (b<c && b<d && b<e)
		{
			System.out.println(b+ " is a smallest number");
		}
		else if (c<d && c<e)
		{
			System.out.println(c+ " is a smallest number");
		}
		else if (d<e)
		{
			System.out.println(d+ " is a smallest number");
		}
		else
		{
			System.out.println(e+ " is a smallest number");
		}
	}
}