package java8.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsFunctions {

	public static void main(String[] args) {
		List<Integer> listData = new ArrayList<>();
		listData.add(1);
		listData.add(2);
		listData.add(3);
		listData.add(4);
		listData.add(5);
		
		//Collectors.reducing()
		
		/*Optional<Integer> result = listData.stream().collect(Collectors.reducing(new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		}));*/
		
		//With Lambda
		Optional<Integer> result = listData.stream().collect(Collectors.reducing((Integer t, Integer u)-> 
				t + u
		));
		
		System.out.println("Collectors.reducing() of " + listData + " is " + result);
		
		//Average using averagingInt()
		/*double average = listData.stream().collect(Collectors.averagingInt(new ToIntFunction<Integer>() {
			@Override
			public int applyAsInt(Integer value) {
				return value;
			}
		}));*/
		
		double average = listData.stream().collect(Collectors.averagingInt(value -> value));
		System.out.println("Collectors.averagingInt() of " + listData + " is " + average);
		
		
		//groupingBy()
		
		/*Map<String, List<Integer>> groupingBy = listData.stream().collect(
				Collectors.groupingBy(new Function<Integer, String>() {		
					//Integer type of input elements, String type of keys
			@Override
			public String apply(Integer t) {
				return String.valueOf(t);
			}
		}));*/
		
		Map<String, List<Integer>> groupingBy = listData.stream().collect(Collectors.groupingBy(t -> 
				String.valueOf(t)
		));
		System.out.println("Collectors.groupingBy() of " + listData + " is " + groupingBy);
		
		
	}

}
