package PatternPrograms;

public class square {
	public static void main(String[] args){
		int num1=10;
		for(int i=1;i<=num1;i++)
		{
			if(num1>i)
			System.out.print("* ");	
			
			for(int j=0;j<=num1;j++)
			{
				//if(num1>j)
					System.out.print("* ");
			}
			System.out.println(" ");
		}
		System.out.println();
	}
}
