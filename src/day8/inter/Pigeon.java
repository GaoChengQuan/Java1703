package day8.inter;

public class Pigeon extends AbstractBird implements IFly{
	
	public Pigeon() {
		super();
	}

	public Pigeon(int legCount) {
		super(legCount);
	}

	@Override
	public void egg() {
		System.out.println("Pigeon egg()");
	}

	@Override
	public void fly() {
		System.out.println("Pigeon fly()");
	}

}
