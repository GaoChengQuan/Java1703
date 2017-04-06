package day7.homework;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(100, 20);
		System.out.println("speed: " + vehicle.getSpeed());
		System.out.println("size: " + vehicle.getSize());
		vehicle.speedDown();
		System.out.println("speed: " + vehicle.getSpeed());
		
	}
}
