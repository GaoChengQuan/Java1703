package day12;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectDemo {
	public static void main(String[] args) {
		//1
		Class clazz1 = Person.class;
		//2
		Class clazz2 = null;
		try {
			clazz2 = Class.forName("day12.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//3
		Person person = new Person();
		Class clazz3 = person.getClass();
		
		System.out.println(clazz1 == clazz2);
		System.out.println(clazz1 == clazz3);
	}
	
	@Test
	public void testField() {
		Class clazz = Person.class;
		Field[] fields = clazz.getFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println(field);
			//System.out.println(field.getName());
		}
	}
	
	@Test
	public void testConstructor() {
		Class clazz = Person.class;
		Constructor[] constructors = clazz.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}
	}
	
	@Test
	public void testMethod() {
		Class clazz = Person.class;
		Method[] methods1 = clazz.getMethods();
		for (Method method : methods1) {
			System.out.println(method);
		}
		System.out.println("--------");
		Method[] methods2 = clazz.getDeclaredMethods();
		for (Method method : methods2) {
			System.out.println(method);
		}
		System.out.println("---------");
	}
	
	@Test
	public void testConMethof() throws Exception {
//		Person person = new Person();
//		person.setName("Java");
//		String name = person.getName();
		Class clazz = Person.class;
		
		Constructor constructor = clazz.getConstructor();
		Person person = (Person) constructor.newInstance();
		
		// public Method getMethod(String name, Class<?>... parameterTypes)
		// name 参数是一个 String，用于指定所需方法的简称。
		// parameterTypes 参数是按声明顺序标识该方法形参类型的 Class 对象的一个数组。
		// 如果 parameterTypes 为 null，则按空数组处理。
		Method setNameMethod = clazz.getDeclaredMethod("setName", new Class[]{String.class});
		setNameMethod.setAccessible(true);
		// person.setName("Java");
		setNameMethod.invoke(person, new Object[]{"Java"});
		String name = person.getName();
		System.out.println(name);
		
		Package pack = clazz.getPackage();
		System.out.println(pack);
		String className = clazz.getName();
		System.out.println(className);
	}
	
	@Test
	public void test1() throws Exception {
		Student student = new Student();
		System.out.println(student);
		changeField(student);
		System.out.println(student);
		
		System.out.println("-----------");
		Person person = new Person();
		System.out.println(person);
		changeField(person);
		System.out.println(person);
	}

	private void changeField(Object obj) throws IllegalAccessException {
		// 1、获得对应的Class
		Class clazz = obj.getClass();
		// 2、获得所有的Fields
		Field[] fields = clazz.getDeclaredFields();
		// 3、遍历所有的Field，如果是String类型，将包含b的改成a
		for (Field field : fields) {
			// 3.1如果是String类型的属性才修改
			if (field.getType() == String.class) {
				// 3.2取出Field的值
				field.setAccessible(true);
				String oldValue = (String) field.get(obj);//student.getName();
				// 3.3将属性的值中的b改为a
				String newValue = oldValue.replace("a", "b");
				// 3.4将修改后的值设置到属性上
				field.set(obj, newValue);//student.setName(value);
			}
		}
	}
}
