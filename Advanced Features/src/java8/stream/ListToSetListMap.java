package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSetListMap {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "Book 1", 1000));
		list.add(new Product(2, "Book 2", 2000));
		list.add(new Product(3, "Book 3", 3000));
		list.add(new Product(4, "Book 4", 4000));
		//list.add(new Product(4, "Book 5", 5000));

		Set<String> setProducts = list.stream().map(product -> product.name).collect(Collectors.toSet());
		System.out.println("List To Set: " + setProducts);

		List<Float> listPrice = list.stream().map(product -> product.price).collect(Collectors.toList());
		System.out.println("List To List: " + listPrice);
		
		
		/*Map<Integer, String> mapBooks = list.stream()
				.collect(Collectors.toMap(new Function<Product, Integer>() {

					@Override
					public Integer apply(Product p) {
						return p.id;
					}
				}, new Function<Product, String>() {

					@Override
					public String apply(Product p) {
						return p.name;
					}
				}));*/
		
		Map<Integer, String> mapBooks = list.stream()
		.collect(Collectors.toMap(product -> product.id, product -> product.name));
		
		System.out.println("List To Map: " + mapBooks);
			
	}

}
