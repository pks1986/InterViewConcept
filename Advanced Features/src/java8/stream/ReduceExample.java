package java8.stream;

import java.util.ArrayList;
import java.util.List;

public class ReduceExample {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "Product 1", 10000));
		list.add(new Product(2, "Product 2", 20000));
		list.add(new Product(3, "Product 3", 30000));
		list.add(new Product(4, "Product 4", 40000));
		list.add(new Product(5, "Product 5", 50000));

		/*
		 * float totalPrice = list.stream().map(product -> product.price).reduce(0.0f,
		 * new BinaryOperator<Float>() {
		 * 
		 * @Override public Float apply(Float value1, Float value2) { return (value1 +
		 * value2); } }); System.out.println(totalPrice);
		 */

		/*new BinaryOperator<Float>() {

			@Override
			public Float apply(Float t, Float u) {
				// TODO Auto-generated method stub
				return t + u;
			}
		};
*/
		float totalPrice = list.stream().map(product -> product.price).reduce(0.0f,
				(value1, previoussum) -> (value1 + previoussum));
		System.out.println(totalPrice);

		// More precise code, using Integer Class Sum function. The first argument is
		// the type of result we want
		float totalPrice2 = list.stream().map(product -> product.id).reduce(0, Integer::sum);
		System.out.println(totalPrice2);
	}
}
