package day19;

public class Singleton {
	//3、定义一个变量来存储创建好的类实例
	//直接在这里创建类实例，由虚拟机来保证只会创建一次
	//这个类加载到内存的时候就会创建唯一的一份实例
	private static Singleton instance = new Singleton();
	
	//1.私有化构造方法，好在内部控制创建实例的数目
	private Singleton() {
		
	}
	
	//2、定义一个方法来为客户端提供类实例
    //这个方法需要定义成类方法，也就是要加static
	public static Singleton getInstance() {
		//4、直接使用已经创建好的实例
		return instance;
	}
}
