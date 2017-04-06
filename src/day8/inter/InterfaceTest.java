package day8.inter;

public class InterfaceTest {
	public static void main(String[] args) {
		AbstractBird bird = new Pigeon();
		bird.egg();
		
		IFly fly = new Pigeon();
		fly.fly();
		
		Pigeon pigeon = new Pigeon();
		printFlyInfo(pigeon);
		Geese geese = new Geese();
		printFlyInfo(geese);
		
		Pigeon pigeon1 = new Pigeon();
		pigeon1.egg();
		pigeon1.fly();
	}
	
	public static void printFlyInfo(IFly fly) {
		System.out.println("飞行的信息");
		fly.fly();
	}
	
//	public static void printFlyInfo(Pigeon pigeon) {
//		System.out.println("飞行的信息");
//		pigeon.fly();
//	}
//	
//	public static void printFlyInfo(Geese geese) {
//		System.out.println("飞行的信息");
//		geese.fly();
//	}
}
