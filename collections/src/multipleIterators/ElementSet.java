package multipleIterators;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import _element.Element;

public class ElementSet implements Iterable<Element> {

	private Set<Element> set = new TreeSet<>();

	public void add(Element e) {
		set.add(e);
	}

	@Override
	public Iterator<Element> iterator() {
		return set.iterator();
	}

	public Iterator<Element> aIterator() {
		Set<Element> gesorteerdeSet = new TreeSet<>(new AComparator());
		gesorteerdeSet.addAll(set);
		return gesorteerdeSet.iterator();
	}

	public Iterator<Element> bIterator() {
		Set<Element> gesorteerdeSet = new TreeSet<>((e1, e2) -> {
			return e1.b - e2.b;
		});
		gesorteerdeSet.addAll(set);
		return gesorteerdeSet.iterator();
	}

}

class AComparator implements Comparator<Element> {

	@Override
	public int compare(Element o1, Element o2) {
		return o1.a - o2.a;
	}

}
