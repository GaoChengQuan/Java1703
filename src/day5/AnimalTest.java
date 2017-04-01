package day5;

public class AnimalTest {
	public static void main(String[] args) {
		Dog dog = new Dog("小黑", "黑色", 4);
		dog.move();
		dog.cry();
		
		System.out.println("---------");
		Fish fish = new Fish();
		fish.setName("金鱼");
		fish.setColor("金色");
		fish.move();
		fish.bubble();
		//equals、hashCode、wait、notify、notifyAll、toString
	}
}
