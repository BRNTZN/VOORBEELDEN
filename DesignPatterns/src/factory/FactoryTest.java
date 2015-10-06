package factory;

public class FactoryTest {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape square = factory.getShape("SQUARE");
		square.draw();
	}

}
