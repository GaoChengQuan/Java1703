package day2;

import org.junit.Test;

public class TestDemo {
	public static void main(String[] args) {
		
	}
	@Test
	public void test1() {
		// 1、变量的作用域/范围
		// 从变量的声明开始，到包含他的最近的大括号
		int a = 3;
		if (a > 5) {
			int b = 4;
			a = 89;
		}
		// b cannot be resolved to a variable
		// b = 7;
	}

	@Test
	public void test2() {
		// 2、变量的重名问题：
		// 作用域重叠时，变量不能重名
		int a = 3;
		if (a > 5) {
			int b = 4;
			int a = 90;
			a = 89;
		}
	}
}
