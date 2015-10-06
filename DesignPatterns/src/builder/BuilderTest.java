package builder;

public class BuilderTest {

	public static void main(String[] args) {
		Car car = new Car.CarBuilder(4, "Lamborghini", "Yellow").sticker("flames").build();
		car.getSticker();
	}
}
