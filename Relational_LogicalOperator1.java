//Relational Operator
//a == b  is equal to
//!= not equal to a!=b
//>  a>b greater than
//<  a<b less than
//>=  greater than or equal to a>=b
//<= less than or equal to a<=b

//Logical Operator
//&& Logical And all the conditions must be true then only it will return true
//|| Logical Or it will return true if any of the condition is true
// 1 Logical Notresult is true=false and vicecersa

class Relational_LogicalOperator1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 6;
		boolean d=true;
		boolean e=false;
		boolean f=!e;
        boolean result1 = a > b && a > c;// a>b 10>20 F
        boolean result2 = a > b || a > c;// 100>20 f 20>6 t
        boolean result3 = !(a > b && a > c);// F=T
        boolean result4 = !(a > b || a > c); //
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
		System.out.println(true);
		System.out.println(false);
		System.out.println(!(d && e));
		System.out.println(f);
    }
}