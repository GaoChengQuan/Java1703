package day7.homework;

public class Excel extends Office {

	public Excel() {
		super();
	}

	public Excel(String data) {
		super(data);
	}
	
	@Override
	public void start() {
		super.start();
		System.out.println("Excel正在打开，打开的数据是" + data);
	}

}
