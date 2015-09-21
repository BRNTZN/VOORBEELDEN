package streams;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamSupplier {

	public static void main(String[] args) {
		Supplier<Stream<String>> streamSupplier = () -> Stream.of("a", "b", "ca", "d");
		streamSupplier.get().filter(a -> a.equals("a")).forEach(System.out::println);
		streamSupplier.get().filter(a -> a.contains("a")).forEach(System.out::println);
	}
}
