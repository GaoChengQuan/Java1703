package day8.homework;

public class SmokingStudent extends Student implements ISmoking{

	@Override
	public void study() {
		System.out.println(className + "的" + name + "正在学习");
	}

	@Override
	public void show() {
		System.out.println("name: " + name);
	}

	@Override
	public void smoking() {
		System.out.println("name: " + name + "吸烟学生");
	}

}
