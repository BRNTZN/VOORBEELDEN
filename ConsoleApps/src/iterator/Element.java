package iterator;

public class Element implements Comparable<Element>{
	
	int id;
	
	public Element(int id) {
		super();
		this.id = id;
	}

	@Override
	public int compareTo(Element o) {
		return Integer.compare(id, o.id)*-1;
	}

}
