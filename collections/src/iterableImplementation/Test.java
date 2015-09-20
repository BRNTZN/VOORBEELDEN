package iterableImplementation;

import _element.Element;

public class Test {

	public static void main(String[] args) {
		Element a = new Element(2, 8);
		Element b = new Element(1, 3);
		Element c = new Element(4, 3);
		
		
		ElementSet elementSet = new ElementSet();
		elementSet.add(a);
		elementSet.add(b);
		elementSet.add(c);
		
		for (Element element : elementSet) {
			System.out.println(element);
		}

	}

}
