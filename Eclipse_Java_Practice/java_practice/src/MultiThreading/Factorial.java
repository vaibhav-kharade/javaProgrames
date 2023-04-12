package MultiThreading;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Factorial extends Thread{
	int num;
	int fact=1;
	public Factorial(int num) {
		this.num = num;
	}
@Override
public void run()
{
PrintWriter pw=null;
try
{
pw=new PrintWriter("D://"+getName()+".txt");
  for(int i=1;i<=num;i++)
  {
	fact=fact*i;  
  }
  pw.println(fact+ " is the factorial of "+num);
  }
catch(FileNotFoundException e)
{
System.out.println("Cannot find the file Nmae "+getName());	
}
finally
{
pw.flush();
pw.close();
}
}
}
