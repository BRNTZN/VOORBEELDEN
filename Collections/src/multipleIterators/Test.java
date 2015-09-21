package multipleIterators;

import java.util.Iterator;

import _element.Element;

public abstract class Test {

	public static void main(String[] args) {
		Element a = new Element(1, 20); // 21
		Element b = new Element(5, 5); // 10
		Element c = new Element(11, 3); // 14
		Element d = new Element(20, 2); // 22
		Element e = new Element(20, 5); // 25

		ElementSet elementSet = new ElementSet();
		elementSet.add(a);
		elementSet.add(b);
		elementSet.add(c);
		elementSet.add(d);
		elementSet.add(e);

		/**
		 * Custom iterator gedefinieerd in de elementset klasse:
		 */
		System.out.println("*********");
		System.out.println("iteratorA");
		Iterator<Element> iteratorA = elementSet.aIterator();
		while (iteratorA.hasNext()) {
			System.out.println(iteratorA.next());
		}

		/**
		 * Custom iterator gedefinieerd in elementset klasse met een lambda:
		 */
		System.out.println("*********");
		System.out.println("iteratorB");
		Iterator<Element> iteratorB = elementSet.bIterator();
		while (iteratorB.hasNext()) {
			System.out.println(iteratorB.next());
		}

	}

}
