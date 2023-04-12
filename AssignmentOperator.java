class AssignmentOperator
//a=5 b=10  assign value
//a+=b---->a=a+b
//a-=b---->a=a-b
//a*=b---->a=a*b
//a/=b---->a=a/b
{
	public static void main(String[] args) 
	{
		int a=67;
		a+=10;//---->a=a+10=77
		a-=9;//---->a=a-9  77-9=68
		a*=3;//---->a=a*3=204
		a/=2;//---->a=a/2=102
		a%=6;
		System.out.println(a);		
	}
}
