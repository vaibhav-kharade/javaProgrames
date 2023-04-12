class Static3 
{
	//static variable
	static int a;//0 30
	static String s;//null, hello
	
	public static void main(String[] args) 
	{
		System.out.println(a);//0
		System.out.println(s);//null
		a=30;//static var
		s="Hello";
		int a=m1(5);//5 method call statement local variable of main()
		System.out.println(a);//5
	    System.out.println(Static3.a);//30static variable
	
	}
	public static int m1(int a)//local var of m1(), formal arg
	{
		System.out.println(a);//5 local variable
	    System.out.println(6);//Hello static var
	    m2(6);
		return a;//local var
	}
	public static void m2(int a)//local var of m2(), formal arg
	{
		System.out.println(Static3.a);//30 static variable
	    System.out.println(s);//Hello static var
	 
	}
}
