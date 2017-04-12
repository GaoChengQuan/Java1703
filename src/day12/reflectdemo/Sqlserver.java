package day12.reflectdemo;

public class Sqlserver extends Db{

	@Override
	public void getConnection() {
		System.out.println("Sqlserver getConnection");
	}

}
