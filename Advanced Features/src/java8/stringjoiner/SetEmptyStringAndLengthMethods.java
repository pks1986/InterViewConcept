package java8.stringjoiner;

import java.util.StringJoiner;

public class SetEmptyStringAndLengthMethods {

	public static void main(String[] args) {
		StringJoiner joinerNames = new StringJoiner(",", "[", "]");
		StringJoiner joinerNames2 = new StringJoiner(",");

		joinerNames.setEmptyValue("Joiner 1 is empty");
		joinerNames2.setEmptyValue("Joiner 2 is empty");

		//joinerNames.add("Rakesh");
		//joinerNames2.add("Rakesh");
		
		System.out.println("Value of 1: " + joinerNames);
		System.out.println("Length of 1: " + joinerNames.length());
		System.out.println("\nValue of 2: " + joinerNames2);
		System.out.println("Length of 2: " + joinerNames2.length());

		joinerNames.add("Rakesh");
		joinerNames.add("Cherika");

	}

}
