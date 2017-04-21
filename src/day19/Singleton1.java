package day19;

public class Singleton1 {
	//3、定义一个变量来存储创建好的类实例
	//因为这个变量要在静态方法中使用，所以需要加上static修饰
	private static Singleton1 instance = null;
	
	//1.私有化构造方法，好在内部控制创建实例的数目
	private Singleton1() {
		
	}
	
	//2、定义一个方法来为客户端提供类实例
	//这个方法需要定义成类方法，也就是要加static
	public synchronized static Singleton1 getInstance() {
		//4、判断这个实例是不是有值
		if (instance == null) {
			//5、如果没有，就创建一个类实例，并把值
			//赋给存储类实例的变量
			instance = new Singleton1();
		}
		return instance;
	}
}
