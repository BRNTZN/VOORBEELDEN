package test;

import java.util.Set;
import java.util.TreeSet;

public class NonComparableTest {

	public static void main(String[] args) {
		Set<NonComparable> set = new TreeSet<>();

		set.add(new NonComparable(10));
		set.add(new NonComparable(1));
		set.add(new NonComparable(8));
		set.add(new NonComparable(4));

		for (NonComparable nonComparable : set) {
			System.out.println(nonComparable);
		}

		/**
		 * Runtime Exception:
		 * 
		 * Exception in thread "main" java.lang.ClassCastException:
		 * test.NonComparable cannot be cast to java.lang.Comparable
		 */
	}

}
