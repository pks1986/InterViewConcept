package java8.stringjoiner;

import java.util.StringJoiner;

public class PrefixSuffix {

	public static void main(String[] args) {

		StringJoiner joinerNames = new StringJoiner(", ", "[ ", " ]");

		joinerNames.add("Rakesh");
		joinerNames.add("Cherika");
		joinerNames.add("Dinesh");
		joinerNames.add("Rani");

		System.out.println(joinerNames);

	}

}
