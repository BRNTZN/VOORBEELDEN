package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElementList implements Iterable<Element>{
	
	private List<Element> lijst = new ArrayList<>();
	
	public void add(Element e){
		lijst.add(e);
	}
	
	@Override
	public Iterator<Element> iterator() {
		return lijst.iterator();
	}

}
