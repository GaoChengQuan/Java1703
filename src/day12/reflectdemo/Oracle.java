package day12.reflectdemo;

public class Oracle extends Db{

	@Override
	public void getConnection() {
		System.out.println("Oracle getConnection");
	}

}
