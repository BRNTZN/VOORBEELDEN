package factory;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}

interface Shape {
	public void draw();
}

class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Square");
	}
}
