package ExceptionHandling;

public class A1 {
	public static void div()
	{
		System.out.println("From div()");
		System.out.println("Hello");
		int a=10,b=0,c;
		try {
			c=a/b;//10/0-->Exception
			System.out.println(c);//unexecuted
		}
		catch (Throwable e) {
			// TODO: handle exception
			System.out.println("Exception Handled");
			System.out.println("ArithmeticException is handled");
		}
		System.out.println(" ");
	}
	public static void main(String [] args) {
		div();		
	}//printStactTrace()--->Default Exception Handler
}




//can we write any statement in try catch block?
	//>no we  cannot write any statement in  between try catch block
	//the after the try catch bolck.

	//can we write only try block without catch block
	//no a try block should always be followd by either catch blockor try finnaly bllock

//if we don't know exception type what type should we mention in catch block?
//when we don't know the exception type we can mention it as exception class type or throwable class type , bcoz exception is 
//super class to all the classess annd during upcasrtting we studied that super class can hold the ref. of the subclass object.
