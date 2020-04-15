package java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinMaxFunctions {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "Book 1", 1000));
		list.add(new Product(2, "Book 2", 2000));
		list.add(new Product(3, "Book 3", 3000));
		list.add(new Product(4, "Book 4", 4000));
		
		Product productMax = list.stream().max(new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				if(p1.price > p2.price){
					return 1;
				} else {
					return -1;
				}
			}
		}).get();
		System.out.println("Max: " + productMax.price);
		
		Product productMin = list.stream().min((product1, product2) -> {
			if(product1.price > product2.price) {
				return 1;
			} else {
				return -1;
			}
		}).get();
		System.out.println("Min: " + productMin.price);
	}

}
