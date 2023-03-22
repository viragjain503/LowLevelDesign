package DesginPatterns;


abstract class Vehicle{
		abstract int getWheel();
		
		@Override
		public String toString() {
			return "Wheel" + this.getWheel();
		}
}

class Car extends Vehicle{
	int wheel;
	public Car(int wheel) {
		this.wheel = wheel;
	}
	@Override
	int getWheel() {
		// TODO Auto-generated method stub
		return this.wheel;
	}
	
}

class Bike extends Vehicle{
	int wheel;
	public Bike(int wheel) {
		this.wheel = wheel;
	}
	
	@Override
	int getWheel() {
		return this.wheel;
	}
}

class VehicleFactory{
	public static Vehicle getInstance(String type, int wheel) {
		if(type == "Car") {
			return new Car(wheel);
		}else if(type == "Bike") {
			return new Bike(wheel);
		}
		return null;
	}
}
public class FactoryDesignPattern {

	public static void main(String[] args) {
			Vehicle car = VehicleFactory.getInstance("Car",4);
			System.out.println(car);
			
			Vehicle bike = VehicleFactory.getInstance("Bike",2);
			System.out.println(bike);
	}

}
