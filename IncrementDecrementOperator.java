// ++(increment operator) preincrement(++i) i=10; sop(++i);//11---change before the action
//postincrement(i++)  i=10;  sop(i++); //10   11----change after the action
//--()decrement operator) predecrement(--i)  i=10; sop(--i);  10--9
//postdecrement(i--)
class IncrementDecrementOperator 
{
	public static void main(String[] args) 
	{
		int a=10;
		System.out.println(a++);//10++=11
		int b=++a;//++11=12-->b
		System.out.println(b);//12
		System.out.println(--b);//--12---->1
		System.out.println(++a + 40 + ++b);//++12 +40+ ++11=13+40+12=40+24=65
		int c=10;
		int d=c++;//d=10 c=11
		System.out.println(c);//11
		System.out.println(d);//10
		System.out.println(--c +--d +c++ +d++ +--d);
		int x=4;
		x+=x++ *++x %2;
		System.out.println(x);
		int y=8;
		y-=++y + y++ +4;
		System.out.println(y);
		int m=20;
		int n=40;
		boolean result=m++>n && n++<m;//20>40 false m++ 20++ 21
		System.out.println(result);
		System.out.println(m);
		System.out.println(n);
	}
}
