package day8.homework;

public class NormalStudent extends Student{

	@Override
	public void study() {
		System.out.println(className + "的" + name + "正在学习");
	}

	@Override
	public void show() {
		System.out.println("name: " + name);
	}

}
