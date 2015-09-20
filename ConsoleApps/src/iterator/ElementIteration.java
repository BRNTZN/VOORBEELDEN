package iterator;

public class ElementIteration {

	public static void main(String[] args) {
		ElementList lijst = new ElementList();
		
		lijst.add(new Element(5));
		lijst.add(new Element(3));
		lijst.add(new Element(1));
		lijst.add(new Element(9));
		lijst.add(new Element(7));
		
//		lijst.
		for (Element element : lijst) {
			System.out.println(element.id);
		}
	}

}
