import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetWithComparable {
	
	public static void main(String[] args) {
		
		TreeSet<Book> ts = new TreeSet<Book>();
		Book book1 = new Book(1, "Let us C", "Yashwant", "BPB", 8);
		Book book2 = new Book(2, "Let us C", "Kanetkar", "BPB",8);  
		Book book3 = new Book(3, "Let us C", "Yashwant", "BPB", 8);
		Book book4 = new Book(4, "Let us C", "Kanetkar", "BPB",8);  
		Book book5 = new Book(2, "Let us C", "Yashwant", "BPB", 8);
		Book book6 = new Book(5, "Let us C", "Kanetkar", "BPB",8);  
		ts.add(book1);
		ts.add(book2);
		ts.add(book3);
		ts.add(book4);
		ts.add(book5);
		ts.add(book6);

		Iterator<Book> itr = ts.iterator();
		Book book;
		while(itr.hasNext()) {
			book = itr.next();
			System.out.println("Book ids: " + book.id);
		}
	}
	
	static class Book implements Comparable<Book>{
		int id, quantity;
		String name, author, publisher;
		public Book(int id, String name, String author, String publisher, int quantity){
			this.id = id;  
		    this.name = name;  
		    this.author = author;  
		    this.publisher = publisher;  
		    this.quantity = quantity;  
		}
		@Override
		public int compareTo(Book book) {
			if(id > book.id) {
				return 1;
			} else if(id < book.id) {
				return -1;
			} else {
				return 0;
			}			
		}		
	}
	
}
