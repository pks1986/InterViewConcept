package java8.optional;

import java.util.Optional;

public class WithOptional {

	public static void main(String[] args) {
		String str[] = new String[10];
		//str[5] = "Hello";
		
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if(checkNull.isPresent()) {
			System.out.println(checkNull.get());
		} else {
			System.out.println("No value assigned yet");
		}
		//NoSuchElementExcpetion
		//System.out.println(checkNull.get());
		
		str[5] = "Hello";
		
		checkNull = Optional.ofNullable(str[5]);
		/*checkNull.ifPresent(new Consumer<String>() {
			@Override
			public void accept(String arg0) {
				System.out.println(arg0);	
			}
		});*/
		checkNull.ifPresent(System.out::println);
		System.out.println(checkNull.get());
		
		//str[0] = "Now assigned";
		Optional<String> orElseEx = Optional.ofNullable(str[0]);
		System.out.println("Or Else Value: " + orElseEx.orElse("Else Value, means empty"));
	
	}
}
