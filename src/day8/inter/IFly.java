package day8.inter;

public interface IFly {
	//Illegal modifier for the interface field IFly.legCount; 
	// only public, static & final are permitted
	public static final int legCount = 2;
	
	// Abstract methods do not specify a body
	// public void eat();
	
	public abstract void fly();
}
