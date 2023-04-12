
package MultiThreading;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EvenNumbers extends Thread{
	int num;
	public EvenNumbers(int num) {
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
	if(i%2==0) {
	pw.println(i+ " is the factorial of "+num);
  }
  }
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