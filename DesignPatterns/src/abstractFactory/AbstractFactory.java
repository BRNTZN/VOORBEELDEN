package abstractFactory;

class FactoryProducer {
	public static AbstractFactory getFactory (String choice){
		if (choice==null) {
			return null;
		}
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		}
		if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
}

public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
}

class ShapeFactory extends AbstractFactory {
	@Override
	Color getColor(String color) {
		return null;
	}
	@Override
	Shape getShape(String shape) {
		if (shape == null) {
			return null;
		}
		if (shape.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		if (shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		return null;
	}
}

class ColorFactory extends AbstractFactory {
	@Override
	Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		}
		if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}
	@Override
	Shape getShape(String shape) {
		return null;
	}
}

interface Shape {
	void draw();
}

class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("CIRCLE!");
	}
}

class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("SQUARE!");
	}
}

interface Color {
	void fill();
}

class Red implements Color {
	@Override
	public void fill() {
		System.out.println("RED!");
	}
}

class Blue implements Color {
	@Override
	public void fill() {
		System.out.println("BLUE!");
	}
}