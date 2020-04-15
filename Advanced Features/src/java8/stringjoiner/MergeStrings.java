package java8.stringjoiner;

import java.util.StringJoiner;

public class MergeStrings {

	public static void main(String[] args) {
		//The merge() method merges two StringJoiner objects excluding of prefix and suffix of second StringJoiner object.

		StringJoiner joinerNames = new StringJoiner(", ", "[ ", " ]");

		joinerNames.add("Rakesh");
		joinerNames.add("Cherika");
		
		StringJoiner joinerNames2 = new StringJoiner(" : ", "{ ", "}");

		joinerNames2.add("Dinesh");
		joinerNames2.add("Rani");
		
		StringJoiner merged = joinerNames.merge(joinerNames2);
		System.out.println(merged);
	}

}
