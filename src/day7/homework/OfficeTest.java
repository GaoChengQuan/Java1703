package day7.homework;

public class OfficeTest {
	public static void main(String[] args) {
		Office office = new Word("word");
		office.start();
		office = new Excel("excel");
		office.start();
	}
}
