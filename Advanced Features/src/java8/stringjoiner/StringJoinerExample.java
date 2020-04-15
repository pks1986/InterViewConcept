package java8.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		
		StringJoiner joinerNames = new StringJoiner(",\n");
		
		joinerNames.add("Rakesh");
		joinerNames.add("Cherika");
		joinerNames.add("Dinesh");
		joinerNames.add("Rani");

		System.out.println(joinerNames);
	}

}
