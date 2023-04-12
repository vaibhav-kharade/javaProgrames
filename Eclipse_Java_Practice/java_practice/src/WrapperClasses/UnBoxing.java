package WrapperClasses;

public class UnBoxing {
	// The process of converting a non-primitive value into the primitive value intValue(), doubleValue()
	public static void main(String[] args) {
		
		Integer b=10; 
		 int a=b.intValue(); 
		System.out.println(a);

		Byte b2=70;
		byte b3=b2.byteValue();
		System.out.println(b3);
		
		Double d1=45.34;
		double d2=d1.doubleValue();
		System.out.println(d2);
		
		Character ch2='l';
		char ch3=ch2.charValue();
		System.out.println(ch3);

	}
}
