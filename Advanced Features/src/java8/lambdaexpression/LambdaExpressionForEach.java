package java8.lambdaexpression;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Consumer;

public class LambdaExpressionForEach {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Item 1");
		list.add("Item 2");
		list.add("Item 3");
		list.add("Item 4");

		System.out.println("\nList");
		
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println("Without Lambda " + t);
			}
		});
		
		System.out.println("With Parenthesis");
		
		list.forEach( (objName) -> {
			System.out.println(objName);
		});
		
		System.out.println("Without Parenthesis");
		list.forEach( objName -> {
			System.out.println(objName);
		});
		

		System.out.println("\nSet");
		Set<String> set = new HashSet<String>();
		set.add("1");
		set.add("2");
		set.add("1");
		set.forEach( setObj ->{
			System.out.println(setObj);
		});
		
		System.out.println("\nMap");
		Map<String, Integer> map = new TreeMap<String, Integer>();
		map.put("Key 1", 100);
		map.put("Key 2", 200);
		map.put("Key 3", 300);
		
		map.forEach((key, value) -> {
			System.out.println(key  + " : " + value);
		});

		//Map.Entry<String, Integer> entry;
		System.out.println("\nMapAgain");
		map.entrySet().forEach(entry -> {
		    System.out.println(entry.getKey() + " : " + entry.getValue());
		}); 		
	}
}
