package MultiThreading;

public class Writer extends Thread{
Book b;
String newTitle;
public Writer(Book b,String newTitle) {
	this.b=b;
	this.newTitle=newTitle;
}
public void run()
{
b.write(newTitle);	
}
}
