package _element;

public class Element implements Comparable<Element>{
	
	public int a;
	public int b;
	
	public Element(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int compareTo(Element o) {
		return (this.a+this.b)-(o.a+o.b);
	}

	@Override
	public String toString() {
		return a+"+"+b+"="+String.valueOf(a+b);
	}
	
	
}
