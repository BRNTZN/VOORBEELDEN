package comparable;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import _element.Element;

public class Test {

	public static void main(String[] args) {
		Element a = new Element(2, 8);
		Element b = new Element(1, 3);
		Element c = new Element(4, 3);
		
		Set<Element> treeSet = new TreeSet<>();
		treeSet.add(a);
		treeSet.add(b);
		treeSet.add(c);
		
		for (Element element : treeSet) {
			System.out.println(element);
		}
		
		/**
		 * hashset houdt geen rekening met compareto:
		 */
		Set<Element> hashSet = new HashSet<>();
		hashSet.add(a);
		hashSet.add(b);
		hashSet.add(c);
		
		for (Element element : hashSet) {
			System.out.println(element);
		}
	}
}
