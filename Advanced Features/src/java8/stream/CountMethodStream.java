package java8.stream;

import java.util.ArrayList;
import java.util.List;

public class CountMethodStream {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "Book 1", 1000));
		list.add(new Product(2, "Book 2", 2000));
		list.add(new Product(3, "Book 3", 3000));
		list.add(new Product(4, "Book 4", 4000));
		
		long count = list.stream()
                //.filter(product->product.price<3000)  
                .count(); 
		System.out.println("Count: " + count);

	}

}
