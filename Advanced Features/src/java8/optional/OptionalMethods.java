package java8.optional;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalMethods {

	public static void main(String[] args) {
		String[] str = new String[10];
		str[5] = "HELLO, HOW ARE YOU?"; // Setting value for 5th index
		// It returns an empty instance of Optional class
		Optional<String> optional = Optional.empty();
		System.out.println(optional);

		// It returns a non-empty Optional
		Optional<String> value = Optional.of(str[5]);
		// If value is present, it returns an Optional otherwise returns an
		// empty Optional
		System.out.println("Filtered value: " + value.filter((s) -> s.equals("Abc")));
		System.out.println("Filtered value: " + value.filter((s) -> s.equals("HELLO, HOW ARE YOU?")));
		// It returns value of an Optional. if value is not present, it throws
		// an NoSuchElementException
		System.out.println("Getting value: " + value.get());
		// It returns hashCode of the value
		System.out.println("Getting hashCode: " + value.hashCode());
		// It returns true if value is present, otherwise false
		System.out.println("Is value present: " + value.isPresent());
		// It returns non-empty Optional if value is present, otherwise returns
		// an empty Optional
		System.out.println("Nullable Optional: " + Optional.ofNullable(str[5]));
		// It returns value if available, otherwise returns specified value,
		System.out.println("orElse: " + value.orElse("Value is not present"));
		Optional<String> value2 = Optional.ofNullable(str[4]);
		System.out.println("orElse: " + value2.orElse("Value is not present"));	//is empty so it will not print
		value.ifPresent(System.out::println); // printing value by using method
												// reference
		
		//ifPresent(Consumer)		
		value.ifPresent(new Consumer<String>() {
			@Override
			public void accept(String arg0) {
				System.out.println("Your if Present Logic Here. Value is " + arg0);
			}
		});
		
		value.ifPresent(optVal -> System.out.println("If else logic using Lambda. Value: " + optVal));		
	}
}
