//Systax:   testCondition?Statement1:Statement2;
// return type of test condition condition boolean type(true,false)
// if the condition ie true--->Statement 1 will get executed
// if the condition ie false--->Statement 2 will get executed
class ConditionalOperator 
{
	public static void main(String[] args) 
	{
		int a=3;
		int b=4;
		int c=(a>b)?a:b;//3>4== true====3   false ===4
		System.out.println(c);
	}
}
