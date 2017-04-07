package day8.inter;

public abstract class AbstractBird {
	protected int legCount;
	
	public abstract void egg();
	
	protected AbstractBird() {
		super();
	}

	protected AbstractBird(int legCount) {
		super();
		this.legCount = legCount;
	}

	public void show() {
		System.out.println("legCount: " + legCount);
	}
}
