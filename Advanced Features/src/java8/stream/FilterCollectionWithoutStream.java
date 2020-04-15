package java8.stream;

import java.util.ArrayList;
import java.util.List;

public class FilterCollectionWithoutStream {

	public static void main(String[] args) {
		List<Float> listAll = new ArrayList<Float>();
		listAll.add(1000f);
		listAll.add(2000f);
		listAll.add(3000f);
		listAll.add(4000f);
		
		List<Float> filteredList = new ArrayList<Float>();
		for(int i = 0; i < listAll.size(); i ++){
			if(listAll.get(i) >= 3000){
				filteredList.add(listAll.get(i));
			}
		}
		
		System.out.println("Filtered List: " + filteredList);

	}

}
