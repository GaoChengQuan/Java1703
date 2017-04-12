package day12.reflectdemo;

public class Mysql extends Db{

	@Override
	public void getConnection() {
		System.out.println("Mysql getConnection");
	}

}
