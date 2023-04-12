//Assignment_1:=> Convert all numeric 
//datatypes int,short,float,double,long,byte into char
class AllDataTypesConversion_Into_Char 
{
	public static void main(String[] args) 
	{
		byte b=40;		
		int i=b;
		short s=(short)i;
		long lo= (char)s;
		float f=(char)lo;
		double d=f;
		System.out.println((char)b);
		System.out.println((char)i);
		System.out.println((char)s);
		System.out.println((char)lo);
		System.out.println((char)f);
		System.out.println((char)d);
	}
}
