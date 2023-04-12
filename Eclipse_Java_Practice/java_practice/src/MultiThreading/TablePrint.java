package MultiThreading;

public class TablePrint extends Thread {
int num;
public TablePrint(int num)
{
	this.num=num;
}
@Override
public void run()
{
	System.out.println(getName());
	try
	{
for(int i=1;i<=10;i++)
{
System.out.println(num+" "+i+"="+(num*i));
sleep(2000);
}
}
catch(InterruptedException e)
	{
	System.out.println(e.getMessage());
	}}
}
