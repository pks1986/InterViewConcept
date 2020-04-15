package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class FilterUsingStream {
	
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "Book 1", 1000));
		list.add(new Product(1, "Book 2", 2000));
		list.add(new Product(1, "Book 3", 3000));
		list.add(new Product(1, "Book 4", 4000));
		list.add(new Product(1, "Book 5", 5000));
		
		List<String> filteredList = 
				list
				.stream()
				.filter(new Predicate<Product>() {
					@Override
					public boolean test(Product p) {
						return p.price > 3000;
					}
				})
				//Using Lambda Expression
				//.filter(p -> p.price > 3000)
				
				.map(new Function<Product, String>() {
					@Override
					public String apply(Product p) {
						return p.name;
					}
				})
				//Using Lambda Expression
				//.map(p -> p.name)  
				.collect(Collectors.toList());
		
		System.out.println("Filtered List Size: " + filteredList);
	}

}
