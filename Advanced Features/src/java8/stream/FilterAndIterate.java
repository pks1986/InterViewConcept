package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class FilterAndIterate {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "Book1", 1000));
		list.add(new Product(2, "Book2", 2000));
		list.add(new Product(3, "Book3", 3000));
		list.add(new Product(4, "Book4", 4000));

		list.stream().filter(product -> product.price == 3000).forEach(product -> System.out.println(product.name));

		/*
		 * List<Product> filteredList = list.stream() .filter(product -> product.price
		 * == 3000) .collect(Collectors.toList()); filteredList.forEach(product -> {
		 * System.out.println(product.name); });
		 */

		System.out.println("\n\nTable without lambda expression");
		final int tableOf = 10;
		Stream.iterate(1, new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t + 1;
			}
		}).filter(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t % tableOf == 0;
			}
		}).limit(10).forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				//System.out.println(t);
				System.out.print(t + "\t");
			}
		});

		System.out.println("\n\nTable with lambda expression");
		Stream.iterate(1, count -> count + 1).filter(num -> num % tableOf == 0).limit(10)
		//.forEach(System.out::println);
		.forEach(num -> System.out.print(num + "\t"));

		System.out.println("\n\nTable with lambda expression");
		Stream.iterate(1, count -> count * tableOf).limit(10)
		//.forEach(System.out::println);
		.forEach(num -> System.out.print(num + "\t"));
	}
}
