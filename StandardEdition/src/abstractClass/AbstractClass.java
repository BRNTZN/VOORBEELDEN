package abstractClass;

public abstract class AbstractClass {
	private int getal = 5;
	private String woord;
	
	public abstract void abstractMethod();
	public void print(){
		System.out.println(woord+" "+getal);
	}
	public void method(){
		System.out.println("please don't override me");
	}
	public void setWoord(String woord){
		this.woord = woord;
	}
}
