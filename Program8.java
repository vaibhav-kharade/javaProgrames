class Program8 
{
	public static void main(String[] args) 
	{
		int a=20;
		int b=a;
		System.out.println(a+" "+b);//20 20
		System.out.println(b+2);//20+2=22
		System.out.println(a+'2');//20+'2'=20+50=70
		System.out.println(b+'2');//20+'2'=20+50=70
		System.out.println('6'+b);//54+20=74
		System.out.println("CoreJava"+a);//CoreJava+20=CoreJava20
		System.out.println(a+b+2+"CoreJava");//42CoreJava
		System.out.println("CoreJava"+a+b+2);//CoreJava20202
		System.out.println("CoreJava"+(a+b+2));//CoreJava42
	}
}
