package WrapperClasses;

public class Boxing {
	// The process of converting a primitive value into the non-primitive(Object)
	//static method valueOf().
public static void main(String [] args)
{
	int a=10; //primitive value
	Integer b=Integer.valueOf(a); // non-primitive
	System.out.println(b);

	byte b1=70;
	Byte b2=Byte.valueOf(b1);
	System.out.println(b2);
	double d=20.90;
	Double d1=Double.valueOf(d);
	System.out.println(d1);
	
	char ch='l';
	Character ch2=Character.valueOf(ch);
	System.out.println(ch2);
	
	}

}
