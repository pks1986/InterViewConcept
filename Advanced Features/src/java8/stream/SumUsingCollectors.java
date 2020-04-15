package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class SumUsingCollectors {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "Product 1", 10000));
		list.add(new Product(2, "Product 2", 20000));
		list.add(new Product(3, "Product 3", 30000));
		list.add(new Product(4, "Product 4", 40000));
		list.add(new Product(5, "Product 5", 50000));

		double sum = list.stream()
				// .map(product -> product.price)
				.collect(Collectors.summingDouble(new ToDoubleFunction<Product>() {
					@Override
					public double applyAsDouble(Product product) {
						// TODO Auto-generated method stub
						return product.price;
					}
				}));
		System.out.println(sum);
		
		//Using Lambda
		sum = list.stream()
				.collect(Collectors.summingDouble(product -> product.price));
		System.out.println(sum);
	}
}