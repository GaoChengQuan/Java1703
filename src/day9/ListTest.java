package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class ListTest {
	public static void main(String[] args) {
		// 数组的处理方式
		Student[] array = new Student[2];
		Student student1 = new Student("zhangsan", 20);
		Student student2 = new Student("lisi", 23);
		array[0] = student1;
		array[1] = student2;
		
		for (int i = 0; i < array.length; i++) {
			Student student = array[i];
			System.out.println(student.getName());
			System.out.println(student.getAge());
		}
		
		//数组也可以使用foreach
		for (Student stu : array) {
			System.out.println(stu);
		}
		
		System.out.println("-------");
		
		// 程序=算法+数据结构
		// 数据结构解决长度固定问题？List
		// 解决List里面数据类型不固定问题？泛型（表示集合里面只能放这种类型）
		// 集合做主要的操作就是：增删改查+遍历
		List<Student> list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		
		Teacher teacher = new Teacher();
		//list.add(teacher);
		
		//index of the element to return，和数组的下标处理是一样的
		Student stu1 = list.get(0);
		System.out.println(stu1.getName());
		System.out.println(stu1.getAge());
		
		Student stu2 = list.get(1);
		System.out.println(stu2.getName());
		System.out.println(stu2.getAge());
		
		//遍历的三种方式：
		// 1、数组的方式
		for (int i = 0; i < list.size(); i++) {
			Student student = list.get(i);
			System.out.println(student);
		}
		//2、foreach方式
		for (Student stu : list) {
			System.out.println(stu);
		}
		// 3、迭代器Iterator
		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student);
		}
	}
	
	@Test
	public void testMap() {
		// CN   中华人民共和国  US 美利坚合众国 
		// key  value
		Map<String, String> map = new HashMap<String, String>();
		map.put("CN", "中华人民共和国");
		map.put("US", "美利坚合众国 ");
		// map.put(new Student(), new Teacher());
		
		String result = map.get("CN");
		System.out.println(result);
		
		System.out.println("-------");
		for (Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key);
			System.out.println(value);
		}
		
	}
}
