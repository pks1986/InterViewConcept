package java8.stream;

import java.util.stream.Stream;

public class StreamIterate {

	public static void main(String[] args) {
		Stream.iterate(1, element -> element + 1).filter(element -> element % 5 == 0).limit(5)
				.forEach(System.out::println);		//Calls this method, public void println(Object x)
				/*.forEach(new Consumer<Integer>() {

					@Override
					public void accept(Integer t) {
						System.out.println(t);
					}
				});*/

	}

}
