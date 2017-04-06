package day8.inter;

public class Honeybee extends AbstractInsect implements IFly{

	@Override
	public void spawn() {
		System.out.println("Honeybee spawn()");
	}

	@Override
	public void fly() {
		System.out.println("Honeybee fly()");
	}

}
