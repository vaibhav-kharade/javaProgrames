package MultiThreading;

public class MyThread1 extends Thread{
	@Override
	public void run()
	{
		System.out.println(getName());
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i);
				sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
