package day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		Person person1 = new Person("zhangsan", 20);
		Person person2 = new Person("lisi", 30);
		Person person3 = new Person("wangwu", 18);
		
		List<Person> list = new ArrayList<Person>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		
		for (Person person : list) {
			System.out.println(person);
		}
		
//		for (Person person : list) {
//			if ("wangwu".equals(person.getName())) {
//				list.remove(person);
//			}
//		}
		
		Iterator<Person> iterator = list.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			if ("lisi".equals(person.getName())) {
				iterator.remove();
			}
		}
		
		System.out.println("-----------");
		for (Person person : list) {
			System.out.println(person);
		}
	}
}
