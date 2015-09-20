package builder;

public class Car {
	/**
	 * verplicht
	 */
	private final int wheels;
	private final String brand, color;
	/**
	 * optioneel
	 */
	private final String sticker;
	
	private Car(CarBuilder builder){
		this.wheels = builder.wheels;
		this.brand = builder.brand;
		this.color = builder.color;
		this.sticker = builder.sticker;
	}
	
	public static class CarBuilder {
		private final int wheels;
		private final String brand, color;
		
		private String sticker;
		
		public CarBuilder(int wheels, String brand, String color){
			this.wheels = wheels;
			this.brand = brand;
			this.color = color;
		}
		
		public CarBuilder sticker(String sticker){
			this.sticker = sticker;
			return this;
		}
		
		public Car build(){
			return new Car(this);
		}
	}

	public int getWheels() {
		return wheels;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public String getSticker() {
		return sticker;
	}
}
