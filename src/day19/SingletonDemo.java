package day19;

public class SingletonDemo {
	public static void main(String[] args) {
		//Singleton singleton = new Singleton();
		Singleton instance = Singleton.getInstance();
		instance.show();
		
		Singleton1 instance1 = Singleton1.getInstance();
		Singleton1 instance2 = Singleton1.getInstance();
		
	}
}
