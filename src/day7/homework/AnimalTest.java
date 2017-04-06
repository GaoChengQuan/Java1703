package day7.homework;

import day4.Stu;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Bird("bird", 10);
		animal.showInfo();
		
		animal = new Person("zhangsan", 20, '男');
		animal.showInfo();
		
		Person person = (Person) animal;
		person.walk();
		System.out.println("------");
		//The constructor Student(String, int, char) is undefined
		Person person2 = new Student("lisi", 29, '女', "Java1703");
		person2.showInfo();
		person2.walk();
		
		Animal animalPerson = new Student("wangsu", 34, '男');
		animalPerson.showInfo();
		
	}
}
