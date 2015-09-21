package iterableImplementation;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import _element.Element;

/**
 * 
 * @author BRNTZN
 *	Door Iterable kan deze klasse in een enhanced for
 */
public class ElementSet implements Iterable<Element> {
	private Set<Element> set = new TreeSet<>();

	@Override
	public Iterator<Element> iterator() {
		return set.iterator();
	}

	public void add(Element e) {
		set.add(e);
	}

}
