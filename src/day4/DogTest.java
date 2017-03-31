package day4;

public class DogTest {
	public static void main(String[] args) {
		String name = "小黑";
		String color = "黑色";
		Dog dog = new Dog(name, color);
		dog.move();
		dog.cry();
	}
}
