package java8.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpComparator {
	
	public static void main(String[] args) {
		
		CustomClass c1 = new CustomClass(1, "Name 1", 100);
		CustomClass c2 = new CustomClass(5, "Name 5", 500);
		CustomClass c3 = new CustomClass(6, "Name 6", 600);
		CustomClass c4 = new CustomClass(2, "Name 2", 200);
		CustomClass c5 = new CustomClass(4, "Name 4", 400);
		CustomClass c6 = new CustomClass(3, "Name 3", 300);

		List<CustomClass> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		list.add(c6);
		
		System.out.println("List without Lambda Comparator\n However comparator did not sort this time: ");
		Collections.sort(list);
		list.forEach(cc->{
			System.out.println(cc.getName());
		});
		
		
		System.out.println("\nWithout Lambda, Sorted in Reverse Order:");
		Collections.sort(list, new Comparator<CustomClass>() {
			@Override
			public int compare(CustomClass cccc1, CustomClass cccc2) {
				if(cccc1.getId() > cccc2.getId()) {
					return -1;
				} else if(cccc1.getId() < cccc2.getId()) {
					return 1;
				} else  {
					return 0;
				}
			}			
		});
		list.forEach(cc->{
			System.out.println(cc.getName());
		});
		
		list.stream().filter(p->{
			return false;
		});
		
		System.out.println("\nSorted With Lambda Expression: ");
		Collections.sort(list, (cc1, cc2) -> {
			CustomClass cccc1 = (CustomClass)cc1;
			CustomClass cccc2 = (CustomClass)cc2;
			
			if(cccc1.getId() > cccc2.getId()) {
				return 1;
			} else if(cccc1.getId() < cccc2.getId()) {
				return -1;
			} else  {
				return 0;
			}
		});
		list.forEach(cc -> {
			System.out.println(cc.getName());
		});
		
	}
}

class CustomClass implements Comparable<Object>{
	private int id, price;
	private String name;
	
	public CustomClass(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
