package MultiThreading;

public class BookDriver {

	public static void main(String[] args) {
		Book book = new Book("New Happy Life");
		Reader read=new Reader(book);
		Writer write=new writer(book,"You can win");
		read.start();
		write.start();
		
	}

}
