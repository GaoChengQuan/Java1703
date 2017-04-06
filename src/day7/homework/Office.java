package day7.homework;

public class Office {
	protected String data;

	public Office() {
		super();
	}

	public Office(String data) {
		super();
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public void start() {
		System.out.println("Office 开始工作");
	}

}
