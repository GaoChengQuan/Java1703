package day12.reflectdemo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class DbTest {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(is);
		is.close();
		String className = properties.getProperty("className");
		//System.out.println(className);
		
		
		Class clazz = Class.forName("day12.reflectdemo." + className);
		Db db = (Db) clazz.newInstance();
		db.getConnection();
	}
}
