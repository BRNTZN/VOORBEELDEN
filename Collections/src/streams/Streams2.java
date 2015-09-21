package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Streams2 {

	public static void main(String[] args) {
		List<Integer> lijst = new ArrayList<Integer>();
		
		for (int i = 0; i < 12345678; i++) {
			lijst.add((int)(Math.random()*Integer.MAX_VALUE));
		}
		
		Supplier<IntStream> ints = () -> lijst.stream().mapToInt(Integer::intValue);

		System.out.println("Aantal getallen groter dan 100000");
		long lang = ints.get().filter(i -> i > 100000).count();
		System.out.println(lang);

		System.out.println("Grootste:");
		ints.get().max().ifPresent(System.out::println);
		System.out.println(ints.get().max().getAsInt());

		System.out.println("kleinste 10-voud");
		System.out.println(ints.get().filter(i -> i % 10 == 0).min().getAsInt());

		System.out.println("gemiddelde");
		System.out.println(ints.get().average().getAsDouble());

		System.out.println("som even getallen");
		System.out.println(ints.get().filter(i -> i % 2 == 0).sum());

		System.out.println("10 grootste getallen");
		ints.get().sorted().skip(12345678 - 10).forEach(i -> System.out.println(i));

	}

}
