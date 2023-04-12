package MultiThreading;

public class Book {
String title;
public Book(String title) {
	this.title=title;
}
public void read()
{
  for(int i=0;i<title.length();i++)
	  System.out.println(title.charAt(i));
  try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	System.out.println(e.getMessage());
	System.out.println("Read Thread is interrupted");
}
}
public void write(String newTitle)
{
   this.title=newTitle;
   try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	System.out.println(e.getMessage());
}
}
}
