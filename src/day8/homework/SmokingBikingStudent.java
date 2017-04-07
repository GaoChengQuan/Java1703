package day8.homework;

public class SmokingBikingStudent extends Student implements ISmoking, IBiking{
	
	public SmokingBikingStudent() {
		super();
	}

	public SmokingBikingStudent(String name, int age, String className) {
		super(name, age, className);
	}

	@Override
	public void bike() {
		System.out.println(name + " bike");
	}

	@Override
	public void smoking() {
		System.out.println(name + " smoking");
	}

	@Override
	public void study() {
		System.out.println(name + " study");
	}

	@Override
	public void show() {
		System.out.println(name + " show");
	}

}
