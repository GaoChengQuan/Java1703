package day8.inter;

public class Geese extends AbstractBird implements IFly{
	
	public Geese() {
		super();
	}

	public Geese(int legCount) {
		super(legCount);
	}

	@Override
	public void egg() {
		System.out.println("Geese egg()");
	}

	@Override
	public void fly() {
		System.out.println("Geese fly()");
	}
}
