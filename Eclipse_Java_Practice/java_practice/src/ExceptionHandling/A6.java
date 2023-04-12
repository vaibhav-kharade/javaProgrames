package ExceptionHandling;

public class A6 {
	public static void main(String[] args) {
		//exception occured and not handled but finally will execute
		int []m=new int[3];//m[0],m[1],m[2],
		try 
		{
			m[0]=20;
			m[1]=56;
			m[2]=22;
			m[3]=10;			
		}
		finally
		{
			System.out.println("from finally block");
		}
	}
}
