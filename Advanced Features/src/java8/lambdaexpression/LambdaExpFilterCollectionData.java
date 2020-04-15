package java8.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaExpFilterCollectionData {
	
	public static void main(String[] args) {
		List<Book> list = new ArrayList<>();
		list.add(new Book("Book 1", 100));
		list.add(new Book("Book 2", 200));
		list.add(new Book("Book 3", 300));
		list.add(new Book("Book 4", 400));
		list.add(new Book("Book 5", 500));
		
		Stream<Book> filteredWithoutLambda = list.stream().filter(new Predicate<Book>() {
			@Override
			public boolean test(Book book) {
				if(book.getBookPrice() <= 300) {
					return true;
				} else {
					return false;
				}
			}
		});
		
		System.out.println("Filtered data without lambda expression:");
		filteredWithoutLambda.forEach(book -> {
			System.out.println(book.getBookName() + " :: " + book.getBookPrice());
		});
		
		//In Single Line
		Stream<Book> filteredList = list.stream().filter ( p -> p.getBookPrice() > 300);
		
		//In Multiple Line
		/*Stream<Book> filteredList = list.stream().filter((p)-> {
			if(p.getBookPrice() > 300) {
				return true;
			} else {
				return false;
			}
		});*/
		
		System.out.println("\nFiltered Data with Lambda Expression:");
		
		filteredList.forEach(book -> {
			System.out.println(book.getBookName() + " :: " + book.getBookPrice());
		});
	}
}

class Book {
	
	private String bookName;
	private int bookPrice;
	
	public Book(String bookName, int bookPrice) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public String getBookName() {
		return bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}	
}