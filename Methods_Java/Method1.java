class Method1 
{
	public static double demo(int a)
	{
		int b=20;
		if(a<0)
		    return a;
		else 
			return b;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int b=129;

		System.out.println(demo(b));
		int c=79;
		System.out.println(demo(c));//20.0
	}
	//-128 to 127  128--->-128 130--->-126
}
